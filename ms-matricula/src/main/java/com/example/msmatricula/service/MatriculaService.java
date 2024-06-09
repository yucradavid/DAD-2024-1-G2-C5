package com.example.msmatricula.service;


import com.example.msmatricula.entity.Matricula;

import java.util.List;
import java.util.Optional;

public interface MatriculaService {
    public List<Matricula> lista();
    
    public Matricula guardar(Matricula matricula);

    public Optional<Matricula> buscarPorId(Integer id);

    public Matricula actualizar(Matricula matricula);

    public void eliminar(Integer id);
}
