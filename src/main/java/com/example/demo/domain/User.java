package com.example.demo.domain;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
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

    @NotBlank(message = "Số điện thoại không được để trống")
    @Pattern(regexp = "^(0|\\+84)(\\d{9})$", message = "Số điện thoại không hợp lệ, phải bắt đầu bằng 0 hoặc +84 và có 10 số")
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
