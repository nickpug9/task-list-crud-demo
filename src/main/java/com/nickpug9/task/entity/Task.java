package com.nickpug9.task.entity;

import lombok.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idtask;
    private String taskname;
    private String taskdescription;
    private String taskcategory;
}
