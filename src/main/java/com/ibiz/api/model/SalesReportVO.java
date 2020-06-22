package com.ibiz.api.model;

public class SalesReportVO {

    /**
     * 사업기회ID
     */
    private String boptId;

    /**
     * 프로젝트ID
     */
    private String prjtId;

    /**
     * 프로젝트명
     */
    private String prjtNm;

    /**
     * 사업분류코드
     */
    private String bsnsClsfCd;

    /**
     * 최종고객ID
     */
    private String lastCustId;

    /**
     * 최종고객명
     */
    private String lastCustNm;

    /**
     * 수주확률코드
     */
    private String wctPrbbCd;

    /**
     * 수주확률명
     */
    private String wctPrbbCdNm;

    /**
     * 영업부서ID
     */
    private String deptId;

    /**
     * 영업부서명
     */
    private String deptNm;

    /**
     * 영업사원ID
     */
    private String empId;

    /**
     * 영업사원명
     */
    private String empNm;

    /**
     * 수주확정일자
     */
    private String wctDcdDate;

    /**
     * 사업기회상태코드
     */
    private String boptStatCd;

    /**
     * 사업기회상태명
     */
    private String boptStatCdNm;

    /**
     * 사업기회종료유형코드
     */
    private String boptEndTypeCd;

    /**
     * 사업기회종료유형코드명
     */
    private String boptEndTypeCdNm;

    /**
     * 이슈갯수
     */
    private int issueCnt;

    /**
     * 수주시기
     */
    private String wctCritYam;

    /**
     * 계약날짜 (수주시기)
     */
    private String cntrDate;

    /**
     * 매출시기 or 매입시기
     */
    private String fcstYam;

    /**
     * 수주기회금액
     */
    private Long wctOpptyRslAmt;

    /**
     * 수주확률적용금액
     */
    private Long wctFcstRslAmt;

    /**
     * 수주실적금액
     */
    private Long wctRslAmt;

    /**
     * 매출시기
     */
    private String sellCritYam;

    /**
     * 매출기회금액
     */
    private Long sellOpptyRslAmt;

    /**
     * 매출확률적용금액
     */
    private Long sellFcstRslAmt;

    /**
     * 매출실적금액
     */
    private Long sellRslAmt;

    /**
     * 순매출기회금액
     */
    private Long nsleOpptyRslAmt;

    /**
     * 순매출확률적용금액
     */
    private Long nsleFcstRslAmt;

    /**
     * 순매출실적금액
     */
    private Long nsleRslAmt;

    /**
     * 기회수주금액
     */
    private Long opptyWctRslAmt;

    /**
     * 기회매출금액
     */
    private Long opptySellRslAmt;

    /**
     * 기회매입금액
     */
    private Long opptyBuyRslAmt;

    /**
     * 기회순매출금액
     */
    private Long opptyNsleRslAmt;

    /**
     * 누적실적수주금액
     */
    private Long acmlWctRslAmt;

    /**
     * 누적실적매출금액
     */
    private Long acmlSellRslAmt;

    /**
     * 누적실적매입금액
     */
    private Long acmlBuyRslAmt;

    /**
     * 누적실적금액
     */
    private Long acmlNsleRslAmt;

    /**
     * 매입시기
     */
    private String buyCritYam;

    /**
     * 매입기회금액
     */
    private Long buyOpptyRslAmt;

    /**
     * 매입확률적용금액
     */
    private Long buyFcstRslAmt;

    /**
     * 매입실적금액
     */
    private Long buyRslAmt;

    private String slsDeptNm;

    private String slsEmpNm;

    /**
     * 총 갯수
     */
    private Integer totalCnt;

    public String getBoptId() {
        return boptId;
    }

    public void setBoptId(String boptId) {
        this.boptId = boptId;
    }

    public String getPrjtId() {
        return prjtId;
    }

    public void setPrjtId(String prjtId) {
        this.prjtId = prjtId;
    }

    public String getPrjtNm() {
        return prjtNm;
    }

    public void setPrjtNm(String prjtNm) {
        this.prjtNm = prjtNm;
    }

    public String getBsnsClsfCd() {
        return bsnsClsfCd;
    }

    public void setBsnsClsfCd(String bsnsClsfCd) {
        this.bsnsClsfCd = bsnsClsfCd;
    }

    public String getLastCustId() {
        return lastCustId;
    }

    public void setLastCustId(String lastCustId) {
        this.lastCustId = lastCustId;
    }

    public String getLastCustNm() {
        return lastCustNm;
    }

    public void setLastCustNm(String lastCustNm) {
        this.lastCustNm = lastCustNm;
    }

    public String getWctPrbbCd() {
        return wctPrbbCd;
    }

    public void setWctPrbbCd(String wctPrbbCd) {
        this.wctPrbbCd = wctPrbbCd;
    }

    public String getWctPrbbCdNm() {
        return wctPrbbCdNm;
    }

