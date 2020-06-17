package com.ibiz.api.model;

import java.util.List;

public class BusinessTargetForEmpAllMMVO {

    /**
     * 사업분류 - UI
     */
    private List<BusinessTargetForEmpMMVO> bsnsUIList;

    /**
     * 사업분류 - UX
     */
    private List<BusinessTargetForEmpMMVO> bsnsUXList;

    /**
     * 사업분류 - ESB
     */
    private List<BusinessTargetForEmpMMVO> bsnsESBList;

    /**
     * 사업분류 - ECM
     */
    private List<BusinessTargetForEmpMMVO> bsnsECMList;

    /**
     * 사업분류 - MG
     */
    private List<BusinessTargetForEmpMMVO> bsnsMGList;

    /**
     * 사업분류 - ILS
     */
    private List<BusinessTargetForEmpMMVO> bsnsILSList;

    /**
     * 사업분류 - ETC
     */
    private List<BusinessTargetForEmpMMVO> bsnsETCList;

    /**
     * 사업분류 - 전체 ( for C U D )
     */
    private List<BusinessTargetForEmpMMVO> cudList;

    private String critYear;

    private String deptId;

    private String bplnDstCd;

    private String bsnsRslDtlDstCd;

    private String empId;

    public List<BusinessTargetForEmpMMVO> getBsnsUIList() {
        return bsnsUIList;
    }

    public void setBsnsUIList(List<BusinessTargetForEmpMMVO> bsnsUIList) {
        this.bsnsUIList = bsnsUIList;
    }

    public List<BusinessTargetForEmpMMVO> getBsnsUXList() {
        return bsnsUXList;
    }

    public void setBsnsUXList(List<BusinessTargetForEmpMMVO> bsnsUXList) {
        this.bsnsUXList = bsnsUXList;
    }

    public List<BusinessTargetForEmpMMVO> getBsnsESBList() {
        return bsnsESBList;
    }

    public void setBsnsESBList(List<BusinessTargetForEmpMMVO> bsnsESBList) {
        this.bsnsESBList = bsnsESBList;
    }

    public List<BusinessTargetForEmpMMVO> getBsnsECMList() {
        return bsnsECMList;
    }

    public void setBsnsECMList(List<BusinessTargetForEmpMMVO> bsnsECMList) {
        this.bsnsECMList = bsnsECMList;
    }

    public List<BusinessTargetForEmpMMVO> getBsnsMGList() {
        return bsnsMGList;
    }

    public void setBsnsMGList(List<BusinessTargetForEmpMMVO> bsnsMGList) {
        this.bsnsMGList = bsnsMGList;
    }

    public List<BusinessTargetForEmpMMVO> getBsnsILSList() {
        return bsnsILSList;
    }

    public void setBsnsILSList(List<BusinessTargetForEmpMMVO> bsnsILSList) {
        this.bsnsILSList = bsnsILSList;
    }

    public List<BusinessTargetForEmpMMVO> getBsnsETCList() {
        return bsnsETCList;
    }

    public void setBsnsETCList(List<BusinessTargetForEmpMMVO> bsnsETCList) {
        this.bsnsETCList = bsnsETCList;
    }

    public List<BusinessTargetForEmpMMVO> getCudList() {
        return cudList;
    }

    public void setCudList(List<BusinessTargetForEmpMMVO> cudList) {
        this.cudList = cudList;
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

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    @Override
    public String toString() {
        return "BusinessTargetForEmpAllMMVO [bsnsUIList=" + bsnsUIList + ", bsnsUXList=" + bsnsUXList + ", bsnsESBList="
                + bsnsESBList + ", bsnsECMList=" + bsnsECMList + ", bsnsMGList=" + bsnsMGList + ", bsnsILSList="
                + bsnsILSList + ", bsnsETCList=" + bsnsETCList + ", cudList=" + cudList + ", critYear=" + critYear
                + ", deptId=" + deptId + ", bplnDstCd=" + bplnDstCd + ", bsnsRslDtlDstCd=" + bsnsRslDtlDstCd
                + ", empId=" + empId + "]";
    }

}