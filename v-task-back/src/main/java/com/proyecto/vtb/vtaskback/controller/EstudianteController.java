package com.proyecto.vtb.vtaskback.controller;

import com.proyecto.vtb.vtaskback.Service.api.EstudianteServiceAPI;
import com.proyecto.vtb.vtaskback.models.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Principal")
@CrossOrigin("*")
public class EstudianteController {

    @Autowired
    private EstudianteServiceAPI estudianteServiceAPI;

    @GetMapping("/Estudiantes")
    public List<Estudiante> getEstudiantes(){
         return estudianteServiceAPI.getAll();
    }

    @GetMapping("/Estudiante/{id}")
    public Estudiante buscarEstudiante(@PathVariable Long id){
        return estudianteServiceAPI.get(id);
    }


    @PostMapping("/AgregarEstudiante")
    public ResponseEntity <Estudiante> agregarEstudiante(@RequestBody Estudiante estudiante){
        Estudiante obj = estudianteServiceAPI.save(estudiante);
        return new ResponseEntity<Estudiante>(obj , HttpStatus.OK);
    }

    @DeleteMapping("/EliminarEstudiante/{id}")
    public ResponseEntity<Estudiante>eliminarEstudiante(@PathVariable Long id){
        Estudiante estudiante = estudianteServiceAPI.get(id);
        if (estudiante != null){
            estudianteServiceAPI.delete(id);
        }else{
            return new ResponseEntity<Estudiante>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<Estudiante>(estudiante , HttpStatus.OK);
    }
}
