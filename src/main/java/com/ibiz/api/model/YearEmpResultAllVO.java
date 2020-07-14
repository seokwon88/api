package com.ibiz.api.model;

import java.util.List;

public class YearEmpResultAllVO {

    /**
     * 사업분류 - UI
     */
    private List<YearEmpResultVO> bsnsUIList;

    /**
     * 사업분류 - UX
     */
    private List<YearEmpResultVO> bsnsUXList;

    /**
     * 사업분류 - ESB
     */
    private List<YearEmpResultVO> bsnsESBList;

    /**
     * 사업분류 - ECM
     */
    private List<YearEmpResultVO> bsnsECMList;

    /**
     * 사업분류 - MG
     */
    private List<YearEmpResultVO> bsnsMGList;

    /**
     * 사업분류 - ILS
     */
    private List<YearEmpResultVO> bsnsILSList;

    /**
     * 사업분류 - ETC
     */
    private List<YearEmpResultVO> bsnsETCList;

    /**
     * 사업분류 - 전체 ( for C U D )
     */
    private List<YearEmpResultVO> cudList;

    private String critYear;

    private String deptId;

    private String bplnDstCd;

    private String brslDtlDstCd;

    private String empId;

    public List<YearEmpResultVO> getBsnsUIList() {
        return bsnsUIList;
    }

    public void setBsnsUIList(List<YearEmpResultVO> bsnsUIList) {
        this.bsnsUIList = bsnsUIList;
    }

    public List<YearEmpResultVO> getBsnsUXList() {
        return bsnsUXList;
    }

    public void setBsnsUXList(List<YearEmpResultVO> bsnsUXList) {
        this.bsnsUXList = bsnsUXList;
    }

    public List<YearEmpResultVO> getBsnsESBList() {
        return bsnsESBList;
    }

    public void setBsnsESBList(List<YearEmpResultVO> bsnsESBList) {
        this.bsnsESBList = bsnsESBList;
    }

    public List<YearEmpResultVO> getBsnsECMList() {
        return bsnsECMList;
    }

    public void setBsnsECMList(List<YearEmpResultVO> bsnsECMList) {
        this.bsnsECMList = bsnsECMList;
    }

    public List<YearEmpResultVO> getBsnsMGList() {
        return bsnsMGList;
    }

    public void setBsnsMGList(List<YearEmpResultVO> bsnsMGList) {
        this.bsnsMGList = bsnsMGList;
    }

    public List<YearEmpResultVO> getBsnsILSList() {
        return bsnsILSList;
    }

    public void setBsnsILSList(List<YearEmpResultVO> bsnsILSList) {
        this.bsnsILSList = bsnsILSList;
    }

    public List<YearEmpResultVO> getBsnsETCList() {
        return bsnsETCList;
    }

    public void setBsnsETCList(List<YearEmpResultVO> bsnsETCList) {
        this.bsnsETCList = bsnsETCList;
    }

    public List<YearEmpResultVO> getCudList() {
        return cudList;
    }

    public void setCudList(List<YearEmpResultVO> cudList) {
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

    @Override
    public String toString() {
        return "YearEmpResultAllVO [bsnsUIList=" + bsnsUIList + ", bsnsUXList=" + bsnsUXList + ", bsnsESBList="
                + bsnsESBList + ", bsnsECMList=" + bsnsECMList + ", bsnsMGList=" + bsnsMGList + ", bsnsILSList="
                + bsnsILSList + ", bsnsETCList=" + bsnsETCList + ", cudList=" + cudList + ", critYear=" + critYear
                + ", deptId=" + deptId + ", bplnDstCd=" + bplnDstCd + ", brslDtlDstCd=" + brslDtlDstCd
                + ", empId=" + empId + "]";
    }

}