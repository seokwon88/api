package com.ibiz.api.dao;

import com.ibiz.api.model.*;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository(value = "businessTargetDao")
public class BusinessTargetDao {

    @Autowired
    private SqlSessionTemplate mybatis;

    /*
     * SELECT
     */

    //사업목표 (영업부서/영업대표)
    public List<BusinessTargetForDeptMMVO> selectBusinessTargetList(BusinessTargetSearchVO businessTargetSearchVO) throws Exception {
        return mybatis.selectList("BusinessTargetMapper.Select_businessTargetList", businessTargetSearchVO);
    }

    //월별영업부서실적 조회
    public List<BusinessTargetForDeptMMVO> selectBusinessTargetForDeptResult(BusinessTargetSearchVO businessTargetSearchVO) throws Exception {
        return mybatis.selectList("BusinessTargetMapper.Select_businessTargetForDeptResult", businessTargetSearchVO);
    }

    //월별영업대표 조회
    public List<BusinessTargetForEmpMMVO> selectBusinessTargetForEmpResult(BusinessTargetSearchVO businessTargetSearchVO) throws Exception {
        return mybatis.selectList("BusinessTargetMapper.Select_businessTargetForEmpResult", businessTargetSearchVO);
    }

    //월별사업부문실적 조회
    public List<BusinessTargetForDeptMMVO> selectBusinessTargetProductResult(BusinessTargetSearchVO businessTargetSearchVO) throws Exception {
        return mybatis.selectList("BusinessTargetMapper.Select_businessTargetProductResult",businessTargetSearchVO);
    }

    //사업분류 - 사업목표 존재여부 체크
    public int selectIsExistsBusinessTarget(BusinessTargetSearchVO businessTargetSearchVO) throws Exception {
        return mybatis.selectOne("BusinessTargetMapper.Select_isExistsBusinessTarget", businessTargetSearchVO);
    }

/*
    //사업분류 - 월별부서 사업목표 존재여부 체크
    public Map<String, String> selectIsExistsBusinessTargetDept(BusinessTargetForDeptMMVO businessTargetForDeptMMVO) throws Exception {
        return mybatis.selectOne("BusinessTargetMapper.Select_isExistsBusinessTargetDept", businessTargetForDeptMMVO);
    }

    //사업분류 - 월별부서 사업목표 존재여부 체크
    public Map<String, String> selectIsExistsBusinessTargetEmp(BusinessTargetForEmpMMVO businessTargetForEmpMMVO) throws Exception {
        return mybatis.selectOne("BusinessTargetMapper.Select_isExistsBusinessTargetEmp", businessTargetForEmpMMVO);
    }*/

    //실적관련 유효한 수정기간인지 여부 체크
    public Map<String, String> selectIsOpenAvlDate(BusinessTargetSearchVO businessTargetSearchVO) throws Exception {
        return mybatis.selectOne("BusinessTargetMapper.Select_isOpenAvlDate",businessTargetSearchVO);
    }

    //기준연도 조회(max)
    public Map<String, String> selectStandardCritYear(BusinessTargetSearchVO businessTargetSearchVO) throws Exception {
        return mybatis.selectOne("BusinessTargetMapper.Select_standardCritYear",businessTargetSearchVO);
    }

    //기준연도 조회(max, min)
    public Map<String, String> selectBusinessTargetCritYear(BusinessTargetSearchVO businessTargetSearchVO) throws Exception {
        return mybatis.selectOne("BusinessTargetMapper.Select_businessTargetCritYear",businessTargetSearchVO);
    }

    /*
     * INSERT
     */

    //사업목표 등록(월별부서)
    public void insertBusinessTargetDeptForMM(BusinessTargetForDeptMMVO businessTargetForDeptMMVO) {
        mybatis.update( "BusinessTargetMapper.Insert_businessTargetDeptForMM", businessTargetForDeptMMVO);
    }

