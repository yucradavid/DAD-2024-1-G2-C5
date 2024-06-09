package com.example.msmonitoreo_asistencia.dto;

import lombok.Data;

import java.time.LocalDate;
@Data
public class DocenteDto {
    private Integer id;
    private String nombre;
    private LocalDate fechaNacimiento;
    private String direccion;
    private String telefono;
    private String email;
    private String especialidad;



}
