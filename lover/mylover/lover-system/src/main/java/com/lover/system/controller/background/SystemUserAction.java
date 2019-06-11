package com.lover.system.controller.background;

import com.lover.core.result.JsonResult;
import com.lover.system.entity.mybatis.SystemUserEntity;
import com.lover.system.service.MPSystemUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

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

    /**
     * 新增用户
     * @param userEntity
     * @param result
     * @return JsonResult
     */
    @PostMapping(value = "/save")
    public JsonResult save(@Valid SystemUserEntity userEntity, BindingResult result) {
        if (result.hasErrors()) {
            return JsonResult.BindingError(result);
        }
        if (userService.queryUserByCode(userEntity.getUserCode()) != null) {
            return JsonResult.failure("用户编码已存在");
        }
        if (userService.insertUserInfo(userEntity) > 0) {
            return JsonResult.SUCCESS;
        }
        return JsonResult.FAILURE;
    }

    /**
     * 修改用户
     * @param userEntity
     * @param result
     * @return JsonResult
     */
    @PutMapping(value = "/update")
    public JsonResult update(@Valid SystemUserEntity userEntity, BindingResult result) {
        if (result.hasErrors()) {
            return JsonResult.BindingError(result);
        }
        if (!userService.queryUserByCode(userEntity.getUserCode(), userEntity.getUserId())) {
            return new JsonResult(-1, " 用户编码已存在");
        }
        if (userService.updateUserInfo(userEntity)) {
            return JsonResult.SUCCESS;
        }
        return JsonResult.FAILURE;
    }

    /**
     * 逻辑删除用户
     * @param userEntity
     * @return JsonResult
     */
    @DeleteMapping(value = "/delete")
    public JsonResult remove(SystemUserEntity userEntity) {
        if (userService.deleteUserInfo(userEntity)) {
            return JsonResult.SUCCESS;
        } else {
            return JsonResult.FAILURE;
        }
    }
}

