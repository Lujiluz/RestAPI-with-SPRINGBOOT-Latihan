package com.domain.model.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Entity // mendeklarasikan sebuah class sebagai entity class
@Table(name = "tbl_product") /*
                              * menyuruh JPA mencari tbl_product di db, jika tidak ada maka akan membuatnya
                              * dan menghubungan tabel tbl_product dengan class Product.java
                              */
@AllArgsConstructor
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id // annotation ini membuat atribut id jadi primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // membuat id menjadi auto-increment
    private long id;

    @Getter
    private String name;

    @Getter
    private String description;

    @Getter
    private double price;

}
