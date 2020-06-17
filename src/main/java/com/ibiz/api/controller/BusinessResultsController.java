package com.ibiz.api.controller;

import com.google.gson.reflect.TypeToken;
import com.ibiz.api.model.BusinessResultsSearchVO;
import com.ibiz.api.model.Payload;
import com.ibiz.api.service.BusinessResultsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@Slf4j
public class BusinessResultsController extends BaseController {

    @Autowired
    private BusinessResultsService businessResultsService;

    @GetMapping("/brsl")
    public String checkState() { return "brsl-8200"; }

    //영업부서실적현황
    @PostMapping("/selectBusinessResultsByDeptList")
    public ResponseEntity<String> selectBusinessResultsByDeptList(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".selectBusinessResultsByDeptList");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<BusinessResultsSearchVO>>(){});

        return super.composePayload(new Payload<List>(businessResultsService.selectBusinessResultsByDeptList(requestPayload)));
    }

    //영업대표실적현황
    @PostMapping("/selectBusinessResultsByEmpList")
    public ResponseEntity<String> selectBusinessResultsByEmpList(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".selectBusinessResultsByEmpList");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<BusinessResultsSearchVO>>(){});

        return super.composePayload(new Payload<List>(businessResultsService.selectBusinessResultsByEmpList(requestPayload)));
    }

    //사업부문실적현황
    @PostMapping("/selectBusinessResultsByBsnsClsfCdList")
    public ResponseEntity<String> selectBusinessResultsByBsnsClsfCdList(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".selectBusinessResultsByBsnsClsfCdList");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<BusinessResultsSearchVO>>(){});

        return super.composePayload(new Payload<List>(businessResultsService.selectBusinessResultsByBsnsClsfCdList(requestPayload)));
    }

    //상품실적현황
    @PostMapping("/selectBusinessResultsByProdDstCdList")
    public ResponseEntity<String> selectBusinessResultsByProdDstCdList(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".selectBusinessResultsByProdDstCdList");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<BusinessResultsSearchVO>>(){});

        return super.composePayload(new Payload<List>(businessResultsService.selectBusinessResultsByProdDstCdList(requestPayload)));
    }

    //실적상세리스트
    @PostMapping("/selectBusinessResultsDetailList")
    public ResponseEntity<String> selectBusinessResultsDetailList(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".selectBusinessResultsDetailList");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<BusinessResultsSearchVO>>(){});

        return super.composePayload(new Payload<List>(businessResultsService.selectBusinessResultsDetailList(requestPayload)));
    }

    //사업분류 콤보박스 리스트
    @PostMapping("/selectBsnsClsfCdListByCritYear")
    public ResponseEntity<String> selectBsnsClsfCdListByCritYear(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".selectBsnsClsfCdListByCritYear");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<BusinessResultsSearchVO>>(){});

        return super.composePayload(new Payload<List>(businessResultsService.selectBsnsClsfCdListByCritYear(requestPayload)));
    }

    //사업 실적비교
    @PostMapping("/selectResultCmprList")
    public ResponseEntity<String> selectResultCmprList(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".selectResultCmprList");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<BusinessResultsSearchVO>>(){});

        return super.composePayload(new Payload<List>(businessResultsService.selectResultCmprList(requestPayload)));
    }
}
