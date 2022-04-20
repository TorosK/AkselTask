package com.example.aksel_jpa;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
//@Table(name="Persons", schema="Persons")
public class Person {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer person_ID;

    //@Column(name="person_first_name")
    private String person_first_name;

    //@Column(name="person_last_name")
    private String person_last_name;

    //@Column(name="person_birthdate")
    private String person_birthdate;

    //@Column(name="person_address")
    private String person_address;


    // fields, getters, setters

}
