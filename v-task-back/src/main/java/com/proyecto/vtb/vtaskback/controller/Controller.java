package com.proyecto.vtb.vtaskback.controller;
import com.proyecto.vtb.vtaskback.models.*;
import com.proyecto.vtb.vtaskback.repositories.DocenteRepository;
import com.proyecto.vtb.vtaskback.repositories.EstudianteRepository;
import com.proyecto.vtb.vtaskback.repositories.ExamenRepository;
import com.proyecto.vtb.vtaskback.repositories.ExameRealizadoRepository;
import com.proyecto.vtb.vtaskback.repositories.GrupoRepository;
import org.springframework.beans.factory.annotation.Autowired;;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;


@RestController
@RequestMapping("/Principal")
@CrossOrigin("*")
public class Controller {

    @Autowired
    private EstudianteRepository estudianteRepository;

    @Autowired
    private ExamenRepository examenRepository;

    @Autowired
    private DocenteRepository docenteRepository;


    @Autowired
    private GrupoRepository gruposRepository;

    @Autowired
    private ExameRealizadoRepository exameRealizadoRepository;





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



    //Metodos examen realizado

    @GetMapping("/BuscarExamenPorId/{id}")
    public Flux<ExamenRealizado> ExamenesRealizadosPorId(@PathVariable String id){
        return exameRealizadoRepository.findByUsuarioId(id);
    }

    @PostMapping("/ResponderExamen")
    public Mono<ExamenRealizado> ResponderExamen(@RequestBody ExamenRealizado examen){
        return exameRealizadoRepository.save(examen);
    }

    @PutMapping("/calificarExamen")
    public Mono<ExamenRealizado> calificarExamen(@RequestBody ExamenRealizado examen){
        return exameRealizadoRepository.save(examen);
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




    //Metodos Grupos

    @PostMapping("/AgregarGrupo")
    public Mono<Grupos> agregarGrupo(@RequestBody Grupos grupo){
        return gruposRepository.save(grupo);
    }

    @GetMapping("/Grupos")
    public Flux<Grupos> getGrupo(){
        return gruposRepository.findAll();
    }

    @PutMapping("/ActualizarGrupo")
    public Mono<Grupos> actualizarGrupo(@RequestBody Grupos grupo){
        return gruposRepository.save(grupo);
    }

    @GetMapping("/Grupo/{id}")
    public Mono<Grupos> buscarGrupo(@PathVariable String id){
        return gruposRepository.findById(id);
    }

    @DeleteMapping("/eliminarGrupo/{id}")
    public Mono<Void> eliminarGrupo(@PathVariable String id){
        return  gruposRepository.deleteById(id);
    }


}
