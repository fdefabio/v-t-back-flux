package com.proyecto.vtb.vtaskback.controller;
import com.proyecto.vtb.vtaskback.models.Examen;
import com.proyecto.vtb.vtaskback.repositories.EstudianteRepository;
import com.proyecto.vtb.vtaskback.models.Estudiante;
import com.proyecto.vtb.vtaskback.repositories.ExamenRepository;
import org.springframework.beans.factory.annotation.Autowired;;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/Principal")
@CrossOrigin("*")
public class Controller {

    @Autowired(required=true)
    private EstudianteRepository estudianteRepository;

    @Autowired
    private ExamenRepository examenRepository;


    //Metodos estudiante

    @GetMapping("/Estudiantes")
    public Flux<Estudiante> getEstudiantes(){
         return estudianteRepository.findAll();
    }

    @GetMapping("/Estudiante/{id}")
    public Mono<Estudiante> buscarEstudiante(@PathVariable String id){

        return estudianteRepository.findById(id);
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


    @GetMapping("/Examen/{id}")
    public Mono<Examen> buscarExamen(@PathVariable String id){

        return examenRepository.findById(id);
    }

    @DeleteMapping("/eliminarExamen/{id}")
    public Mono<Void> eliminarExamen(@PathVariable String id){
        return  examenRepository.deleteById(id);
    }



}
