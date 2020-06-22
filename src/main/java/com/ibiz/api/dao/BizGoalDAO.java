package com.ibiz.api.dao;

import com.ibiz.api.model.*;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository(value = "bizGoalDAO")
public class BizGoalDAO {

    @Autowired
    private SqlSessionTemplate mybatis;

    /*
     * SELECT
     */

    //사업목표 (영업부서/영업대표)
    public List<YearDeptResultVO> selectMonthlyGoalList(BizGoalSearchVO bizGoalSearchVO) throws Exception {
        return mybatis.selectList("BizGoalMapper.selectMonthlyGoalList", bizGoalSearchVO);
    }

    //월별영업부서실적 조회
    public List<YearDeptResultVO> selectMonthlyDeptStatsList(BizGoalSearchVO bizGoalSearchVO) throws Exception {
        return mybatis.selectList("BizGoalMapper.selectMonthlyDeptStatsList", bizGoalSearchVO);
    }

    //월별영업대표 조회
    public List<YearEmpResultVO> selectMonthlyEmployeeStatsList(BizGoalSearchVO bizGoalSearchVO) throws Exception {
        return mybatis.selectList("BizGoalMapper.selectMonthlyEmployeeStatsList", bizGoalSearchVO);
    }

    //월별사업부문실적 조회
    public List<YearDeptResultVO> selectMonthlyBizGroupStatsList(BizGoalSearchVO bizGoalSearchVO) throws Exception {
        return mybatis.selectList("BizGoalMapper.selectMonthlyBizGroupStatsList", bizGoalSearchVO);
    }

    //사업분류 - 사업목표 존재여부 체크
    public int selectisExistsBizGoal(BizGoalSearchVO bizGoalSearchVO) throws Exception {
        return mybatis.selectOne("BizGoalMapper.selectisExistsBizGoal", bizGoalSearchVO);
    }

    //실적관련 유효한 수정기간인지 여부 체크
    public Map<String, String> selectIsAvlChgDate(BizGoalSearchVO bizGoalSearchVO) throws Exception {
        return mybatis.selectOne("BizGoalMapper.selectIsAvlChgDate", bizGoalSearchVO);
    }

    //기준연도 조회(max)
    public Map<String, String> selectMaxCritYear(BizGoalSearchVO bizGoalSearchVO) throws Exception {
        return mybatis.selectOne("BizGoalMapper.selectMaxCritYear", bizGoalSearchVO);
    }

    //기준연도 조회(max, min)
    public Map<String, String> selectMinMaxCritYear(BizGoalSearchVO bizGoalSearchVO) throws Exception {
        return mybatis.selectOne("BizGoalMapper.selectMinMaxCritYear", bizGoalSearchVO);
    }

    /*
     * INSERT
     */

    //사업목표 등록(월별부서)
    public void insertMonthlyDeptGoal(YearDeptResultVO yearDeptResultVO) {
        mybatis.update( "BizGoalMapper.insertMonthlyDeptGoal", yearDeptResultVO);
    }

    //사업목표 등록(월별부서)
    public void insertMonthlyEmpGoal(YearEmpResultVO yearEmpResultVO) {
        mybatis.update( "BizGoalMapper.insertMonthlyEmpGoal", yearEmpResultVO);
    }

    /*
     * UPDATE
     */

    //사업목표 수립 >> 확정 (영업부서)
    public void insertMonthlyDeptGoalDcd(YearDeptResultVO yearDeptResultVO) throws Exception {
        mybatis.insert( "BizGoalMapper.insertMonthlyDeptGoalDcd", yearDeptResultVO);
    }

    //사업목표 수립 >> 확정 (영업대표)
    public void insertMonthlyEmpGoalDcd(YearEmpResultVO yearEmpResultVO) throws Exception {
        mybatis.insert("BizGoalMapper.insertMonthlyEmpGoalDcd", yearEmpResultVO);
    }

    //사업목표 수립 >> 확정 (영업부서) - 하위부서포함
    public void insertMonthlyDeptLwrkDeptCvrdGoal(BizGoalSearchVO bizGoalSearchVO) {
        mybatis.update( "BizGoalMapper.insertMonthlyDeptLwrkDeptCvrdGoal", bizGoalSearchVO);
    }

    //사업목표 수립 >> 확정 (영업대표) - 하위부서포함
    public void insertMonthlyEmpLwrkDeptCvrdGoal(BizGoalSearchVO bizGoalSearchVO) throws Exception {
        mybatis.insert( "BizGoalMapper.insertMonthlyEmpLwrkDeptCvrdGoal", bizGoalSearchVO);
    }

    /*
     * DELETE
     */

    //사업목표 전체삭제(월별부서)
    public void deleteMonthlyDeptGoal(YearDeptResultVO yearDeptResultVO) throws Exception {
        mybatis.delete("BizGoalMapper.deleteMonthlyDeptGoal", yearDeptResultVO);
    }

    //사업목표 전체삭제(월별영업대표)
    public void deleteMonthlyEmpGoal(YearEmpResultVO yearEmpResultVO) throws Exception {
        mybatis.delete("BizGoalMapper.deleteMonthlyEmpGoal", yearEmpResultVO);
    }

    // 사업목표 목표확정 전체삭제(월별영업대표)
    public void deleteGoalDcdMonthlyEmp(YearEmpResultVO yearEmpResultVO) throws Exception {
        mybatis.delete("BizGoalMapper.deleteGoalDcdMonthlyEmp", yearEmpResultVO);
    }

    //사업목표 목표확정 삭제(월별부서)
    public void deleteGoalDcdMonthlyDept(YearDeptResultVO yearDeptResultVO) throws Exception {
        mybatis.delete("BizGoalMapper.deleteGoalDcdMonthlyDept", yearDeptResultVO);
    }

    //사업목표 목표확정 삭제(월별부서) 하위부서포함일 경우
    public void deleteGoalDcdMonthlyDeptForLwrkDept(BizGoalSearchVO bizGoalSearchVO) throws Exception {
        mybatis.delete("BizGoalMapper.deleteGoalDcdMonthlyDeptForLwrkDept", bizGoalSearchVO);
    }

    // 사업목표 목표확정 전체삭제(월별영업대표) 하위부서포함일 경우
    public void deleteGoalDcdMonthlyEmpForLwrkDept(BizGoalSearchVO bizGoalSearchVO) throws Exception {
        mybatis.delete("BizGoalMapper.deleteGoalDcdMonthlyEmpForLwrkDept", bizGoalSearchVO);
    }
}