    //사업목표 등록(월별부서)
    public void insertBusinessTargetEmpForMM(BusinessTargetForEmpMMVO businessTargetForEmpMMVO) {
        mybatis.update( "BusinessTargetMapper.Insert_businessTargetEmpForMM", businessTargetForEmpMMVO);
    }

    /*
     * UPDATE
     */

    //사업목표 수립 >> 확정 (영업부서)
    public void updateBusinessTargetDeptForMM(BusinessTargetForDeptMMVO businessTargetForDeptMMVO) throws Exception {
        mybatis.insert( "BusinessTargetMapper.Insert_businessTargetDeptForMMConfirm", businessTargetForDeptMMVO);
    }

    //사업목표 수립 >> 확정 (영업대표)
    public void updateBusinessTargetEmpForMM(BusinessTargetForEmpMMVO businessTargetForEmpMMVO) throws Exception {
        mybatis.insert("BusinessTargetMapper.Insert_businessTargetEmpForMMConfirm", businessTargetForEmpMMVO);
    }

    //사업목표 수립 >> 확정 (영업부서) - 하위부서포함
    public void updateLowerDeptBusinessTargetDeptForMM(BusinessTargetSearchVO businessTargetSearchVO) {
        mybatis.update( "BusinessTargetMapper.Insert_LowerDeptBusinessTargetDeptForMMConfirm", businessTargetSearchVO);
    }

    //사업목표 수립 >> 확정 (영업대표) - 하위부서포함
    public void updateLowerDeptBusinessTargetEmpForMM(BusinessTargetSearchVO businessTargetSearchVO) throws Exception {
        mybatis.insert( "BusinessTargetMapper.Insert_LowerDeptBusinessTargetEmpForMMConfirm", businessTargetSearchVO);
    }

    /*
     * DELETE
     */

    //사업목표 전체삭제(월별부서)
    public void deleteAllBusinessTargetDeptForMM(BusinessTargetForDeptMMVO businessTargetForDeptMMVO) throws Exception {
        mybatis.delete("BusinessTargetMapper.Delete_allBusinessTargetDeptForMM", businessTargetForDeptMMVO);
    }

    //사업목표 전체삭제(월별영업대표)
    public void deleteAllBusinessTargetEmpForMM(BusinessTargetForEmpMMVO businessTargetForEmpMMVO) throws Exception {
        mybatis.delete("BusinessTargetMapper.Delete_allBusinessTargetEmpForMM", businessTargetForEmpMMVO);
    }

    // 사업목표 목표확정 전체삭제(월별영업대표)
    public void deleteOnlyGoalBusinessTargetEmpForMM(BusinessTargetForEmpMMVO businessTargetForEmpMMVO) throws Exception {
        mybatis.delete("BusinessTargetMapper.Delete_onlyGoalBusinessTargetEmpForMM", businessTargetForEmpMMVO);
    }

    //사업목표 목표확정 삭제(월별부서)
    public void deleteOnlyGoalBusinessTargetDeptForMM(BusinessTargetForDeptMMVO businessTargetForDeptMMVO) throws Exception {
        mybatis.delete("BusinessTargetMapper.Delete_onlyGoalBusinessTargetDeptForMM", businessTargetForDeptMMVO);
    }

    //사업목표 목표확정 삭제(월별부서) 하위부서포함일 경우
    public void deleteGoalBusinessTargetDeptForLowerDept(BusinessTargetSearchVO businessTargetSearchVO) throws Exception {
        mybatis.delete("BusinessTargetMapper.Delete_goalBusinessTargetDeptForLowerDept", businessTargetSearchVO);
    }

    // 사업목표 목표확정 전체삭제(월별영업대표) 하위부서포함일 경우
    public void deleteGoalBusinessTargetEmpForLowerDept(BusinessTargetSearchVO businessTargetSearchVO) throws Exception {
        mybatis.delete("BusinessTargetMapper.Delete_goalBusinessTargetEmpForLowerDept", businessTargetSearchVO);
    }
}
