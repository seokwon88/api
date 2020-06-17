package com.ibiz.api.service;

import com.ibiz.api.dao.WeekJobReportDao;
import com.ibiz.api.model.Payload;
import com.ibiz.api.model.WeekJobReportSubVO;
import com.ibiz.api.model.WeekJobReportVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
public class WeekJobReportService {

    @Resource(name = "weekJobReportDao")
    private WeekJobReportDao weekJobReportDao;

    //주간업무보고 조회
    @Transactional
    public List<WeekJobReportVO> selectWeekJobReportList(Payload<WeekJobReportVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".selectReportList");
        WeekJobReportVO weekJobReportVO = requestPayload.getDto();

        List<WeekJobReportVO> weekJobReportList = weekJobReportDao.selectWeekJobReportList(weekJobReportVO);

        return weekJobReportList;
    }

    //주간업무보고 조회(서브)
    @Transactional
    public List<WeekJobReportSubVO> selectWeekJobReportSubList(Payload<WeekJobReportVO> requestPayload) throws Exception {
        log.info("Call Service : " + this.getClass().getName() + ".selectWeekJobReportSubList");
        WeekJobReportVO weekJobReportVO = requestPayload.getDto();

        List<WeekJobReportSubVO> weekJobReporSubtList = weekJobReportDao.selectWeekJobReportSubList(weekJobReportVO);

        return weekJobReporSubtList;
    }

}
