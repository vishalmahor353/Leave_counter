package com.example.leavedatetime.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class WorkingDayRequest {

    private LocalDateTime startDate;
    private Double noOfLeaves;
    private Boolean isSaturdayOff;
    private Boolean isSundayOff;
    private List<LocalDate> holidays = new ArrayList<>();
}
