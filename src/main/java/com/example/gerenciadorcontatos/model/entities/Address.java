package com.example.gerenciadorcontatos.model.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Table(name = "address")
@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Address implements Serializable {
    private static final long serialVersionUID = -8769564640723437313L;
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String street;
    @Column(nullable = false)
    private Integer number;
    private String complement;
    private String district;
    @Column(nullable = false, length = 9)
    private String cep;
    @Column(nullable = false)
    private String city;
    @Column(nullable = false)
    private String state;

    @ManyToOne
    private Contact contact;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Address address = (Address) o;
        return Objects.equals(id, address.id);
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "street = " + street + ", " +
                "number = " + number + ", " +
                "complement = " + complement + ", " +
                "district = " + district + ", " +
                "cep = " + cep + ", " +
                "city = " + city + ", " +
                "state = " + state + ")";
    }
}