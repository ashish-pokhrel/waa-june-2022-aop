package com.example.aop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {
        @Id
        @GeneratedValue
        private int id;
        private String email;
        private String password;
        private String firstname;
        private String lastname;
}
