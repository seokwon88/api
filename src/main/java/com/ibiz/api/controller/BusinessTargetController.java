package com.ibiz.api.controller;

import com.google.gson.reflect.TypeToken;
import com.ibiz.api.model.*;
import com.ibiz.api.service.BusinessResultsService;
import com.ibiz.api.service.BusinessTargetService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
@Slf4j
public class BusinessTargetController extends BaseController {

    @Autowired
    private BusinessTargetService businessTargetService;

    @GetMapping("/businessTarget")
    public String checkState() { return "businessTarget-8200"; }

    //사업목표관리 - 영업부서별/ 영업대표별
    @PostMapping("/selectBusinessTargetList")
    public ResponseEntity<String> selectBusinessTargetList(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".selectBusinessTargetList");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<BusinessTargetSearchVO>>(){});

        return super.composePayload(new Payload<List>(businessTargetService.selectBusinessTargetList(requestPayload)));
    }

    //실적관련 유효한 수정기간인지 여부 체크
    @PostMapping("/selectIsOpenAvlDate")
    public ResponseEntity<String> selectIsOpenAvlDate(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".selectIsOpenAvlDate");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<BusinessTargetSearchVO>>(){});

        return super.composePayload(new Payload<Map>(businessTargetService.selectIsOpenAvlDate(requestPayload)));
    }

    //월별영업부서실적 조회
    @PostMapping("/selectBusinessTargetForDeptResult")
    public ResponseEntity<String> selectBusinessTargetForDeptResult(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".selectBusinessTargetForDeptResult");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<BusinessTargetSearchVO>>(){});

        return super.composePayload(new Payload<List>(businessTargetService.selectBusinessTargetForDeptResult(requestPayload)));
    }

    //월별영업대표실적 조회
    @PostMapping("/selectBusinessTargetForEmpResult")
    public ResponseEntity<String> selectBusinessTargetForEmpResult(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".selectBusinessTargetForEmpResult");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<BusinessTargetSearchVO>>(){});

        return super.composePayload(new Payload<List>(businessTargetService.selectBusinessTargetForEmpResult(requestPayload)));
    }

    //월별상품실적 조회
    @PostMapping("/selectBusinessTargetProductResult")
    public ResponseEntity<String> selectBusinessTargetProductResult(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".selectBusinessTargetProductResult");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<BusinessTargetSearchVO>>(){});

        return super.composePayload(new Payload<List>(businessTargetService.selectBusinessTargetProductResult(requestPayload)));
    }

    //사업목표관리 - 사업예상불러오기
    @PostMapping("/selectBusinessTargetBOPT")
    public ResponseEntity<String> selectBusinessTargetBOPT(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".selectBusinessTargetBOPT");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<BusinessTargetSearchVO>>(){});

        return super.composePayload(new Payload<List>(businessTargetService.selectBusinessTargetBOPT(requestPayload)));
    }

    //사업목표 기준연도조회(max값)
    @PostMapping("/selectStandardCritYear")
    public ResponseEntity<String> selectStandardCritYear(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".selectStandardCritYear");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<BusinessTargetSearchVO>>(){});

        return super.composePayload(new Payload<Map>(businessTargetService.selectStandardCritYear(requestPayload)));
    }

    //사업목표 기준연도조회
    @PostMapping("/selectBusinessTargetYear")
    public ResponseEntity<String> selectBusinessTargetYear(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".selectBusinessTargetYear");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<BusinessTargetSearchVO>>(){});

        return super.composePayload(new Payload<Map>(businessTargetService.selectBusinessTargetYear(requestPayload)));
    }

     /* INSERT*/


    //사업목표 등록 (월별 부서)
    @PostMapping("/insertBusinessTargetDeptForMM")
    public ResponseEntity<String> insertBusinessTargetDeptForMM(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".insertBusinessTargetDeptForMM");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<BusinessTargetForDeptAllMMVO>>(){});

        return super.composePayload(new Payload<BusinessTargetForDeptAllMMVO>(businessTargetService.insertBusinessTargetDeptForMM(requestPayload)));
    }

    //사업목표 등록 (월별 영업대표)
    @PostMapping("/insertBusinessTargetEmpForMM")
    public ResponseEntity<String> insertBusinessTargetEmpForMM(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".insertBusinessTargetEmpForMM");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<BusinessTargetForDeptAllMMVO>>(){});

        return super.composePayload(new Payload<BusinessTargetForEmpAllMMVO>(businessTargetService.insertBusinessTargetEmpForMM(requestPayload)));
    }


     // UPDATE


    //사업목표 확정 (영업부서) - 하위부서포함
    @PostMapping("/updateLowerDeptBusinessTargetDeptForMM")
    public ResponseEntity<String> updateLowerDeptBusinessTargetDeptForMM(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".updateLowerDeptBusinessTargetDeptForMM");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<BusinessTargetSearchVO>>(){});

        return super.composePayload(new Payload<BusinessTargetSearchVO>(businessTargetService.updateLowerDeptBusinessTargetDeptForMM(requestPayload)));
    }

    //사업목표 확정 (영업부서)
    @PostMapping("/updateBusinessTargetDeptForMM")
    public ResponseEntity<String> updateBusinessTargetDeptForMM(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".updateBusinessTargetDeptForMM");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<BusinessTargetForDeptAllMMVO>>(){});

        return super.composePayload(new Payload<BusinessTargetForDeptAllMMVO>(businessTargetService.updateBusinessTargetDeptForMM(requestPayload)));
    }

    //사업목표 확정 (영업대표) - 하위부서포함
    @PostMapping("/updateLowerDeptBusinessTargetEmpForMM")
    public ResponseEntity<String> updateLowerDeptBusinessTargetEmpForMM(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".updateLowerDeptBusinessTargetEmpForMM");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<BusinessTargetSearchVO>>(){});

        return super.composePayload(new Payload<BusinessTargetSearchVO>(businessTargetService.updateLowerDeptBusinessTargetEmpForMM(requestPayload)));
    }

    //사업목표 확정 (영업대표)
    @PostMapping("/updateBusinessTargetEmpForMM")
    public ResponseEntity<String> updateBusinessTargetEmpForMM(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".updateBusinessTargetEmpForMM");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<BusinessTargetSearchVO>>(){});

        return super.composePayload(new Payload<BusinessTargetForEmpAllMMVO>(businessTargetService.updateBusinessTargetEmpForMM(requestPayload)));
    }


     //DELETE


    //사업목표 삭제 (월별 부서)
    @PostMapping("/deleteAllBusinessTargetDeptForMM")
    public ResponseEntity<String> deleteAllBusinessTargetDeptForMM(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".deleteAllBusinessTargetDeptForMM");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<BusinessTargetForDeptMMVO>>(){});

        return super.composePayload(new Payload<BusinessTargetForDeptMMVO>(businessTargetService.deleteAllBusinessTargetDeptForMM(requestPayload)));
    }

    //사업목표 삭제 (월별 영업대표)
    @PostMapping("/deleteAllBusinessTargetEmpForMM")
    public ResponseEntity<String> deleteAllBusinessTargetEmpForMM(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".deleteAllBusinessTargetEmpForMM");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<BusinessTargetForEmpMMVO>>(){});

        return super.composePayload(new Payload<BusinessTargetForEmpMMVO>(businessTargetService.deleteAllBusinessTargetEmpForMM(requestPayload)));
    }
}
