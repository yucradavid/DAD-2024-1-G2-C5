package com.example.msmatricula.repository;

import com.example.msadmatricula.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Integer>{
    
}
