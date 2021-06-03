package com.ibiz.api.model;

public class BusinessResultSearchVO {

    /**
     * 기준연도
     */
    private String critYear;

    /**
     * 예상연월
     */
    private String fcstYam;

    /**
     * 단위
     */
    private String amtUnitCd;

    /**
     * 기준월
     */
    private String critMon;

    /**
     * 잔여기간 시작월
     */
    private String rsdnStartMon;

    /**
     * 잔여기간 종료월
     */
    private String rsdnEndMon;

    /**
     * 영업부서
     */
    private String deptId;

    /**
     * 연간/누적 예상표시
     */
    private String fcstYN;

    /**
     * 사업부분코드
     */
    private String bsnsClsfCd;

    /**
     * 사업실적구분코드
     */
    private String brslDtlDstCd;

    /**
     * 영업대표ID
     */
    private String empId;

    /**
     * 상위부서ID
     */
    private String hgrkDeptId;

    /**
     * 상위부서명
     */
    private String hgrkDeptNm;

    /**
     * 정렬타입코드
     */
    private String orderTypeCd;

    /**
     * 사업실적구분코드
     */
    private String brslDstCd;

    /**
     * 잔여기간 시작연월
     */
    private String rsdnStartDate;

    /**
     * 잔여기간 종료연월
     */
    private String rsdnEndDate;

    // 기준연월
    private String critDate;

    private String slsDeptId;

    private String slsEmpId;

    private String fromDate;

    private String toDate;

    private String janDate;

    private String subDept;

    private String prjtTypeCd;

    /**
     * 상품구분코드
     */
    private String prodDstCd;

    private String isUnsold;

    private String pageType;

    private String orgTypeCd;

    private String slsDeptNm;

    private String empNm;

    private String stdMonth;

    /**
     * 제품분류코드
     */
    private String godsClsfCd;

    /**
     * 사업계획분류코드
     */
    private String bplnClsfCd;

    /**
     * 사업계획분류코드  명
     */
    private String bplnClsfCdNm;


    /**
     * 페이지사이즈
     */
    private Integer pageSize;

    /**
     * 페이지넘버
     */
    private Integer pageNumber;

    // 프로젝트별 합계조회여부
    private String byPrjtYn;


    public String getCritYear() {
        return critYear;
    }

    public void setCritYear(String critYear) {
        this.critYear = critYear;
    }

    public String getFcstYam() {
        return fcstYam;
    }

    public void setFcstYam(String fcstYam) {
        this.fcstYam = fcstYam;
    }

    public String getAmtUnitCd() {
        return amtUnitCd;
    }

    public void setAmtUnitCd(String amtUnitCd) {
        this.amtUnitCd = amtUnitCd;
    }

    public String getCritMon() {
        return critMon;
    }

    public void setCritMon(String critMon) {
        this.critMon = critMon;
    }

    public String getRsdnEndMon() {
        return rsdnEndMon;
    }

