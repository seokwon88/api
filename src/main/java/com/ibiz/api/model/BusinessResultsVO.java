package com.ibiz.api.model;

public class BusinessResultsVO {

    /**
     * 사업부문별 코드
     */
    private String bsnsClsfCd;

    /**
     * 실적구분코드
     */
    private String bsnsRslDtlDstCd;

    /**
     * 실적구분명
     */
    private String bsnsRslDtlDstNm;

    /**
     * 연간목표실적
     */
    private Long yrlyGoalRslAmt;

    /**
     * 연간기회실적
     */
    private Long yrlyOpptyRslAmt;

    /**
     * 연간예상실적
     */
    private Long yrlyFcstRslAmt;

    /**
     * 연간실적
     */
    private Long yrlyBrslRslAmt;

    /**
     * 기준월목표실적
     */
    private Long stdGoalRslAmt;

    /**
     * 기준월기회실적
     */
    private Long stdOpptyRslAmt;

    /**
     * 기준월예상실적
     */
    private Long stdFcstRslAmt;

    /**
     * 기준월실적
     */
    private Long stdBrslRslAmt;

    /**
     * 누적목표실적
     */
    private Long acmlGoalRslAmt;

    /**
     * 누적기회실적
     */
    private Long acmlOpptyRslAmt;

    /**
     * 누적예상실적
     */
    private Long acmlFcstRslAmt;

    /**
     * 누적실적
     */
    private Long acmlBrslRslAmt;

    /**
     * 잔여기간목표실적
     */
    private Long rsdnGoalRslAmt;

    /**
     * 잔여기간기회실적
     */
    private Long rsdnOpptyRslAmt;

    /**
     * 잔여기간예상실적
     */
    private Long rsdnFcstRslAmt;

    /**
     * 잔여기간실적
     */
    private Long rsdnBrslRslAmt;

    /**
     * 상품구분코드
     */
    private String prodDstCd;

    /**
     * 상품명
     */
    private String prodDstNm;

    /**
     * 영업부서ID
     */
    private String deptId;

    /**
     * 영업부서명
     */
    private String deptNm;

    /**
     * 영업대표ID
     */
    private String empId;

    /**
     * 영업대표명
     */
    private String empNm;

    /**
     * 상위부서ID
     */
    private String hgrkDeptId;

    /**
     * 상위부서명
     */
    private String hgrkDeptNm;

    /**
     * 실적구분코드
     */
    private String brslDstCd;

    /**
     * 실적구분명
     */
    private String brslDstNm;

    /**
     * 최상위 레벨의 부서명
     */
    private String deptLvl1Nm;

    /**
     * 상위 레벨의 부서명
     */
    private String deptLvl2Nm;

    /**
     * 최상위 레벨의 부서ID
     */
    private String deptLvl1Id;

    /**
     * 상위 레벨의 부서ID
     */
    private String deptLvl2Id;

    private String bsnsClsfNm;

    /**
     * 1월
     */
    private Long janAmt;

    /**
     * 2월
     */
    private Long febAmt;

    /**
     * 3월
     */
    private Long marAmt;

    /**
     * 4월
     */
    private Long aprAmt;

    /**
     * 5월
     */
    private Long mayAmt;

    /**
     * 6월
     */
    private Long junAmt;

    /**
     * 7월
     */
    private Long julAmt;

    /**
     * 8월
     */
    private Long augAmt;

    /**
     * 9월
     */
    private Long sepAmt;

    /**
     * 10월
     */
    private Long octAmt;

    /**
     * 11월
     */
    private Long novAmt;

    /**
     * 12월
     */
    private Long decAmt;

    /**
     * 연도
     */
    private String critYear;

    public String getBsnsClsfCd() {
        return bsnsClsfCd;
    }

    public void setBsnsClsfCd(String bsnsClsfCd) {
        this.bsnsClsfCd = bsnsClsfCd;
    }

    public String getBsnsRslDtlDstCd() {
        return bsnsRslDtlDstCd;
    }

    public void setBsnsRslDtlDstCd(String bsnsRslDtlDstCd) {
        this.bsnsRslDtlDstCd = bsnsRslDtlDstCd;
    }

    public String getBsnsRslDtlDstNm() {
        return bsnsRslDtlDstNm;
    }

    public void setBsnsRslDtlDstNm(String bsnsRslDtlDstNm) {
        this.bsnsRslDtlDstNm = bsnsRslDtlDstNm;
    }

    public Long getYrlyGoalRslAmt() {
        return yrlyGoalRslAmt;
    }

    public void setYrlyGoalRslAmt(Long yrlyGoalRslAmt) {
        this.yrlyGoalRslAmt = yrlyGoalRslAmt;
    }

    public Long getYrlyFcstRslAmt() {
        return yrlyFcstRslAmt;
    }

    public void setYrlyFcstRslAmt(Long yrlyFcstRslAmt) {
        this.yrlyFcstRslAmt = yrlyFcstRslAmt;
    }

    public Long getYrlyBrslRslAmt() {
        return yrlyBrslRslAmt;
    }

