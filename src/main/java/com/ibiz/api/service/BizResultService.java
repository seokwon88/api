package com.ibiz.api.service;

import com.ibiz.api.dao.BizResultDAO;
import com.ibiz.api.dao.CmnDAO;
import com.ibiz.api.model.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
public class BizResultService {

    @Resource(name = "bizResultDAO")
    private BizResultDAO bizResultDAO;

    @Resource(name = "cmnDAO")
    private CmnDAO cmnDAO;

    //영업부서실적현황
    @Transactional
    public List<BusinessResultVO> selectExpectDeptStatsList(Payload<BusinessResultSearchVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".selectExpectDeptStatsList");
        BusinessResultSearchVO businessResultSearchVO = requestPayload.getDto();

        if(businessResultSearchVO.getDeptId().equals("")) {
            businessResultSearchVO.setDeptId(cmnDAO.selectHTRKDeptInfo().getDeptId());
        }

        businessResultSearchVO.setJanDate(businessResultSearchVO.getCritYear()+"01"); // 기준연도+1월
        businessResultSearchVO.setFromDate(businessResultSearchVO.getCritYear()+ businessResultSearchVO.getCritMon()); // 기준월
        businessResultSearchVO.setRsdnStartDate(businessResultSearchVO.getCritYear()+ businessResultSearchVO.getRsdnStartMon()); // 잔여시작월
        businessResultSearchVO.setRsdnEndDate(businessResultSearchVO.getCritYear()+ businessResultSearchVO.getRsdnEndMon()); // 잔여종료월 (구 toDate)

        List<BusinessResultVO> list = bizResultDAO.selectExpectDeptStatsList(businessResultSearchVO);

