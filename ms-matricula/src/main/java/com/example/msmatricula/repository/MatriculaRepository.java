package com.example.msmatricula.repository;

import com.example.msadmatricula.entity.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatriculaRepository extends JpaRepository<Matricula, Integer>{
    
}
