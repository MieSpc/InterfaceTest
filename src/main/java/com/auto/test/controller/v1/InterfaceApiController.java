package com.auto.test.controller.v1;

import com.auto.test.common.CommonResult;
import com.auto.test.entity.ApiRequestEntity;
import com.auto.test.exceptions.RequestValidatorException;
import com.auto.test.manager.api.ApiManager;
import com.auto.test.validator.ApiValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/v1/")
public class InterfaceApiController {

    @Autowired
    private ApiManager apiManager;

    @RequestMapping(value = "/create-or-update", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult createApi(@RequestBody ApiRequestEntity apiRequestEntity){
        try {
            ApiValidator.validateCreateOrUpdateApi(apiRequestEntity);
        }catch (RequestValidatorException e){
            return CommonResult.validateFailed(e.getMessage(), e.getReason());
        }
        return CommonResult.success(apiManager.saveOrUpdateApi(apiRequestEntity));
    }

}
