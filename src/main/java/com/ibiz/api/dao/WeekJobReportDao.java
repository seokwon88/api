package com.ibiz.api.dao;

import com.ibiz.api.model.WeekJobReportSubVO;
import com.ibiz.api.model.WeekJobReportVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "weekJobReportDao")
public class WeekJobReportDao {

    @Autowired
    private SqlSessionTemplate mybatis;

    /*
     * SELECT
     */

    //주간업무보고 조회
    public List<WeekJobReportVO> selectWeekJobReportList(WeekJobReportVO weekJobReportVO) throws Exception {
        return mybatis.selectList( "SalesRecordMapper.Select_WeekJobReportList", weekJobReportVO);
    }

    //주간업무보고 조회(서브)
    public List<WeekJobReportSubVO> selectWeekJobReportSubList(WeekJobReportVO weekJobReportVO) throws Exception {
        return mybatis.selectList( "SalesRecordMapper.Select_WeekJobReportSubList", weekJobReportVO);
    }
}
