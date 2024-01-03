package com.buseni.planning;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PlanningServiceImpl implements PlanningService {

    private final  PlanningRepo planningRepo;

    public PlanningServiceImpl(PlanningRepo planningRepo) {
        this.planningRepo = planningRepo;
    }

    @Override
    public void addPlanning(CreatePlanningDto createPlanningDto) {
        var planning = Planning.builder()
                .planningType(createPlanningDto.planningType())
                .title(createPlanningDto.title())
                .planningItemDtoList(createPlanningDto.items())
                .build();
        //TODO Save database
        planningRepo.save(planning);
        //TODO Call notification service

    }
}
