package com.ibiz.api.service;

import com.ibiz.api.dao.BusinessResultsDao;
import com.ibiz.api.dao.CmnDao;
import com.ibiz.api.model.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
public class BusinessResultsService {

    @Resource(name = "businessResultsDao")
    private BusinessResultsDao businessResultsDao;

    @Resource(name = "cmnDao")
    private CmnDao cmnDao;

    //영업부서실적현황
    @Transactional
    public List<BusinessResultsVO> selectBusinessResultsByDeptList(Payload<BusinessResultsSearchVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".selectBusinessResultsByDeptList");
        BusinessResultsSearchVO businessResultsSearchVO = requestPayload.getDto();

        if(businessResultsSearchVO.getDeptId().equals("")) {
            businessResultsSearchVO.setDeptId(cmnDao.selectHTRKDeptInfo().getDeptId());
        }

        businessResultsSearchVO.setJanDate(businessResultsSearchVO.getCritYear()+"01"); // 기준연도+1월
        businessResultsSearchVO.setFromDate(businessResultsSearchVO.getCritYear()+businessResultsSearchVO.getCritMon()); // 기준월
        businessResultsSearchVO.setRsdnStartDate(businessResultsSearchVO.getCritYear()+businessResultsSearchVO.getRsdnStartMon()); // 잔여시작월
        businessResultsSearchVO.setRsdnEndDate(businessResultsSearchVO.getCritYear()+businessResultsSearchVO.getRsdnEndMon()); // 잔여종료월 (구 toDate)

        List<BusinessResultsVO> list = businessResultsDao.selectBusinessResultsByDeptList(businessResultsSearchVO);

