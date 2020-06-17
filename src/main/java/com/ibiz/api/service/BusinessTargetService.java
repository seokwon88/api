//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.ibiz.api.service;

import com.ibiz.api.dao.BusinessTargetDao;
import com.ibiz.api.dao.CmnDao;
import com.ibiz.api.model.AccountVO;
import com.ibiz.api.model.BusinessTargetForDeptAllMMVO;
import com.ibiz.api.model.BusinessTargetForDeptMMVO;
import com.ibiz.api.model.BusinessTargetForEmpAllMMVO;
import com.ibiz.api.model.BusinessTargetForEmpMMVO;
import com.ibiz.api.model.BusinessTargetSearchVO;
import com.ibiz.api.model.Payload;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BusinessTargetService {
    private static final Logger log = LoggerFactory.getLogger(BusinessTargetService.class);
    @Resource(name = "businessTargetDao")
    private BusinessTargetDao businessTargetDao;
    @Resource(name = "cmnDao")
    private CmnDao cmnDao;
    protected Calendar calendar;

    public BusinessTargetService() {
        this.calendar = new GregorianCalendar(Locale.KOREA);
    }

    // 사업목표 조회
    @Transactional
    public List<BusinessTargetForDeptMMVO> selectBusinessTargetList(Payload<BusinessTargetSearchVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".selectBusinessTargetList");
        BusinessTargetSearchVO businessTargetSearchVO = (BusinessTargetSearchVO)requestPayload.getDto();
        new ArrayList();
        if (businessTargetSearchVO.getSlsDeptId().equals("")) {
            businessTargetSearchVO.setSlsDeptId(this.cmnDao.selectHTRKDeptInfo().getDeptId());
        }

        List<BusinessTargetForDeptMMVO> list = this.businessTargetDao.selectBusinessTargetList(businessTargetSearchVO);
        return list;
    }

    // 실적관련 유효한 수정기간 여부 조회
    @Transactional
    public Map selectIsOpenAvlDate(Payload<BusinessTargetSearchVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".BusinessTargetSearchVO");
        BusinessTargetSearchVO businessTargetSearchVO = (BusinessTargetSearchVO)requestPayload.getDto();
        return this.businessTargetDao.selectIsOpenAvlDate(businessTargetSearchVO);
    }

    // 부서 실적현황 조회
    @Transactional
    public List<BusinessTargetForDeptMMVO> selectBusinessTargetForDeptResult(Payload<BusinessTargetSearchVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".selectBusinessTargetForDeptResult");
        BusinessTargetSearchVO businessTargetSearchVO = (BusinessTargetSearchVO)requestPayload.getDto();
        if (businessTargetSearchVO.getSlsDeptId().equals("")) {
            businessTargetSearchVO.setSlsDeptId(this.cmnDao.selectHTRKDeptInfo().getDeptId());
        }

        List businessTargetForDeptMMList;
        if (!businessTargetSearchVO.getBsnsRslDtlDstCd().equals("AR") && !businessTargetSearchVO.getBsnsRslDtlDstCd().equals("BR") && !businessTargetSearchVO.getBsnsRslDtlDstCd().equals("CR") && !businessTargetSearchVO.getBsnsRslDtlDstCd().equals("DR") && !businessTargetSearchVO.getBsnsRslDtlDstCd().equals("ER") && !businessTargetSearchVO.getBsnsRslDtlDstCd().equals("FR")) {
            businessTargetForDeptMMList = this.businessTargetDao.selectBusinessTargetForDeptResult(businessTargetSearchVO);
        } else {
            //20200131 *R은 S로 바꿔서 조회되지 않게 변경
            /*String var4 = businessTargetSearchVO.getBsnsRslDtlDstCd();
            byte var5 = -1;
            switch(var4.hashCode()) {
                case 2128:
                    if (var4.equals("BR")) {
                        var5 = 0;
                    }
                    break;
                case 2159:
                    if (var4.equals("CR")) {
                        var5 = 1;
                    }
                    break;
                case 2190:
                    if (var4.equals("DR")) {
                        var5 = 2;
                    }
            }

            switch(var5) {
                case 0:
                    businessTargetSearchVO.setBsnsRslDtlDstCd("BS");
                    break;
                case 1:
                    businessTargetSearchVO.setBsnsRslDtlDstCd("CS");
                    break;
                case 2:
                    businessTargetSearchVO.setBsnsRslDtlDstCd("DS");
            }*/

            businessTargetForDeptMMList = this.businessTargetDao.selectBusinessTargetForDeptResult(businessTargetSearchVO);
            if (String.valueOf(this.calendar.get(1)).equals(businessTargetSearchVO.getYear())) {
                Iterator var6 = businessTargetForDeptMMList.iterator();

                while(var6.hasNext()) {
                    BusinessTargetForDeptMMVO businessTargetForDeptMMVO = (BusinessTargetForDeptMMVO)var6.next();
                    businessTargetForDeptMMVO.setSumAmt((businessTargetForDeptMMVO.getJanAmt() == null ? 0L : businessTargetForDeptMMVO.getJanAmt()) + (businessTargetForDeptMMVO.getFebAmt() == null ? 0L : businessTargetForDeptMMVO.getFebAmt()) + (businessTargetForDeptMMVO.getMarAmt() == null ? 0L : businessTargetForDeptMMVO.getMarAmt()) + (businessTargetForDeptMMVO.getAprAmt() == null ? 0L : businessTargetForDeptMMVO.getAprAmt()) + (businessTargetForDeptMMVO.getMayAmt() == null ? 0L : businessTargetForDeptMMVO.getMayAmt()) + (businessTargetForDeptMMVO.getJunAmt() == null ? 0L : businessTargetForDeptMMVO.getJunAmt()) + (businessTargetForDeptMMVO.getJulAmt() == null ? 0L : businessTargetForDeptMMVO.getJulAmt()) + (businessTargetForDeptMMVO.getAugAmt() == null ? 0L : businessTargetForDeptMMVO.getAugAmt()) + (businessTargetForDeptMMVO.getSepAmt() == null ? 0L : businessTargetForDeptMMVO.getSepAmt()) + (businessTargetForDeptMMVO.getOctAmt() == null ? 0L : businessTargetForDeptMMVO.getOctAmt()) + (businessTargetForDeptMMVO.getNovAmt() == null ? 0L : businessTargetForDeptMMVO.getNovAmt()) + (businessTargetForDeptMMVO.getDecAmt() == null ? 0L : businessTargetForDeptMMVO.getDecAmt()));
                }
            }
        }

        return businessTargetForDeptMMList;
    }

    // 영업대표 실적현황 조회
    @Transactional
    public List<BusinessTargetForEmpMMVO> selectBusinessTargetForEmpResult(Payload<BusinessTargetSearchVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".selectBusinessTargetForEmpResult");
        BusinessTargetSearchVO businessTargetSearchVO = (BusinessTargetSearchVO)requestPayload.getDto();
        if (businessTargetSearchVO.getSlsDeptId().equals("")) {
            businessTargetSearchVO.setSlsDeptId(this.cmnDao.selectHTRKDeptInfo().getDeptId());
        }

        List businessTargetForEmpMMList;
        if (!businessTargetSearchVO.getBsnsRslDtlDstCd().equals("AR") && !businessTargetSearchVO.getBsnsRslDtlDstCd().equals("BR") && !businessTargetSearchVO.getBsnsRslDtlDstCd().equals("CR") && !businessTargetSearchVO.getBsnsRslDtlDstCd().equals("DR") && !businessTargetSearchVO.getBsnsRslDtlDstCd().equals("ER") && !businessTargetSearchVO.getBsnsRslDtlDstCd().equals("FR")) {
            businessTargetForEmpMMList = this.businessTargetDao.selectBusinessTargetForEmpResult(businessTargetSearchVO);
        } else {
            //20200131 *R은 S로 바꿔서 조회되지 않게 변경
            /*String var4 = businessTargetSearchVO.getBsnsRslDtlDstCd();
            byte var5 = -1;
            switch(var4.hashCode()) {
                case 2128:
                    if (var4.equals("BR")) {
                        var5 = 0;
                    }
                    break;
                case 2159:
                    if (var4.equals("CR")) {
                        var5 = 1;
                    }
                    break;
                case 2190:
                    if (var4.equals("DR")) {
                        var5 = 2;
                    }
            }

            switch(var5) {
                case 0:
                    businessTargetSearchVO.setBsnsRslDtlDstCd("BS");
                    break;
                case 1:
                    businessTargetSearchVO.setBsnsRslDtlDstCd("CS");
                    break;
                case 2:
                    businessTargetSearchVO.setBsnsRslDtlDstCd("DS");
            }*/

            businessTargetForEmpMMList = this.businessTargetDao.selectBusinessTargetForEmpResult(businessTargetSearchVO);
            if (String.valueOf(this.calendar.get(1)).equals(businessTargetSearchVO.getYear())) {
                Iterator var6 = businessTargetForEmpMMList.iterator();

                while(var6.hasNext()) {
                    BusinessTargetForEmpMMVO businessTargetForEmpMMVO = (BusinessTargetForEmpMMVO)var6.next();
                    businessTargetForEmpMMVO.setSumAmt((businessTargetForEmpMMVO.getJanAmt() == null ? 0L : businessTargetForEmpMMVO.getJanAmt()) + (businessTargetForEmpMMVO.getFebAmt() == null ? 0L : businessTargetForEmpMMVO.getFebAmt()) + (businessTargetForEmpMMVO.getMarAmt() == null ? 0L : businessTargetForEmpMMVO.getMarAmt()) + (businessTargetForEmpMMVO.getAprAmt() == null ? 0L : businessTargetForEmpMMVO.getAprAmt()) + (businessTargetForEmpMMVO.getMayAmt() == null ? 0L : businessTargetForEmpMMVO.getMayAmt()) + (businessTargetForEmpMMVO.getJunAmt() == null ? 0L : businessTargetForEmpMMVO.getJunAmt()) + (businessTargetForEmpMMVO.getJulAmt() == null ? 0L : businessTargetForEmpMMVO.getJulAmt()) + (businessTargetForEmpMMVO.getAugAmt() == null ? 0L : businessTargetForEmpMMVO.getAugAmt()) + (businessTargetForEmpMMVO.getSepAmt() == null ? 0L : businessTargetForEmpMMVO.getSepAmt()) + (businessTargetForEmpMMVO.getOctAmt() == null ? 0L : businessTargetForEmpMMVO.getOctAmt()) + (businessTargetForEmpMMVO.getNovAmt() == null ? 0L : businessTargetForEmpMMVO.getNovAmt()) + (businessTargetForEmpMMVO.getDecAmt() == null ? 0L : businessTargetForEmpMMVO.getDecAmt()));
                }
            }
        }

        return businessTargetForEmpMMList;
    }

    // 상품실적 현황 조회
    @Transactional
    public List<BusinessTargetForDeptMMVO> selectBusinessTargetProductResult(Payload<BusinessTargetSearchVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".selectBusinessTargetProductResult");
        BusinessTargetSearchVO businessTargetSearchVO = (BusinessTargetSearchVO)requestPayload.getDto();

        //20200131 *R은 S로 바꿔서 조회되지 않게 변경
        /*String var3 = businessTargetSearchVO.getBsnsRslDtlDstCd();
        byte var4 = -1;
        switch(var3.hashCode()) {
            case 2128:
                if (var3.equals("BR")) {
                    var4 = 0;
                }
                break;
            case 2159:
                if (var3.equals("CR")) {
                    var4 = 1;
                }
                break;
            case 2190:
                if (var3.equals("DR")) {
                    var4 = 2;
                }
        }

        switch(var4) {
            case 0:
                businessTargetSearchVO.setBsnsRslDtlDstCd("BS");
                break;
            case 1:
                businessTargetSearchVO.setBsnsRslDtlDstCd("CS");
                break;
            case 2:
                businessTargetSearchVO.setBsnsRslDtlDstCd("DS");
        }*/

        if (businessTargetSearchVO.getSlsDeptId().equals("")) {
            businessTargetSearchVO.setSlsDeptId(this.cmnDao.selectHTRKDeptInfo().getDeptId());
        }

        List<BusinessTargetForDeptMMVO> list = this.businessTargetDao.selectBusinessTargetProductResult(businessTargetSearchVO);
        if (String.valueOf(this.calendar.get(1)).equals(businessTargetSearchVO.getYear()) && (businessTargetSearchVO.getBsnsRslDtlDstCd().equals("AR") || businessTargetSearchVO.getBsnsRslDtlDstCd().equals("BS") || businessTargetSearchVO.getBsnsRslDtlDstCd().equals("CS") || businessTargetSearchVO.getBsnsRslDtlDstCd().equals("DS") || businessTargetSearchVO.getBsnsRslDtlDstCd().equals("ER") || businessTargetSearchVO.getBsnsRslDtlDstCd().equals("FR"))) {
            Iterator var7 = list.iterator();

            while(var7.hasNext()) {
                BusinessTargetForDeptMMVO businessTargetForDeptMMVO = (BusinessTargetForDeptMMVO)var7.next();
                businessTargetForDeptMMVO.setSumAmt((businessTargetForDeptMMVO.getJanAmt() == null ? 0L : businessTargetForDeptMMVO.getJanAmt()) + (businessTargetForDeptMMVO.getFebAmt() == null ? 0L : businessTargetForDeptMMVO.getFebAmt()) + (businessTargetForDeptMMVO.getMarAmt() == null ? 0L : businessTargetForDeptMMVO.getMarAmt()) + (businessTargetForDeptMMVO.getAprAmt() == null ? 0L : businessTargetForDeptMMVO.getAprAmt()) + (businessTargetForDeptMMVO.getMayAmt() == null ? 0L : businessTargetForDeptMMVO.getMayAmt()) + (businessTargetForDeptMMVO.getJunAmt() == null ? 0L : businessTargetForDeptMMVO.getJunAmt()) + (businessTargetForDeptMMVO.getJulAmt() == null ? 0L : businessTargetForDeptMMVO.getJulAmt()) + (businessTargetForDeptMMVO.getAugAmt() == null ? 0L : businessTargetForDeptMMVO.getAugAmt()) + (businessTargetForDeptMMVO.getSepAmt() == null ? 0L : businessTargetForDeptMMVO.getSepAmt()) + (businessTargetForDeptMMVO.getOctAmt() == null ? 0L : businessTargetForDeptMMVO.getOctAmt()) + (businessTargetForDeptMMVO.getNovAmt() == null ? 0L : businessTargetForDeptMMVO.getNovAmt()) + (businessTargetForDeptMMVO.getDecAmt() == null ? 0L : businessTargetForDeptMMVO.getDecAmt()));
            }
        }

        return list;
    }

    // 기준연도 조회(max)
    @Transactional
    public Map selectStandardCritYear(Payload<BusinessTargetSearchVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".selectStandardCritYear");
        BusinessTargetSearchVO businessTargetSearchVO = (BusinessTargetSearchVO)requestPayload.getDto();
        Map<String, String> resultMap = new HashMap();
        resultMap.put("critYear", (String)this.businessTargetDao.selectStandardCritYear(businessTargetSearchVO).get("RESULT"));
        return resultMap;
    }

    //
    @Transactional
    public List<BusinessTargetForDeptMMVO> selectBusinessTargetBOPT(Payload<BusinessTargetSearchVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".selectBusinessTargetBOPT");
        BusinessTargetSearchVO businessTargetSearchVO = (BusinessTargetSearchVO)requestPayload.getDto();
        new ArrayList();
        businessTargetSearchVO.setBplnDstCd("F1");
        if (businessTargetSearchVO.getSlsDeptId().equals("")) {
            businessTargetSearchVO.setSlsDeptId(this.cmnDao.selectHTRKDeptInfo().getDeptId());
        }

        if (businessTargetSearchVO.getBsnsRslDtlDstCd() != null) {
            String var4 = businessTargetSearchVO.getBsnsRslDtlDstCd();
            byte var5 = -1;
            switch(var4.hashCode()) {
                case 2095:
                    if (var4.equals("AP")) {
                        var5 = 0;
                    }
                    break;
                case 2126:
                    if (var4.equals("BP")) {
                        var5 = 1;
                    }
                    break;
                case 2157:
                    if (var4.equals("CP")) {
                        var5 = 2;
                    }
                    break;
                case 2250:
                    if (var4.equals("FP")) {
                        var5 = 3;
                    }
            }

            switch(var5) {
                case 0:
                    businessTargetSearchVO.setBsnsRslDtlDstCd("AF");
                    break;
                case 1:
                    businessTargetSearchVO.setBsnsRslDtlDstCd("BF");
                    break;
                case 2:
                    businessTargetSearchVO.setBsnsRslDtlDstCd("CF");
                    break;
                case 3:
                    businessTargetSearchVO.setBsnsRslDtlDstCd("FF");
            }
        }

        List<BusinessTargetForDeptMMVO> list = this.businessTargetDao.selectBusinessTargetList(businessTargetSearchVO);
        return list;
    }

    // 기준연도 조회(max, min)
    @Transactional
    public Map selectBusinessTargetYear(Payload<BusinessTargetSearchVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".selectBusinessTargetYear");
        BusinessTargetSearchVO businessTargetSearchVO = (BusinessTargetSearchVO)requestPayload.getDto();
        Map<String, String> resultMap = new HashMap();
        resultMap.put("minYear", String.valueOf(this.businessTargetDao.selectBusinessTargetCritYear(businessTargetSearchVO).get("MIN_CRIT_YEAR")));
        resultMap.put("maxYear", String.valueOf(this.businessTargetDao.selectBusinessTargetCritYear(businessTargetSearchVO).get("MAX_CRIT_YEAR")));
        return resultMap;
    }

    // 영업부서 목표 등록
    @Transactional
    public BusinessTargetForDeptAllMMVO insertBusinessTargetDeptForMM(Payload<BusinessTargetForDeptAllMMVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".insertBusinessTargetDeptForMM");
        BusinessTargetForDeptAllMMVO businessTargetForDeptAllMMVO = (BusinessTargetForDeptAllMMVO)requestPayload.getDto();
        if (businessTargetForDeptAllMMVO.getCudList().size() > 0) {
            BusinessTargetSearchVO searchVO = new BusinessTargetSearchVO();
            searchVO.setYear(businessTargetForDeptAllMMVO.getCudList().get(0).getCritYear());
            searchVO.setManageTarget("SDPT");
            searchVO.setSlsDeptId(businessTargetForDeptAllMMVO.getCudList().get(0).getDeptId());
            searchVO.setBplnDstCd(businessTargetForDeptAllMMVO.getCudList().get(0).getBplnDstCd());
            searchVO.setBsnsRslDtlDstCd(businessTargetForDeptAllMMVO.getCudList().get(0).getBsnsRslDtlDstCd());

            if(this.businessTargetDao.selectIsExistsBusinessTarget(searchVO) > 0 ){
                this.businessTargetDao.deleteAllBusinessTargetDeptForMM((BusinessTargetForDeptMMVO)businessTargetForDeptAllMMVO.getCudList().get(0));
            }

            /*if (Boolean.valueOf((String)this.businessTargetDao.selectIsExistsBusinessTargetDept((BusinessTargetForDeptMMVO)businessTargetForDeptAllMMVO.getCudList().get(0)).get("RESULT"))) {
                this.businessTargetDao.deleteAllBusinessTargetDeptForMM((BusinessTargetForDeptMMVO)businessTargetForDeptAllMMVO.getCudList().get(0));
            }*/

            Iterator var3 = businessTargetForDeptAllMMVO.getCudList().iterator();

            while(var3.hasNext()) {
                BusinessTargetForDeptMMVO businessTargetForDeptMMVO = (BusinessTargetForDeptMMVO)var3.next();
                businessTargetForDeptMMVO.setGodsClsfCd("AL");
                businessTargetForDeptMMVO.setProdTypeCd("AL");
                businessTargetForDeptMMVO.setJanAmt((businessTargetForDeptMMVO.getJanAmt() == null ? 0L : businessTargetForDeptMMVO.getJanAmt()) * 1000L);
                businessTargetForDeptMMVO.setFebAmt((businessTargetForDeptMMVO.getFebAmt() == null ? 0L : businessTargetForDeptMMVO.getFebAmt()) * 1000L);
                businessTargetForDeptMMVO.setMarAmt((businessTargetForDeptMMVO.getMarAmt() == null ? 0L : businessTargetForDeptMMVO.getMarAmt()) * 1000L);
                businessTargetForDeptMMVO.setAprAmt((businessTargetForDeptMMVO.getAprAmt() == null ? 0L : businessTargetForDeptMMVO.getAprAmt()) * 1000L);
                businessTargetForDeptMMVO.setMayAmt((businessTargetForDeptMMVO.getMayAmt() == null ? 0L : businessTargetForDeptMMVO.getMayAmt()) * 1000L);
                businessTargetForDeptMMVO.setJunAmt((businessTargetForDeptMMVO.getJunAmt() == null ? 0L : businessTargetForDeptMMVO.getJunAmt()) * 1000L);
                businessTargetForDeptMMVO.setJulAmt((businessTargetForDeptMMVO.getJulAmt() == null ? 0L : businessTargetForDeptMMVO.getJulAmt()) * 1000L);
                businessTargetForDeptMMVO.setAugAmt((businessTargetForDeptMMVO.getAugAmt() == null ? 0L : businessTargetForDeptMMVO.getAugAmt()) * 1000L);
                businessTargetForDeptMMVO.setSepAmt((businessTargetForDeptMMVO.getSepAmt() == null ? 0L : businessTargetForDeptMMVO.getSepAmt()) * 1000L);
                businessTargetForDeptMMVO.setOctAmt((businessTargetForDeptMMVO.getOctAmt() == null ? 0L : businessTargetForDeptMMVO.getOctAmt()) * 1000L);
                businessTargetForDeptMMVO.setNovAmt((businessTargetForDeptMMVO.getNovAmt() == null ? 0L : businessTargetForDeptMMVO.getNovAmt()) * 1000L);
                businessTargetForDeptMMVO.setDecAmt((businessTargetForDeptMMVO.getDecAmt() == null ? 0L : businessTargetForDeptMMVO.getDecAmt()) * 1000L);
                this.businessTargetDao.insertBusinessTargetDeptForMM(businessTargetForDeptMMVO);
            }
        } else {
            BusinessTargetForDeptMMVO model = new BusinessTargetForDeptMMVO();
            model.setCritYear(businessTargetForDeptAllMMVO.getCritYear());
            model.setDeptId(businessTargetForDeptAllMMVO.getDeptId());
            model.setBplnDstCd(businessTargetForDeptAllMMVO.getBplnDstCd());
            model.setBsnsRslDtlDstCd(businessTargetForDeptAllMMVO.getBsnsRslDtlDstCd());
            this.businessTargetDao.deleteAllBusinessTargetDeptForMM(model);
        }

        return businessTargetForDeptAllMMVO;
    }

    // 영업대표 목표 등록
    @Transactional
    public BusinessTargetForEmpAllMMVO insertBusinessTargetEmpForMM(Payload<BusinessTargetForEmpAllMMVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".insertBusinessTargetEmpForMM");
        BusinessTargetForEmpAllMMVO businessTargetForEmpAllMMVO = (BusinessTargetForEmpAllMMVO)requestPayload.getDto();
        if (businessTargetForEmpAllMMVO.getCudList().size() > 0) {

            BusinessTargetSearchVO searchVO = new BusinessTargetSearchVO();
            searchVO.setYear(businessTargetForEmpAllMMVO.getCudList().get(0).getCritYear());
            searchVO.setManageTarget("SPRN");
            searchVO.setSlsDeptId(businessTargetForEmpAllMMVO.getCudList().get(0).getDeptId());
            searchVO.setBplnDstCd(businessTargetForEmpAllMMVO.getCudList().get(0).getBplnDstCd());
            searchVO.setBsnsRslDtlDstCd(businessTargetForEmpAllMMVO.getCudList().get(0).getBsnsRslDtlDstCd());
            searchVO.setEmpId(businessTargetForEmpAllMMVO.getCudList().get(0).getEmpId());

            if(this.businessTargetDao.selectIsExistsBusinessTarget(searchVO) > 0 ){
                this.businessTargetDao.deleteAllBusinessTargetEmpForMM((BusinessTargetForEmpMMVO)businessTargetForEmpAllMMVO.getCudList().get(0));
            }

            /*if (Boolean.valueOf((String)this.businessTargetDao.selectIsExistsBusinessTargetEmp((BusinessTargetForEmpMMVO)businessTargetForEmpAllMMVO.getCudList().get(0)).get("RESULT"))) {
                this.businessTargetDao.deleteAllBusinessTargetEmpForMM((BusinessTargetForEmpMMVO)businessTargetForEmpAllMMVO.getCudList().get(0));
            }*/

            Iterator var3 = businessTargetForEmpAllMMVO.getCudList().iterator();

            while(var3.hasNext()) {
                BusinessTargetForEmpMMVO businessTargetForEmpMMVO = (BusinessTargetForEmpMMVO)var3.next();
                businessTargetForEmpMMVO.setGodsClsfCd("AL");
                businessTargetForEmpMMVO.setProdTypeCd("AL");
                businessTargetForEmpMMVO.setJanAmt((businessTargetForEmpMMVO.getJanAmt() == null ? 0L : businessTargetForEmpMMVO.getJanAmt()) * 1000L);
                businessTargetForEmpMMVO.setFebAmt((businessTargetForEmpMMVO.getFebAmt() == null ? 0L : businessTargetForEmpMMVO.getFebAmt()) * 1000L);
                businessTargetForEmpMMVO.setMarAmt((businessTargetForEmpMMVO.getMarAmt() == null ? 0L : businessTargetForEmpMMVO.getMarAmt()) * 1000L);
                businessTargetForEmpMMVO.setAprAmt((businessTargetForEmpMMVO.getAprAmt() == null ? 0L : businessTargetForEmpMMVO.getAprAmt()) * 1000L);
                businessTargetForEmpMMVO.setMayAmt((businessTargetForEmpMMVO.getMayAmt() == null ? 0L : businessTargetForEmpMMVO.getMayAmt()) * 1000L);
                businessTargetForEmpMMVO.setJunAmt((businessTargetForEmpMMVO.getJunAmt() == null ? 0L : businessTargetForEmpMMVO.getJunAmt()) * 1000L);
                businessTargetForEmpMMVO.setJulAmt((businessTargetForEmpMMVO.getJulAmt() == null ? 0L : businessTargetForEmpMMVO.getJulAmt()) * 1000L);
                businessTargetForEmpMMVO.setAugAmt((businessTargetForEmpMMVO.getAugAmt() == null ? 0L : businessTargetForEmpMMVO.getAugAmt()) * 1000L);
                businessTargetForEmpMMVO.setSepAmt((businessTargetForEmpMMVO.getSepAmt() == null ? 0L : businessTargetForEmpMMVO.getSepAmt()) * 1000L);
                businessTargetForEmpMMVO.setOctAmt((businessTargetForEmpMMVO.getOctAmt() == null ? 0L : businessTargetForEmpMMVO.getOctAmt()) * 1000L);
                businessTargetForEmpMMVO.setNovAmt((businessTargetForEmpMMVO.getNovAmt() == null ? 0L : businessTargetForEmpMMVO.getNovAmt()) * 1000L);
                businessTargetForEmpMMVO.setDecAmt((businessTargetForEmpMMVO.getDecAmt() == null ? 0L : businessTargetForEmpMMVO.getDecAmt()) * 1000L);
                this.businessTargetDao.insertBusinessTargetEmpForMM(businessTargetForEmpMMVO);
            }
        } else {
            BusinessTargetForEmpMMVO model = new BusinessTargetForEmpMMVO();
            model.setCritYear(businessTargetForEmpAllMMVO.getCritYear());
            model.setDeptId(businessTargetForEmpAllMMVO.getDeptId());
            model.setEmpId(businessTargetForEmpAllMMVO.getEmpId());
            model.setBplnDstCd(businessTargetForEmpAllMMVO.getBplnDstCd());
            model.setBsnsRslDtlDstCd(businessTargetForEmpAllMMVO.getBsnsRslDtlDstCd());
            this.businessTargetDao.deleteAllBusinessTargetEmpForMM(model);
        }

        return businessTargetForEmpAllMMVO;
    }

    // 부서 목표 수정(하위부서 포함)
    @Transactional
    public BusinessTargetSearchVO updateLowerDeptBusinessTargetDeptForMM(Payload<BusinessTargetSearchVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".updateLowerDeptBusinessTargetDeptForMM");
        BusinessTargetSearchVO businessTargetSearchVO = (BusinessTargetSearchVO)requestPayload.getDto();
        this.businessTargetDao.deleteGoalBusinessTargetDeptForLowerDept(businessTargetSearchVO);
        this.businessTargetDao.updateLowerDeptBusinessTargetDeptForMM(businessTargetSearchVO);
        return businessTargetSearchVO;
    }

    // 부서 목표 수정
    @Transactional
    public BusinessTargetForDeptAllMMVO updateBusinessTargetDeptForMM(Payload<BusinessTargetForDeptAllMMVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".updateBusinessTargetDeptForMM");
        BusinessTargetForDeptAllMMVO businessTargetForDeptAllMMVO = (BusinessTargetForDeptAllMMVO)requestPayload.getDto();
        if (businessTargetForDeptAllMMVO.getCudList().size() > 0) {

            BusinessTargetSearchVO searchVO = new BusinessTargetSearchVO();
            searchVO.setYear(businessTargetForDeptAllMMVO.getCudList().get(0).getCritYear());
            searchVO.setManageTarget("SDPT");
            searchVO.setSlsDeptId(businessTargetForDeptAllMMVO.getCudList().get(0).getDeptId());
            searchVO.setBplnDstCd(businessTargetForDeptAllMMVO.getCudList().get(0).getBplnDstCd());
            searchVO.setBsnsRslDtlDstCd(businessTargetForDeptAllMMVO.getCudList().get(0).getBsnsRslDtlDstCd());

            if(this.businessTargetDao.selectIsExistsBusinessTarget(searchVO) > 0 ){
                this.businessTargetDao.deleteAllBusinessTargetDeptForMM((BusinessTargetForDeptMMVO)businessTargetForDeptAllMMVO.getCudList().get(0));
            }
            /*
            if (Boolean.valueOf((String)this.businessTargetDao.selectIsExistsBusinessTargetDept((BusinessTargetForDeptMMVO)businessTargetForDeptAllMMVO.getCudList().get(0)).get("RESULT"))) {
                this.businessTargetDao.deleteOnlyGoalBusinessTargetDeptForMM((BusinessTargetForDeptMMVO)businessTargetForDeptAllMMVO.getCudList().get(0));
            }*/

            Iterator var3 = businessTargetForDeptAllMMVO.getCudList().iterator();

            while(var3.hasNext()) {
                BusinessTargetForDeptMMVO businessTargetForDeptMMVO = (BusinessTargetForDeptMMVO)var3.next();
                businessTargetForDeptMMVO.setGodsClsfCd("AL");
                businessTargetForDeptMMVO.setProdTypeCd("AL");
                businessTargetForDeptMMVO.setJanAmt((businessTargetForDeptMMVO.getJanAmt() == null ? 0L : businessTargetForDeptMMVO.getJanAmt()) * 1000L);
                businessTargetForDeptMMVO.setFebAmt((businessTargetForDeptMMVO.getFebAmt() == null ? 0L : businessTargetForDeptMMVO.getFebAmt()) * 1000L);
                businessTargetForDeptMMVO.setMarAmt((businessTargetForDeptMMVO.getMarAmt() == null ? 0L : businessTargetForDeptMMVO.getMarAmt()) * 1000L);
                businessTargetForDeptMMVO.setAprAmt((businessTargetForDeptMMVO.getAprAmt() == null ? 0L : businessTargetForDeptMMVO.getAprAmt()) * 1000L);
                businessTargetForDeptMMVO.setMayAmt((businessTargetForDeptMMVO.getMayAmt() == null ? 0L : businessTargetForDeptMMVO.getMayAmt()) * 1000L);
                businessTargetForDeptMMVO.setJunAmt((businessTargetForDeptMMVO.getJunAmt() == null ? 0L : businessTargetForDeptMMVO.getJunAmt()) * 1000L);
                businessTargetForDeptMMVO.setJulAmt((businessTargetForDeptMMVO.getJulAmt() == null ? 0L : businessTargetForDeptMMVO.getJulAmt()) * 1000L);
                businessTargetForDeptMMVO.setAugAmt((businessTargetForDeptMMVO.getAugAmt() == null ? 0L : businessTargetForDeptMMVO.getAugAmt()) * 1000L);
                businessTargetForDeptMMVO.setSepAmt((businessTargetForDeptMMVO.getSepAmt() == null ? 0L : businessTargetForDeptMMVO.getSepAmt()) * 1000L);
                businessTargetForDeptMMVO.setOctAmt((businessTargetForDeptMMVO.getOctAmt() == null ? 0L : businessTargetForDeptMMVO.getOctAmt()) * 1000L);
                businessTargetForDeptMMVO.setNovAmt((businessTargetForDeptMMVO.getNovAmt() == null ? 0L : businessTargetForDeptMMVO.getNovAmt()) * 1000L);
                businessTargetForDeptMMVO.setDecAmt((businessTargetForDeptMMVO.getDecAmt() == null ? 0L : businessTargetForDeptMMVO.getDecAmt()) * 1000L);
                this.businessTargetDao.updateBusinessTargetDeptForMM(businessTargetForDeptMMVO);
            }
        } else {
            BusinessTargetForDeptMMVO model = new BusinessTargetForDeptMMVO();
            model.setCritYear(businessTargetForDeptAllMMVO.getCritYear());
            model.setDeptId(businessTargetForDeptAllMMVO.getDeptId());
            model.setBplnDstCd(businessTargetForDeptAllMMVO.getBplnDstCd());
            model.setBsnsRslDtlDstCd(businessTargetForDeptAllMMVO.getBsnsRslDtlDstCd());
            this.businessTargetDao.deleteOnlyGoalBusinessTargetDeptForMM(model);
        }

        return businessTargetForDeptAllMMVO;
    }

    // 사원 목표 수정(하위부서 포함)
    @Transactional
    public BusinessTargetSearchVO updateLowerDeptBusinessTargetEmpForMM(Payload<BusinessTargetSearchVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".updateLowerDeptBusinessTargetEmpForMM");
        BusinessTargetSearchVO businessTargetSearchVO = (BusinessTargetSearchVO)requestPayload.getDto();
        this.businessTargetDao.deleteGoalBusinessTargetEmpForLowerDept(businessTargetSearchVO);
        this.businessTargetDao.updateLowerDeptBusinessTargetEmpForMM(businessTargetSearchVO);
        return businessTargetSearchVO;
    }

    // 사원 목표 수정
    @Transactional
    public BusinessTargetForEmpAllMMVO updateBusinessTargetEmpForMM(Payload<BusinessTargetForEmpAllMMVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".updateBusinessTargetEmpForMM");
        BusinessTargetForEmpAllMMVO businessTargetForEmpAllMMVO = (BusinessTargetForEmpAllMMVO)requestPayload.getDto();
        if (businessTargetForEmpAllMMVO.getCudList().size() > 0) {
            BusinessTargetSearchVO searchVO = new BusinessTargetSearchVO();
            searchVO.setYear(businessTargetForEmpAllMMVO.getCudList().get(0).getCritYear());
            searchVO.setManageTarget("SPRN");
            searchVO.setSlsDeptId(businessTargetForEmpAllMMVO.getCudList().get(0).getDeptId());
            searchVO.setBplnDstCd(businessTargetForEmpAllMMVO.getCudList().get(0).getBplnDstCd());
            searchVO.setBsnsRslDtlDstCd(businessTargetForEmpAllMMVO.getCudList().get(0).getBsnsRslDtlDstCd());
            searchVO.setEmpId(businessTargetForEmpAllMMVO.getCudList().get(0).getEmpId());

            if(this.businessTargetDao.selectIsExistsBusinessTarget(searchVO) > 0 ){
                this.businessTargetDao.deleteAllBusinessTargetEmpForMM((BusinessTargetForEmpMMVO)businessTargetForEmpAllMMVO.getCudList().get(0));
            }
            /*
            if (Boolean.valueOf((String)this.businessTargetDao.selectIsExistsBusinessTargetEmp((BusinessTargetForEmpMMVO)businessTargetForEmpAllMMVO.getCudList().get(0)).get("RESULT"))) {
                this.businessTargetDao.deleteOnlyGoalBusinessTargetEmpForMM((BusinessTargetForEmpMMVO)businessTargetForEmpAllMMVO.getCudList().get(0));
            }*/

            Iterator var3 = businessTargetForEmpAllMMVO.getCudList().iterator();

            while(var3.hasNext()) {
                BusinessTargetForEmpMMVO businessTargetForEmpMMVO = (BusinessTargetForEmpMMVO)var3.next();
                businessTargetForEmpMMVO.setGodsClsfCd("AL");
                businessTargetForEmpMMVO.setProdTypeCd("AL");
                businessTargetForEmpMMVO.setJanAmt((businessTargetForEmpMMVO.getJanAmt() == null ? 0L : businessTargetForEmpMMVO.getJanAmt()) * 1000L);
                businessTargetForEmpMMVO.setFebAmt((businessTargetForEmpMMVO.getFebAmt() == null ? 0L : businessTargetForEmpMMVO.getFebAmt()) * 1000L);
                businessTargetForEmpMMVO.setMarAmt((businessTargetForEmpMMVO.getMarAmt() == null ? 0L : businessTargetForEmpMMVO.getMarAmt()) * 1000L);
                businessTargetForEmpMMVO.setAprAmt((businessTargetForEmpMMVO.getAprAmt() == null ? 0L : businessTargetForEmpMMVO.getAprAmt()) * 1000L);
                businessTargetForEmpMMVO.setMayAmt((businessTargetForEmpMMVO.getMayAmt() == null ? 0L : businessTargetForEmpMMVO.getMayAmt()) * 1000L);
                businessTargetForEmpMMVO.setJunAmt((businessTargetForEmpMMVO.getJunAmt() == null ? 0L : businessTargetForEmpMMVO.getJunAmt()) * 1000L);
                businessTargetForEmpMMVO.setJulAmt((businessTargetForEmpMMVO.getJulAmt() == null ? 0L : businessTargetForEmpMMVO.getJulAmt()) * 1000L);
                businessTargetForEmpMMVO.setAugAmt((businessTargetForEmpMMVO.getAugAmt() == null ? 0L : businessTargetForEmpMMVO.getAugAmt()) * 1000L);
                businessTargetForEmpMMVO.setSepAmt((businessTargetForEmpMMVO.getSepAmt() == null ? 0L : businessTargetForEmpMMVO.getSepAmt()) * 1000L);
                businessTargetForEmpMMVO.setOctAmt((businessTargetForEmpMMVO.getOctAmt() == null ? 0L : businessTargetForEmpMMVO.getOctAmt()) * 1000L);
                businessTargetForEmpMMVO.setNovAmt((businessTargetForEmpMMVO.getNovAmt() == null ? 0L : businessTargetForEmpMMVO.getNovAmt()) * 1000L);
                businessTargetForEmpMMVO.setDecAmt((businessTargetForEmpMMVO.getDecAmt() == null ? 0L : businessTargetForEmpMMVO.getDecAmt()) * 1000L);
                this.businessTargetDao.updateBusinessTargetEmpForMM(businessTargetForEmpMMVO);
            }
        } else {
            BusinessTargetForEmpMMVO model = new BusinessTargetForEmpMMVO();
            model.setCritYear(businessTargetForEmpAllMMVO.getCritYear());
            model.setDeptId(businessTargetForEmpAllMMVO.getDeptId());
            model.setEmpId(businessTargetForEmpAllMMVO.getEmpId());
            model.setBplnDstCd(businessTargetForEmpAllMMVO.getBplnDstCd());
            model.setBsnsRslDtlDstCd(businessTargetForEmpAllMMVO.getBsnsRslDtlDstCd());
            this.businessTargetDao.deleteOnlyGoalBusinessTargetEmpForMM(model);
        }

        return businessTargetForEmpAllMMVO;
    }

    // 부서 목표 전체 삭제
    @Transactional
    public BusinessTargetForDeptMMVO deleteAllBusinessTargetDeptForMM(Payload<BusinessTargetForDeptMMVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".deleteAllBusinessTargetDeptForMM");
        AccountVO accountVO = requestPayload.getAccountVO();
        BusinessTargetForDeptMMVO businessTargetForDeptMMVO = (BusinessTargetForDeptMMVO)requestPayload.getDto();
        this.businessTargetDao.deleteAllBusinessTargetDeptForMM(businessTargetForDeptMMVO);
        return businessTargetForDeptMMVO;
    }

    // 사원 목표 전체 삭제
    @Transactional
    public BusinessTargetForEmpMMVO deleteAllBusinessTargetEmpForMM(Payload<BusinessTargetForEmpMMVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".deleteAllBusinessTargetEmpForMM");
        AccountVO accountVO = requestPayload.getAccountVO();
        BusinessTargetForEmpMMVO businessTargetForEmpMMVO = (BusinessTargetForEmpMMVO)requestPayload.getDto();
        this.businessTargetDao.deleteAllBusinessTargetEmpForMM(businessTargetForEmpMMVO);
        return businessTargetForEmpMMVO;
    }
}
