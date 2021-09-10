package com.example.gerenciadorcontatos.model.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Table(name = "user")
@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = -97814396482582593L;
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
    @Column(name = "user_pass")
    private String password;
    private String email;

    @Transient
    private Integer runTimeID;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}