    public void setRsdnEndMon(String rsdnEndMon) {
        this.rsdnEndMon = rsdnEndMon;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getFcstYN() {
        return fcstYN;
    }

    public void setFcstYN(String fcstYN) {
        this.fcstYN = fcstYN;
    }

    public String getBsnsClsfCd() {
        return bsnsClsfCd;
    }

    public void setBsnsClsfCd(String bsnsClsfCd) {
        this.bsnsClsfCd = bsnsClsfCd;
    }

    public String getBrslDtlDstCd() {
        return brslDtlDstCd;
    }

    public void setBrslDtlDstCd(String brslDtlDstCd) {
        this.brslDtlDstCd = brslDtlDstCd;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getHgrkDeptId() {
        return hgrkDeptId;
    }

    public void setHgrkDeptId(String hgrkDeptId) {
        this.hgrkDeptId = hgrkDeptId;
    }

    public String getHgrkDeptNm() {
        return hgrkDeptNm;
    }

    public void setHgrkDeptNm(String hgrkDeptNm) {
        this.hgrkDeptNm = hgrkDeptNm;
    }

    public String getOrderTypeCd() {
        return orderTypeCd;
    }

    public void setOrderTypeCd(String orderTypeCd) {
        this.orderTypeCd = orderTypeCd;
    }

    public String getBrslDstCd() {
        return brslDstCd;
    }

    public void setBrslDstCd(String brslDstCd) {
        this.brslDstCd = brslDstCd;
    }

    public String getSlsDeptId() {
        return slsDeptId;
    }

    public void setSlsDeptId(String slsDeptId) {
        this.slsDeptId = slsDeptId;
    }

    public String getSlsEmpId() {
        return slsEmpId;
    }

    public void setSlsEmpId(String slsEmpId) {
        this.slsEmpId = slsEmpId;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public String getJanDate() {
        return janDate;
    }

    public void setJanDate(String janDate) {
        this.janDate = janDate;
    }

    public String getSubDept() {
        return subDept;
    }

    public void setSubDept(String subDept) {
        this.subDept = subDept;
    }

    public String getPrjtTypeCd() {
        return prjtTypeCd;
    }

    public void setPrjtTypeCd(String prjtTypeCd) {
        this.prjtTypeCd = prjtTypeCd;
    }

    public String getProdDstCd() {
        return prodDstCd;
    }

    public void setProdDstCd(String prodDstCd) {
        this.prodDstCd = prodDstCd;
    }

    public String getIsUnsold() {
        return isUnsold;
    }

    public void setIsUnsold(String isUnsold) {
        this.isUnsold = isUnsold;
    }

    public String getPageType() {
        return pageType;
    }

    public void setPageType(String pageType) {
        this.pageType = pageType;
    }

    public String getOrgTypeCd() {
        return orgTypeCd;
    }

    public void setOrgTypeCd(String orgTypeCd) {
        this.orgTypeCd = orgTypeCd;
    }

    public String getSlsDeptNm() {
        return slsDeptNm;
    }

    public void setSlsDeptNm(String slsDeptNm) {
        this.slsDeptNm = slsDeptNm;
    }

    public String getEmpNm() {
        return empNm;
    }

    public void setEmpNm(String empNm) {
        this.empNm = empNm;
    }

    public String getStdMonth() {
        return stdMonth;
    }

    public void setStdMonth(String stdMonth) {
        this.stdMonth = stdMonth;
    }

    public String getGodsClsfCd() {
        return godsClsfCd;
    }

    public void setGodsClsfCd(String godsClsfCd) {
        this.godsClsfCd = godsClsfCd;
    }

    public String getBplnClsfCd() {
        return bplnClsfCd;
    }

    public void setBplnClsfCd(String bplnClsfCd) {
        this.bplnClsfCd = bplnClsfCd;
    }

    public String getBplnClsfCdNm() {
        return bplnClsfCdNm;
    }

    public void setBplnClsfCdNm(String bplnClsfCdNm) {
        this.bplnClsfCdNm = bplnClsfCdNm;
    }

    public String getRsdnStartMon() {
        return rsdnStartMon;
    }

    public void setRsdnStartMon(String rsdnStartMon) {
        this.rsdnStartMon = rsdnStartMon;
    }

    public String getRsdnStartDate() {
        return rsdnStartDate;
    }

    public void setRsdnStartDate(String rsdnStartDate) {
        this.rsdnStartDate = rsdnStartDate;
    }

    public String getRsdnEndDate() {
        return rsdnEndDate;
    }

    public void setRsdnEndDate(String rsdnEndDate) {
        this.rsdnEndDate = rsdnEndDate;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getCritDate() {
        return critDate;
    }

    public void setCritDate(String critDate) {
        this.critDate = critDate;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getByPrjtYn() {
        return byPrjtYn;
    }

    public void setByPrjtYn(String byPrjtYn) {
        this.byPrjtYn = byPrjtYn;
    }
}
