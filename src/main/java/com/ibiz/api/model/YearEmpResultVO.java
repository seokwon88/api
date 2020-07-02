package com.ibiz.api.model;

import com.ibiz.api.exception.ExceptionCode;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @Table BRST110T
 */
public class YearEmpResultVO {

    /**
     * 사업연도
     */
    @NotNull
    @Size(max=4, message= ExceptionCode.OUTOFSIZE_EXCEPTION+" 기준연도는 4자리 이하여야합니다." )
    private String critYear;

    /**
     * 부서ID
     */
    @NotNull
    @Size(max=8, message=ExceptionCode.OUTOFSIZE_EXCEPTION+" 부서ID는 8자리 이하여야합니다." )
    private String deptId;

    /**
     * 사원ID
     */
    @NotNull
    @Size(max=10, message=ExceptionCode.OUTOFSIZE_EXCEPTION+" 사원ID는 10자리 이하여야합니다." )
    private String empId;

    /**
     * 사업계획구분코드
     */
    @NotNull
    @Size(max=4, message=ExceptionCode.OUTOFSIZE_EXCEPTION+" 사업계획구분코드는 4자리 이하여야합니다." )
    private String bplnDstCd;

    /**
     * 사업실적상세구분코드
     */
    @NotNull
    @Size(max=4, message=ExceptionCode.OUTOFSIZE_EXCEPTION+" 사업실적상세구분코드는 4자리 이하여야합니다." )
    private String bsnsRslDtlDstCd;

    /**
     * 사업분류코드
     */
    @NotNull
    @Size(max=4, message=ExceptionCode.OUTOFSIZE_EXCEPTION+" 사업분류코드는 4자리 이하여야합니다." )
    private String bsnsClsfCd;

    /**
     * 상붐구분코드
     */
    @NotNull
    @Size(max=4, message=ExceptionCode.OUTOFSIZE_EXCEPTION+" 상품구분코드는 4자리 이하여야합니다." )
    private String prodDstCd;

    /**
     * 상붐유형코드
     */
    @NotNull
    @Size(max=4, message=ExceptionCode.OUTOFSIZE_EXCEPTION+" 상품유형코드는 4자리 이하여야합니다." )
    private String prodTypeCd;

    /**
     * 제품분류코드
     */
    @NotNull
    @Size(max=4, message=ExceptionCode.OUTOFSIZE_EXCEPTION+" 제품분류코드는 4자리 이하여야합니다." )
    private String godsClsfCd;

    /**
     * 1월금액
     */
    @Digits(integer=15,fraction=0)
    private Long janAmt;

    /**
     * 2월금액
     */
    @Digits(integer=15,fraction=0)
    private Long febAmt;

    /**
     * 3월금액
     */
    @Digits(integer=15,fraction=0)
    private Long marAmt;

    /**
     * 4월금액
     */
    @Digits(integer=15,fraction=0)
    private Long aprAmt;

    /**
     * 5월금액
     */
    @Digits(integer=15,fraction=0)
    private Long mayAmt;

    /**
     * 6월금액
     */
    @Digits(integer=15,fraction=0)
    private Long junAmt;

    /**
     * 7월금액
     */
    @Digits(integer=15,fraction=0)
    private Long julAmt;

    /**
     * 8월금액
     */
    @Digits(integer=15,fraction=0)
    private Long augAmt;

    /**
     * 9월금액
     */
    @Digits(integer=15,fraction=0)
    private Long sepAmt;

    /**
     * 10월금액
     */
    @Digits(integer=15,fraction=0)
    private Long octAmt;

    /**
     * 11월금액
     */
    @Digits(integer=15,fraction=0)
    private Long novAmt;

    /**
     * 12월금액
     */
    @Digits(integer=15,fraction=0)
    private Long decAmt;


    /**
     * 상위부서ID(본부ID)
     */
    private String hgrkDeptId;

    /**
     * 상위부서명(본부명)
     */
    private String hgrkDeptNm;

    /**
     * 부서 정렬
     */
    private String deptSortSeqc;

    /**
     * 부서명
     */
    private String deptNm;

    /**
     * 영업대표명
     */
    private String empNm;

    /**
     * 본부 갯수
     */
    private int hgrkDeptCnt;

    /**
     * 팀 갯수
     */
    private int hgrkDeptTeamCnt;

    /**
     * 상품구분명
     */
    private String prodDstCdNm;

