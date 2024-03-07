package org.talent.toDoList.dto;

import lombok.*;
import org.talent.toDoList.enumeration.RepeatType;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NewTaskRequest {

    private String label;
    private LocalTime startTime;
    private LocalTime endTime;
    private RepeatType repeatType;
    private int categoryID;

}
