package com.buseni.planning;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1/plannings")
public record PlanningController (PlanningService planningService){


    @PostMapping
    public void addPlanning(@RequestBody CreatePlanningDto createPlanningDto){
        log.info("New planning {} " , createPlanningDto);
        planningService.addPlanning(createPlanningDto);
    }
}
