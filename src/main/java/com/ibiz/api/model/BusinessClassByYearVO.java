package com.ibiz.api.model;

public class BusinessClassByYearVO {
    /**
     * 기준연도
     */
    private String critYear;

    /**
     * 사업분류코드
     */
    private String bsnsClsfCd;

    /**
     * 사업분류명
     */
    private String bsnsClsfNm;

    /**
     * 정렬순서
     */
    private Integer sortSeqc;

    public String getCritYear() {
        return critYear;
    }

    public void setCritYear(String critYear) {
        this.critYear = critYear;
    }

    public String getBsnsClsfCd() {
        return bsnsClsfCd;
    }

    public void setBsnsClsfCd(String bsnsClsfCd) {
        this.bsnsClsfCd = bsnsClsfCd;
    }

    public String getBsnsClsfNm() {
        return bsnsClsfNm;
    }

    public void setBsnsClsfNm(String bsnsClsfNm) {
        this.bsnsClsfNm = bsnsClsfNm;
    }

    public Integer getSortSeqc() {
        return sortSeqc;
    }

    public void setSortSeqc(Integer sortSeqc) {
        this.sortSeqc = sortSeqc;
    }
}
