package com.lover.system.controller.background;

import com.lover.core.result.JsonResult;
import com.lover.system.entity.mybatis.SystemUserEntity;
import com.lover.system.service.MPSystemUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lhf
 * @since 2019-06-09
 */
@RestController
@RequestMapping("background/systemUserEntity")
public class SystemUserAction {

    @Autowired
    private MPSystemUserService userService;

    @PostMapping(value = "save")
    public JsonResult save(@Valid SystemUserEntity userEntity, BindingResult result) {
        if (result.hasErrors()) {
            return JsonResult.BindingError(result);
        }
        if (userService.insertUserInfo(userEntity) > 0) {
            return JsonResult.SUCCESS;
        }
        return JsonResult.FAILURE;
    }
}

