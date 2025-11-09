package com.spring.dto;

import java.time.LocalDate;

public class DailyCount {
    private LocalDate day;
    private Long count;

    public DailyCount(LocalDate day, Long count) {
        this.day = day;
        this.count = count;
    }
    public LocalDate getDay() { return day; }
    public Long getCount() { return count; }
}
