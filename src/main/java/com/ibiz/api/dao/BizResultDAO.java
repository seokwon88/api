package com.ibiz.api.dao;

import com.ibiz.api.model.*;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "bizResultDAO")
public class BizResultDAO {

    @Autowired
    private SqlSessionTemplate mybatis;

    /*
     * SELECT
     */

    //영업부서실적현황 리스트 조회
    public List<BusinessResultVO> selectExpectDeptStatsList(BusinessResultSearchVO businessResultSearchVO) {
        return mybatis.selectList("BizResultMapper.selectExpectDeptStatsList", businessResultSearchVO);
    }

    //영업대표실적현황 리스트 조회
    public List<BusinessResultVO> selectExpectEmployeeStatsList(BusinessResultSearchVO businessResultSearchVO) {
        return mybatis.selectList("BizResultMapper.selectExpectEmployeeStatsList", businessResultSearchVO);
    }

    //사업부분별 리스트 조회
    public List<BusinessResultVO> selectExpectBizGroupStatsList(BusinessResultSearchVO businessResultSearchVO) {
        return mybatis.selectList("BizResultMapper.selectExpectBizGroupStatsList", businessResultSearchVO);
    }

    //상품별 리스트 조회
    public List<BusinessResultVO> selectExpectProdGroupStatsList(BusinessResultSearchVO businessResultSearchVO) {
        return mybatis.selectList("BizResultMapper.selectExpectProdGroupStatsList", businessResultSearchVO);
    }

    //기준연도별 사업분류 리스트 조회
    public List<YearBizTypeDimVO> selectBsnsClsfList(YearBizTypeDimVO yearBizTypeDimVO) {
        return mybatis.selectList("BizResultMapper.selectBsnsClsfList",yearBizTypeDimVO);
    }

    //수주 예상/실적 영업부서 리스트 조회
    public List<SalesReportVO> selectWCTSalesReportList(BusinessResultSearchVO businessResultSearchVO) {
        return mybatis.selectList( "BizResultMapper.selectWCTSalesReportList", businessResultSearchVO);
    }

    //매입/매출 예상/실적 영업부서 리스트 조회
    public List<SalesReportVO> selectBuySellSalesReportList(BusinessResultSearchVO businessResultSearchVO) {
        return mybatis.selectList("BizResultMapper.selectBuySellSalesReportList", businessResultSearchVO);
    }

    //실적 비교
    public List<BusinessResultVO> selectMonthlyCompareStatsList(BusinessResultSearchVO businessResultSearchVO) {
        return mybatis.selectList("BizResultMapper.selectMonthlyCompareStatsList", businessResultSearchVO);
    }

    //주간업무보고 조회
    public List<WeekJobReportVO> selectWeeklyActivityList(WeekJobReportVO weekJobReportVO) throws Exception {
        return mybatis.selectList( "BizResultMapper.selectWeeklyActivityList", weekJobReportVO);
    }

    //주간업무보고 조회(서브)
    public List<WeekJobReportVO> selectWeeklyActivitySubList(WeekJobReportVO weekJobReportVO) throws Exception {
        return mybatis.selectList( "BizResultMapper.selectWeeklyActivitySubList", weekJobReportVO);
    }

    public List<MonthlyWorkVO> selectMonthlyWorkList(MonthlyWorkVO monthlyWorkVO) {
        return mybatis.selectList( "BizResultMapper.selectMonthlyWorkList", monthlyWorkVO);
    }

    //월간보고서 기준연도 리스트 조회
    public List<MonthlyWorkVO> selectCritYearList() {
        return mybatis.selectList( "BizResultMapper.selectCritYearList");
    }

    //월간보고서상세내역 조회
    public MonthlyWorkVO selectMonthlyWork(MonthlyWorkVO monthlyWorkVO) {
        return mybatis.selectOne( "BizResultMapper.selectMonthlyWork", monthlyWorkVO);
    }

    //저장가능여부 조회
    public int selectIsAbleToSave(MonthlyWorkVO monthlyWorkVO) {
        return mybatis.selectOne( "BizResultMapper.selectIsAbleToSave", monthlyWorkVO);
    }
    
    //월간보고서 등록
    public void insertMonthlyWork(MonthlyWorkVO monthlyWorkVO) throws Exception {
        mybatis.insert( "BizResultMapper.insertMonthlyWork", monthlyWorkVO);
    }

    //월간보고서 수정
    public void updateMonthlyWork(MonthlyWorkVO monthlyWorkVO) throws Exception {
        mybatis.update( "BizResultMapper.updateMonthlyWork", monthlyWorkVO);
    }

    //월간보고서 삭제
    public void deleteMonthlyWork(MonthlyWorkVO monthlyWorkVO) throws Exception {
        mybatis.delete("BizResultMapper.deleteMonthlyWork", monthlyWorkVO);
    }

}
