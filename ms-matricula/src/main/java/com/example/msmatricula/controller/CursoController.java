package com.example.msmatricula.controller;


import com.example.msmatricula.entity.Curso;
import com.example.msmatricula.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {
    @Autowired
    private CursoService cursoService;

    @GetMapping
    public ResponseEntity<List<Curso>> listar() {
        return ResponseEntity.ok(cursoService.listar());
    }

    @PostMapping
    public ResponseEntity<Curso> guardar(@RequestBody Curso curso) {
        return ResponseEntity.ok(cursoService.guardar(curso));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Curso> buscarPOrId(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok(cursoService.buscarPorId(id).get());
    }

    @PutMapping
    public ResponseEntity<Curso> actualizar(@RequestBody Curso curso) {
        return ResponseEntity.ok(cursoService.actualizar(curso));

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<List<Curso>> eliminar(@PathVariable(required = true) Integer id) {
        cursoService.eliminar(id);
        return ResponseEntity.ok(cursoService.listar());
    }
}
