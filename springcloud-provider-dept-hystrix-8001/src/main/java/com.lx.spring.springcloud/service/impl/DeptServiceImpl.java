package com.lx.spring.springcloud.service.impl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.lx.spring.springcloud.bean.Dept;
import com.lx.spring.springcloud.mapper.DeptMapper;
import com.lx.spring.springcloud.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liuxun
 * @since 2018-06-26
 */
@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements IDeptService {

    @Autowired
    private DeptMapper deptMapper;
    @Override
    public Dept selectById(Long id) {
        return deptMapper.selectById(id);
    }
}
