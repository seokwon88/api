package com.ibiz.api.model;

public class BizGoalSearchVO {

    /**
     * 기준연도
     */
    private String year;

    /**
     * 영업부서ID
     */
    private String slsDeptId;

    /**
     * 사업계획구분코드
     */
    private String bplnDstCd;

    /**
     * 사업실적상세구분코드
     */
    private String brslDtlDstCd;

    /**
     * 사업분류코드
     */
    private String bsnsClsfCd;

    /**
     * 실적구분코드
     */
    private String brslDstCd;

    /**
     * 영업대표ID
     */
    private String empId;

    /**
     * 목표관리주체
     */
    private String manageTarget;

    /**
     * 금액단위코드
     */
    private String amtUnitCd;


    /**
     * 오픈관리대상 코드
     */
    private String openMgmtTgtCd;

    /**
     * 하위부서포함여부
     */
    private String lowerDeptYN;

    // 관리자를 위한 코드
    private String adminBplnDstCd;

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getSlsDeptId() {
        return slsDeptId;
    }

    public void setSlsDeptId(String slsDeptId) {
        this.slsDeptId = slsDeptId;
    }

    public String getBplnDstCd() {
        return bplnDstCd;
    }

    public void setBplnDstCd(String bplnDstCd) {
        this.bplnDstCd = bplnDstCd;
    }

    public String getBrslDtlDstCd() {
        return brslDtlDstCd;
    }

    public void setBrslDtlDstCd(String brslDtlDstCd) {
        this.brslDtlDstCd = brslDtlDstCd;
    }

    public String getBsnsClsfCd() {
        return bsnsClsfCd;
    }

    public void setBsnsClsfCd(String bsnsClsfCd) {
        this.bsnsClsfCd = bsnsClsfCd;
    }

    public String getBrslDstCd() {
        return brslDstCd;
    }

    public void setBrslDstCd(String brslDstCd) {
        this.brslDstCd = brslDstCd;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getManageTarget() {
        return manageTarget;
    }

    public void setManageTarget(String manageTarget) {
        this.manageTarget = manageTarget;
    }

    public String getAmtUnitCd() {
        return amtUnitCd;
    }

    public void setAmtUnitCd(String amtUnitCd) {
        this.amtUnitCd = amtUnitCd;
    }

    public String getOpenMgmtTgtCd() {
        return openMgmtTgtCd;
    }

    public void setOpenMgmtTgtCd(String openMgmtTgtCd) {
        this.openMgmtTgtCd = openMgmtTgtCd;
    }

    public String getLowerDeptYN() {
        return lowerDeptYN;
    }

    public void setLowerDeptYN(String lowerDeptYN) {
        this.lowerDeptYN = lowerDeptYN;
    }

    public String getAdminBplnDstCd() {
        return adminBplnDstCd;
    }

    public void setAdminBplnDstCd(String adminBplnDstCd) {
        this.adminBplnDstCd = adminBplnDstCd;
    }

    @Override
    public String toString() {
        return "BizGoalSearchVO [year=" + year + ", slsDeptId=" + slsDeptId + ", bplnDstCd=" + bplnDstCd
                + ", brslDtlDstCd=" + brslDtlDstCd + ", bsnsClsfCd=" + bsnsClsfCd + ", brslDstCd=" + brslDstCd
                + ", empId=" + empId + ", manageTarget=" + manageTarget + ", amtUnitCd=" + amtUnitCd
                + ", openMgmtTgtCd=" + openMgmtTgtCd + ", lowerDeptYN=" + lowerDeptYN + ", adminBplnDstCd="
                + adminBplnDstCd + "]";
    }
}