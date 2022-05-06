package com.proyecto.vtb.vtaskback.impl;

import com.proyecto.vtb.vtaskback.DAO.api.EstudianteRepository;
import com.proyecto.vtb.vtaskback.Service.api.EstudianteServiceAPI;
import com.proyecto.vtb.vtaskback.commons.GenericServiceImpl;
import com.proyecto.vtb.vtaskback.models.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
@Service
public class EstudianteServiceImpl extends GenericServiceImpl<Estudiante , Long> implements EstudianteServiceAPI {

    @Autowired
    private EstudianteRepository estudianteRepository;
    @Override
    public CrudRepository<Estudiante, Long> getDao() {
        return estudianteRepository;
    }


}
