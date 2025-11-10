package com.example.demo.domain;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank(message = "ko duoc de trong")
    private String name;

    @Email(message = "Email is not valid", regexp = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")
    @NotEmpty(message = "email ko dc de trong")
    private String email;

    @NotBlank(message = "ko dc de trong")
    private String password;

    @NotBlank(message = "ko dc de trong")
    private String phone;

   private int age;

   @Enumerated(EnumType.STRING)
   private GenderEnum gender;

   private String address;

   private Instant createdAt;

   private Instant updatedAt;

   private String createdBy;

   private String updatedBy;

   @PrePersist
   public void handleBeforeCreate(){

   }

    @PreUpdate
    public void handleBeforeUpdate(){

    }
}
