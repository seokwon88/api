package com.ibiz.api.dao;

import com.ibiz.api.model.ReportVO;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository(value = "reportDao")
public class ReportDao {

    @Autowired
    private SqlSessionTemplate mybatis;

    /*
     * SELECT
     */

    //월간보고서리스트 조회
    public List<ReportVO> selectReportList(ReportVO reportVO) {
        return mybatis.selectList( "ReportMapper.Select_reportList", reportVO);
    }

    //월간보고서 기준연도 리스트 조회
    public List<ReportVO> selectCritYearList() {
        return mybatis.selectList( "ReportMapper.Select_critYearList");
    }
    //월간보고서상세내역 조회
    public ReportVO selectReporDetail(ReportVO reportVO) {
        return mybatis.selectOne( "ReportMapper.Select_reporDetail", reportVO);
    }
    //저장가능여부 조회
    public int selectIsAbleToSave(ReportVO reportVO) {
        return mybatis.selectOne( "ReportMapper.Select_isAbleToSave", reportVO);
    }

    /*
     * INSERT
     */
    //월간보고서 등록
    public void insertReporDetail(ReportVO reportVO) throws Exception {
        mybatis.insert( "ReportMapper.Insert_reporDetail", reportVO);
    }

    /*
     * UPDATE
     */
    //월간보고서 수정
    public void updateReportDetail(ReportVO reportVO) {
        mybatis.update( "ReportMapper.Update_reportDetail", reportVO);
    }

    /*
     * DELETE
     */
    //월간보고서 삭제
    public void deleteReportDetail(ReportVO reportVO) {
        mybatis.delete("ReportMapper.Delete_reportDetail", reportVO);
    }

}
