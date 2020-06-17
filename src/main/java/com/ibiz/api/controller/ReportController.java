package com.ibiz.api.controller;

import com.google.gson.reflect.TypeToken;
import com.ibiz.api.model.Payload;
import com.ibiz.api.model.ReportVO;
import com.ibiz.api.service.ReportService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@Slf4j
public class ReportController extends BaseController {

    @Autowired
    private ReportService reportService;

    @GetMapping("/report")
    public String checkState() { return "report-8200"; }

    //월간보고서리스트 조회
    @PostMapping("/selectReportList")
    public ResponseEntity<String> selectReportList(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".selectReportList");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<ReportVO>>(){});

        return super.composePayload(new Payload<List>(reportService.selectReportList(requestPayload)));
    }
    //월간보고서 기준연도 리스트 조회
    @PostMapping("/selectCritYearList")
    public ResponseEntity<String> selectCritYearList() throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".selectCritYearList");

        return super.composePayload(new Payload<List>(reportService.selectCritYearList()));
    }

    //월간보고서상세내역 조회
    @PostMapping("/selectReportDetail")
    public ResponseEntity<String> selectReportDetail(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".selectReportDetail");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<ReportVO>>(){});

        return super.composePayload(new Payload<ReportVO>(reportService.selectReportDetail(requestPayload)));
    }
    //월간보고서 등록
    @PostMapping("/insertReportDetail")
    public ResponseEntity<String> insertReportDetail(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".insertReportDetail");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<ReportVO>>(){});

        return super.composePayload(new Payload<ReportVO>(reportService.insertReportDetail(requestPayload)));
    }
    //월간보고서 수정
    @PostMapping("/updateReportDetail")
    public ResponseEntity<String> updateReportDetail(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".updateReportDetail");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<ReportVO>>(){});

        return super.composePayload(new Payload<ReportVO>(reportService.updateReportDetail(requestPayload)));
    }
    //월간보고서 삭제
    @PostMapping("/deleteReportDetail")
    public ResponseEntity<String> deleteReportDetail(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".deleteReportDetail");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<ReportVO>>(){});

        return super.composePayload(new Payload<ReportVO>(reportService.deleteReportDetail(requestPayload)));
    }

}