    public void setYrlyBrslRslAmt(Long yrlyBrslRslAmt) {
        this.yrlyBrslRslAmt = yrlyBrslRslAmt;
    }

    public Long getStdGoalRslAmt() {
        return stdGoalRslAmt;
    }

    public void setStdGoalRslAmt(Long stdGoalRslAmt) {
        this.stdGoalRslAmt = stdGoalRslAmt;
    }

    public Long getStdFcstRslAmt() {
        return stdFcstRslAmt;
    }

    public void setStdFcstRslAmt(Long stdFcstRslAmt) {
        this.stdFcstRslAmt = stdFcstRslAmt;
    }

    public Long getStdBrslRslAmt() {
        return stdBrslRslAmt;
    }

    public void setStdBrslRslAmt(Long stdBrslRslAmt) {
        this.stdBrslRslAmt = stdBrslRslAmt;
    }

    public Long getAcmlGoalRslAmt() {
        return acmlGoalRslAmt;
    }

    public void setAcmlGoalRslAmt(Long acmlGoalRslAmt) {
        this.acmlGoalRslAmt = acmlGoalRslAmt;
    }

    public Long getAcmlFcstRslAmt() {
        return acmlFcstRslAmt;
    }

    public void setAcmlFcstRslAmt(Long acmlFcstRslAmt) {
        this.acmlFcstRslAmt = acmlFcstRslAmt;
    }

    public Long getAcmlBrslRslAmt() {
        return acmlBrslRslAmt;
    }

    public void setAcmlBrslRslAmt(Long acmlBrslRslAmt) {
        this.acmlBrslRslAmt = acmlBrslRslAmt;
    }

    public Long getRsdnGoalRslAmt() {
        return rsdnGoalRslAmt;
    }

    public void setRsdnGoalRslAmt(Long rsdnGoalRslAmt) {
        this.rsdnGoalRslAmt = rsdnGoalRslAmt;
    }

    public Long getRsdnFcstRslAmt() {
        return rsdnFcstRslAmt;
    }

    public void setRsdnFcstRslAmt(Long rsdnFcstRslAmt) {
        this.rsdnFcstRslAmt = rsdnFcstRslAmt;
    }

    public Long getRsdnBrslRslAmt() {
        return rsdnBrslRslAmt;
    }

    public void setRsdnBrslRslAmt(Long rsdnBrslRslAmt) {
        this.rsdnBrslRslAmt = rsdnBrslRslAmt;
    }

    public String getProdDstCd() {
        return prodDstCd;
    }

    public void setProdDstCd(String prodDstCd) {
        this.prodDstCd = prodDstCd;
    }

    public String getProdDstNm() {
        return prodDstNm;
    }

