package com.ibiz.api.model;

public class BusinessIssueListVO {

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
     * 이슈제목
     */
    private String issueTitl;

    /**
     * 이슈발생일
     */
    private String issueOcrDate;

    /**
     * 이슈등록사원ID
     */
    private String regEmpId;

    /**
     * 이슈등록사원명
     */
    private String regEmpNm;

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
     * 이슈처리상태코드
     */
    private String issueDlngStatCd;

    /**
     * 이슈처리상태코드명
     */
    private String issueDlngStatCdNm;

    /**
     * 이슈발생시작일자
     */
    private String issueOcrStartDate;

    /**
     * 이슈발생종료일자
     */
    private String issueOcrEndDate;

    /**
     * 처리부서ID
     */
    private String dlngDeptId;

    /**
     * 처리부서명
     */
    private String dlngDeptNm;

    /**
     * 처리사원ID
     */
    private String dlngEmpId;

    /**
     * 처리사원명
     */
    private String dlngEmpNm;

    /**
     * 계획등록일자
     */
    private String planRegDate;

    /**
     * 개선완료일자
     */
    private String btrmCmplDate;

    /**
     * 이슈내용
     */
    private String issueCont;

    /**
     * 개선계획내용
     */
    private String btrmPlanCont;

    /**
     * 진행사항
     */
    private String btrmPrgsMtr;

    /**
     * 유효시작일자
     */
    private String avlStartDate;

    /**
     * 유효종료일자
     */
    private String avlEndDate;

    /**
     * 페이지사이즈
     */
    private Integer pageSize;

    /**
     * 페이지넘버
     */
    private Integer pageNumber;

    /**
     * 전체 수
     */
    private Integer totalCnt;

    public String getPrjtId() {
        return prjtId;
    }

    public void setPrjtId(String prjtId) {
        this.prjtId = prjtId;
    }

    public String getLastCustId() {
        return lastCustId;
    }

    public void setLastCustId(String lastCustId) {
        this.lastCustId = lastCustId;
    }

    public String getIssueDlngStatCd() {
        return issueDlngStatCd;
    }

    public void setIssueDlngStatCd(String issueDlngStatCd) {
        this.issueDlngStatCd = issueDlngStatCd;
    }

    public String getDlngDeptId() {
        return dlngDeptId;
    }

    public void setDlngDeptId(String dlngDeptId) {
        this.dlngDeptId = dlngDeptId;
    }

    public String getDlngEmpId() {
        return dlngEmpId;
    }

    public void setDlngEmpId(String dlngEmpId) {
        this.dlngEmpId = dlngEmpId;
    }

    public String getPlanRegDate() {
        return planRegDate;
    }

    public void setPlanRegDate(String planRegDate) {
        this.planRegDate = planRegDate;
    }

    public String getBtrmCmplDate() {
        return btrmCmplDate;
    }

    public void setBtrmCmplDate(String btrmCmplDate) {
        this.btrmCmplDate = btrmCmplDate;
    }

    public String getIssueCont() {
        return issueCont;
    }

    public void setIssueCont(String issueCont) {
        this.issueCont = issueCont;
    }

    public String getBtrmPlanCont() {
        return btrmPlanCont;
    }

    public void setBtrmPlanCont(String btrmPlanCont) {
        this.btrmPlanCont = btrmPlanCont;
    }

    public String getAvlStartDate() {
        return avlStartDate;
    }

    public void setAvlStartDate(String avlStartDate) {
        this.avlStartDate = avlStartDate;
    }

    public String getAvlEndDate() {
        return avlEndDate;
    }

    public void setAvlEndDate(String avlEndDate) {
        this.avlEndDate = avlEndDate;
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

    public String getIssueDlngStatCdNm() {
        return issueDlngStatCdNm;
    }

    public void setIssueDlngStatCdNm(String issueDlngStatCdNm) {
        this.issueDlngStatCdNm = issueDlngStatCdNm;
    }

    public String getLastCustNm() {
        return lastCustNm;
    }

    public void setLastCustNm(String lastCustNm) {
        this.lastCustNm = lastCustNm;
    }

    public String getPrjtNm() {
        return prjtNm;
    }

    public void setPrjtNm(String prjtNm) {
        this.prjtNm = prjtNm;
    }


    public String getIssueOcrDate() {
        return issueOcrDate;
    }

    public void setIssueOcrDate(String issueOcrDate) {
        this.issueOcrDate = issueOcrDate;
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

    public String getBtrmPrgsMtr() {
        return btrmPrgsMtr;
    }

    public void setBtrmPrgsMtr(String btrmPrgsMtr) {
        this.btrmPrgsMtr = btrmPrgsMtr;
    }

    public String getIssueTitl() {
        return issueTitl;
    }

    public void setIssueTitl(String issueTitl) {
        this.issueTitl = issueTitl;
    }

    public String getIssueOcrStartDate() {
        return issueOcrStartDate;
    }

    public void setIssueOcrStartDate(String issueOcrStartDate) {
        this.issueOcrStartDate = issueOcrStartDate;
    }

    public String getIssueOcrEndDate() {
        return issueOcrEndDate;
    }

    public void setIssueOcrEndDate(String issueOcrEndDate) {
        this.issueOcrEndDate = issueOcrEndDate;
    }

    public String getDlngDeptNm() {
        return dlngDeptNm;
    }

    public void setDlngDeptNm(String dlngDeptNm) {
        this.dlngDeptNm = dlngDeptNm;
    }

    public String getDlngEmpNm() {
        return dlngEmpNm;
    }

    public void setDlngEmpNm(String dlngEmpNm) {
        this.dlngEmpNm = dlngEmpNm;
    }

    public Integer getTotalCnt() {
        return totalCnt;
    }

    public void setTotalCnt(Integer totalCnt) {
        this.totalCnt = totalCnt;
    }

    @Override
    public String toString() {
        return "BusinessIssueListVO [lastCustId=" + lastCustId + ", lastCustNm=" + lastCustNm + ", prjtId=" + prjtId
                + ", prjtNm=" + prjtNm + ", issueTitl=" + issueTitl + ", issueOcrDate=" + issueOcrDate + ", regEmpId="
                + regEmpId + ", regEmpNm=" + regEmpNm + ", slsDeptId=" + slsDeptId + ", slsDeptNm=" + slsDeptNm
                + ", slsEmpId=" + slsEmpId + ", slsEmpNm=" + slsEmpNm + ", issueDlngStatCd=" + issueDlngStatCd
                + ", issueDlngStatCdNm=" + issueDlngStatCdNm + ", issueOcrStartDate=" + issueOcrStartDate
                + ", issueOcrEndDate=" + issueOcrEndDate + ", dlngDeptId=" + dlngDeptId + ", dlngDeptNm=" + dlngDeptNm
                + ", dlngEmpId=" + dlngEmpId + ", dlngEmpNm=" + dlngEmpNm + ", planRegDate=" + planRegDate
                + ", btrmCmplDate=" + btrmCmplDate + ", issueCont=" + issueCont + ", btrmPlanCont=" + btrmPlanCont
                + ", btrmPrgsMtr=" + btrmPrgsMtr + ", avlStartDate=" + avlStartDate + ", avlEndDate=" + avlEndDate
                + ", pageSize=" + pageSize + ", pageNumber=" + pageNumber + ", totalCnt=" + totalCnt + "]";
    }
}