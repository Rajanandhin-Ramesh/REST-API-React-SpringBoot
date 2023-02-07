package com.learnings.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Entity
    @Table(name = "employees")
    public class Employee {

        @Id
        @GeneratedValue(strategy=GenerationType.IDENTITY)
        public long id;


        @Column(name = "first_name")
        public String firstName;

        @Column(name = "last_name")
        public String lastName;

        @Column(name = "email_id")
        public String emailId;




}
