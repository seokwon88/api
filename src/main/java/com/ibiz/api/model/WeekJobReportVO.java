package com.ibiz.api.model;

public class WeekJobReportVO {

    /**
     * 사업분류코드
     */
    private String bsnsClsfCd;

    /**
     * 사업분류코드명
     */
    private String bsnsClsfCdNm;

    /**
     * 최종고객ID
     */
    private String lastCustId;

    /**
     * 최종고객명
     */
    private String lastCustNm;

    /**
     * 프로젝트ID
     */
    private String prjtId;

    /**
     * 프로젝트명
     */
    private String prjtNm;

    /**
     * 사업기회ID
     */
    private String boptId;

    /**
     * 사업기회명
     */
    private String boptNm;

    /**
     * 발주고객ID
     */
    private String ordeCustId;

    /**
     * 발주고객명
     */
    private String ordeCustNm;

    /**
     * 계약일자
     */
    private String cntrDate;

    /**
     * 계약이행시작연월
     */
    private String cntrTrsfStartYam;

    /**
     * 계약이행종료연월
     */
    private String cntrTrsfEndYam;

    /**
     * 활동등록시작기간
     */
    private String regActStartDate;

    /**
     * 활동등록시작기간
     */
    private String regActEndDate;

    /**
     * 예상수주액
     */
    private String sumSellAmt;

    /**
     * 수주확률코드
     */
    private String wctPrbbCd;

    /**
     * 수주확률코드명
     */
    private String wctPrbbCdNm;

    /**
     * 최고수주확률
     */
    private int minWctPrbbCd;

    /**
     * 최저수주확률
     */
    private int maxWctPrbbCd;

    /**
     * 영업부서ID
     */
    private String slsDeptId;

    /**
     * 영업부서명
     */
    private String slsDeptNm;

    /**
     * 영업사원ID
     */
    private String slsEmpId;

    /**
     * 영업사원명
     */
    private String slsEmpNm;

    /**
     * 사업기회상태코드
     */
    private String boptStatCd;

    /**
     * 사업기회상태코드명
     */
    private String boptStatCdNm;

    /**
     * 비교코드
     */
    private String compareCd;

    /**
     * 페이지사이즈
     */
    private Integer pageSize;

    /**
     * 페이지넘버
     */
    private Integer pageNumber;

    /**
     * 전체페이지
     */
    private Integer totalCnt;

    /**
     * 특별내용
     */
    private String spclCont;

    /**
     * 주요활동내용
     */
    private String prmryActCont;

    /**
     * 활동계획내용
     */
    private String actPlanCont;

    public String getBsnsClsfCd() {
        return bsnsClsfCd;
    }

    public void setBsnsClsfCd(String bsnsClsfCd) {
        this.bsnsClsfCd = bsnsClsfCd;
    }

    public String getBsnsClsfCdNm() {
        return bsnsClsfCdNm;
    }

