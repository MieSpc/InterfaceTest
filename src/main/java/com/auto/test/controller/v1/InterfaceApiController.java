package com.auto.test.controller.v1;

import com.auto.test.common.CommonResult;
import com.auto.test.entity.ApiSaveRequest;
import com.auto.test.entity.SimpleLongRequest;
import com.auto.test.enums.ResultCode;
import com.auto.test.exceptions.CustomException;
import com.auto.test.manager.api.ApiManager;
import com.auto.test.utils.JsonUtil;
import com.auto.test.validator.ApiValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Objects;

@Controller
@RequestMapping("/api/v1/")
public class InterfaceApiController {
    private static final Logger LOGGER = LoggerFactory.getLogger(InterfaceApiController.class);

    @Autowired
    private ApiManager apiManager;

    @RequestMapping(value = "/create-or-update", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult createApi(@RequestBody ApiSaveRequest apiSaveRequest){
        if (Objects.isNull(apiSaveRequest)){
            throw new CustomException(ResultCode.VALIDATE_FAILED);
        }
        LOGGER.info("save api request:" + JsonUtil.getJsonFromObject(apiSaveRequest));
        ApiValidator.validateCreateOrUpdateApi(apiSaveRequest);
        return CommonResult.success(apiManager.saveOrUpdateApi(apiSaveRequest));
    }

    @RequestMapping(value = "/api-detail", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult apiDetail(@RequestBody SimpleLongRequest request){
        if (Objects.isNull(request) || Objects.isNull(request.getData())){
            throw new CustomException(ResultCode.VALIDATE_FAILED);
        }
        LOGGER.info("search api id:"+request.getData());
        return CommonResult.success(apiManager.apiDetail(request));
    }

}
