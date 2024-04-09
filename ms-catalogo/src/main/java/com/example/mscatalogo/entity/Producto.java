package com.example.mscatalogo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String descripcion;
    private BigDecimal precio;
    private LocalDate fecha_creacion;
    private LocalDate fecha_fin;
    @ManyToOne
    private Categoria categoria;
}
