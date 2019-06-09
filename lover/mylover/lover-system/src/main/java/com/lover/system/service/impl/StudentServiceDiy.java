package com.lover.system.service.impl;

import com.lover.system.entity.StudentEntity;
import com.lover.system.mapper.StudentDao;
import com.lover.system.service.MPStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lhf
 * @since 2019-06-08
 */
@Service
public class StudentServiceDiy extends ServiceImpl<StudentDao, StudentEntity> implements MPStudentService {

}
