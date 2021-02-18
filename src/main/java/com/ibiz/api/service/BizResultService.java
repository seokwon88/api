package com.ibiz.api.service;

import com.ibiz.api.dao.BizResultDAO;
import com.ibiz.api.exception.NotNullException;
import com.ibiz.api.exception.UpdateDeniedException;
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

    //영업부서실적현황
    @Transactional
    public List<BusinessResultVO> selectExpectDeptStatsList(Payload<BusinessResultSearchVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".selectExpectDeptStatsList");
        BusinessResultSearchVO businessResultSearchVO = requestPayload.getDto();


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

        if(businessResultSearchVO.getBrslDtlDstCd() != null) {
            if(businessResultSearchVO.getBrslDtlDstCd().equals("BU") || businessResultSearchVO.getBrslDtlDstCd().equals("CU") || businessResultSearchVO.getBrslDtlDstCd().equals("DU")){
                businessResultSearchVO.setIsUnsold("Y");
            }

            if(businessResultSearchVO.getBrslDtlDstCd().substring(0,1).equals("A")) {
                list = bizResultDAO.selectWCTSalesReportList(businessResultSearchVO);
            }else if(businessResultSearchVO.getBrslDtlDstCd().substring(0,1).equals("B") || businessResultSearchVO.getBrslDtlDstCd().substring(0,1).equals("C")) {
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
    public List<MonthlyWorkVO> selectMonthlyWorkList(Payload<MonthlyWorkVO> requestPayload) {
        log.info("Call Service : " + this.getClass().getName() + ".selectMonthlyWorkList");
        AccountVO accountVO = requestPayload.getAccountVO();
        MonthlyWorkVO monthlyWorkVO = requestPayload.getDto();

        List<MonthlyWorkVO> ReportList = bizResultDAO.selectMonthlyWorkList(monthlyWorkVO);

        if (accountVO.getRoleList().contains("AD")) {
            monthlyWorkVO.setAccountRole("AD");
        }

        return ReportList;
    }
    //월간보고서 기준연도 리스트 조회
    @Transactional
    public List<MonthlyWorkVO> selectCritYearList() {
        log.info("Call Service : " + this.getClass().getName() + ".selectCritYearList");
        List<MonthlyWorkVO> reportResult;

        if(bizResultDAO.selectCritYearList().get(0) != null) {
            reportResult = bizResultDAO.selectCritYearList();
        }else {
            reportResult = null;
        }

        return reportResult;
    }
    //월간보고서상세내역 조회
    @Transactional
    public MonthlyWorkVO selectMonthlyWork(Payload<MonthlyWorkVO> requestPayload) {
        log.info("Call Service : " + this.getClass().getName() + ".selectMonthlyWork");
        AccountVO accountVO = requestPayload.getAccountVO();
        MonthlyWorkVO monthlyWorkVO = requestPayload.getDto();

        MonthlyWorkVO report = bizResultDAO.selectMonthlyWork(monthlyWorkVO);

        return report;
    }

    //월간보고서 등록
    @Transactional
    public MonthlyWorkVO insertMonthlyWork(Payload<MonthlyWorkVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".insertMonthlyWork");
        AccountVO accountVO = requestPayload.getAccountVO();
        MonthlyWorkVO monthlyWorkVO = requestPayload.getDto();

        monthlyWorkVO.setRegEmpId(accountVO.getEmpId());
        monthlyWorkVO.setChgEmpId(accountVO.getEmpId());

        if(bizResultDAO.selectIsAbleToSave(monthlyWorkVO) == 0){
            bizResultDAO.insertMonthlyWork(monthlyWorkVO);
        }else{
            monthlyWorkVO = null;
            throw new UpdateDeniedException("동일한 기준연월의 월간보고가 존재하여 저장이 불가합니다.", monthlyWorkVO);
        }

        return monthlyWorkVO;
    }
    //월간보고서 수정
    @Transactional
    public MonthlyWorkVO updateMonthlyWork(Payload<MonthlyWorkVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".updateMonthlyWork");
        AccountVO accountVO = requestPayload.getAccountVO();
        MonthlyWorkVO monthlyWorkVO = requestPayload.getDto();

        monthlyWorkVO.setChgEmpId(accountVO.getEmpId());
        bizResultDAO.updateMonthlyWork(monthlyWorkVO);

        return monthlyWorkVO;
    }
    //월간보고서 삭제
    @Transactional
    public MonthlyWorkVO deleteMonthlyWork(Payload<MonthlyWorkVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".deleteMonthlyWork");
        AccountVO accountVO = requestPayload.getAccountVO();
        MonthlyWorkVO monthlyWorkVO = requestPayload.getDto();

        bizResultDAO.deleteMonthlyWork(monthlyWorkVO);

        return monthlyWorkVO;
    }

    //사업프로젝트 리스트 조회
    @Transactional
    public List<BizProjectInfoVO> selectBizPrjtInfoList(Payload<BizProjectInfoVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".selectBizPrjtInfoList");
        BizProjectInfoVO bizProjectInfoVO = requestPayload.getDto();

        List<BizProjectInfoVO> list = bizResultDAO.selectBizPrjtInfoList(bizProjectInfoVO);

        for(int i = 0 ; i < list.size() ; i++){
            BizProjectInfoVO bizProjectInfo = new BizProjectInfoVO();
            bizProjectInfo.setPrjtId(list.get(i).getPrjtId());
            bizProjectInfo.setSeq(list.get(i).getSeq());
            bizProjectInfo.setRprtYn("Y");
            bizProjectInfo.setStartDate(bizProjectInfoVO.getStartDate());
            bizProjectInfo.setEndDate(bizProjectInfoVO.getEndDate());

            List<BizProjectReportVO> reportList = bizResultDAO.selectBizPrjtRprtBkdnList(bizProjectInfo);

            list.get(i).setBizProjectReportList(reportList);

            if(reportList.size() > 0){
                list.get(i).setRprtYn("Y");
            }else{
                list.get(i).setRprtYn("N");
            }

        }

        return list;
    }

    //사업프로젝트 기본 상세 조회
    @Transactional
    public BizProjectInfoVO selectBizPrjtInfo(Payload<BizProjectInfoVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".selectBizPrjtInfo");
        AccountVO accountVO = requestPayload.getAccountVO();
        BizProjectInfoVO bizProjectInfoVO = requestPayload.getDto();

        bizProjectInfoVO = bizResultDAO.selectBizPrjtInfo(bizProjectInfoVO);
        bizProjectInfoVO.setBizProjectReportList(bizResultDAO.selectBizPrjtRprtBkdnList(bizProjectInfoVO));

        return bizProjectInfoVO;
    }

    //사업프로젝트 기본 등록
    @Transactional
    public BizProjectInfoVO insertBizPrjtInfo(Payload<BizProjectInfoVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".insertBizPrjtInfo");
        AccountVO accountVO = requestPayload.getAccountVO();
        BizProjectInfoVO bizProjectInfoVO = requestPayload.getDto();

        bizProjectInfoVO.setRegEmpId(accountVO.getEmpId());
        bizProjectInfoVO.setChgEmpId(accountVO.getEmpId());

        try{
            //MAX SEQ
            int seq = bizResultDAO.selectBizPrjtSeq(bizProjectInfoVO).getSeq();
            seq+=1;

            // 사업프로젝트 등록
            bizProjectInfoVO.setSeq(seq);
            bizResultDAO.insertBizPrjtInfo(bizProjectInfoVO);

            //사업보고내역 등록
            for(BizProjectReportVO bizProjectReportVO : bizProjectInfoVO.getBizProjectReportList()){
                bizProjectReportVO.setPrjtId(bizProjectInfoVO.getPrjtId());
                bizProjectReportVO.setSeq(seq);
                bizProjectReportVO.setBsnsPrgsStatCd(bizProjectInfoVO.getBsnsPrgsStatCd());
                bizProjectReportVO.setChgEmpId(bizProjectInfoVO.getChgEmpId());

                bizResultDAO.insertBizPrjtRprtBkdnInfo(bizProjectReportVO);
            }

        }catch (Exception e){
            throw new NotNullException(bizProjectInfoVO);
        }

        return bizProjectInfoVO;
    }

    //사업프로젝트 기본 수정
    @Transactional
    public BizProjectInfoVO updateBizPrjtInfo(Payload<BizProjectInfoVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".updateBizPrjtInfo");
        AccountVO accountVO = requestPayload.getAccountVO();
        BizProjectInfoVO bizProjectInfoVO = requestPayload.getDto();

        bizProjectInfoVO.setChgEmpId(accountVO.getEmpId());

        try{
            // 사업프로젝트 수정
            bizResultDAO.updateBizPrjtInfo(bizProjectInfoVO);

            // 사업보고내역 수정
            for(BizProjectReportVO bizProjectReportVO : bizProjectInfoVO.getBizPrjtRprtDelList()){
                bizResultDAO.deleteBizPrjtRprtBkdnInfo(bizProjectReportVO);
            }

            for(BizProjectReportVO bizProjectReportVO : bizProjectInfoVO.getBizProjectReportList()){
                bizProjectReportVO.setChgEmpId(bizProjectInfoVO.getChgEmpId());

                if(bizProjectReportVO.getBsnsPrgsStatCd() == null){
                    bizProjectReportVO.setBsnsPrgsStatCd(bizProjectInfoVO.getBsnsPrgsStatCd());
                }
                if(bizProjectReportVO.getPrjtId() == null){
                    bizProjectReportVO.setPrjtId(bizProjectInfoVO.getPrjtId());
                    bizProjectReportVO.setSeq(bizProjectInfoVO.getSeq());
                    bizResultDAO.insertBizPrjtRprtBkdnInfo(bizProjectReportVO);
                }else{
                    bizResultDAO.updateBizPrjtRprtBkdnInfo(bizProjectReportVO);
                }

            }


        }catch (Exception e){
            throw new NotNullException(bizProjectInfoVO);
        }

        return bizProjectInfoVO;
    }

    //사업프로젝트 삭제
    @Transactional
    public BizProjectInfoVO deleteBizPrjtInfo(Payload<BizProjectInfoVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".deleteBizPrjtInfo");
        AccountVO accountVO = requestPayload.getAccountVO();
        BizProjectInfoVO bizProjectInfoVO = requestPayload.getDto();
        BizProjectReportVO bizProjectReportVO = new BizProjectReportVO();

        bizProjectReportVO.setPrjtId(bizProjectInfoVO.getPrjtId());
        bizProjectReportVO.setSeq(bizProjectInfoVO.getSeq() );

        bizResultDAO.deleteBizPrjtRprtBkdnInfo(bizProjectReportVO);

        bizResultDAO.deleteBizPrjtInfo(bizProjectInfoVO);


        return bizProjectInfoVO;
    }

    //실적상세리스트
    @Transactional
    public List<SalesReportVO> selectSalesRealReportDetailList(Payload<BusinessResultSearchVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".selectSalesRealReportDetailList");
        BusinessResultSearchVO businessResultSearchVO = requestPayload.getDto();

        List<SalesReportVO> list = new ArrayList<>();

        list = bizResultDAO.selectSalesRealReportDetailList(businessResultSearchVO);

        return list;
    }

}
