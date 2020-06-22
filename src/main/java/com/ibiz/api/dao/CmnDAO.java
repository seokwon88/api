package com.ibiz.api.dao;

import com.ibiz.api.model.DeptVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository(value = "cmnDAO")
public class CmnDAO {

    @Autowired
    private SqlSessionTemplate mybatis;

    /*
     * SELECT
     */

    public DeptVO selectHTRKDeptInfo(){
        return mybatis.selectOne("CmnMapper.Select_HTRKDeptInfo");
    }

}