    public void setBsnsClsfCdNm(String bsnsClsfCdNm) {
        this.bsnsClsfCdNm = bsnsClsfCdNm;
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

    public String getPrjtId() {
        return prjtId;
    }

    public void setPrjtId(String prjtId) {
        this.prjtId = prjtId;
    }

    public String getBoptId() {
        return boptId;
    }

    public void setBoptId(String boptId) {
        this.boptId = boptId;
    }

    public String getBoptNm() {
        return boptNm;
    }

    public void setBoptNm(String boptNm) {
        this.boptNm = boptNm;
    }

    public String getOrdeCustId() {
        return ordeCustId;
    }

    public void setOrdeCustId(String ordeCustId) {
        this.ordeCustId = ordeCustId;
    }

    public String getOrdeCustNm() {
        return ordeCustNm;
    }

    public void setOrdeCustNm(String ordeCustNm) {
        this.ordeCustNm = ordeCustNm;
    }

    public String getCntrDate() {
        return cntrDate;
    }

    public void setCntrDate(String cntrDate) {
        this.cntrDate = cntrDate;
    }

    public String getCntrTrsfStartYam() {
        return cntrTrsfStartYam;
    }

    public void setCntrTrsfStartYam(String cntrTrsfStartYam) {
        this.cntrTrsfStartYam = cntrTrsfStartYam;
    }

    public String getCntrTrsfEndYam() {
        return cntrTrsfEndYam;
    }

    public void setCntrTrsfEndYam(String cntrTrsfEndYam) {
        this.cntrTrsfEndYam = cntrTrsfEndYam;
    }

    public String getSumSellAmt() {
        return sumSellAmt;
    }

    public void setSumSellAmt(String sumSellAmt) {
        this.sumSellAmt = sumSellAmt;
    }

    public String getWctPrbbCd() {
        return wctPrbbCd;
    }

    public void setWctPrbbCd(String wctPrbbCd) {
        this.wctPrbbCd = wctPrbbCd;
    }

    public String getWctPrbbCdNm() {
        return wctPrbbCdNm;
    }

    public void setWctPrbbCdNm(String wctPrbbCdNm) {
        this.wctPrbbCdNm = wctPrbbCdNm;
    }

    public String getSlsDeptId() {
        return slsDeptId;
    }

    public void setSlsDeptId(String slsDeptId) {
        this.slsDeptId = slsDeptId;
    }

    public String getSlsDeptNm() {
        return slsDeptNm;
    }

    public void setSlsDeptNm(String slsDeptNm) {
        this.slsDeptNm = slsDeptNm;
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

    public String getBoptStatCd() {
        return boptStatCd;
    }

    public void setBoptStatCd(String boptStatCd) {
        this.boptStatCd = boptStatCd;
    }

    public String getBoptStatCdNm() {
        return boptStatCdNm;
    }

    public void setBoptStatCdNm(String boptStatCdNm) {
        this.boptStatCdNm = boptStatCdNm;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getPrjtNm() {
        return prjtNm;
    }

    public void setPrjtNm(String prjtNm) {
        this.prjtNm = prjtNm;
    }

    public String getCompareCd() {
        return compareCd;
    }

    public void setCompareCd(String compareCd) {
        this.compareCd = compareCd;
    }

    public int getMinWctPrbbCd() {
        return minWctPrbbCd;
    }

    public void setMinWctPrbbCd(int minWctPrbbCd) {
        this.minWctPrbbCd = minWctPrbbCd;
    }

    public int getMaxWctPrbbCd() {
        return maxWctPrbbCd;
    }

    public void setMaxWctPrbbCd(int maxWctPrbbCd) {
        this.maxWctPrbbCd = maxWctPrbbCd;
    }

    public String getRegActStartDate() {
        return regActStartDate;
    }

    public void setRegActStartDate(String regActStartDate) {
        this.regActStartDate = regActStartDate;
    }

    public String getRegActEndDate() {
        return regActEndDate;
    }

    public void setRegActEndDate(String regActEndDate) {
        this.regActEndDate = regActEndDate;
    }

    public Integer getTotalCnt() {
        return totalCnt;
    }

    public void setTotalCnt(Integer totalCnt) {
        this.totalCnt = totalCnt;
    }

    public String getActPlanCont() {
        return actPlanCont;
    }

    public String getPrmryActCont() {
        return prmryActCont;
    }

    public String getSpclCont() {
        return spclCont;
    }

    public void setActPlanCont(String actPlanCont) {
        this.actPlanCont = actPlanCont;
    }

    public void setPrmryActCont(String prmryActCont) {
        this.prmryActCont = prmryActCont;
    }

    public void setSpclCont(String spclCont) {
        this.spclCont = spclCont;
    }

    @Override
    public String toString() {
        return "WeekJobReportVO [bsnsClsfCd=" + bsnsClsfCd + ", bsnsClsfCdNm=" + bsnsClsfCdNm + ", lastCustId=" + lastCustId
                + ", lastCustNm=" + lastCustNm + ", prjtId=" + prjtId + ", prjtNm=" + prjtNm + ", boptId=" + boptId
                + ", boptNm=" + boptNm + ", ordeCustId=" + ordeCustId + ", ordeCustNm=" + ordeCustNm + ", cntrDate="
                + cntrDate + ", cntrTrsfStartYam=" + cntrTrsfStartYam + ", cntrTrsfEndYam=" + cntrTrsfEndYam
                + ", regActStartDate=" + regActStartDate + ", regActEndDate=" + regActEndDate + ", sumSellAmt="
                + sumSellAmt + ", wctPrbbCd=" + wctPrbbCd + ", wctPrbbCdNm=" + wctPrbbCdNm + ", minWctPrbbCd="
                + minWctPrbbCd + ", maxWctPrbbCd=" + maxWctPrbbCd + ", slsDeptId=" + slsDeptId + ", slsDeptNm="
                + slsDeptNm + ", slsEmpId=" + slsEmpId + ", slsEmpNm=" + slsEmpNm + ", boptStatCd=" + boptStatCd
                + ", boptStatCdNm=" + boptStatCdNm + ", compareCd=" + compareCd + ", pageSize=" + pageSize + ", pageNumber="
                + pageNumber + ", totalCnt=" + totalCnt + ", actPlanCont=" + actPlanCont + ", prmryActCont=" + prmryActCont + ", spclCont=" + spclCont+ "]";
    }

}