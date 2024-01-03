package com.buseni.planning;

import java.time.LocalDate;

public record PlanningItemDto(LocalDate date, String president, String predicateur) {
}