        return list;
    }

    //영업대표실적현황
    @Transactional
    public List<BusinessResultVO> selectExpectEmployeeStatsList(Payload<BusinessResultSearchVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".selectExpectEmployeeStatsList");
        BusinessResultSearchVO businessResultSearchVO = requestPayload.getDto();

        if(businessResultSearchVO.getDeptId().equals("")) {
            businessResultSearchVO.setDeptId(cmnDAO.selectHTRKDeptInfo().getDeptId());
        }
        businessResultSearchVO.setJanDate(businessResultSearchVO.getCritYear()+"01"); // 기준연도+1월
        businessResultSearchVO.setFromDate(businessResultSearchVO.getCritYear()+ businessResultSearchVO.getCritMon()); // 기준월
        businessResultSearchVO.setRsdnStartDate(businessResultSearchVO.getCritYear()+ businessResultSearchVO.getRsdnStartMon()); // 잔여시작월
        businessResultSearchVO.setRsdnEndDate(businessResultSearchVO.getCritYear()+ businessResultSearchVO.getRsdnEndMon()); // 잔여종료월 (구 toDate)

        List<BusinessResultVO> list = bizResultDAO.selectExpectEmployeeStatsList(businessResultSearchVO);

        return list;
    }

    //사업부문실적현황
    @Transactional
    public List<BusinessResultVO> selectExpectBizGroupStatsList(Payload<BusinessResultSearchVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".selectExpectBizGroupStatsList");
        BusinessResultSearchVO businessResultSearchVO = requestPayload.getDto();

        if(businessResultSearchVO.getDeptId().equals("")) {
            businessResultSearchVO.setDeptId(cmnDAO.selectHTRKDeptInfo().getDeptId());
        }
        businessResultSearchVO.setJanDate(businessResultSearchVO.getCritYear()+"01"); // 기준연도+1월
        businessResultSearchVO.setFromDate(businessResultSearchVO.getCritYear()+ businessResultSearchVO.getCritMon()); // 기준월
        businessResultSearchVO.setRsdnStartDate(businessResultSearchVO.getCritYear()+ businessResultSearchVO.getRsdnStartMon()); // 잔여시작월
        businessResultSearchVO.setRsdnEndDate(businessResultSearchVO.getCritYear()+ businessResultSearchVO.getRsdnEndMon()); // 잔여종료월 (구 toDate)

        List<BusinessResultVO> list = bizResultDAO.selectExpectBizGroupStatsList(businessResultSearchVO);

        return list;
    }

    //상품실적현황
    @Transactional
    public List<BusinessResultVO> selectExpectProdGroupStatsList(Payload<BusinessResultSearchVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".selectExpectProdGroupStatsList");
        BusinessResultSearchVO businessResultSearchVO = requestPayload.getDto();

        businessResultSearchVO.setJanDate(businessResultSearchVO.getCritYear()+"01"); // 기준연도+1월
        businessResultSearchVO.setFromDate(businessResultSearchVO.getCritYear()+ businessResultSearchVO.getCritMon()); // 기준월
        businessResultSearchVO.setRsdnStartDate(businessResultSearchVO.getCritYear()+ businessResultSearchVO.getRsdnStartMon()); // 잔여시작월
        businessResultSearchVO.setRsdnEndDate(businessResultSearchVO.getCritYear()+ businessResultSearchVO.getRsdnEndMon()); // 잔여종료월 (구 toDate)

        List<BusinessResultVO> list = bizResultDAO.selectExpectProdGroupStatsList(businessResultSearchVO);

        return list;
    }

    //실적상세리스트
    @Transactional
    public List<SalesReportVO> selectSalesReportList(Payload<BusinessResultSearchVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".selectSalesReportList");
        BusinessResultSearchVO businessResultSearchVO = requestPayload.getDto();

        List<SalesReportVO> list = new ArrayList<>();

        if(businessResultSearchVO.getBsnsRslDtlDstCd() != null) {
            if(businessResultSearchVO.getBsnsRslDtlDstCd().equals("BU") || businessResultSearchVO.getBsnsRslDtlDstCd().equals("CU") || businessResultSearchVO.getBsnsRslDtlDstCd().equals("DU")){
                businessResultSearchVO.setIsUnsold("Y");
            }

            if(businessResultSearchVO.getBsnsRslDtlDstCd().substring(0,1).equals("A")) {
                list = bizResultDAO.selectWCTSalesReportList(businessResultSearchVO);
            }else if(businessResultSearchVO.getBsnsRslDtlDstCd().substring(0,1).equals("B") || businessResultSearchVO.getBsnsRslDtlDstCd().substring(0,1).equals("C")) {
                list = bizResultDAO.selectBuySellSalesReportList(businessResultSearchVO);
            }
        }else {
            if(businessResultSearchVO.getBrslDstCd().equals("A")) {
                list = bizResultDAO.selectWCTSalesReportList(businessResultSearchVO);
            }else if(businessResultSearchVO.getBrslDstCd().equals("B") || businessResultSearchVO.getBrslDstCd().equals("C")) {
                list = bizResultDAO.selectBuySellSalesReportList(businessResultSearchVO);
            }
        }

        return list;
    }

    //사업분류 콤보박스 리스트
    public List<YearBizTypeDimVO> selectBsnsClsfList(Payload<YearBizTypeDimVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".selectBsnsClsfList");
        YearBizTypeDimVO yearBizTypeDimVO = requestPayload.getDto();

        List<YearBizTypeDimVO> list = new ArrayList<>();
        list = bizResultDAO.selectBsnsClsfList(yearBizTypeDimVO);

        return list;
    }

    //사업 실적비교
    @Transactional
    public List<BusinessResultVO> selectMonthlyCompareStatsList(Payload<BusinessResultSearchVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".selectMonthlyCompareStatsList");
        BusinessResultSearchVO businessResultSearchVO = requestPayload.getDto();

        List<BusinessResultVO> list = new ArrayList<>();
        list = bizResultDAO.selectMonthlyCompareStatsList(businessResultSearchVO);

        return list;
    }

    //주간업무보고 조회
    @Transactional
    public List<WeekJobReportVO> selectWeeklyActivityList(Payload<WeekJobReportVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".selectMonthlyWorkList");
        WeekJobReportVO weekJobReportVO = requestPayload.getDto();

        List<WeekJobReportVO> weekJobReportList = bizResultDAO.selectWeeklyActivityList(weekJobReportVO);

        return weekJobReportList;
    }

    //주간업무보고 조회(서브)
    @Transactional
    public List<WeekJobReportVO> selectWeeklyActivitySubList(Payload<WeekJobReportVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".selectWeeklyActivitySubList");
        WeekJobReportVO weekJobReportVO = requestPayload.getDto();

        List<WeekJobReportVO> weekJobReporSubtList = bizResultDAO.selectWeeklyActivitySubList(weekJobReportVO);

        return weekJobReporSubtList;
    }


    //월간보고서리스트 조회
    @Transactional
    public List<MontlyWorkVO> selectMonthlyWorkList(Payload<MontlyWorkVO> requestPayload) {
        log.info("Call Service : " + this.getClass().getName() + ".selectMonthlyWorkList");
        AccountVO accountVO = requestPayload.getAccountVO();
        MontlyWorkVO montlyWorkVO = requestPayload.getDto();

        List<MontlyWorkVO> ReportList = bizResultDAO.selectMonthlyWorkList(montlyWorkVO);

        if (accountVO.getRoleList().contains("AD")) {
            montlyWorkVO.setAccountRole("AD");
        }

        return ReportList;
    }
    //월간보고서 기준연도 리스트 조회
    @Transactional
    public List<MontlyWorkVO> selectCritYearList() {
        log.info("Call Service : " + this.getClass().getName() + ".selectCritYearList");
        List<MontlyWorkVO> reportResult;

        if(bizResultDAO.selectCritYearList().get(0) != null) {
            reportResult = bizResultDAO.selectCritYearList();
        }else {
            reportResult = null;
        }

        return reportResult;
    }
    //월간보고서상세내역 조회
    @Transactional
    public MontlyWorkVO selectMonthlyWork(Payload<MontlyWorkVO> requestPayload) {
        log.info("Call Service : " + this.getClass().getName() + ".selectMonthlyWork");
        AccountVO accountVO = requestPayload.getAccountVO();
        MontlyWorkVO montlyWorkVO = requestPayload.getDto();

        MontlyWorkVO report = bizResultDAO.selectMonthlyWork(montlyWorkVO);

        return report;
    }

    //월간보고서 등록
    @Transactional
    public MontlyWorkVO insertMonthlyWork(Payload<MontlyWorkVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".insertMonthlyWork");
        AccountVO accountVO = requestPayload.getAccountVO();
        MontlyWorkVO montlyWorkVO = requestPayload.getDto();

        montlyWorkVO.setRegEmpId(accountVO.getEmpId());
        montlyWorkVO.setChgEmpId(accountVO.getEmpId());

        if(bizResultDAO.selectIsAbleToSave(montlyWorkVO) == 0){
            bizResultDAO.insertMonthlyWork(montlyWorkVO);
        }else{
            montlyWorkVO = null;
        }

        return montlyWorkVO;
    }
    //월간보고서 수정
    @Transactional
    public MontlyWorkVO updateMonthlyWork(Payload<MontlyWorkVO> requestPayload) {
        log.info("Call Service : " + this.getClass().getName() + ".updateMonthlyWork");
        AccountVO accountVO = requestPayload.getAccountVO();
        MontlyWorkVO montlyWorkVO = requestPayload.getDto();

        montlyWorkVO.setChgEmpId(accountVO.getEmpId());
        bizResultDAO.updateMonthlyWork(montlyWorkVO);

        return montlyWorkVO;
    }
    //월간보고서 삭제
    @Transactional
    public MontlyWorkVO deleteMonthlyWork(Payload<MontlyWorkVO> requestPayload) {
        log.info("Call Service : " + this.getClass().getName() + ".deleteMonthlyWork");
        AccountVO accountVO = requestPayload.getAccountVO();
        MontlyWorkVO montlyWorkVO = requestPayload.getDto();

        bizResultDAO.deleteMonthlyWork(montlyWorkVO);

        return montlyWorkVO;
    }

}
