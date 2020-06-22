//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.ibiz.api.service;

import com.ibiz.api.dao.BizGoalDAO;
import com.ibiz.api.dao.CmnDAO;
import com.ibiz.api.model.AccountVO;
import com.ibiz.api.model.YearDeptResultAllVO;
import com.ibiz.api.model.YearDeptResultVO;
import com.ibiz.api.model.YearEmpResultAllVO;
import com.ibiz.api.model.YearEmpResultVO;
import com.ibiz.api.model.BizGoalSearchVO;
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
public class BizGoalService {
    private static final Logger log = LoggerFactory.getLogger(BizGoalService.class);
    @Resource(name = "bizGoalDAO")
    private BizGoalDAO bizGoalDAO;
    @Resource(name = "cmnDAO")
    private CmnDAO cmnDAO;
    protected Calendar calendar;

    public BizGoalService() {
        this.calendar = new GregorianCalendar(Locale.KOREA);
    }

    // 사업목표 조회
    @Transactional
    public List<YearDeptResultVO> selectMonthlyGoalList(Payload<BizGoalSearchVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".selectMonthlyGoalList");
        BizGoalSearchVO bizGoalSearchVO = (BizGoalSearchVO)requestPayload.getDto();
        new ArrayList();
        if (bizGoalSearchVO.getSlsDeptId().equals("")) {
            bizGoalSearchVO.setSlsDeptId(this.cmnDAO.selectHTRKDeptInfo().getDeptId());
        }

