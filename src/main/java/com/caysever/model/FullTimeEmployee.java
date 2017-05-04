package com.caysever.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

/**
 * Created by alican on 04.05.2017.
 */
@Entity
@Data
@ToString(callSuper = true)
public class FullTimeEmployee extends Employee {
    @NotNull @Column(name = "total_working_hours_of_week")
    private int totalWorkingHoursOfWeek;

}
