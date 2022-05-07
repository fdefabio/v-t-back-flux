package com.proyecto.vtb.vtaskback.controller;
import com.proyecto.vtb.vtaskback.DAO.EstudianteRepository;
import com.proyecto.vtb.vtaskback.models.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/Principal")
@CrossOrigin("*")
public class EstudianteController {

    @Autowired
    private EstudianteRepository estudianteRepository;

    @GetMapping("/Estudiantes")
    public Flux<Estudiante> getEstudiantes(){
         return estudianteRepository.findAll();
    }

   /* @GetMapping("/Estudiante/{id}")
    public Estudiante buscarEstudiante(@PathVariable Long id){
        return estudianteServiceAPI.get(id);
    }*/


    @PostMapping("/AgregarEstudiante")
    public Mono<Estudiante> agregarEstudiante(@RequestBody Estudiante estudiante){

        return estudianteRepository.save(estudiante);
    }

  /*  @DeleteMapping("/EliminarEstudiante/{id}")
    public ResponseEntity<Estudiante>eliminarEstudiante(@PathVariable Long id){
        Estudiante estudiante = estudianteServiceAPI.get(id);
        if (estudiante != null){
            estudianteServiceAPI.delete(id);
        }else{
            return new ResponseEntity<Estudiante>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<Estudiante>(estudiante , HttpStatus.OK);
    }*/
}
