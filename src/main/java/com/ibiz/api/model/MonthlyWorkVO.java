package com.ibiz.api.model;

import com.ibiz.api.exception.ExceptionCode;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.Map;
/**
 * @Table BPIP260T
 */
public class MonthlyWorkVO {

    private String accountRole;

    private String critYear;

    private Integer pageSize;

    private Integer pageNumber;

    private List<Map<String, String>> buttonList;

    @NotNull
    @Size(max=6, message=ExceptionCode.OUTOFSIZE_EXCEPTION+" 기준연월은 6자리 이하여야합니다." )
    private String critYam;

    @NotNull
    @Size(max=8, message= ExceptionCode.OUTOFSIZE_EXCEPTION+" 영업부서ID는 8자리 이하여야합니다." )
    private String slsDeptId;

    private String slsDeptNm;

    @NotNull
    private String bdctCont;

    @Size(max=10, message=ExceptionCode.OUTOFSIZE_EXCEPTION+" 등록사원ID는 10자리 이하여야합니다." )
    private String regEmpId;

    private String regEmpNm;

    private String regDt;

    @Size(max=10, message=ExceptionCode.OUTOFSIZE_EXCEPTION+" 변경사원ID는 10자리 이하여야합니다." )
    private String chgEmpId;

    private String chgEmpNm;

    private String chgDt;

    private String viewerDeptId;

    private String viewerEmpId;

    /*전체페이지 수 */
    private Integer totalCnt;

    public String getAccountRole() {
        return accountRole;
    }

    public void setAccountRole(String accountRole) {
        this.accountRole = accountRole;
    }

    public String getCritYear() {
        return critYear;
    }

    public void setCritYear(String critYear) {
        this.critYear = critYear;
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

    public List<Map<String, String>> getButtonList() {
        return buttonList;
    }

    public void setButtonList(List<Map<String, String>> buttonList) {
        this.buttonList = buttonList;
    }

    public String getCritYam() {
        return critYam;
    }

    public void setCritYam(String critYam) {
        this.critYam = critYam;
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

    public String getBdctCont() {
        return bdctCont;
    }

    public void setBdctCont(String bdctCont) {
        this.bdctCont = bdctCont;
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

    public String getRegDt() {
        return regDt;
    }

    public void setRegDt(String regDt) {
        this.regDt = regDt;
    }

    public String getChgEmpId() {
        return chgEmpId;
    }

    public void setChgEmpId(String chgEmpId) {
        this.chgEmpId = chgEmpId;
    }

    public String getChgEmpNm() {
        return chgEmpNm;
    }

    public void setChgEmpNm(String chgEmpNm) {
        this.chgEmpNm = chgEmpNm;
    }

    public String getChgDt() {
        return chgDt;
    }

    public void setChgDt(String chgDt) {
        this.chgDt = chgDt;
    }

    public String getViewerDeptId() {
        return viewerDeptId;
    }

    public void setViewerDeptId(String viewerDeptId) {
        this.viewerDeptId = viewerDeptId;
    }

    public String getViewerEmpId() {
        return viewerEmpId;
    }

    public void setViewerEmpId(String viewerEmpId) {
        this.viewerEmpId = viewerEmpId;
    }

    public Integer getTotalCnt() {
        return totalCnt;
    }

    public void setTotalCnt(Integer totalCnt) {
        this.totalCnt = totalCnt;
    }


}