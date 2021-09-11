package com.example.gerenciadorcontatos.model.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Table(name = "contact")
@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Contact implements Serializable {
    private static final long serialVersionUID = -6161396019363333376L;
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false, unique = true, length = 9)
    private String rg;
    @Column(nullable = false, unique = true, length = 14)
    private String cpf;

    @JsonIgnore
    @OneToMany(cascade = {CascadeType.ALL}, mappedBy = "contact")
    private List<Address> address = new ArrayList<>();

    @ManyToOne(cascade = CascadeType.ALL)
    private User user;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Contact contact = (Contact) o;
        return Objects.equals(id, contact.id);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}