    public void setWctPrbbCdNm(String wctPrbbCdNm) {
        this.wctPrbbCdNm = wctPrbbCdNm;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptNm() {
        return deptNm;
    }

    public void setDeptNm(String deptNm) {
        this.deptNm = deptNm;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpNm() {
        return empNm;
    }

    public void setEmpNm(String empNm) {
        this.empNm = empNm;
    }

    public String getWctDcdDate() {
        return wctDcdDate;
    }

    public void setWctDcdDate(String wctDcdDate) {
        this.wctDcdDate = wctDcdDate;
    }

    public String getBoptStatCd() {
        return boptStatCd;
    }

    public void setBoptStatCd(String boptStatCd) {
        this.boptStatCd = boptStatCd;
    }

    public String getBoptStatCdNm() {
        return boptStatCdNm;
    }

    public void setBoptStatCdNm(String boptStatCdNm) {
        this.boptStatCdNm = boptStatCdNm;
    }

    public String getBoptEndTypeCd() {
        return boptEndTypeCd;
    }

    public void setBoptEndTypeCd(String boptEndTypeCd) {
        this.boptEndTypeCd = boptEndTypeCd;
    }

    public String getBoptEndTypeCdNm() {
        return boptEndTypeCdNm;
    }

    public void setBoptEndTypeCdNm(String boptEndTypeCdNm) {
        this.boptEndTypeCdNm = boptEndTypeCdNm;
    }

    public int getIssueCnt() {
        return issueCnt;
    }

    public void setIssueCnt(int issueCnt) {
        this.issueCnt = issueCnt;
    }

    public String getWctCritYam() {
        return wctCritYam;
    }

    public void setWctCritYam(String wctCritYam) {
        this.wctCritYam = wctCritYam;
    }

    public String getCntrDate() {
        return cntrDate;
    }

    public void setCntrDate(String cntrDate) {
        this.cntrDate = cntrDate;
    }

    public String getFcstYam() {
        return fcstYam;
    }

    public void setFcstYam(String fcstYam) {
        this.fcstYam = fcstYam;
    }

    public Long getWctOpptyRslAmt() {
        return wctOpptyRslAmt;
    }

    public void setWctOpptyRslAmt(Long wctOpptyRslAmt) {
        this.wctOpptyRslAmt = wctOpptyRslAmt;
    }

    public Long getWctFcstRslAmt() {
        return wctFcstRslAmt;
    }

    public void setWctFcstRslAmt(Long wctFcstRslAmt) {
        this.wctFcstRslAmt = wctFcstRslAmt;
    }

    public Long getWctRslAmt() {
        return wctRslAmt;
    }

    public void setWctRslAmt(Long wctRslAmt) {
        this.wctRslAmt = wctRslAmt;
    }

    public String getSellCritYam() {
        return sellCritYam;
    }

    public void setSellCritYam(String sellCritYam) {
        this.sellCritYam = sellCritYam;
    }

    public Long getSellOpptyRslAmt() {
        return sellOpptyRslAmt;
    }

    public void setSellOpptyRslAmt(Long sellOpptyRslAmt) {
        this.sellOpptyRslAmt = sellOpptyRslAmt;
    }

    public Long getSellFcstRslAmt() {
        return sellFcstRslAmt;
    }

    public void setSellFcstRslAmt(Long sellFcstRslAmt) {
        this.sellFcstRslAmt = sellFcstRslAmt;
    }

    public Long getSellRslAmt() {
        return sellRslAmt;
    }

    public void setSellRslAmt(Long sellRslAmt) {
        this.sellRslAmt = sellRslAmt;
    }

    public Long getNsleOpptyRslAmt() {
        return nsleOpptyRslAmt;
    }

    public void setNsleOpptyRslAmt(Long nsleOpptyRslAmt) {
        this.nsleOpptyRslAmt = nsleOpptyRslAmt;
    }

    public Long getNsleFcstRslAmt() {
        return nsleFcstRslAmt;
    }

    public void setNsleFcstRslAmt(Long nsleFcstRslAmt) {
        this.nsleFcstRslAmt = nsleFcstRslAmt;
    }

    public Long getNsleRslAmt() {
        return nsleRslAmt;
    }

    public void setNsleRslAmt(Long nsleRslAmt) {
        this.nsleRslAmt = nsleRslAmt;
    }

    public Long getOpptyWctRslAmt() {
        return opptyWctRslAmt;
    }

    public void setOpptyWctRslAmt(Long opptyWctRslAmt) {
        this.opptyWctRslAmt = opptyWctRslAmt;
    }

    public Long getOpptySellRslAmt() {
        return opptySellRslAmt;
    }

    public void setOpptySellRslAmt(Long opptySellRslAmt) {
        this.opptySellRslAmt = opptySellRslAmt;
    }

    public Long getOpptyBuyRslAmt() {
        return opptyBuyRslAmt;
    }

    public void setOpptyBuyRslAmt(Long opptyBuyRslAmt) {
        this.opptyBuyRslAmt = opptyBuyRslAmt;
    }

    public Long getOpptyNsleRslAmt() {
        return opptyNsleRslAmt;
    }

    public void setOpptyNsleRslAmt(Long opptyNsleRslAmt) {
        this.opptyNsleRslAmt = opptyNsleRslAmt;
    }

    public Long getAcmlWctRslAmt() {
        return acmlWctRslAmt;
    }

    public void setAcmlWctRslAmt(Long acmlWctRslAmt) {
        this.acmlWctRslAmt = acmlWctRslAmt;
    }

    public Long getAcmlSellRslAmt() {
        return acmlSellRslAmt;
    }

    public void setAcmlSellRslAmt(Long acmlSellRslAmt) {
        this.acmlSellRslAmt = acmlSellRslAmt;
    }

    public Long getAcmlBuyRslAmt() {
        return acmlBuyRslAmt;
    }

    public void setAcmlBuyRslAmt(Long acmlBuyRslAmt) {
        this.acmlBuyRslAmt = acmlBuyRslAmt;
    }

    public Long getAcmlNsleRslAmt() {
        return acmlNsleRslAmt;
    }

    public void setAcmlNsleRslAmt(Long acmlNsleRslAmt) {
        this.acmlNsleRslAmt = acmlNsleRslAmt;
    }

    public String getBuyCritYam() {
        return buyCritYam;
    }

    public void setBuyCritYam(String buyCritYam) {
        this.buyCritYam = buyCritYam;
    }

    public Long getBuyOpptyRslAmt() {
        return buyOpptyRslAmt;
    }

    public void setBuyOpptyRslAmt(Long buyOpptyRslAmt) {
        this.buyOpptyRslAmt = buyOpptyRslAmt;
    }

    public Long getBuyFcstRslAmt() {
        return buyFcstRslAmt;
    }

    public void setBuyFcstRslAmt(Long buyFcstRslAmt) {
        this.buyFcstRslAmt = buyFcstRslAmt;
    }

    public Long getBuyRslAmt() {
        return buyRslAmt;
    }

    public void setBuyRslAmt(Long buyRslAmt) {
        this.buyRslAmt = buyRslAmt;
    }

    public String getSlsDeptNm() {
        return slsDeptNm;
    }

    public void setSlsDeptNm(String slsDeptNm) {
        this.slsDeptNm = slsDeptNm;
    }

    public String getSlsEmpNm() {
        return slsEmpNm;
    }

    public void setSlsEmpNm(String slsEmpNm) {
        this.slsEmpNm = slsEmpNm;
    }

    public Integer getTotalCnt() {
        return totalCnt;
    }

    public void setTotalCnt(Integer totalCnt) {
        this.totalCnt = totalCnt;
    }

    @Override
    public String toString() {
        return "SalesReportVO [boptId=" + boptId + ", prjtId=" + prjtId + ", prjtNm=" + prjtNm
                + ", bsnsClsfCd=" + bsnsClsfCd + ", lastCustId=" + lastCustId + ", lastCustNm=" + lastCustNm
                + ", wctPrbbCd=" + wctPrbbCd + ", wctPrbbCdNm=" + wctPrbbCdNm + ", deptId=" + deptId + ", deptNm=" + deptNm
                + ", empId=" + empId + ", empNm=" + empNm + ", wctDcdDate=" + wctDcdDate + ", boptStatCd=" + boptStatCd
                + ", boptStatCdNm=" + boptStatCdNm + ", boptEndTypeCd=" + boptEndTypeCd + ", boptEndTypeCdNm=" + boptEndTypeCdNm
                + ", issueCnt=" + issueCnt + ", wctCritYam=" + wctCritYam + ", cntrDate=" + cntrDate + ", fcstYam="
                + fcstYam + ", wctOpptyRslAmt=" + wctOpptyRslAmt + ", wctFcstRslAmt=" + wctFcstRslAmt + ", wctRslAmt="
                + wctRslAmt + ", sellCritYam=" + sellCritYam + ", sellOpptyRslAmt=" + sellOpptyRslAmt
                + ", sellFcstRslAmt=" + sellFcstRslAmt + ", sellRslAmt=" + sellRslAmt + ", nsleOpptyRslAmt="
                + nsleOpptyRslAmt + ", nsleFcstRslAmt=" + nsleFcstRslAmt + ", nsleRslAmt=" + nsleRslAmt
                + ", opptyWctRslAmt=" + opptyWctRslAmt + ", opptySellRslAmt=" + opptySellRslAmt + ", opptyBuyRslAmt="
                + opptyBuyRslAmt + ", opptyNsleRslAmt=" + opptyNsleRslAmt + ", acmlWctRslAmt=" + acmlWctRslAmt
                + ", acmlSellRslAmt=" + acmlSellRslAmt + ", acmlBuyRslAmt=" + acmlBuyRslAmt + ", acmlNsleRslAmt="
                + acmlNsleRslAmt + ", buyCritYam=" + buyCritYam + ", buyOpptyRslAmt=" + buyOpptyRslAmt
                + ", buyFcstRslAmt=" + buyFcstRslAmt + ", buyRslAmt=" + buyRslAmt + ", slsDeptNm=" + slsDeptNm
                + ", slsEmpNm=" + slsEmpNm + "]";
    }

}
