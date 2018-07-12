package com.lx.spring.springcloud.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.lx.spring.springcloud.bean.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author liuxun
 * @since 2018-06-26
 */
@Mapper
public interface DeptMapper extends BaseMapper<Dept> {

    @Select("select * from dept where deptno = #{id}")
    Dept selectById(Long id);
}
