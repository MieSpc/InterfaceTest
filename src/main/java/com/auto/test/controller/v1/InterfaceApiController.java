package com.auto.test.controller.v1;

import com.auto.test.common.CommonResult;
import com.auto.test.entity.ApiRequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/v1/")
public class InterfaceApiController {


    @RequestMapping(value = "/create-or-update", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult createApi(@RequestBody ApiRequestEntity apiRequestEntity){

        return CommonResult.success(apiRequestEntity);
    }

}
