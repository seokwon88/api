package com.ibiz.api.model;

public class TgtDeptVO {

    /**
     * 게시문서ID
     */
    private String notcDocId;

    /**
     * 게시대상부서ID
     */
    private String notcDeptId;

    /**
     * 하위부서포함여부
     */
    private String lwrkDeptCvrdYn;

    /**
     * 게시대상부서명
     */
    private String notcDeptNm;


    public String getNotcDocId() {
        return notcDocId;
    }

    public void setNotcDocId(String notcDocId) {
        this.notcDocId = notcDocId;
    }

    public String getNotcDeptId() {
        return notcDeptId;
    }

    public void setNotcDeptId(String notcDeptId) {
        this.notcDeptId = notcDeptId;
    }

    public String getLwrkDeptCvrdYn() {
        return lwrkDeptCvrdYn;
    }

    public void setLwrkDeptCvrdYn(String lwrkDeptCvrdYn) {
        this.lwrkDeptCvrdYn = lwrkDeptCvrdYn;
    }

    public String getNotcDeptNm() {
        return notcDeptNm;
    }

    public void setNotcDeptNm(String notcDeptNm) {
        this.notcDeptNm = notcDeptNm;
    }

}
