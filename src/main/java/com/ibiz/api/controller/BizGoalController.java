package com.ibiz.api.controller;

import com.google.gson.reflect.TypeToken;
import com.ibiz.api.model.*;
import com.ibiz.api.service.BizGoalService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
@Slf4j
public class BizGoalController extends BaseController {

    @Autowired
    private BizGoalService bizGoalService;

    @GetMapping("/bizGoal")
    public String checkState() { return "bizGoal-8200"; }

    //사업목표관리 - 영업부서별/ 영업대표별
    @PostMapping("/selectMonthlyGoalList")
    public ResponseEntity<String> selectMonthlyGoalList(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".selectMonthlyGoalList");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<BizGoalSearchVO>>(){});

        return super.composePayload(new Payload<List>(bizGoalService.selectMonthlyGoalList(requestPayload)));
    }

    //사업목표관리 - 사업예상불러오기
    @PostMapping("/selectBizFcstList")
    public ResponseEntity<String> selectBizFcstList(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".selectBizFcstList");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<BizGoalSearchVO>>(){});

        return super.composePayload(new Payload<List>(bizGoalService.selectBizFcstList(requestPayload)));
    }

    //실적관련 유효한 수정기간인지 여부 체크
    @PostMapping("/selectIsAvlChgDate")
    public ResponseEntity<String> selectIsAvlChgDate(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".selectIsAvlChgDate");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<BizGoalSearchVO>>(){});

        return super.composePayload(new Payload<Map>(bizGoalService.selectIsAvlChgDate(requestPayload)));
    }

    //월별영업부서실적 조회
    @PostMapping("/selectMonthlyDeptStatsList")
    public ResponseEntity<String> selectMonthlyDeptStatsList(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".selectMonthlyDeptStatsList");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<BizGoalSearchVO>>(){});

        return super.composePayload(new Payload<List>(bizGoalService.selectMonthlyDeptStatsList(requestPayload)));
    }

    //월별영업대표실적 조회
    @PostMapping("/selectMonthlyEmployeeStatsList")
    public ResponseEntity<String> selectMonthlyEmployeeStatsList(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".selectMonthlyEmployeeStatsList");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<BizGoalSearchVO>>(){});

        return super.composePayload(new Payload<List>(bizGoalService.selectMonthlyEmployeeStatsList(requestPayload)));
    }

    //월별상품실적 조회
    @PostMapping("/selectMonthlyBizGroupStatsList")
    public ResponseEntity<String> selectMonthlyBizGroupStatsList(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".selectMonthlyBizGroupStatsList");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<BizGoalSearchVO>>(){});

        return super.composePayload(new Payload<List>(bizGoalService.selectMonthlyBizGroupStatsList(requestPayload)));
    }

    //사업목표 기준연도조회(max값)
    @PostMapping("/selectMaxCritYear")
    public ResponseEntity<String> selectMaxCritYear(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".selectMaxCritYear");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<BizGoalSearchVO>>(){});

        return super.composePayload(new Payload<Map>(bizGoalService.selectMaxCritYear(requestPayload)));
    }

    //사업목표 기준연도조회
    @PostMapping("/selectMinMaxCritYear")
    public ResponseEntity<String> selectMinMaxCritYear(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".selectMinMaxCritYear");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<BizGoalSearchVO>>(){});

        return super.composePayload(new Payload<Map>(bizGoalService.selectMinMaxCritYear(requestPayload)));
    }

     /* INSERT*/


    //사업목표 등록 (월별 부서)
    @PostMapping("/insertMonthlyDeptGoal")
    public ResponseEntity<String> insertMonthlyDeptGoal(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".insertMonthlyDeptGoal");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<YearDeptResultAllVO>>(){});

        return super.composePayload(new Payload<YearDeptResultAllVO>(bizGoalService.insertMonthlyDeptGoal(requestPayload)));
    }

    //사업목표 등록 (월별 영업대표)
    @PostMapping("/insertMonthlyEmpGoal")
    public ResponseEntity<String> insertMonthlyEmpGoal(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".insertMonthlyEmpGoal");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<YearDeptResultAllVO>>(){});

        return super.composePayload(new Payload<YearEmpResultAllVO>(bizGoalService.insertMonthlyEmpGoal(requestPayload)));
    }


     // UPDATE


    //사업목표 확정 (영업부서) - 하위부서포함
    @PostMapping("/insertMonthlyDeptLwrkDeptCvrdGoal")
    public ResponseEntity<String> insertMonthlyDeptLwrkDeptCvrdGoal(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".insertMonthlyDeptLwrkDeptCvrdGoal");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<YearDeptResultVO>>(){});

        return super.composePayload(new Payload<YearDeptResultVO>(bizGoalService.insertMonthlyDeptLwrkDeptCvrdGoal(requestPayload)));
    }

    //사업목표 확정 (영업부서)
    @PostMapping("/insertMonthlyDeptGoalDcd")
    public ResponseEntity<String> insertMonthlyDeptGoalDcd(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".insertMonthlyDeptGoalDcd");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<YearDeptResultAllVO>>(){});

        return super.composePayload(new Payload<YearDeptResultAllVO>(bizGoalService.insertMonthlyDeptGoalDcd(requestPayload)));
    }

    //사업목표 확정 (영업대표) - 하위부서포함
    @PostMapping("/insertMonthlyEmpLwrkDeptCvrdGoal")
    public ResponseEntity<String> insertMonthlyEmpLwrkDeptCvrdGoal(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".insertMonthlyEmpLwrkDeptCvrdGoal");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<YearEmpResultVO>>(){});

        return super.composePayload(new Payload<YearEmpResultVO>(bizGoalService.insertMonthlyEmpLwrkDeptCvrdGoal(requestPayload)));
    }

    //사업목표 확정 (영업대표)
    @PostMapping("/insertMonthlyEmpGoalDcd")
    public ResponseEntity<String> insertMonthlyEmpGoalDcd(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".insertMonthlyEmpGoalDcd");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<YearEmpResultAllVO>>(){});

        return super.composePayload(new Payload<YearEmpResultAllVO>(bizGoalService.insertMonthlyEmpGoalDcd(requestPayload)));
    }


     //DELETE


    //사업목표 삭제 (월별 부서)
    @PostMapping("/deleteMonthlyDeptGoal")
    public ResponseEntity<String> deleteMonthlyDeptGoal(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".deleteMonthlyDeptGoal");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<YearDeptResultVO>>(){});

        return super.composePayload(new Payload<YearDeptResultVO>(bizGoalService.deleteMonthlyDeptGoal(requestPayload)));
    }

    //사업목표 삭제 (월별 영업대표)
    @PostMapping("/deleteMonthlyEmpGoal")
    public ResponseEntity<String> deleteMonthlyEmpGoal(@RequestParam("payload") String payload) throws Exception {
        log.info("Call Controller : " + this.getClass().getName() + ".deleteMonthlyEmpGoal");
        Payload requestPayload = super.parsePayload(payload, new TypeToken<Payload<YearEmpResultVO>>(){});

        return super.composePayload(new Payload<YearEmpResultVO>(bizGoalService.deleteMonthlyEmpGoal(requestPayload)));
    }
}
