package com.caysever.model;

import com.caysever.enums.GENDER;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.util.Date;

/**
 * Created by alican on 04.05.2017.
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Data
@ToString
public abstract class Employee {
    @Id @GeneratedValue(strategy = GenerationType.TABLE)
    protected Long id;
    @NotNull @Column(name = "name")
    protected String name;
    @NotNull @Column(name = "surname")
    protected String surname;
    @NotNull @Past @Column(name = "birthday")
    protected Date birthDay;
    @NotNull @Column(name = "gender")
    protected GENDER gender;
}
