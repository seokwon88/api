package com.ibiz.api.model;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import java.util.List;

public class BizProjectInfoVO {

    /**
     * 프로젝트ID
     */
    @NotNull
    private String prjtId;

    /**
     * 프로젝트 검색 ID
     */
    private String prjtSearchId;

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
     * 사업부서ID
     */
    @NotNull
    private String bsnsDeptId;

    /**
     * 사업부서명
     */
    private String bsnsDeptNm;

    /**
     * 사업사원ID
     */
    @NotNull
    private String bsnsEmpId;

    /**
     * 사업사원명
     */
    private String bsnsEmpNm;

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
     * 페이지사이즈
     */
    private String pageSize;

    /**
     * 페이지넘버
     */
    private String pageNumber;

    /**
     * 전체 수
     */
    private Integer totalCnt;

    /**
     * 보고유무 (검색조건)
     */
    private String rprtYn;

    /**
     * 최종고객ID (검색조건)
     */
    private String lastCustId;

    /**
     * 최종고객명 (검색조건)
     */
    private String lastCustNm;

    /**
     * 영업사원ID (검색조건)
     */
    private String slsEmpId;

    /**
     * 영업사업명
     */
    private String slsEmpNm;

    /**
     * 프로젝트상태코드
     */
    private String prjtStatCd;

    /**
     * 프로젝트상태코드명
     */
    private String prjtStatCdNm;

    /**
     * 사업수행시작일자
     */
    private String bexcStartDate;

    /**
     * 사업수행종료일자
     */
    private String bexcEndDate;

    /**
     * 프로젝트유형코드 (검색조건)
     */
    private String prjtTypeCd;

    /**
     * 프로젝트유형코드명
     */
    private String prjtTypeCdNm;

    /**
     * 등록시작기간 (검색조건)
     */
    private String startDate;

    /**
     * 등록종료기간 (검색조건)
     */
    private String endDate;

    /**
     * 정렬기준 (검색조건)
     */
    private String sortCrit;

    /**
     * 사업프로젝트보고내역
     */
    private List<BizProjectReportVO> bizProjectReportList;

    /**
     * 사업프로젝트보고 삭제 내역
     */
    private List<BizProjectReportVO> bizPrjtRprtDelList;

    public String getPrjtId() {
        return prjtId;
    }

    public void setPrjtId(String prjtId) {
        this.prjtId = prjtId;
    }

    public String getPrjtSearchId() {
        return prjtSearchId;
    }

    public void setPrjtSearchId(String prjtSearchId) {
        this.prjtSearchId = prjtSearchId;
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

    public String getBsnsDeptId() {
        return bsnsDeptId;
    }

    public void setBsnsDeptId(String bsnsDeptId) {
        this.bsnsDeptId = bsnsDeptId;
    }

    public String getBsnsDeptNm() {
        return bsnsDeptNm;
    }

    public void setBsnsDeptNm(String bsnsDeptNm) {
        this.bsnsDeptNm = bsnsDeptNm;
    }

    public String getBsnsEmpId() {
        return bsnsEmpId;
    }

    public void setBsnsEmpId(String bsnsEmpId) {
        this.bsnsEmpId = bsnsEmpId;
    }

    public String getBsnsEmpNm() {
        return bsnsEmpNm;
    }

    public void setBsnsEmpNm(String bsnsEmpNm) {
        this.bsnsEmpNm = bsnsEmpNm;
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

    public Integer getTotalCnt() {
        return totalCnt;
    }

    public void setTotalCnt(Integer totalCnt) {
        this.totalCnt = totalCnt;
    }

    public String getRprtYn() {
        return rprtYn;
    }

    public void setRprtYn(String rprtYn) {
        this.rprtYn = rprtYn;
    }

    public String getLastCustId() {
        return lastCustId;
    }

    public void setLastCustId(String lastCustId) {
        this.lastCustId = lastCustId;
    }

    public String getLastCustNm() {
        return lastCustNm;
    }

    public void setLastCustNm(String lastCustNm) {
        this.lastCustNm = lastCustNm;
    }

    public String getSlsEmpId() {
        return slsEmpId;
    }

    public void setSlsEmpId(String slsEmpId) {
        this.slsEmpId = slsEmpId;
    }

    public String getSlsEmpNm() {
        return slsEmpNm;
    }

    public void setSlsEmpNm(String slsEmpNm) {
        this.slsEmpNm = slsEmpNm;
    }

    public String getPrjtStatCd() {
        return prjtStatCd;
    }

    public void setPrjtStatCd(String prjtStatCd) {
        this.prjtStatCd = prjtStatCd;
    }

    public String getPrjtStatCdNm() {
        return prjtStatCdNm;
    }

    public void setPrjtStatCdNm(String prjtStatCdNm) {
        this.prjtStatCdNm = prjtStatCdNm;
    }

    public String getBexcStartDate() {
        return bexcStartDate;
    }

    public void setBexcStartDate(String bexcStartDate) {
        this.bexcStartDate = bexcStartDate;
    }

    public String getBexcEndDate() {
        return bexcEndDate;
    }

    public void setBexcEndDate(String bexcEndDate) {
        this.bexcEndDate = bexcEndDate;
    }

    public String getPrjtTypeCd() {
        return prjtTypeCd;
    }

    public void setPrjtTypeCd(String prjtTypeCd) {
        this.prjtTypeCd = prjtTypeCd;
    }

    public String getPrjtTypeCdNm() {
        return prjtTypeCdNm;
    }

    public void setPrjtTypeCdNm(String prjtTypeCdNm) {
        this.prjtTypeCdNm = prjtTypeCdNm;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getSortCrit() {
        return sortCrit;
    }

    public void setSortCrit(String sortCrit) {
        this.sortCrit = sortCrit;
    }

    public List<BizProjectReportVO> getBizProjectReportList() {
        return bizProjectReportList;
    }

    public void setBizProjectReportList(List<BizProjectReportVO> bizProjectReportList) {
        this.bizProjectReportList = bizProjectReportList;
    }

    public List<BizProjectReportVO> getBizPrjtRprtDelList() {
        return bizPrjtRprtDelList;
    }

    public void setBizPrjtRprtDelList(List<BizProjectReportVO> bizPrjtRprtDelList) {
        this.bizPrjtRprtDelList = bizPrjtRprtDelList;
    }

}