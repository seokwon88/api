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
     * 사업분류코드명
     */
    private String bsnsClsfCdNm;

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

    // 매출금액기회 총액
    private long totalSellOpptyRslAmt;

    // 매입금액기회 총액
    private long totalBuyOpptyRslAmt;

    // 매출금액확률적용 총액
    private long totalSellFcstRslAmt;

    // 매입금액확률적용 총액
    private long totalBuyFcstRslAmt;

    // 매출금액 실적 총액
    private long totalSellRslAmt;

    // 매입금액 실적 총액
    private long totalBuyRslAmt;

    // 매출금액 기회전체 총액
    private long totalOpptySellRslAmt;

    // 매입금액 기회전체 총액
    private long totalOpptyBuyRslAmt;

    // 매출금액 누적실적 총액
    private long totalAcmlSellRslAmt;

    // 매입금액 누적실적 총액
    private long totalAcmlBuyRslAmt;

    // 매출금액 차액 총액
    private long totalDefSellAmt;

    // 매입금액 차액 총액
    private long totalDefBuyAmt;

    /**
     * 사업부문
     */
    private String bsnsCfsfCd;

    /**
     * 상품구분
     */
    private String prodDstCdNm;

    // 수주(계약)금액
    private long cntrAmt;

    // 수주ID
    private String wctId;

    // 매출 차액
    private long defSellAmt;

    // 매입 차액
    private long defBuyAmt;

    // 프로젝트별 매출합계
    private long prjtSellAmt;

    // 프로젝트별 매입합계
    private long prjtBuyAmt;

    // ERP 매출금액
    private long realSellRslAmt;

    // ERP 매입금액
    private long realBuyRslAmt;

    // ERP 매출 총합계금액
    private long totalRealSellRslAmt;

    // ERP 매입 총합계금액
    private long totalRealBuyRslAmt;


    public String getProdDstCdNm() {
        return prodDstCdNm;
    }

    public void setProdDstCdNm(String prodDstCdNm) {
        this.prodDstCdNm = prodDstCdNm;
    }

    public String getBsnsCfsfCd() {
        return bsnsCfsfCd;
    }

    public void setBsnsCfsfCd(String bsnsCfsfCd) {
        this.bsnsCfsfCd = bsnsCfsfCd;
    }

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

    public String getBsnsClsfCdNm() {
        return bsnsClsfCdNm;
    }

    public void setBsnsClsfCdNm(String bsnsClsfCdNm) {
        this.bsnsClsfCdNm = bsnsClsfCdNm;
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

    public long getTotalSellOpptyRslAmt() {
        return totalSellOpptyRslAmt;
    }

    public void setTotalSellOpptyRslAmt(long totalSellOpptyRslAmt) {
        this.totalSellOpptyRslAmt = totalSellOpptyRslAmt;
    }

    public long getTotalBuyOpptyRslAmt() {
        return totalBuyOpptyRslAmt;
    }

    public void setTotalBuyOpptyRslAmt(long totalBuyOpptyRslAmt) {
        this.totalBuyOpptyRslAmt = totalBuyOpptyRslAmt;
    }

    public long getTotalSellFcstRslAmt() {
        return totalSellFcstRslAmt;
    }

    public void setTotalSellFcstRslAmt(long totalSellFcstRslAmt) {
        this.totalSellFcstRslAmt = totalSellFcstRslAmt;
    }

    public long getTotalBuyFcstRslAmt() {
        return totalBuyFcstRslAmt;
    }

    public void setTotalBuyFcstRslAmt(long totalBuyFcstRslAmt) {
        this.totalBuyFcstRslAmt = totalBuyFcstRslAmt;
    }

    public long getTotalSellRslAmt() {
        return totalSellRslAmt;
    }

    public void setTotalSellRslAmt(long totalSellRslAmt) {
        this.totalSellRslAmt = totalSellRslAmt;
    }

    public long getTotalBuyRslAmt() {
        return totalBuyRslAmt;
    }

    public void setTotalBuyRslAmt(long totalBuyRslAmt) {
        this.totalBuyRslAmt = totalBuyRslAmt;
    }

    public long getTotalOpptySellRslAmt() {
        return totalOpptySellRslAmt;
    }

    public void setTotalOpptySellRslAmt(long totalOpptySellRslAmt) {
        this.totalOpptySellRslAmt = totalOpptySellRslAmt;
    }

    public long getTotalOpptyBuyRslAmt() {
        return totalOpptyBuyRslAmt;
    }

    public void setTotalOpptyBuyRslAmt(long totalOpptyBuyRslAmt) {
        this.totalOpptyBuyRslAmt = totalOpptyBuyRslAmt;
    }

    public long getTotalAcmlSellRslAmt() {
        return totalAcmlSellRslAmt;
    }

    public void setTotalAcmlSellRslAmt(long totalAcmlSellRslAmt) {
        this.totalAcmlSellRslAmt = totalAcmlSellRslAmt;
    }

    public long getTotalAcmlBuyRslAmt() {
        return totalAcmlBuyRslAmt;
    }

    public void setTotalAcmlBuyRslAmt(long totalAcmlBuyRslAmt) {
        this.totalAcmlBuyRslAmt = totalAcmlBuyRslAmt;
    }

    public long getCntrAmt() {
        return cntrAmt;
    }

    public void setCntrAmt(long cntrAmt) {
        this.cntrAmt = cntrAmt;
    }

    public String getWctId() {
        return wctId;
    }

    public void setWctId(String wctId) {
        this.wctId = wctId;
    }

    public long getDefSellAmt() {
        return defSellAmt;
    }

    public void setDefSellAmt(long defSellAmt) {
        this.defSellAmt = defSellAmt;
    }

    public long getDefBuyAmt() {
        return defBuyAmt;
    }

    public void setDefBuyAmt(long defBuyAmt) {
        this.defBuyAmt = defBuyAmt;
    }

    public long getTotalDefSellAmt() {
        return totalDefSellAmt;
    }

    public void setTotalDefSellAmt(long totalDefSellAmt) {
        this.totalDefSellAmt = totalDefSellAmt;
    }

    public long getTotalDefBuyAmt() {
        return totalDefBuyAmt;
    }

    public void setTotalDefBuyAmt(long totalDefBuyAmt) {
        this.totalDefBuyAmt = totalDefBuyAmt;
    }

    public long getPrjtSellAmt() {
        return prjtSellAmt;
    }

    public void setPrjtSellAmt(long prjtSellAmt) {
        this.prjtSellAmt = prjtSellAmt;
    }

    public long getPrjtBuyAmt() {
        return prjtBuyAmt;
    }

    public void setPrjtBuyAmt(long prjtBuyAmt) {
        this.prjtBuyAmt = prjtBuyAmt;
    }

    public long getRealSellRslAmt() {
        return realSellRslAmt;
    }

    public void setRealSellRslAmt(long realSellRslAmt) {
        this.realSellRslAmt = realSellRslAmt;
    }

    public long getRealBuyRslAmt() {
        return realBuyRslAmt;
    }

    public void setRealBuyRslAmt(long realBuyRslAmt) {
        this.realBuyRslAmt = realBuyRslAmt;
    }

    public long getTotalRealSellRslAmt() {
        return totalRealSellRslAmt;
    }

    public void setTotalRealSellRslAmt(long totalRealSellRslAmt) {
        this.totalRealSellRslAmt = totalRealSellRslAmt;
    }

    public long getTotalRealBuyRslAmt() {
        return totalRealBuyRslAmt;
    }

    public void setTotalRealBuyRslAmt(long totalRealBuyRslAmt) {
        this.totalRealBuyRslAmt = totalRealBuyRslAmt;
    }
}