        List<YearDeptResultVO> list = this.bizGoalDAO.selectMonthlyGoalList(bizGoalSearchVO);
        return list;
    }

    // 실적관련 유효한 수정기간 여부 조회
    @Transactional
    public Map selectIsAvlChgDate(Payload<BizGoalSearchVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".BizGoalSearchVO");
        BizGoalSearchVO bizGoalSearchVO = (BizGoalSearchVO)requestPayload.getDto();
        return this.bizGoalDAO.selectIsAvlChgDate(bizGoalSearchVO);
    }

    // 부서 실적현황 조회
    @Transactional
    public List<YearDeptResultVO> selectMonthlyDeptStatsList(Payload<BizGoalSearchVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".selectMonthlyDeptStatsList");
        BizGoalSearchVO bizGoalSearchVO = (BizGoalSearchVO)requestPayload.getDto();
        if (bizGoalSearchVO.getSlsDeptId().equals("")) {
            bizGoalSearchVO.setSlsDeptId(this.cmnDAO.selectHTRKDeptInfo().getDeptId());
        }

        List businessTargetForDeptMMList;
        if (!bizGoalSearchVO.getBsnsRslDtlDstCd().equals("AR") && !bizGoalSearchVO.getBsnsRslDtlDstCd().equals("BR") && !bizGoalSearchVO.getBsnsRslDtlDstCd().equals("CR") && !bizGoalSearchVO.getBsnsRslDtlDstCd().equals("DR") && !bizGoalSearchVO.getBsnsRslDtlDstCd().equals("ER") && !bizGoalSearchVO.getBsnsRslDtlDstCd().equals("FR")) {
            businessTargetForDeptMMList = this.bizGoalDAO.selectMonthlyDeptStatsList(bizGoalSearchVO);
        } else {
            //20200131 *R은 S로 바꿔서 조회되지 않게 변경
            /*String var4 = bizGoalSearchVO.getBsnsRslDtlDstCd();
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
                    bizGoalSearchVO.setBsnsRslDtlDstCd("BS");
                    break;
                case 1:
                    bizGoalSearchVO.setBsnsRslDtlDstCd("CS");
                    break;
                case 2:
                    bizGoalSearchVO.setBsnsRslDtlDstCd("DS");
            }*/

            businessTargetForDeptMMList = this.bizGoalDAO.selectMonthlyDeptStatsList(bizGoalSearchVO);
            if (String.valueOf(this.calendar.get(1)).equals(bizGoalSearchVO.getYear())) {
                Iterator var6 = businessTargetForDeptMMList.iterator();

                while(var6.hasNext()) {
                    YearDeptResultVO yearDeptResultVO = (YearDeptResultVO)var6.next();
                    yearDeptResultVO.setSumAmt((yearDeptResultVO.getJanAmt() == null ? 0L : yearDeptResultVO.getJanAmt()) + (yearDeptResultVO.getFebAmt() == null ? 0L : yearDeptResultVO.getFebAmt()) + (yearDeptResultVO.getMarAmt() == null ? 0L : yearDeptResultVO.getMarAmt()) + (yearDeptResultVO.getAprAmt() == null ? 0L : yearDeptResultVO.getAprAmt()) + (yearDeptResultVO.getMayAmt() == null ? 0L : yearDeptResultVO.getMayAmt()) + (yearDeptResultVO.getJunAmt() == null ? 0L : yearDeptResultVO.getJunAmt()) + (yearDeptResultVO.getJulAmt() == null ? 0L : yearDeptResultVO.getJulAmt()) + (yearDeptResultVO.getAugAmt() == null ? 0L : yearDeptResultVO.getAugAmt()) + (yearDeptResultVO.getSepAmt() == null ? 0L : yearDeptResultVO.getSepAmt()) + (yearDeptResultVO.getOctAmt() == null ? 0L : yearDeptResultVO.getOctAmt()) + (yearDeptResultVO.getNovAmt() == null ? 0L : yearDeptResultVO.getNovAmt()) + (yearDeptResultVO.getDecAmt() == null ? 0L : yearDeptResultVO.getDecAmt()));
                }
            }
        }

        return businessTargetForDeptMMList;
    }

    // 영업대표 실적현황 조회
    @Transactional
    public List<YearEmpResultVO> selectMonthlyEmployeeStatsList(Payload<BizGoalSearchVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".selectMonthlyEmployeeStatsList");
        BizGoalSearchVO bizGoalSearchVO = (BizGoalSearchVO)requestPayload.getDto();
        if (bizGoalSearchVO.getSlsDeptId().equals("")) {
            bizGoalSearchVO.setSlsDeptId(this.cmnDAO.selectHTRKDeptInfo().getDeptId());
        }

        List businessTargetForEmpMMList;
        if (!bizGoalSearchVO.getBsnsRslDtlDstCd().equals("AR") && !bizGoalSearchVO.getBsnsRslDtlDstCd().equals("BR") && !bizGoalSearchVO.getBsnsRslDtlDstCd().equals("CR") && !bizGoalSearchVO.getBsnsRslDtlDstCd().equals("DR") && !bizGoalSearchVO.getBsnsRslDtlDstCd().equals("ER") && !bizGoalSearchVO.getBsnsRslDtlDstCd().equals("FR")) {
            businessTargetForEmpMMList = this.bizGoalDAO.selectMonthlyEmployeeStatsList(bizGoalSearchVO);
        } else {
            //20200131 *R은 S로 바꿔서 조회되지 않게 변경
            /*String var4 = bizGoalSearchVO.getBsnsRslDtlDstCd();
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
                    bizGoalSearchVO.setBsnsRslDtlDstCd("BS");
                    break;
                case 1:
                    bizGoalSearchVO.setBsnsRslDtlDstCd("CS");
                    break;
                case 2:
                    bizGoalSearchVO.setBsnsRslDtlDstCd("DS");
            }*/

            businessTargetForEmpMMList = this.bizGoalDAO.selectMonthlyEmployeeStatsList(bizGoalSearchVO);
            if (String.valueOf(this.calendar.get(1)).equals(bizGoalSearchVO.getYear())) {
                Iterator var6 = businessTargetForEmpMMList.iterator();

                while(var6.hasNext()) {
                    YearEmpResultVO yearEmpResultVO = (YearEmpResultVO)var6.next();
                    yearEmpResultVO.setSumAmt((yearEmpResultVO.getJanAmt() == null ? 0L : yearEmpResultVO.getJanAmt()) + (yearEmpResultVO.getFebAmt() == null ? 0L : yearEmpResultVO.getFebAmt()) + (yearEmpResultVO.getMarAmt() == null ? 0L : yearEmpResultVO.getMarAmt()) + (yearEmpResultVO.getAprAmt() == null ? 0L : yearEmpResultVO.getAprAmt()) + (yearEmpResultVO.getMayAmt() == null ? 0L : yearEmpResultVO.getMayAmt()) + (yearEmpResultVO.getJunAmt() == null ? 0L : yearEmpResultVO.getJunAmt()) + (yearEmpResultVO.getJulAmt() == null ? 0L : yearEmpResultVO.getJulAmt()) + (yearEmpResultVO.getAugAmt() == null ? 0L : yearEmpResultVO.getAugAmt()) + (yearEmpResultVO.getSepAmt() == null ? 0L : yearEmpResultVO.getSepAmt()) + (yearEmpResultVO.getOctAmt() == null ? 0L : yearEmpResultVO.getOctAmt()) + (yearEmpResultVO.getNovAmt() == null ? 0L : yearEmpResultVO.getNovAmt()) + (yearEmpResultVO.getDecAmt() == null ? 0L : yearEmpResultVO.getDecAmt()));
                }
            }
        }

        return businessTargetForEmpMMList;
    }

    // 상품실적 현황 조회
    @Transactional
    public List<YearDeptResultVO> selectMonthlyBizGroupStatsList(Payload<BizGoalSearchVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".selectMonthlyBizGroupStatsList");
        BizGoalSearchVO bizGoalSearchVO = (BizGoalSearchVO)requestPayload.getDto();

        //20200131 *R은 S로 바꿔서 조회되지 않게 변경
        /*String var3 = bizGoalSearchVO.getBsnsRslDtlDstCd();
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
                bizGoalSearchVO.setBsnsRslDtlDstCd("BS");
                break;
            case 1:
                bizGoalSearchVO.setBsnsRslDtlDstCd("CS");
                break;
            case 2:
                bizGoalSearchVO.setBsnsRslDtlDstCd("DS");
        }*/

        if (bizGoalSearchVO.getSlsDeptId().equals("")) {
            bizGoalSearchVO.setSlsDeptId(this.cmnDAO.selectHTRKDeptInfo().getDeptId());
        }

        List<YearDeptResultVO> list = this.bizGoalDAO.selectMonthlyBizGroupStatsList(bizGoalSearchVO);
        if (String.valueOf(this.calendar.get(1)).equals(bizGoalSearchVO.getYear()) && (bizGoalSearchVO.getBsnsRslDtlDstCd().equals("AR") || bizGoalSearchVO.getBsnsRslDtlDstCd().equals("BS") || bizGoalSearchVO.getBsnsRslDtlDstCd().equals("CS") || bizGoalSearchVO.getBsnsRslDtlDstCd().equals("DS") || bizGoalSearchVO.getBsnsRslDtlDstCd().equals("ER") || bizGoalSearchVO.getBsnsRslDtlDstCd().equals("FR"))) {
            Iterator var7 = list.iterator();

            while(var7.hasNext()) {
                YearDeptResultVO yearDeptResultVO = (YearDeptResultVO)var7.next();
                yearDeptResultVO.setSumAmt((yearDeptResultVO.getJanAmt() == null ? 0L : yearDeptResultVO.getJanAmt()) + (yearDeptResultVO.getFebAmt() == null ? 0L : yearDeptResultVO.getFebAmt()) + (yearDeptResultVO.getMarAmt() == null ? 0L : yearDeptResultVO.getMarAmt()) + (yearDeptResultVO.getAprAmt() == null ? 0L : yearDeptResultVO.getAprAmt()) + (yearDeptResultVO.getMayAmt() == null ? 0L : yearDeptResultVO.getMayAmt()) + (yearDeptResultVO.getJunAmt() == null ? 0L : yearDeptResultVO.getJunAmt()) + (yearDeptResultVO.getJulAmt() == null ? 0L : yearDeptResultVO.getJulAmt()) + (yearDeptResultVO.getAugAmt() == null ? 0L : yearDeptResultVO.getAugAmt()) + (yearDeptResultVO.getSepAmt() == null ? 0L : yearDeptResultVO.getSepAmt()) + (yearDeptResultVO.getOctAmt() == null ? 0L : yearDeptResultVO.getOctAmt()) + (yearDeptResultVO.getNovAmt() == null ? 0L : yearDeptResultVO.getNovAmt()) + (yearDeptResultVO.getDecAmt() == null ? 0L : yearDeptResultVO.getDecAmt()));
            }
        }

        return list;
    }

    // 기준연도 조회(max)
    @Transactional
    public Map selectMaxCritYear(Payload<BizGoalSearchVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".selectMaxCritYear");
        BizGoalSearchVO bizGoalSearchVO = (BizGoalSearchVO)requestPayload.getDto();
        Map<String, String> resultMap = new HashMap();
        resultMap.put("critYear", (String)this.bizGoalDAO.selectMaxCritYear(bizGoalSearchVO).get("RESULT"));
        return resultMap;
    }

    //
    @Transactional
    public List<YearDeptResultVO> selectBizFcstList(Payload<BizGoalSearchVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".selectBizFcstList");
        BizGoalSearchVO bizGoalSearchVO = (BizGoalSearchVO)requestPayload.getDto();
        new ArrayList();
        bizGoalSearchVO.setBplnDstCd("F1");
        if (bizGoalSearchVO.getSlsDeptId().equals("")) {
            bizGoalSearchVO.setSlsDeptId(this.cmnDAO.selectHTRKDeptInfo().getDeptId());
        }

        if (bizGoalSearchVO.getBsnsRslDtlDstCd() != null) {
            String var4 = bizGoalSearchVO.getBsnsRslDtlDstCd();
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
                    bizGoalSearchVO.setBsnsRslDtlDstCd("AF");
                    break;
                case 1:
                    bizGoalSearchVO.setBsnsRslDtlDstCd("BF");
                    break;
                case 2:
                    bizGoalSearchVO.setBsnsRslDtlDstCd("CF");
                    break;
                case 3:
                    bizGoalSearchVO.setBsnsRslDtlDstCd("FF");
            }
        }

        List<YearDeptResultVO> list = this.bizGoalDAO.selectMonthlyGoalList(bizGoalSearchVO);
        return list;
    }

    // 기준연도 조회(max, min)
    @Transactional
    public Map selectMinMaxCritYear(Payload<BizGoalSearchVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".selectMinMaxCritYear");
        BizGoalSearchVO bizGoalSearchVO = (BizGoalSearchVO)requestPayload.getDto();
        Map<String, String> resultMap = new HashMap();
        resultMap.put("minYear", String.valueOf(this.bizGoalDAO.selectMinMaxCritYear(bizGoalSearchVO).get("MIN_CRIT_YEAR")));
        resultMap.put("maxYear", String.valueOf(this.bizGoalDAO.selectMinMaxCritYear(bizGoalSearchVO).get("MAX_CRIT_YEAR")));
        return resultMap;
    }

    // 영업부서 목표 등록
    @Transactional
    public YearDeptResultAllVO insertMonthlyDeptGoal(Payload<YearDeptResultAllVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".insertMonthlyDeptGoal");
        YearDeptResultAllVO yearDeptResultAllVO = (YearDeptResultAllVO)requestPayload.getDto();
        if (yearDeptResultAllVO.getCudList().size() > 0) {
            BizGoalSearchVO searchVO = new BizGoalSearchVO();
            searchVO.setYear(yearDeptResultAllVO.getCudList().get(0).getCritYear());
            searchVO.setManageTarget("SDPT");
            searchVO.setSlsDeptId(yearDeptResultAllVO.getCudList().get(0).getDeptId());
            searchVO.setBplnDstCd(yearDeptResultAllVO.getCudList().get(0).getBplnDstCd());
            searchVO.setBsnsRslDtlDstCd(yearDeptResultAllVO.getCudList().get(0).getBsnsRslDtlDstCd());

            if(this.bizGoalDAO.selectisExistsBizGoal(searchVO) > 0 ){
                this.bizGoalDAO.deleteMonthlyDeptGoal((YearDeptResultVO) yearDeptResultAllVO.getCudList().get(0));
            }

            /*if (Boolean.valueOf((String)this.bizGoalDAO.selectisExistsBizGoalDept((YearDeptResultVO)yearDeptResultAllVO.getCudList().get(0)).get("RESULT"))) {
                this.bizGoalDAO.deleteMonthlyDeptGoal((YearDeptResultVO)yearDeptResultAllVO.getCudList().get(0));
            }*/

            Iterator var3 = yearDeptResultAllVO.getCudList().iterator();

            while(var3.hasNext()) {
                YearDeptResultVO yearDeptResultVO = (YearDeptResultVO)var3.next();
                yearDeptResultVO.setGodsClsfCd("AL");
                yearDeptResultVO.setProdTypeCd("AL");
                yearDeptResultVO.setJanAmt((yearDeptResultVO.getJanAmt() == null ? 0L : yearDeptResultVO.getJanAmt()) * 1000L);
                yearDeptResultVO.setFebAmt((yearDeptResultVO.getFebAmt() == null ? 0L : yearDeptResultVO.getFebAmt()) * 1000L);
                yearDeptResultVO.setMarAmt((yearDeptResultVO.getMarAmt() == null ? 0L : yearDeptResultVO.getMarAmt()) * 1000L);
                yearDeptResultVO.setAprAmt((yearDeptResultVO.getAprAmt() == null ? 0L : yearDeptResultVO.getAprAmt()) * 1000L);
                yearDeptResultVO.setMayAmt((yearDeptResultVO.getMayAmt() == null ? 0L : yearDeptResultVO.getMayAmt()) * 1000L);
                yearDeptResultVO.setJunAmt((yearDeptResultVO.getJunAmt() == null ? 0L : yearDeptResultVO.getJunAmt()) * 1000L);
                yearDeptResultVO.setJulAmt((yearDeptResultVO.getJulAmt() == null ? 0L : yearDeptResultVO.getJulAmt()) * 1000L);
                yearDeptResultVO.setAugAmt((yearDeptResultVO.getAugAmt() == null ? 0L : yearDeptResultVO.getAugAmt()) * 1000L);
                yearDeptResultVO.setSepAmt((yearDeptResultVO.getSepAmt() == null ? 0L : yearDeptResultVO.getSepAmt()) * 1000L);
                yearDeptResultVO.setOctAmt((yearDeptResultVO.getOctAmt() == null ? 0L : yearDeptResultVO.getOctAmt()) * 1000L);
                yearDeptResultVO.setNovAmt((yearDeptResultVO.getNovAmt() == null ? 0L : yearDeptResultVO.getNovAmt()) * 1000L);
                yearDeptResultVO.setDecAmt((yearDeptResultVO.getDecAmt() == null ? 0L : yearDeptResultVO.getDecAmt()) * 1000L);
                this.bizGoalDAO.insertMonthlyDeptGoal(yearDeptResultVO);
            }
        } else {
            YearDeptResultVO model = new YearDeptResultVO();
            model.setCritYear(yearDeptResultAllVO.getCritYear());
            model.setDeptId(yearDeptResultAllVO.getDeptId());
            model.setBplnDstCd(yearDeptResultAllVO.getBplnDstCd());
            model.setBsnsRslDtlDstCd(yearDeptResultAllVO.getBsnsRslDtlDstCd());
            this.bizGoalDAO.deleteMonthlyDeptGoal(model);
        }

        return yearDeptResultAllVO;
    }

    // 영업대표 목표 등록
    @Transactional
    public YearEmpResultAllVO insertMonthlyEmpGoal(Payload<YearEmpResultAllVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".insertMonthlyEmpGoal");
        YearEmpResultAllVO yearEmpResultAllVO = (YearEmpResultAllVO)requestPayload.getDto();
        if (yearEmpResultAllVO.getCudList().size() > 0) {

            BizGoalSearchVO searchVO = new BizGoalSearchVO();
            searchVO.setYear(yearEmpResultAllVO.getCudList().get(0).getCritYear());
            searchVO.setManageTarget("SPRN");
            searchVO.setSlsDeptId(yearEmpResultAllVO.getCudList().get(0).getDeptId());
            searchVO.setBplnDstCd(yearEmpResultAllVO.getCudList().get(0).getBplnDstCd());
            searchVO.setBsnsRslDtlDstCd(yearEmpResultAllVO.getCudList().get(0).getBsnsRslDtlDstCd());
            searchVO.setEmpId(yearEmpResultAllVO.getCudList().get(0).getEmpId());

            if(this.bizGoalDAO.selectisExistsBizGoal(searchVO) > 0 ){
                this.bizGoalDAO.deleteMonthlyEmpGoal((YearEmpResultVO) yearEmpResultAllVO.getCudList().get(0));
            }

            /*if (Boolean.valueOf((String)this.bizGoalDAO.selectisExistsBizGoalEmp((YearEmpResultVO)yearEmpResultAllVO.getCudList().get(0)).get("RESULT"))) {
                this.bizGoalDAO.deleteMonthlyEmpGoal((YearEmpResultVO)yearEmpResultAllVO.getCudList().get(0));
            }*/

            Iterator var3 = yearEmpResultAllVO.getCudList().iterator();

            while(var3.hasNext()) {
                YearEmpResultVO yearEmpResultVO = (YearEmpResultVO)var3.next();
                yearEmpResultVO.setGodsClsfCd("AL");
                yearEmpResultVO.setProdTypeCd("AL");
                yearEmpResultVO.setJanAmt((yearEmpResultVO.getJanAmt() == null ? 0L : yearEmpResultVO.getJanAmt()) * 1000L);
                yearEmpResultVO.setFebAmt((yearEmpResultVO.getFebAmt() == null ? 0L : yearEmpResultVO.getFebAmt()) * 1000L);
                yearEmpResultVO.setMarAmt((yearEmpResultVO.getMarAmt() == null ? 0L : yearEmpResultVO.getMarAmt()) * 1000L);
                yearEmpResultVO.setAprAmt((yearEmpResultVO.getAprAmt() == null ? 0L : yearEmpResultVO.getAprAmt()) * 1000L);
                yearEmpResultVO.setMayAmt((yearEmpResultVO.getMayAmt() == null ? 0L : yearEmpResultVO.getMayAmt()) * 1000L);
                yearEmpResultVO.setJunAmt((yearEmpResultVO.getJunAmt() == null ? 0L : yearEmpResultVO.getJunAmt()) * 1000L);
                yearEmpResultVO.setJulAmt((yearEmpResultVO.getJulAmt() == null ? 0L : yearEmpResultVO.getJulAmt()) * 1000L);
                yearEmpResultVO.setAugAmt((yearEmpResultVO.getAugAmt() == null ? 0L : yearEmpResultVO.getAugAmt()) * 1000L);
                yearEmpResultVO.setSepAmt((yearEmpResultVO.getSepAmt() == null ? 0L : yearEmpResultVO.getSepAmt()) * 1000L);
                yearEmpResultVO.setOctAmt((yearEmpResultVO.getOctAmt() == null ? 0L : yearEmpResultVO.getOctAmt()) * 1000L);
                yearEmpResultVO.setNovAmt((yearEmpResultVO.getNovAmt() == null ? 0L : yearEmpResultVO.getNovAmt()) * 1000L);
                yearEmpResultVO.setDecAmt((yearEmpResultVO.getDecAmt() == null ? 0L : yearEmpResultVO.getDecAmt()) * 1000L);
                this.bizGoalDAO.insertMonthlyEmpGoal(yearEmpResultVO);
            }
        } else {
            YearEmpResultVO model = new YearEmpResultVO();
            model.setCritYear(yearEmpResultAllVO.getCritYear());
            model.setDeptId(yearEmpResultAllVO.getDeptId());
            model.setEmpId(yearEmpResultAllVO.getEmpId());
            model.setBplnDstCd(yearEmpResultAllVO.getBplnDstCd());
            model.setBsnsRslDtlDstCd(yearEmpResultAllVO.getBsnsRslDtlDstCd());
            this.bizGoalDAO.deleteMonthlyEmpGoal(model);
        }

        return yearEmpResultAllVO;
    }

    // 부서 목표 수정(하위부서 포함)
    @Transactional
    public BizGoalSearchVO insertMonthlyDeptLwrkDeptCvrdGoal(Payload<BizGoalSearchVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".insertMonthlyDeptLwrkDeptCvrdGoal");
        BizGoalSearchVO bizGoalSearchVO = (BizGoalSearchVO)requestPayload.getDto();
        this.bizGoalDAO.deleteGoalDcdMonthlyDeptForLwrkDept(bizGoalSearchVO);
        this.bizGoalDAO.insertMonthlyDeptLwrkDeptCvrdGoal(bizGoalSearchVO);
        return bizGoalSearchVO;
    }

    // 부서 목표 수정
    @Transactional
    public YearDeptResultAllVO insertMonthlyDeptGoalDcd(Payload<YearDeptResultAllVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".insertMonthlyDeptGoalDcd");
        YearDeptResultAllVO yearDeptResultAllVO = (YearDeptResultAllVO)requestPayload.getDto();
        if (yearDeptResultAllVO.getCudList().size() > 0) {

            BizGoalSearchVO searchVO = new BizGoalSearchVO();
            searchVO.setYear(yearDeptResultAllVO.getCudList().get(0).getCritYear());
            searchVO.setManageTarget("SDPT");
            searchVO.setSlsDeptId(yearDeptResultAllVO.getCudList().get(0).getDeptId());
            searchVO.setBplnDstCd(yearDeptResultAllVO.getCudList().get(0).getBplnDstCd());
            searchVO.setBsnsRslDtlDstCd(yearDeptResultAllVO.getCudList().get(0).getBsnsRslDtlDstCd());

            if(this.bizGoalDAO.selectisExistsBizGoal(searchVO) > 0 ){
                this.bizGoalDAO.deleteMonthlyDeptGoal((YearDeptResultVO) yearDeptResultAllVO.getCudList().get(0));
            }
            /*
            if (Boolean.valueOf((String)this.bizGoalDAO.selectisExistsBizGoalDept((YearDeptResultVO)yearDeptResultAllVO.getCudList().get(0)).get("RESULT"))) {
                this.bizGoalDAO.deleteGoalDcdMonthlyDept((YearDeptResultVO)yearDeptResultAllVO.getCudList().get(0));
            }*/

            Iterator var3 = yearDeptResultAllVO.getCudList().iterator();

            while(var3.hasNext()) {
                YearDeptResultVO yearDeptResultVO = (YearDeptResultVO)var3.next();
                yearDeptResultVO.setGodsClsfCd("AL");
                yearDeptResultVO.setProdTypeCd("AL");
                yearDeptResultVO.setJanAmt((yearDeptResultVO.getJanAmt() == null ? 0L : yearDeptResultVO.getJanAmt()) * 1000L);
                yearDeptResultVO.setFebAmt((yearDeptResultVO.getFebAmt() == null ? 0L : yearDeptResultVO.getFebAmt()) * 1000L);
                yearDeptResultVO.setMarAmt((yearDeptResultVO.getMarAmt() == null ? 0L : yearDeptResultVO.getMarAmt()) * 1000L);
                yearDeptResultVO.setAprAmt((yearDeptResultVO.getAprAmt() == null ? 0L : yearDeptResultVO.getAprAmt()) * 1000L);
                yearDeptResultVO.setMayAmt((yearDeptResultVO.getMayAmt() == null ? 0L : yearDeptResultVO.getMayAmt()) * 1000L);
                yearDeptResultVO.setJunAmt((yearDeptResultVO.getJunAmt() == null ? 0L : yearDeptResultVO.getJunAmt()) * 1000L);
                yearDeptResultVO.setJulAmt((yearDeptResultVO.getJulAmt() == null ? 0L : yearDeptResultVO.getJulAmt()) * 1000L);
                yearDeptResultVO.setAugAmt((yearDeptResultVO.getAugAmt() == null ? 0L : yearDeptResultVO.getAugAmt()) * 1000L);
                yearDeptResultVO.setSepAmt((yearDeptResultVO.getSepAmt() == null ? 0L : yearDeptResultVO.getSepAmt()) * 1000L);
                yearDeptResultVO.setOctAmt((yearDeptResultVO.getOctAmt() == null ? 0L : yearDeptResultVO.getOctAmt()) * 1000L);
                yearDeptResultVO.setNovAmt((yearDeptResultVO.getNovAmt() == null ? 0L : yearDeptResultVO.getNovAmt()) * 1000L);
                yearDeptResultVO.setDecAmt((yearDeptResultVO.getDecAmt() == null ? 0L : yearDeptResultVO.getDecAmt()) * 1000L);
                this.bizGoalDAO.insertMonthlyDeptGoalDcd(yearDeptResultVO);
            }
        } else {
            YearDeptResultVO model = new YearDeptResultVO();
            model.setCritYear(yearDeptResultAllVO.getCritYear());
            model.setDeptId(yearDeptResultAllVO.getDeptId());
            model.setBplnDstCd(yearDeptResultAllVO.getBplnDstCd());
            model.setBsnsRslDtlDstCd(yearDeptResultAllVO.getBsnsRslDtlDstCd());
            this.bizGoalDAO.deleteGoalDcdMonthlyDept(model);
        }

        return yearDeptResultAllVO;
    }

    // 사원 목표 수정(하위부서 포함)
    @Transactional
    public BizGoalSearchVO insertMonthlyEmpLwrkDeptCvrdGoal(Payload<BizGoalSearchVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".insertMonthlyEmpLwrkDeptCvrdGoal");
        BizGoalSearchVO bizGoalSearchVO = (BizGoalSearchVO)requestPayload.getDto();
        this.bizGoalDAO.deleteGoalDcdMonthlyEmpForLwrkDept(bizGoalSearchVO);
        this.bizGoalDAO.insertMonthlyEmpLwrkDeptCvrdGoal(bizGoalSearchVO);
        return bizGoalSearchVO;
    }

    // 사원 목표 수정
    @Transactional
    public YearEmpResultAllVO insertMonthlyEmpGoalDcd(Payload<YearEmpResultAllVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".insertMonthlyEmpGoalDcd");
        YearEmpResultAllVO yearEmpResultAllVO = (YearEmpResultAllVO)requestPayload.getDto();
        if (yearEmpResultAllVO.getCudList().size() > 0) {
            BizGoalSearchVO searchVO = new BizGoalSearchVO();
            searchVO.setYear(yearEmpResultAllVO.getCudList().get(0).getCritYear());
            searchVO.setManageTarget("SPRN");
            searchVO.setSlsDeptId(yearEmpResultAllVO.getCudList().get(0).getDeptId());
            searchVO.setBplnDstCd(yearEmpResultAllVO.getCudList().get(0).getBplnDstCd());
            searchVO.setBsnsRslDtlDstCd(yearEmpResultAllVO.getCudList().get(0).getBsnsRslDtlDstCd());
            searchVO.setEmpId(yearEmpResultAllVO.getCudList().get(0).getEmpId());

            if(this.bizGoalDAO.selectisExistsBizGoal(searchVO) > 0 ){
                this.bizGoalDAO.deleteMonthlyEmpGoal((YearEmpResultVO) yearEmpResultAllVO.getCudList().get(0));
            }
            /*
            if (Boolean.valueOf((String)this.bizGoalDAO.selectisExistsBizGoalEmp((YearEmpResultVO)yearEmpResultAllVO.getCudList().get(0)).get("RESULT"))) {
                this.bizGoalDAO.deleteGoalDcdMonthlyEmp((YearEmpResultVO)yearEmpResultAllVO.getCudList().get(0));
            }*/

            Iterator var3 = yearEmpResultAllVO.getCudList().iterator();

            while(var3.hasNext()) {
                YearEmpResultVO yearEmpResultVO = (YearEmpResultVO)var3.next();
                yearEmpResultVO.setGodsClsfCd("AL");
                yearEmpResultVO.setProdTypeCd("AL");
                yearEmpResultVO.setJanAmt((yearEmpResultVO.getJanAmt() == null ? 0L : yearEmpResultVO.getJanAmt()) * 1000L);
                yearEmpResultVO.setFebAmt((yearEmpResultVO.getFebAmt() == null ? 0L : yearEmpResultVO.getFebAmt()) * 1000L);
                yearEmpResultVO.setMarAmt((yearEmpResultVO.getMarAmt() == null ? 0L : yearEmpResultVO.getMarAmt()) * 1000L);
                yearEmpResultVO.setAprAmt((yearEmpResultVO.getAprAmt() == null ? 0L : yearEmpResultVO.getAprAmt()) * 1000L);
                yearEmpResultVO.setMayAmt((yearEmpResultVO.getMayAmt() == null ? 0L : yearEmpResultVO.getMayAmt()) * 1000L);
                yearEmpResultVO.setJunAmt((yearEmpResultVO.getJunAmt() == null ? 0L : yearEmpResultVO.getJunAmt()) * 1000L);
                yearEmpResultVO.setJulAmt((yearEmpResultVO.getJulAmt() == null ? 0L : yearEmpResultVO.getJulAmt()) * 1000L);
                yearEmpResultVO.setAugAmt((yearEmpResultVO.getAugAmt() == null ? 0L : yearEmpResultVO.getAugAmt()) * 1000L);
                yearEmpResultVO.setSepAmt((yearEmpResultVO.getSepAmt() == null ? 0L : yearEmpResultVO.getSepAmt()) * 1000L);
                yearEmpResultVO.setOctAmt((yearEmpResultVO.getOctAmt() == null ? 0L : yearEmpResultVO.getOctAmt()) * 1000L);
                yearEmpResultVO.setNovAmt((yearEmpResultVO.getNovAmt() == null ? 0L : yearEmpResultVO.getNovAmt()) * 1000L);
                yearEmpResultVO.setDecAmt((yearEmpResultVO.getDecAmt() == null ? 0L : yearEmpResultVO.getDecAmt()) * 1000L);
                this.bizGoalDAO.insertMonthlyEmpGoalDcd(yearEmpResultVO);
            }
        } else {
            YearEmpResultVO model = new YearEmpResultVO();
            model.setCritYear(yearEmpResultAllVO.getCritYear());
            model.setDeptId(yearEmpResultAllVO.getDeptId());
            model.setEmpId(yearEmpResultAllVO.getEmpId());
            model.setBplnDstCd(yearEmpResultAllVO.getBplnDstCd());
            model.setBsnsRslDtlDstCd(yearEmpResultAllVO.getBsnsRslDtlDstCd());
            this.bizGoalDAO.deleteGoalDcdMonthlyEmp(model);
        }

        return yearEmpResultAllVO;
    }

    // 부서 목표 전체 삭제
    @Transactional
    public YearDeptResultVO deleteMonthlyDeptGoal(Payload<YearDeptResultVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".deleteMonthlyDeptGoal");
        AccountVO accountVO = requestPayload.getAccountVO();
        YearDeptResultVO yearDeptResultVO = (YearDeptResultVO)requestPayload.getDto();
        this.bizGoalDAO.deleteMonthlyDeptGoal(yearDeptResultVO);
        return yearDeptResultVO;
    }

    // 사원 목표 전체 삭제
    @Transactional
    public YearEmpResultVO deleteMonthlyEmpGoal(Payload<YearEmpResultVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".deleteMonthlyEmpGoal");
        AccountVO accountVO = requestPayload.getAccountVO();
        YearEmpResultVO yearEmpResultVO = (YearEmpResultVO)requestPayload.getDto();
        this.bizGoalDAO.deleteMonthlyEmpGoal(yearEmpResultVO);
        return yearEmpResultVO;
    }
}
