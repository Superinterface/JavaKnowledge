package com.javaEE.fremwork.Mybatis.mapper;

import java.util.List;

import com.javaEE.fremwork.Mybatis.entity.TRole;

public interface TRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TRole record);

    int insertSelective(TRole record);

    TRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TRole record);

    int updateByPrimaryKey(TRole record);
    
    List<TRole> selectRoleandUsers();
}