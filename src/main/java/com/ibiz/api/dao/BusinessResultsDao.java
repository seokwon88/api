package com.ibiz.api.dao;

import com.ibiz.api.model.*;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "businessResultsDao")
public class BusinessResultsDao {

    @Autowired
    private SqlSessionTemplate mybatis;

    /*
     * SELECT
     */

    //영업부서실적현황 리스트 조회
    public List<BusinessResultsVO> selectBusinessResultsByDeptList(BusinessResultsSearchVO businessResultsSearchVO) {
        return mybatis.selectList("BusinessResultsMapper.Select_BusinessResultsByDeptList",businessResultsSearchVO);
    }

    //영업대표실적현황 리스트 조회
    public List<BusinessResultsVO> selectBusinessResultsByEmpList(BusinessResultsSearchVO businessResultsSearchVO) {
        return mybatis.selectList("BusinessResultsMapper.Select_BusinessResultsByEmpList",businessResultsSearchVO);
    }

    //사업부분별 리스트 조회
    public List<BusinessResultsVO> selectBusinessResultsByBsnsClsfCdList(BusinessResultsSearchVO businessResultsSearchVO) {
        return mybatis.selectList("BusinessResultsMapper.Select_BusinessResultsByBsnsClsfCdList",businessResultsSearchVO);
    }

    //상품별 리스트 조회
    public List<BusinessResultsVO> selectBusinessResultsByProdCdList(BusinessResultsSearchVO businessResultsSearchVO) {
        return mybatis.selectList("BusinessResultsMapper.Select_BusinessResultsByProdCdList",businessResultsSearchVO);
    }

    //기준연도별 사업분류 리스트 조회
    public List<BusinessClassByYearVO> selectBsnsClsfCdListByCritYear(BusinessResultsSearchVO businessResultsSearchVO) {
        return mybatis.selectList("BusinessResultsMapper.Select_BsnsClsfCdListByCritYear",businessResultsSearchVO);
    }

    //수주 예상/실적 영업부서 리스트 조회
    public List<BusinessResultsDetailVO> selectBusinessResultsWCTDetailList(BusinessResultsSearchVO businessResultsSearchVO) {
        return mybatis.selectList( "BusinessResultsMapper.Select_BusinessResultsWCTDetailList",businessResultsSearchVO);
    }

    //매입/매출 예상/실적 영업부서 리스트 조회
    public List<BusinessResultsDetailVO> selectBusinessResultsBuySellDetailList(BusinessResultsSearchVO businessResultsSearchVO) {
        return mybatis.selectList("BusinessResultsMapper.Select_BusinessResultsBuySellDetailList",businessResultsSearchVO);
    }

    //실적 비교
    public List<BusinessResultsVO> selectResultCmprList(BusinessResultsSearchVO businessResultsSearchVO) {
        return mybatis.selectList("BusinessResultsMapper.Select_ResultCmprList",businessResultsSearchVO);
    }
}
