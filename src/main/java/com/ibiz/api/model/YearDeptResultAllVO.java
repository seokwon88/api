package com.ibiz.api.model;

import java.util.List;

public class YearDeptResultAllVO {
    /**
     * 사업분류 - UI
     */
    private List<YearDeptResultVO> bsnsUIList;

    /**
     * 사업분류 - UX
     */
    private List<YearDeptResultVO> bsnsUXList;

    /**
     * 사업분류 - ESB
     */
    private List<YearDeptResultVO> bsnsESBList;

    /**
     * 사업분류 - ECM
     */
    private List<YearDeptResultVO> bsnsECMList;

    /**
     * 사업분류 - MG
     */
    private List<YearDeptResultVO> bsnsMGList;

    /**
     * 사업분류 - ILS
     */
    private List<YearDeptResultVO> bsnsILSList;

    /**
     * 사업분류 - ETC
     */
    private List<YearDeptResultVO> bsnsETCList;

    /**
     * 사업분류 - 전체 ( for C,U,D )
     */
    private List<YearDeptResultVO> cudList;

    /**
     * 사업실적 - 사업분류별 total 합계
     */
    private List<YearDeptResultVO> totalSumList;

    private String critYear;

    private String deptId;

    private String bplnDstCd;

    private String brslDtlDstCd;

    public List<YearDeptResultVO> getBsnsUIList() {
        return bsnsUIList;
    }

    public void setBsnsUIList(List<YearDeptResultVO> bsnsUIList) {
        this.bsnsUIList = bsnsUIList;
    }

    public List<YearDeptResultVO> getBsnsUXList() {
        return bsnsUXList;
    }

    public void setBsnsUXList(List<YearDeptResultVO> bsnsUXList) {
        this.bsnsUXList = bsnsUXList;
    }

    public List<YearDeptResultVO> getBsnsESBList() {
        return bsnsESBList;
    }

    public void setBsnsESBList(List<YearDeptResultVO> bsnsESBList) {
        this.bsnsESBList = bsnsESBList;
    }

    public List<YearDeptResultVO> getBsnsECMList() {
        return bsnsECMList;
    }

    public void setBsnsECMList(List<YearDeptResultVO> bsnsECMList) {
        this.bsnsECMList = bsnsECMList;
    }

    public List<YearDeptResultVO> getBsnsMGList() {
        return bsnsMGList;
    }

    public void setBsnsMGList(List<YearDeptResultVO> bsnsMGList) {
        this.bsnsMGList = bsnsMGList;
    }

    public List<YearDeptResultVO> getBsnsILSList() {
        return bsnsILSList;
    }

    public void setBsnsILSList(List<YearDeptResultVO> bsnsILSList) {
        this.bsnsILSList = bsnsILSList;
    }

    public List<YearDeptResultVO> getBsnsETCList() {
        return bsnsETCList;
    }

    public void setBsnsETCList(List<YearDeptResultVO> bsnsETCList) {
        this.bsnsETCList = bsnsETCList;
    }

    public List<YearDeptResultVO> getCudList() {
        return cudList;
    }

    public void setCudList(List<YearDeptResultVO> cudList) {
        this.cudList = cudList;
    }

    public List<YearDeptResultVO> getTotalSumList() {
        return totalSumList;
    }

    public void setTotalSumList(List<YearDeptResultVO> totalSumList) {
        this.totalSumList = totalSumList;
    }

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

    @Override
    public String toString() {
        return "YearDeptResultAllVO [bsnsUIList=" + bsnsUIList + ", bsnsUXList=" + bsnsUXList
                + ", bsnsESBList=" + bsnsESBList + ", bsnsECMList=" + bsnsECMList + ", bsnsMGList=" + bsnsMGList
                + ", bsnsILSList=" + bsnsILSList + ", bsnsETCList=" + bsnsETCList + ", cudList=" + cudList
                + ", totalSumList=" + totalSumList + ", critYear=" + critYear + ", deptId=" + deptId + ", bplnDstCd="
                + bplnDstCd + ", brslDtlDstCd=" + brslDtlDstCd + "]";
    }

}