package com.example.leavedatetime.controller;

import com.example.leavedatetime.entity.WorkingDayRequest;
import com.example.leavedatetime.service.WorkingDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class WorkingDayController {

    @Autowired
    private WorkingDayService workingDayService;

    @PostMapping(value = "/count-end-date")
    public ResponseEntity<?> countEndDate(@RequestBody WorkingDayRequest request){
        return new ResponseEntity<>(workingDayService.countEndDate(request),
                HttpStatus.OK);
    }
}
