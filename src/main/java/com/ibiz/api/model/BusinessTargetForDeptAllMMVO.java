package com.ibiz.api.model;

import java.util.List;

public class BusinessTargetForDeptAllMMVO {
    /**
     * 사업분류 - UI
     */
    private List<BusinessTargetForDeptMMVO> bsnsUIList;

    /**
     * 사업분류 - UX
     */
    private List<BusinessTargetForDeptMMVO> bsnsUXList;

    /**
     * 사업분류 - ESB
     */
    private List<BusinessTargetForDeptMMVO> bsnsESBList;

    /**
     * 사업분류 - ECM
     */
    private List<BusinessTargetForDeptMMVO> bsnsECMList;

    /**
     * 사업분류 - MG
     */
    private List<BusinessTargetForDeptMMVO> bsnsMGList;

    /**
     * 사업분류 - ILS
     */
    private List<BusinessTargetForDeptMMVO> bsnsILSList;

    /**
     * 사업분류 - ETC
     */
    private List<BusinessTargetForDeptMMVO> bsnsETCList;

    /**
     * 사업분류 - 전체 ( for C,U,D )
     */
    private List<BusinessTargetForDeptMMVO> cudList;

    /**
     * 사업실적 - 사업분류별 total 합계
     */
    private List<BusinessTargetForDeptMMVO> totalSumList;

    private String critYear;

    private String deptId;

    private String bplnDstCd;

    private String bsnsRslDtlDstCd;

    public List<BusinessTargetForDeptMMVO> getBsnsUIList() {
        return bsnsUIList;
    }

    public void setBsnsUIList(List<BusinessTargetForDeptMMVO> bsnsUIList) {
        this.bsnsUIList = bsnsUIList;
    }

    public List<BusinessTargetForDeptMMVO> getBsnsUXList() {
        return bsnsUXList;
    }

    public void setBsnsUXList(List<BusinessTargetForDeptMMVO> bsnsUXList) {
        this.bsnsUXList = bsnsUXList;
    }

    public List<BusinessTargetForDeptMMVO> getBsnsESBList() {
        return bsnsESBList;
    }

    public void setBsnsESBList(List<BusinessTargetForDeptMMVO> bsnsESBList) {
        this.bsnsESBList = bsnsESBList;
    }

    public List<BusinessTargetForDeptMMVO> getBsnsECMList() {
        return bsnsECMList;
    }

    public void setBsnsECMList(List<BusinessTargetForDeptMMVO> bsnsECMList) {
        this.bsnsECMList = bsnsECMList;
    }

    public List<BusinessTargetForDeptMMVO> getBsnsMGList() {
        return bsnsMGList;
    }

    public void setBsnsMGList(List<BusinessTargetForDeptMMVO> bsnsMGList) {
        this.bsnsMGList = bsnsMGList;
    }

    public List<BusinessTargetForDeptMMVO> getBsnsILSList() {
        return bsnsILSList;
    }

    public void setBsnsILSList(List<BusinessTargetForDeptMMVO> bsnsILSList) {
        this.bsnsILSList = bsnsILSList;
    }

    public List<BusinessTargetForDeptMMVO> getBsnsETCList() {
        return bsnsETCList;
    }

    public void setBsnsETCList(List<BusinessTargetForDeptMMVO> bsnsETCList) {
        this.bsnsETCList = bsnsETCList;
    }

    public List<BusinessTargetForDeptMMVO> getCudList() {
        return cudList;
    }

    public void setCudList(List<BusinessTargetForDeptMMVO> cudList) {
        this.cudList = cudList;
    }

    public List<BusinessTargetForDeptMMVO> getTotalSumList() {
        return totalSumList;
    }

    public void setTotalSumList(List<BusinessTargetForDeptMMVO> totalSumList) {
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

    public String getBsnsRslDtlDstCd() {
        return bsnsRslDtlDstCd;
    }

    public void setBsnsRslDtlDstCd(String bsnsRslDtlDstCd) {
        this.bsnsRslDtlDstCd = bsnsRslDtlDstCd;
    }

    @Override
    public String toString() {
        return "BusinessTargetForDeptAllMMVO [bsnsUIList=" + bsnsUIList + ", bsnsUXList=" + bsnsUXList
                + ", bsnsESBList=" + bsnsESBList + ", bsnsECMList=" + bsnsECMList + ", bsnsMGList=" + bsnsMGList
                + ", bsnsILSList=" + bsnsILSList + ", bsnsETCList=" + bsnsETCList + ", cudList=" + cudList
                + ", totalSumList=" + totalSumList + ", critYear=" + critYear + ", deptId=" + deptId + ", bplnDstCd="
                + bplnDstCd + ", bsnsRslDtlDstCd=" + bsnsRslDtlDstCd + "]";
    }

}