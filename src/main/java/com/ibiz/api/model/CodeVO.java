package com.ibiz.api.model;

import java.util.List;
import java.util.Map;

public class CodeVO {

    /**
     * 공통그룹코드
     */
    private String comGrpCd;

    /**
     * 공통코드
     */
    private String comCd;

    /**
     * 공통코드명
     */
    private String comCdNm;

    /**
     * 공통코드설명
     */
    private String comCdDesc;

    /**
     * 상위공통코드
     */
    private String hgrkComCd;

    /**
     * 공통코드문자값
     */
    private String comCdCharVal;

    /**
     * 공통코드숫자값
     */
    private String comCdNumVal;

    /**
     * 정렬순서
     */
    private Integer sortSeqc;

    /**
     * 사용여부
     */
    private String useYn;

    /**
     * 등록사원ID
     */
    private String regEmpId;

    /**
     * 등록일시
     */
    private String regDt;

    /**
     * 변경사원ID
     */
    private String chgEmpId;

    /**
     * 변경일시
     */
    private String chgDt;

    /**
     * 동일코드존재 갯수
     */
    private Integer isExistCodeCnt;

    /**
     * 오리지널 공통코드
     */
    private String orinComCd;

    /**
     * 상위그룹코드
     */
    private String hgrkComGrpCd;

    /**
     * 테이블이름
     */
    private String tableName;

    /**
     * 컬럼이름
     */
    private String columnName;

    /**
     * 그리드상에서 사용하는 상태값(C/R/U/D)
     */
    private String gridStatus;

    private Integer totalCnt;


    /**
     * 그리드상에서 저장시 필요함(C/U/D)
     */
    private List<CodeVO> codeList;

    public String getComGrpCd() {
        return comGrpCd;
    }

    public void setComGrpCd(String comGrpCd) {
        this.comGrpCd = comGrpCd;
    }

    public String getComCd() {
        return comCd;
    }

    public void setComCd(String comCd) {
        this.comCd = comCd;
    }

    public String getComCdNm() {
        return comCdNm;
    }

    public void setComCdNm(String comCdNm) {
        this.comCdNm = comCdNm;
    }

    public String getComCdDesc() {
        return comCdDesc;
    }

    public void setComCdDesc(String comCdDesc) {
        this.comCdDesc = comCdDesc;
    }

    public String getHgrkComCd() {
        return hgrkComCd;
    }

    public void setHgrkComCd(String hgrkComCd) {
        this.hgrkComCd = hgrkComCd;
    }

    public String getComCdCharVal() {
        return comCdCharVal;
    }

    public void setComCdCharVal(String comCdCharVal) {
        this.comCdCharVal = comCdCharVal;
    }

    public String getComCdNumVal() {
        return comCdNumVal;
    }

    public void setComCdNumVal(String comCdNumVal) {
        this.comCdNumVal = comCdNumVal;
    }


    public Integer getSortSeqc() {
        return sortSeqc;
    }

    public void setSortSeqc(Integer sortSeqc) {
        this.sortSeqc = sortSeqc;
    }

    public String getUseYn() {
        return useYn;
    }

    public void setUseYn(String useYn) {
        this.useYn = useYn;
    }

    public String getRegEmpId() {
        return regEmpId;
    }

    public void setRegEmpId(String regEmpId) {
        this.regEmpId = regEmpId;
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

    public String getChgDt() {
        return chgDt;
    }

    public void setChgDt(String chgDt) {
        this.chgDt = chgDt;
    }

    public Integer getIsExistCodeCnt() {
        return isExistCodeCnt;
    }

    public void setIsExistCodeCnt(Integer isExistCodeCnt) {
        this.isExistCodeCnt = isExistCodeCnt;
    }

    public String getOrinComCd() {
        return orinComCd;
    }

    public void setOrinComCd(String orinComCd) {
        this.orinComCd = orinComCd;
    }

    public String getGridStatus() {
        return gridStatus;
    }

    public void setGridStatus(String gridStatus) {
        this.gridStatus = gridStatus;
    }

    public List<CodeVO> getCodeList() {
        return codeList;
    }

    public void setCodeList(List<CodeVO> codeList) {
        this.codeList = codeList;
    }

    public String getHgrkComGrpCd() {
        return hgrkComGrpCd;
    }

    public void setHgrkComGrpCd(String hgrkComGrpCd) {
        this.hgrkComGrpCd = hgrkComGrpCd;
    }

    public Integer getTotalCnt() {
        return totalCnt;
    }

    public void setTotalCnt(Integer totalCnt) {
        this.totalCnt = totalCnt;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    @Override
    public String toString() {
        return "CodeVO [comGrpCd=" + comGrpCd + ", comCd=" + comCd + ", comCdNm=" + comCdNm + ", comCdDesc=" + comCdDesc
                + ", hgrkComCd=" + hgrkComCd + ", comCdCharVal=" + comCdCharVal + ", comCdNumVal=" + comCdNumVal
                + ", sortSeqc=" + sortSeqc + ", useYn=" + useYn + ", regEmpId=" + regEmpId + ", regDt=" + regDt
                + ", chgEmpId=" + chgEmpId + ", chgDt=" + chgDt + ", isExistCodeCnt=" + isExistCodeCnt + ", orinComCd="
                + orinComCd + ", hgrkComGrpCd=" + hgrkComGrpCd + ", tableName=" + tableName + ", columnName="
                + columnName + ", gridStatus=" + gridStatus + ", totalCnt=" + totalCnt + ", codeList=" + codeList + "]";
    }
}