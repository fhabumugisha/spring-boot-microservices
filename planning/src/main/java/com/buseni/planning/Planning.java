package com.buseni.planning;

import com.buseni.planning.PlanningItemDto;
import com.buseni.planning.PlanningTypeEnum;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Planning {
    @Id
    @GeneratedValue(strategy =  GenerationType.UUID)
    private UUID id;
    private PlanningTypeEnum planningType;

    private String title;

    private List<PlanningItemDto> planningItemDtoList;
}