    /**
     * 소계 금액
     */
    private Long sumAmt;

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
    public String getCritYear() {
        return critYear;
    }

    public void setCritYear(String critYear) {
        this.critYear = critYear;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getBplnDstCd() {
        return bplnDstCd;
    }

    public void setBplnDstCd(String bplnDstCd) {
        this.bplnDstCd = bplnDstCd;
    }

    public String getBsnsRslDtlDstCd() {
        return bsnsRslDtlDstCd;
    }

    public void setBsnsRslDtlDstCd(String bsnsRslDtlDstCd) {
        this.bsnsRslDtlDstCd = bsnsRslDtlDstCd;
    }

    public String getBsnsClsfCd() {
        return bsnsClsfCd;
    }

    public void setBsnsClsfCd(String bsnsClsfCd) {
        this.bsnsClsfCd = bsnsClsfCd;
    }

    public String getProdDstCd() {
        return prodDstCd;
    }

    public void setProdDstCd(String prodDstCd) {
        this.prodDstCd = prodDstCd;
    }

    public String getGodsClsfCd() {
        return godsClsfCd;
    }

    public void setGodsClsfCd(String godsClsfCd) {
        this.godsClsfCd = godsClsfCd;
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

    public String getDeptSortSeqc() {
        return deptSortSeqc;
    }

    public void setDeptSortSeqc(String deptSortSeqc) {
        this.deptSortSeqc = deptSortSeqc;
    }

    public String getDeptNm() {
        return deptNm;
    }

    public void setDeptNm(String deptNm) {
        this.deptNm = deptNm;
    }

    public String getEmpNm() {
        return empNm;
    }

    public void setEmpNm(String empNm) {
        this.empNm = empNm;
    }

    public int getHgrkDeptCnt() {
        return hgrkDeptCnt;
    }

    public void setHgrkDeptCnt(int hgrkDeptCnt) {
        this.hgrkDeptCnt = hgrkDeptCnt;
    }

    public int getHgrkDeptTeamCnt() {
        return hgrkDeptTeamCnt;
    }

    public void setHgrkDeptTeamCnt(int hgrkDeptTeamCnt) {
        this.hgrkDeptTeamCnt = hgrkDeptTeamCnt;
    }

    public String getProdDstCdNm() {
        return prodDstCdNm;
    }

    public void setProdDstCdNm(String prodDstCdNm) {
        this.prodDstCdNm = prodDstCdNm;
    }

    public Long getSumAmt() {
        return sumAmt;
    }

    public void setSumAmt(Long sumAmt) {
        this.sumAmt = sumAmt;
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

    public String getProdTypeCd() {
        return prodTypeCd;
    }

    public void setProdTypeCd(String prodTypeCd) {
        this.prodTypeCd = prodTypeCd;
    }

    @Override
    public String toString() {
        return "YearEmpResultVO [critYear=" + critYear + ", deptId=" + deptId + ", empId=" + empId
                + ", bplnDstCd=" + bplnDstCd + ", bsnsRslDtlDstCd=" + bsnsRslDtlDstCd + ", bsnsClsfCd=" + bsnsClsfCd
                + ", prodDstCd=" + prodDstCd + ", godsClsfCd=" + godsClsfCd + ", janAmt=" + janAmt + ", febAmt="
                + febAmt + ", marAmt=" + marAmt + ", aprAmt=" + aprAmt + ", mayAmt=" + mayAmt + ", junAmt=" + junAmt
                + ", julAmt=" + julAmt + ", augAmt=" + augAmt + ", sepAmt=" + sepAmt + ", octAmt=" + octAmt
                + ", novAmt=" + novAmt + ", decAmt=" + decAmt + ", hgrkDeptId=" + hgrkDeptId + ", hgrkDeptNm="
                + hgrkDeptNm + ", deptSortSeqc=" + deptSortSeqc + ", deptNm=" + deptNm + ", empNm=" + empNm
                + ", hgrkDeptCnt=" + hgrkDeptCnt + ", hgrkDeptTeamCnt=" + hgrkDeptTeamCnt + ", prodDstCdNm=" + prodDstCdNm
                + ", sumAmt=" + sumAmt + ", deptLvl1Nm=" + deptLvl1Nm + ", deptLvl2Nm=" + deptLvl2Nm + ", deptLvl1Id="
                + deptLvl1Id + ", deptLvl2Id=" + deptLvl2Id + "]";
    }
}