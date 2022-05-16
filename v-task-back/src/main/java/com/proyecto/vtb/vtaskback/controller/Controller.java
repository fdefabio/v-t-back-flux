package com.proyecto.vtb.vtaskback.controller;
import com.proyecto.vtb.vtaskback.models.Docente;
import com.proyecto.vtb.vtaskback.models.Examen;
import com.proyecto.vtb.vtaskback.repositories.DocenteRepository;
import com.proyecto.vtb.vtaskback.repositories.EstudianteRepository;
import com.proyecto.vtb.vtaskback.models.Estudiante;
import com.proyecto.vtb.vtaskback.repositories.ExamenRepository;
import org.springframework.beans.factory.annotation.Autowired;;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;


@RestController
@RequestMapping("/Principal")
@CrossOrigin("*")
public class Controller {

    @Autowired(required=true)
    private EstudianteRepository estudianteRepository;

    @Autowired
    private ExamenRepository examenRepository;

    @Autowired
    private DocenteRepository docenteRepository;





    //Metodos estudiante

    @GetMapping("/Estudiantes")
    public Flux<Estudiante> getEstudiantes(){
        return estudianteRepository.findAll();
    }

    @GetMapping("/Estudiante/{id}")
    public Mono<Estudiante> buscarEstudiante(@PathVariable String id){
        return estudianteRepository.findById(id);
    }
    @PutMapping("/ActualizarEstudiante")
    public Mono<Estudiante> actualizarEstudiante(@RequestBody Estudiante estudiante ){
        return estudianteRepository.save(estudiante);
    }

    @PostMapping("/AgregarEstudiante")
    public Mono<Estudiante> agregarEstudiante(@RequestBody Estudiante estudiante){
        return estudianteRepository.save(estudiante);
    }

    @DeleteMapping("/eliminarEstudiante/{id}")
    public Mono<Void> eliminarEstudiante(@PathVariable String id){
        return  estudianteRepository.deleteById(id);
    }





    //Metodos examen

    @PostMapping("/AgregarExamen")
    public Mono<Examen> agregarExamen(@RequestBody Examen examen){
        return examenRepository.save(examen);
    }

    @GetMapping("/Examenes")
    public Flux<Examen> getExamenes(){
        return examenRepository.findAll();
    }

    @GetMapping("/MisExamenes/{id}")
    public Flux<Examen> getExamenesById(@PathVariable String id){
        return examenRepository.findByIdEstudiante(id);
    }


    @PutMapping("/ActualizarExamen")
    public Mono<Examen> actualizarExamen(@RequestBody Examen examen){
        return examenRepository.save(examen);
    }

    @GetMapping("/Examen/{id}")
    public Mono<Examen> buscarExamen(@PathVariable String id){
        return examenRepository.findById(id);
    }

    @DeleteMapping("/eliminarExamen/{id}")
    public Mono<Void> eliminarExamen(@PathVariable String id){
        return  examenRepository.deleteById(id);
    }





    //Metodos docente

    @PostMapping("/AgregarDocente")
    public Mono<Docente> agregarDocente(@RequestBody Docente docente){
        return docenteRepository.save(docente);
    }

    @GetMapping("/Docentes")
    public Flux<Docente> getDocentes(){
        return docenteRepository.findAll();
    }

    @PutMapping("/ActualizarDocente")
    public Mono<Docente> actualizarExamen(@RequestBody Docente docente){
        return docenteRepository.save(docente);
    }

    @GetMapping("/Docente/{id}")
    public Mono<Docente> buscarDocente(@PathVariable String id){
        return docenteRepository.findById(id);
    }

    @DeleteMapping("/eliminarDocente/{id}")
    public Mono<Void> eliminarDocente(@PathVariable String id){
        return  docenteRepository.deleteById(id);
    }



}
