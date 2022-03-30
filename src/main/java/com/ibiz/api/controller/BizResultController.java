package com.ibiz.api.controller;

import com.google.gson.reflect.TypeToken;
import com.ibiz.api.model.*;
import com.ibiz.api.service.BizResultService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@Slf4j
public class BizResultController extends BaseController {

    @Autowired
    private BizResultService bizResultService;

    @GetMapping("/bizResult")
    public String checkState() { return "bizResult-8200"; }

    //영업부서실적현황
    @PostMapping("/selectExpectDeptStatsList")
    public ResponseEntity<String> selectExpectDeptStatsList(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".selectExpectDeptStatsList");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<BusinessResultSearchVO>>(){});

        return super.composePayload(new Payload<List>(bizResultService.selectExpectDeptStatsList(requestPayload)));
    }

    //영업대표실적현황
    @PostMapping("/selectExpectEmployeeStatsList")
    public ResponseEntity<String> selectExpectEmployeeStatsList(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".selectExpectEmployeeStatsList");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<BusinessResultSearchVO>>(){});

        return super.composePayload(new Payload<List>(bizResultService.selectExpectEmployeeStatsList(requestPayload)));
    }

    //사업부문실적현황
    @PostMapping("/selectExpectBizGroupStatsList")
    public ResponseEntity<String> selectExpectBizGroupStatsList(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".selectExpectBizGroupStatsList");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<BusinessResultSearchVO>>(){});

        return super.composePayload(new Payload<List>(bizResultService.selectExpectBizGroupStatsList(requestPayload)));
    }

    //상품실적현황
    @PostMapping("/selectExpectProdGroupStatsList")
    public ResponseEntity<String> selectExpectProdGroupStatsList(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".selectExpectProdGroupStatsList");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<BusinessResultSearchVO>>(){});

        return super.composePayload(new Payload<List>(bizResultService.selectExpectProdGroupStatsList(requestPayload)));
    }

    //실적상세리스트
    @PostMapping("/selectSalesReportList")
    public ResponseEntity<String> selectSalesReportList(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".selectSalesReportList");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<BusinessResultSearchVO>>(){});

        return super.composePayload(new Payload<List>(bizResultService.selectSalesReportList(requestPayload)));
    }

    //잔여예상 실적상세리스트
    @PostMapping("/selectSalesReportRsdnList")
    public ResponseEntity<String> selectSalesReportRsdnList(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".selectSalesReportRsdnList");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<BusinessResultSearchVO>>(){});

        return super.composePayload(new Payload<List>(bizResultService.selectSalesReportRsdnList(requestPayload)));
    }

    //사업분류 콤보박스 리스트
    @PostMapping("/selectBsnsClsfList")
    public ResponseEntity<String> selectBsnsClsfList(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".selectBsnsClsfList");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<YearBizTypeDimVO>>(){});

        return super.composePayload(new Payload<List>(bizResultService.selectBsnsClsfList(requestPayload)));
    }

    //사업 실적비교
    @PostMapping("/selectMonthlyCompareStatsList")
    public ResponseEntity<String> selectMonthlyCompareStatsList(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".selectMonthlyCompareStatsList");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<BusinessResultSearchVO>>(){});

        return super.composePayload(new Payload<List>(bizResultService.selectMonthlyCompareStatsList(requestPayload)));
    }

    //주간업무보고 조회
    @PostMapping("/selectWeeklyActivityList")
    public ResponseEntity<String> selectWeeklyActivityList(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".selectWeeklyActivityList");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<WeekJobReportVO>>(){});

        return super.composePayload(new Payload<List>(bizResultService.selectWeeklyActivityList(requestPayload)));
    }
    //주간업무보고 조회(서브)
    @PostMapping("/selectWeeklyActivitySubList")
    public ResponseEntity<String> selectWeeklyActivitySubList(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".selectWeeklyActivitySubList");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<WeekJobReportVO>>(){});

        return super.composePayload(new Payload<List>(bizResultService.selectWeeklyActivitySubList(requestPayload)));
    }

    //월간보고서리스트 조회
    @PostMapping("/selectMonthlyWorkList")
    public ResponseEntity<String> selectMonthlyWorkList(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".selectMonthlyWorkList");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<MonthlyWorkVO>>(){});

        return super.composePayload(new Payload<List>(bizResultService.selectMonthlyWorkList(requestPayload)));
    }
    //월간보고서 기준연도 리스트 조회
    @PostMapping("/selectCritYearList")
    public ResponseEntity<String> selectCritYearList() throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".selectCritYearList");

        return super.composePayload(new Payload<List>(bizResultService.selectCritYearList()));
    }

    //월간보고서상세내역 조회
    @PostMapping("/selectMonthlyWork")
    public ResponseEntity<String> selectMonthlyWork(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".selectMonthlyWork");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<MonthlyWorkVO>>(){});

        return super.composePayload(new Payload<MonthlyWorkVO>(bizResultService.selectMonthlyWork(requestPayload)));
    }
    //월간보고서 등록
    @PostMapping("/insertMonthlyWork")
    public ResponseEntity<String> insertMonthlyWork(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".insertMonthlyWork");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<MonthlyWorkVO>>(){});

        return super.composePayload(new Payload<MonthlyWorkVO>(bizResultService.insertMonthlyWork(requestPayload)));
    }
    //월간보고서 수정
    @PostMapping("/updateMonthlyWork")
    public ResponseEntity<String> updateMonthlyWork(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".updateMonthlyWork");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<MonthlyWorkVO>>(){});

        return super.composePayload(new Payload<MonthlyWorkVO>(bizResultService.updateMonthlyWork(requestPayload)));
    }
    //월간보고서 삭제
    @PostMapping("/deleteMonthlyWork")
    public ResponseEntity<String> deleteMonthlyWork(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".deleteMonthlyWork");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<MonthlyWorkVO>>(){});

        return super.composePayload(new Payload<MonthlyWorkVO>(bizResultService.deleteMonthlyWork(requestPayload)));
    }



    //사업프로젝트 리스트 조회
    @PostMapping("/selectBizPrjtInfoList")
    public ResponseEntity<String> selectBizPrjtInfoList(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".selectBizPrjtInfoList");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<BizProjectInfoVO>>(){});

        return super.composePayload(new Payload<List>(bizResultService.selectBizPrjtInfoList(requestPayload)));
    }

    //사업프로젝트 기본 상세 조회
    @PostMapping("/selectBizPrjtInfo")
    public ResponseEntity<String> selectBizPrjtInfo(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".selectBizPrjtInfo");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<BizProjectInfoVO>>(){});

        return super.composePayload(new Payload<BizProjectInfoVO>(bizResultService.selectBizPrjtInfo(requestPayload)));
    }

    //사업프로젝트 기본 등록
    @PostMapping("/insertBizPrjtInfo")
    public ResponseEntity<String> insertBizPrjtInfo(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".insertBizPrjtInfo");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<BizProjectInfoVO>>(){});

        return super.composePayload(new Payload<BizProjectInfoVO>(bizResultService.insertBizPrjtInfo(requestPayload)));
    }

    //사업프로젝트 기본 수정
    @PostMapping("/updateBizPrjtInfo")
    public ResponseEntity<String> updateBizPrjtInfo(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".updateBizPrjtInfo");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<BizProjectInfoVO>>(){});

        return super.composePayload(new Payload<BizProjectInfoVO>(bizResultService.updateBizPrjtInfo(requestPayload)));
    }

    //사업프로젝트 기본 삭제
    @PostMapping("/deleteBizPrjtInfo")
    public ResponseEntity<String> deleteBizPrjtInfo(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".deleteBizPrjtInfo");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<BizProjectInfoVO>>(){});

        return super.composePayload(new Payload<BizProjectInfoVO>(bizResultService.deleteBizPrjtInfo(requestPayload)));
    }

    //ERP상세리스트
    @PostMapping("/selectSalesRealReportDetailList")
    public ResponseEntity<String> selectSalesRealReportDetailList(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".selectSalesRealReportDetailList");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<BusinessResultSearchVO>>(){});

        return super.composePayload(new Payload<List>(bizResultService.selectSalesRealReportDetailList(requestPayload)));
    }


    //사업업무보고 목록 조회
    @PostMapping("/selectBizWorkReportList")
    public ResponseEntity<String> selectBizWorkReportList(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".selectBizWorkReportList");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<BizProjectInfoVO>>(){});

        return super.composePayload(new Payload<List>(bizResultService.selectBizWorkReportList(requestPayload)));
    }

    //사업업무보고 상세 조회
    @PostMapping("/selectBizWorkReportInfo")
    public ResponseEntity<String> selectBizWorkReportInfo(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".selectBizWorkReportInfo");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<BizProjectReportVO>>(){});

        return super.composePayload(new Payload<BizProjectReportVO>(bizResultService.selectBizWorkReportInfo(requestPayload)));
    }

    //사업업무보고 등록
    @PostMapping("/insertBizWorkReportInfo")
    public ResponseEntity<String> insertBizWorkReportInfo(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".insertBizWorkReportInfo");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<BizProjectReportVO>>(){});

        return super.composePayload(new Payload<BizProjectReportVO>(bizResultService.insertBizWorkReportInfo(requestPayload)));
    }

    //사업업무보고 수정
    @PostMapping("/updateBizWorkReportInfo")
    public ResponseEntity<String> updateBizWorkReportInfo(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".updateBizWorkReportInfo");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<BizProjectReportVO>>(){});

        return super.composePayload(new Payload<BizProjectReportVO>(bizResultService.updateBizWorkReportInfo(requestPayload)));
    }

    //사업업무보고 삭제
    @PostMapping("/deleteBizWorkReportInfo")
    public ResponseEntity<String> deleteBizWorkReportInfo(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".deleteBizWorkReportInfo");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<BizProjectReportVO>>(){});

        return super.composePayload(new Payload<BizProjectReportVO>(bizResultService.deleteBizWorkReportInfo(requestPayload)));
    }

}
