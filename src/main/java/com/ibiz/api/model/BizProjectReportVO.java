package com.ibiz.api.model;

import javax.validation.constraints.NotNull;

public class BizProjectReportVO {

    /**
     * 프로젝트ID
     */
    private String prjtId;

    /**
     * 프로젝트명
     */
    private String prjtNm;

    /**
     * SEQ
     */
    private Integer prjtSeq;

    /**
     * SEQ
     */
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
    private String bsnsPrgsStatCd;

    /**
     * 사업진행상태코드명
     */
    private String bsnsPrgsStatCdNm;

    /**
     * 보고유형코드
     */
    private String rprtTypeCd;

    /**
     * 보고유형코드명
     */
    private String rprtTypeCdNm;

    /**
     * 부서ID
     */
    private String deptId;

    /**
     * 부서명
     */
    private String deptNm;

    /**
     * 등록사원ID
     */
    private String regEmpId;

    /**
     * 등록사원명
     */
    private String regEmpNm;

    /**
     * 등록일시
     */
    private String regDt;

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

    /**
     * 전체 수
     */
    private Integer totalCnt;

    /**
     * 페이징 크기
     */
    private String pageSize;

    /**
     * 페이지번호
     */
    private String pageNumber;

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

    public Integer getPrjtSeq() {
        return prjtSeq;
    }

    public void setPrjtSeq(Integer prjtSeq) {
        this.prjtSeq = prjtSeq;
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

    public String getRprtTypeCd() {
        return rprtTypeCd;
    }

    public void setRprtTypeCd(String rprtTypeCd) {
        this.rprtTypeCd = rprtTypeCd;
    }

    public String getRprtTypeCdNm() {
        return rprtTypeCdNm;
    }

    public void setRprtTypeCdNm(String rprtTypeCdNm) {
        this.rprtTypeCdNm = rprtTypeCdNm;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptNm() {
        return deptNm;
    }

    public void setDeptNm(String deptNm) {
        this.deptNm = deptNm;
    }

    public String getRegEmpId() {
        return regEmpId;
    }

    public void setRegEmpId(String regEmpId) {
        this.regEmpId = regEmpId;
    }

    public String getRegEmpNm() {
        return regEmpNm;
    }

    public void setRegEmpNm(String regEmpNm) {
        this.regEmpNm = regEmpNm;
    }

    public String getRegDt() {
        return regDt;
    }

    public void setRegDt(String regDt) {
        this.regDt = regDt;
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

    public Integer getTotalCnt() {
        return totalCnt;
    }

    public void setTotalCnt(Integer totalCnt) {
        this.totalCnt = totalCnt;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public String getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
    }
}