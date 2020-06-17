package com.ibiz.api.service;

import com.ibiz.api.dao.ReportDao;
import com.ibiz.api.model.AccountVO;
import com.ibiz.api.model.Payload;
import com.ibiz.api.model.ReportVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
public class ReportService {

    @Resource(name = "reportDao")
    private ReportDao reportDao;

    //월간보고서리스트 조회
    @Transactional
    public List<ReportVO> selectReportList(Payload<ReportVO> requestPayload) {
        log.info("Call Service : " + this.getClass().getName() + ".selectReportList");
        AccountVO accountVO = requestPayload.getAccountVO();
        ReportVO reportVO = requestPayload.getDto();

        List<ReportVO> ReportList = reportDao.selectReportList(reportVO);

        if (accountVO.getRoleList().contains("AD")) {
            reportVO.setAccountRole("AD");
        }

        return ReportList;
    }
    //월간보고서 기준연도 리스트 조회
    @Transactional
    public List<ReportVO> selectCritYearList() {
        log.info("Call Service : " + this.getClass().getName() + ".selectCritYearList");
        List<ReportVO> reportResult;

        if(reportDao.selectCritYearList().get(0) != null) {
            reportResult = reportDao.selectCritYearList();
        }else {
            reportResult = null;
        }

        return reportResult;
    }
    //월간보고서상세내역 조회
    @Transactional
    public ReportVO selectReportDetail(Payload<ReportVO> requestPayload) {
        log.info("Call Service : " + this.getClass().getName() + ".selectReportDetail");
        AccountVO accountVO = requestPayload.getAccountVO();
        ReportVO reportVO = requestPayload.getDto();

        ReportVO report = reportDao.selectReporDetail(reportVO);

        return report;
    }

    //월간보고서 등록
    @Transactional
    public ReportVO insertReportDetail(Payload<ReportVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".insertReportDetail");
        AccountVO accountVO = requestPayload.getAccountVO();
        ReportVO reportVO = requestPayload.getDto();

        reportVO.setRegEmpId(accountVO.getEmpId());
        reportVO.setChgEmpId(accountVO.getEmpId());

        if(reportDao.selectIsAbleToSave(reportVO) == 0){
            reportDao.insertReporDetail(reportVO);
        }else{
            reportVO = null;
        }

        return reportVO;
    }
    //월간보고서 수정
    @Transactional
    public ReportVO updateReportDetail(Payload<ReportVO> requestPayload) {
        log.info("Call Service : " + this.getClass().getName() + ".updateReportDetail");
        AccountVO accountVO = requestPayload.getAccountVO();
        ReportVO reportVO = requestPayload.getDto();

        reportVO.setChgEmpId(accountVO.getEmpId());
        reportDao.updateReportDetail(reportVO);

        return reportVO;
    }
    //월간보고서 삭제
    @Transactional
    public ReportVO deleteReportDetail(Payload<ReportVO> requestPayload) {
        log.info("Call Service : " + this.getClass().getName() + ".deleteReportDetail");
        AccountVO accountVO = requestPayload.getAccountVO();
        ReportVO reportVO = requestPayload.getDto();

        reportDao.deleteReportDetail(reportVO);

        return reportVO;
    }


}
