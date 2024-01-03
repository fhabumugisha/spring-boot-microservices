package com.buseni.planning;

import lombok.Builder;

import java.util.List;

@Builder
public record CreatePlanningDto(PlanningTypeEnum planningType, String title, List<PlanningItemDto> items) {
}
