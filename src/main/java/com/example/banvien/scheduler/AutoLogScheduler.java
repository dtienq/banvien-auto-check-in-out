package com.example.banvien.scheduler;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Component
@Slf4j
@RequiredArgsConstructor
public class AutoLogScheduler {
    private final RestTemplate restTemplate;

    @Scheduled(cron = "0 0/1 * ? * *")
    public void checkTimesheet() {
        log.info("call api get list timesheet!");
        Map<String, String> req = new HashMap<>();
        req.put("stringEncoder", "eyJ1c2VyX2lkIjoiNjAxYTk5MDItMTg5NS00ZjRhLTllZGItZGZkNzJhY2Q2NTMwIiwiZW1haWwiOiJ0aWVuLnF1YWNoLWRpbmhAYmFudmllbi5jb20udm4iLCJmaXJzdF9uYW1lIjoiRGluaCBUaWVuIiwibGFzdF9uYW1lIjoiUXVhY2giLCJ0ZW5hbnRfaWQiOiIyYTZiM2M0Ni1hMTVlLTQ0Y2QtYjE4ZS0xYWU5ZmVlM2ZjY2EiLCJvcmdfaWQiOiIwODQ5M2Q3NC04NDFlLTRkMzgtOTkyNC04MDFmN2UzYTllMGIifQ==");
        restTemplate.postForEntity("https://api-hcm.banvien.com.vn/mytimeapp/v1.0/check-in-out-app", req, Object.class);
        log.info("ending");
    }
}
