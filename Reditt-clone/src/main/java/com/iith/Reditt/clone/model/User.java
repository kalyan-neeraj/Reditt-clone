package com.iith.Reditt.clone.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.Instant;


@Data
@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    @NotBlank(message = "user name cannot be empty")
    private String username;
    @NotBlank(message = "Password cannot be empty")
    private String password;

    @Email
    @NotBlank(message = "Email cannot be empty")
    private String email;
    private Instant created;
    private boolean enabled;
}
