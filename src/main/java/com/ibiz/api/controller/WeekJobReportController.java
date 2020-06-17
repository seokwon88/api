package com.ibiz.api.controller;

import com.google.gson.reflect.TypeToken;
import com.ibiz.api.model.Payload;
import com.ibiz.api.model.WeekJobReportVO;
import com.ibiz.api.service.WeekJobReportService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@Slf4j
public class WeekJobReportController extends BaseController {

    @Autowired
    private WeekJobReportService weekJobReportService;

    @GetMapping("/weekJobReport")
    public String checkState() { return "weekJobReport-8200"; }

    //주간업무보고 조회
    @PostMapping("/selectWeekJobReportList")
    public ResponseEntity<String> selectWeekJobReportList(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".selectWeekJobReportList");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<WeekJobReportVO>>(){});

        return super.composePayload(new Payload<List>(weekJobReportService.selectWeekJobReportList(requestPayload)));
    }
    //주간업무보고 조회(서브)
    @PostMapping("/selectWeekJobReportSubList")
    public ResponseEntity<String> selectWeekJobReportSubList(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".selectWeekJobReportSubList");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<WeekJobReportVO>>(){});

        return super.composePayload(new Payload<List>(weekJobReportService.selectWeekJobReportSubList(requestPayload)));
    }

}
