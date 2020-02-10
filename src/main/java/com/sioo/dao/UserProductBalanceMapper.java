package com.sioo.dao;

import com.sioo.user.api.po.UserProductBalance;

public interface UserProductBalanceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserProductBalance record);

    int insertSelective(UserProductBalance record);

    UserProductBalance selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserProductBalance record);

    int updateByPrimaryKey(UserProductBalance record);
}