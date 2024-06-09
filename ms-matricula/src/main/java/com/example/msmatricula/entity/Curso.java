package com.example.msmatricula.entity;

import com.example.msmatricula.dto.DocenteDto;
import com.example.msmatricula.dto.EstudianteDto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String descripcion;
    private String periodo;

    @Transient
    private DocenteDto docenteDto ;

    @Transient
    private EstudianteDto estudianteDto ;

}
