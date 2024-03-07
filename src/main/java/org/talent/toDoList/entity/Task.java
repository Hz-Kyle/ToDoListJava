package org.talent.toDoList.entity;

import jakarta.persistence.*;
import lombok.*;
import org.talent.toDoList.enumeration.RepeatType;

import java.time.LocalTime;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String label;
    private LocalTime startTime;
    private LocalTime endTime;


    @Enumerated(EnumType.STRING)
    private RepeatType repeatType;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Category category;

}