        return list;
    }

    //영업대표실적현황
    @Transactional
    public List<BusinessResultsVO> selectBusinessResultsByEmpList(Payload<BusinessResultsSearchVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".selectBusinessResultsByEmpList");
        BusinessResultsSearchVO businessResultsSearchVO = requestPayload.getDto();

        if(businessResultsSearchVO.getDeptId().equals("")) {
            businessResultsSearchVO.setDeptId(cmnDao.selectHTRKDeptInfo().getDeptId());
        }
        businessResultsSearchVO.setJanDate(businessResultsSearchVO.getCritYear()+"01"); // 기준연도+1월
        businessResultsSearchVO.setFromDate(businessResultsSearchVO.getCritYear()+businessResultsSearchVO.getCritMon()); // 기준월
        businessResultsSearchVO.setRsdnStartDate(businessResultsSearchVO.getCritYear()+businessResultsSearchVO.getRsdnStartMon()); // 잔여시작월
        businessResultsSearchVO.setRsdnEndDate(businessResultsSearchVO.getCritYear()+businessResultsSearchVO.getRsdnEndMon()); // 잔여종료월 (구 toDate)

        List<BusinessResultsVO> list = businessResultsDao.selectBusinessResultsByEmpList(businessResultsSearchVO);

        return list;
    }

    //사업부문실적현황
    @Transactional
    public List<BusinessResultsVO> selectBusinessResultsByBsnsClsfCdList(Payload<BusinessResultsSearchVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".selectBusinessResultsByBsnsClsfCdList");
        BusinessResultsSearchVO businessResultsSearchVO = requestPayload.getDto();

        if(businessResultsSearchVO.getDeptId().equals("")) {
            businessResultsSearchVO.setDeptId(cmnDao.selectHTRKDeptInfo().getDeptId());
        }
        businessResultsSearchVO.setJanDate(businessResultsSearchVO.getCritYear()+"01"); // 기준연도+1월
        businessResultsSearchVO.setFromDate(businessResultsSearchVO.getCritYear()+businessResultsSearchVO.getCritMon()); // 기준월
        businessResultsSearchVO.setRsdnStartDate(businessResultsSearchVO.getCritYear()+businessResultsSearchVO.getRsdnStartMon()); // 잔여시작월
        businessResultsSearchVO.setRsdnEndDate(businessResultsSearchVO.getCritYear()+businessResultsSearchVO.getRsdnEndMon()); // 잔여종료월 (구 toDate)

        List<BusinessResultsVO> list = businessResultsDao.selectBusinessResultsByBsnsClsfCdList(businessResultsSearchVO);

        return list;
    }

    //상품실적현황
    @Transactional
    public List<BusinessResultsVO> selectBusinessResultsByProdDstCdList(Payload<BusinessResultsSearchVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".selectBusinessResultsByProdDstCdList");
        BusinessResultsSearchVO businessResultsSearchVO = requestPayload.getDto();

        businessResultsSearchVO.setJanDate(businessResultsSearchVO.getCritYear()+"01"); // 기준연도+1월
        businessResultsSearchVO.setFromDate(businessResultsSearchVO.getCritYear()+businessResultsSearchVO.getCritMon()); // 기준월
        businessResultsSearchVO.setRsdnStartDate(businessResultsSearchVO.getCritYear()+businessResultsSearchVO.getRsdnStartMon()); // 잔여시작월
        businessResultsSearchVO.setRsdnEndDate(businessResultsSearchVO.getCritYear()+businessResultsSearchVO.getRsdnEndMon()); // 잔여종료월 (구 toDate)

        List<BusinessResultsVO> list = businessResultsDao.selectBusinessResultsByProdCdList(businessResultsSearchVO);

        return list;
    }

    //실적상세리스트
    @Transactional
    public List<BusinessResultsDetailVO> selectBusinessResultsDetailList(Payload<BusinessResultsSearchVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".selectBusinessResultsDetailList");
        BusinessResultsSearchVO businessResultsSearchVO = requestPayload.getDto();

        List<BusinessResultsDetailVO> list = new ArrayList<>();

        if(businessResultsSearchVO.getBsnsRslDtlDstCd() != null) {
            if(businessResultsSearchVO.getBsnsRslDtlDstCd().equals("BU") || businessResultsSearchVO.getBsnsRslDtlDstCd().equals("CU") || businessResultsSearchVO.getBsnsRslDtlDstCd().equals("DU")){
                businessResultsSearchVO.setIsUnsold("Y");
            }

            if(businessResultsSearchVO.getBsnsRslDtlDstCd().substring(0,1).equals("A")) {
                list = businessResultsDao.selectBusinessResultsWCTDetailList(businessResultsSearchVO);
            }else if(businessResultsSearchVO.getBsnsRslDtlDstCd().substring(0,1).equals("B") || businessResultsSearchVO.getBsnsRslDtlDstCd().substring(0,1).equals("C")) {
                list = businessResultsDao.selectBusinessResultsBuySellDetailList(businessResultsSearchVO);
            }
        }else {
            if(businessResultsSearchVO.getBrslDstCd().equals("A")) {
                list = businessResultsDao.selectBusinessResultsWCTDetailList(businessResultsSearchVO);
            }else if(businessResultsSearchVO.getBrslDstCd().equals("B") || businessResultsSearchVO.getBrslDstCd().equals("C")) {
                list = businessResultsDao.selectBusinessResultsBuySellDetailList(businessResultsSearchVO);
            }
        }

        return list;
    }

    //사업분류 콤보박스 리스트
    public List<BusinessClassByYearVO> selectBsnsClsfCdListByCritYear(Payload<BusinessResultsSearchVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".selectBsnsClsfCdListByCritYear");
        BusinessResultsSearchVO businessResultsSearchVO = requestPayload.getDto();

        List<BusinessClassByYearVO> list = new ArrayList<>();
        list = businessResultsDao.selectBsnsClsfCdListByCritYear(businessResultsSearchVO);

        return list;
    }


    //사업 실적비교
    @Transactional
    public List<BusinessResultsVO> selectResultCmprList(Payload<BusinessResultsSearchVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".selectResultCmprList");
        BusinessResultsSearchVO businessResultsSearchVO = requestPayload.getDto();

        List<BusinessResultsVO> list = new ArrayList<>();
        list = businessResultsDao.selectResultCmprList(businessResultsSearchVO);

        return list;
    }
}
