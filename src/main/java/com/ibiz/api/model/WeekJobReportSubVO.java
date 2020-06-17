package com.ibiz.api.model;

import java.util.List;
import java.util.Map;

public class WeekJobReportSubVO {

    /**
     * 프로젝트ID
     */
    private String prjtId;

    /**
     * 사업기회ID
     */
    private String boptId;

    /**
     * 특별내용
     */
    private String spclCont;

    /**
     * 주요활동내용
     */
    private String prmryActCont;

    /**
     * 활동계획내용
     */
    private String actPlanCont;

    public String getPrjtId() {
        return prjtId;
    }

    public void setPrjtId(String prjtId) {
        this.prjtId = prjtId;
    }

    public String getBoptId() {
        return boptId;
    }

    public void setBoptId(String boptId) {
        this.boptId = boptId;
    }

    public String getSpclCont() {
        return spclCont;
    }

    public void setSpclCont(String spclCont) {
        this.spclCont = spclCont;
    }

    public String getPrmryActCont() {
        return prmryActCont;
    }

    public void setPrmryActCont(String prmryActCont) {
        this.prmryActCont = prmryActCont;
    }

    public String getActPlanCont() {
        return actPlanCont;
    }

    public void setActPlanCont(String actPlanCont) {
        this.actPlanCont = actPlanCont;
    }

    @Override
    public String toString() {
        return "WeekJobReportSubVO [prjtId=" + prjtId + ", boptId=" + boptId + ", spclCont=" + spclCont
                + ", prmryActCont=" + prmryActCont + ", actPlanCont=" + actPlanCont + "]";
    }

}