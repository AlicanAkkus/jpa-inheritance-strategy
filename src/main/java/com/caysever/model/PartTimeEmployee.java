package com.caysever.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
@Data
@ToString(callSuper = true)
public class PartTimeEmployee extends Employee {
    @NotNull @Column(name = "hourly_age")
    protected Float hourlyWage;
}