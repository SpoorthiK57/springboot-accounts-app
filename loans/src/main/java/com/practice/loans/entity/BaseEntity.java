package com.practice.loans.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;


@MappedSuperclass
@Getter @Setter @ToString
public class BaseEntity {

    @Column(name="created_at")
    private LocalDate createdAt;

    @Column(name="created_by")
    private String createdBy;

    @Column(name="updated_at")
    private LocalDate updatedAt;

    @Column(name="updated_by")
    private String updatedBy;

}
