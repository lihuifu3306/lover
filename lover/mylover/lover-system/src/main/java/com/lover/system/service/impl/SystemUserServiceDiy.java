package com.lover.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.lover.system.entity.mybatis.SystemUserEntity;
import com.lover.system.mapper.SystemUserDao;
import com.lover.system.service.MPSystemUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lover.util.helpers.HelpString;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lhf
 * @since 2019-06-09
 */
@Service
@Transactional(rollbackFor = {Exception.class})
public class SystemUserServiceDiy extends ServiceImpl<SystemUserDao, SystemUserEntity> implements MPSystemUserService {

    @Override
    public int insertUserInfo(SystemUserEntity userEntity) {
        userEntity.setUserUuid(HelpString.getGUID());
        userEntity.setCreateTime(LocalDateTime.now());
        return this.baseMapper.insertUserInfo(userEntity);
    }

    @Override
    public SystemUserEntity queryUserByCode(String userCode) {
        QueryWrapper<SystemUserEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_code", userCode);
        return this.getOne(queryWrapper);
    }

    @Override
    public boolean queryUserByCode(String userCode, Long userId) {
        QueryWrapper<SystemUserEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_code", userCode);
        queryWrapper.ne("user_id", userId);
        return this.getOne(queryWrapper) == null;
    }

    @Override
    public boolean updateUserInfo(SystemUserEntity userEntity) {
        userEntity.setUpdateTime(LocalDateTime.now());
        return this.updateById(userEntity);
    }

    @Override
    public boolean deleteUserInfo(SystemUserEntity userEntity) {
        userEntity.setIsDelete(1);
        userEntity.setDeleteTime(LocalDateTime.now());
        return this.updateById(userEntity);
    }
}
