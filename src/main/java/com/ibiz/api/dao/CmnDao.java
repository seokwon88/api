package com.ibiz.api.dao;

import com.ibiz.api.model.DeptVO;
import com.ibiz.api.model.ReportVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "cmnDao")
public class CmnDao {

    @Autowired
    private SqlSessionTemplate mybatis;

    /*
     * SELECT
     */

    public DeptVO selectHTRKDeptInfo(){
        return mybatis.selectOne("CmnMapper.Select_HTRKDeptInfo");
    }

}