    public void setProdDstNm(String prodDstNm) {
        this.prodDstNm = prodDstNm;
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

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpNm() {
        return empNm;
    }

    public void setEmpNm(String empNm) {
        this.empNm = empNm;
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

    public String getBrslDstNm() {
        return brslDstNm;
    }

    public void setBrslDstNm(String brslDstNm) {
        this.brslDstNm = brslDstNm;
    }

    public String getDeptLvl1Nm() {
        return deptLvl1Nm;
    }

    public void setDeptLvl1Nm(String deptLvl1Nm) {
        this.deptLvl1Nm = deptLvl1Nm;
    }

    public String getDeptLvl2Nm() {
        return deptLvl2Nm;
    }

    public void setDeptLvl2Nm(String deptLvl2Nm) {
        this.deptLvl2Nm = deptLvl2Nm;
    }

    public String getDeptLvl1Id() {
        return deptLvl1Id;
    }

    public void setDeptLvl1Id(String deptLvl1Id) {
        this.deptLvl1Id = deptLvl1Id;
    }

    public String getDeptLvl2Id() {
        return deptLvl2Id;
    }

    public void setDeptLvl2Id(String deptLvl2Id) {
        this.deptLvl2Id = deptLvl2Id;
    }

    public String getBrslDstCd() {
        return brslDstCd;
    }

    public void setBrslDstCd(String brslDstCd) {
        this.brslDstCd = brslDstCd;
    }

    public String getBsnsClsfNm() {
        return bsnsClsfNm;
    }

    public void setBsnsClsfNm(String bsnsClsfNm) {
        this.bsnsClsfNm = bsnsClsfNm;
    }

    public Long getYrlyOpptyRslAmt() {
        return yrlyOpptyRslAmt;
    }

    public void setYrlyOpptyRslAmt(Long yrlyOpptyRslAmt) {
        this.yrlyOpptyRslAmt = yrlyOpptyRslAmt;
    }

    public Long getStdOpptyRslAmt() {
        return stdOpptyRslAmt;
    }

    public void setStdOpptyRslAmt(Long stdOpptyRslAmt) {
        this.stdOpptyRslAmt = stdOpptyRslAmt;
    }

    public Long getAcmlOpptyRslAmt() {
        return acmlOpptyRslAmt;
    }

    public void setAcmlOpptyRslAmt(Long acmlOpptyRslAmt) {
        this.acmlOpptyRslAmt = acmlOpptyRslAmt;
    }

    public Long getRsdnOpptyRslAmt() {
        return rsdnOpptyRslAmt;
    }

    public void setRsdnOpptyRslAmt(Long rsdnOpptyRslAmt) {
        this.rsdnOpptyRslAmt = rsdnOpptyRslAmt;
    }

    public Long getJanAmt() {
        return janAmt;
    }

    public void setJanAmt(Long janAmt) {
        this.janAmt = janAmt;
    }

    public Long getFebAmt() {
        return febAmt;
    }

    public void setFebAmt(Long febAmt) {
        this.febAmt = febAmt;
    }

    public Long getMarAmt() {
        return marAmt;
    }

    public void setMarAmt(Long marAmt) {
        this.marAmt = marAmt;
    }

    public Long getAprAmt() {
        return aprAmt;
    }

    public void setAprAmt(Long aprAmt) {
        this.aprAmt = aprAmt;
    }

    public Long getMayAmt() {
        return mayAmt;
    }

    public void setMayAmt(Long mayAmt) {
        this.mayAmt = mayAmt;
    }

    public Long getJunAmt() {
        return junAmt;
    }

    public void setJunAmt(Long junAmt) {
        this.junAmt = junAmt;
    }

    public Long getJulAmt() {
        return julAmt;
    }

    public void setJulAmt(Long julAmt) {
        this.julAmt = julAmt;
    }

    public Long getAugAmt() {
        return augAmt;
    }

    public void setAugAmt(Long augAmt) {
        this.augAmt = augAmt;
    }

    public Long getSepAmt() {
        return sepAmt;
    }

    public void setSepAmt(Long sepAmt) {
        this.sepAmt = sepAmt;
    }

    public Long getOctAmt() {
        return octAmt;
    }

    public void setOctAmt(Long octAmt) {
        this.octAmt = octAmt;
    }

    public Long getNovAmt() {
        return novAmt;
    }

    public void setNovAmt(Long novAmt) {
        this.novAmt = novAmt;
    }

    public Long getDecAmt() {
        return decAmt;
    }

    public void setDecAmt(Long decAmt) {
        this.decAmt = decAmt;
    }

    public String getCritYear() {
        return critYear;
    }

    public void setCritYear(String critYear) {
        this.critYear = critYear;
    }

    @Override
    public String toString() {
        return "BusinessResultsVO [bsnsClsfCd=" + bsnsClsfCd + ", bsnsRslDtlDstCd=" + bsnsRslDtlDstCd
                + ", bsnsRslDtlDstNm=" + bsnsRslDtlDstNm + ", yrlyGoalRslAmt=" + yrlyGoalRslAmt + ", yrlyFcstRslAmt="
                + yrlyFcstRslAmt + ", yrlyBrslRslAmt=" + yrlyBrslRslAmt + ", stdGoalRslAmt=" + stdGoalRslAmt
                + ", stdFcstRslAmt=" + stdFcstRslAmt + ", stdBrslRslAmt=" + stdBrslRslAmt + ", acmlGoalRslAmt="
                + acmlGoalRslAmt + ", acmlFcstRslAmt=" + acmlFcstRslAmt + ", acmlBrslRslAmt=" + acmlBrslRslAmt
                + ", rsdnGoalRslAmt=" + rsdnGoalRslAmt + ", rsdnFcstRslAmt=" + rsdnFcstRslAmt + ", rsdnBrslRslAmt="
                + rsdnBrslRslAmt + ", prodDstCd=" + prodDstCd + ", prodDstNm=" + prodDstNm + ", deptId=" + deptId
                + ", deptNm=" + deptNm + ", empId=" + empId + ", empNm=" + empNm + ", hgrkDeptId=" + hgrkDeptId
                + ", hgrkDeptNm=" + hgrkDeptNm + ", brslDstCd=" + brslDstCd + ", brslDstNm=" + brslDstNm
                + ", deptLvl1Nm=" + deptLvl1Nm + ", deptLvl2Nm=" + deptLvl2Nm + ", deptLvl1Id=" + deptLvl1Id
                + ", deptLvl2Id=" + deptLvl2Id + ", bsnsClsfNm=" + bsnsClsfNm + ", yrlyOpptyRslAmt=" + yrlyOpptyRslAmt + ", stdOpptyRslAmt=" + stdOpptyRslAmt
                + ", acmlOpptyRslAmt=" + acmlOpptyRslAmt + ", rsdnOpptyRslAmt=" + rsdnOpptyRslAmt
                + ", janAmt=" + janAmt + ", febAmt=" + febAmt + ", marAmt=" + marAmt + ", aprAmt=" + aprAmt
                + ", mayAmt=" + mayAmt + ", junAmt=" + junAmt + ", julAmt=" + julAmt + ", augAmt=" + augAmt
                + ", sepAmt=" + sepAmt + ", octAmt=" + octAmt + ", novAmt=" + novAmt + ", decAmt=" + decAmt + ", critYear=" + critYear + "]";
    }


}