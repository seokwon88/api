package com.ibiz.api.model;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

public class BizProjectReportVO {

    /**
     * 프로젝트ID
     */
    @NotNull
    private String prjtId;

    /**
     * 프로젝트명
     */
    private String prjtNm;

    /**
     * SEQ
     */
    @Digits(integer=3,fraction=0)
    private Integer seq;

    /**
     * 사업보고시작일자
     */
    @NotNull
    private String bsnsRprtStartDate;

    /**
     * 사업보고종료일자
     */
    @NotNull
    private String bsnsRprtEndDate;

    /**
     * 보고유무
     */
    private String rprtYn;

    /**
     * 보고내용
     */
    private String rprtCont;

    /**
     * 사업진행상태코드
     */
    @NotNull
    private String bsnsPrgsStatCd;

    /**
     * 사업진행상태코드명
     */
    private String bsnsPrgsStatCdNm;

    /**
     * 변경사원ID
     */
    private String chgEmpId;

    /**
     * 변경사원명
     */
    private String chgEmpNm;

    /**
     * 변경일시
     */
    private String chgDt;

    public String getPrjtId() {
        return prjtId;
    }

    public void setPrjtId(String prjtId) {
        this.prjtId = prjtId;
    }

    public String getPrjtNm() {
        return prjtNm;
    }

    public void setPrjtNm(String prjtNm) {
        this.prjtNm = prjtNm;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public String getBsnsRprtStartDate() {
        return bsnsRprtStartDate;
    }

    public void setBsnsRprtStartDate(String bsnsRprtStartDate) {
        this.bsnsRprtStartDate = bsnsRprtStartDate;
    }

    public String getBsnsRprtEndDate() {
        return bsnsRprtEndDate;
    }

    public void setBsnsRprtEndDate(String bsnsRprtEndDate) {
        this.bsnsRprtEndDate = bsnsRprtEndDate;
    }

    public String getRprtYn() {
        return rprtYn;
    }

    public void setRprtYn(String rprtYn) {
        this.rprtYn = rprtYn;
    }

    public String getRprtCont() {
        return rprtCont;
    }

    public void setRprtCont(String rprtCont) {
        this.rprtCont = rprtCont;
    }

    public String getBsnsPrgsStatCd() {
        return bsnsPrgsStatCd;
    }

    public void setBsnsPrgsStatCd(String bsnsPrgsStatCd) {
        this.bsnsPrgsStatCd = bsnsPrgsStatCd;
    }

    public String getBsnsPrgsStatCdNm() {
        return bsnsPrgsStatCdNm;
    }

    public void setBsnsPrgsStatCdNm(String bsnsPrgsStatCdNm) {
        this.bsnsPrgsStatCdNm = bsnsPrgsStatCdNm;
    }

    public String getChgEmpId() {
        return chgEmpId;
    }

    public void setChgEmpId(String chgEmpId) {
        this.chgEmpId = chgEmpId;
    }

    public String getChgEmpNm() {
        return chgEmpNm;
    }

    public void setChgEmpNm(String chgEmpNm) {
        this.chgEmpNm = chgEmpNm;
    }

    public String getChgDt() {
        return chgDt;
    }

    public void setChgDt(String chgDt) {
        this.chgDt = chgDt;
    }

}