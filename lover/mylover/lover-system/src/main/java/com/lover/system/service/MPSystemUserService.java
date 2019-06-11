package com.lover.system.service;

import com.lover.system.entity.mybatis.SystemUserEntity;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lhf
 * @since 2019-06-09
 */
public interface MPSystemUserService extends IService<SystemUserEntity> {

    /**
     * 新增用户
     * @param userEntity
     * @return int
     */
    int insertUserInfo(SystemUserEntity userEntity);

    /**
     * 根据编码查询用户信息
     * @param userCode
     * @return SystemUserEntity
     */
    SystemUserEntity queryUserByCode(String userCode);

    /**
     * 根据编码查询用户信息
     * @param userCode
     * @param userId
     * @return SystemUserEntity
     */
    boolean queryUserByCode(String userCode, Long userId);

    /**
     * 修改用户信息
     * @param userEntity
     * @return boolean
     */
    boolean updateUserInfo(SystemUserEntity userEntity);

    /**
     * 删除用户信息
     * @param userEntity
     * @return boolean
     */
    boolean deleteUserInfo(SystemUserEntity userEntity);

}
