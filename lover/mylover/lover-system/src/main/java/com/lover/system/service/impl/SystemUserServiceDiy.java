package com.lover.system.service.impl;

import com.lover.system.entity.mybatis.SystemUserEntity;
import com.lover.system.mapper.SystemUserDao;
import com.lover.system.service.MPSystemUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lhf
 * @since 2019-06-09
 */
@Service
public class SystemUserServiceDiy extends ServiceImpl<SystemUserDao, SystemUserEntity> implements MPSystemUserService {

}
