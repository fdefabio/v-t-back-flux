package com.proyecto.vtb.vtaskback.commons;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public abstract class GenericServiceImpl<T , ID extends Serializable> implements GenericServiceAPI<T , ID> {

    private static final Logger log = LoggerFactory.getLogger(GenericServiceImpl.class);

    @Override
    public T save(T entity) {
        return null/*getDao().save(entity)*/;
    }

    @Override
    public void delete(ID id) {
        getDao().deleteById(id);
    }

    @Override
    public T get(ID id) {
       /* Optional<T> obj = getDao().findById(id);
        if(obj.isPresent()){
            return obj.get();
        }*/
        return null;
    }

    @Override
    public List<T> getAll() {
        List<T> returnList = new ArrayList<>();
        Flux.fromIterable(returnList).subscribe();
        return returnList;
    }

    public abstract ReactiveMongoRepository <T, ID> getDao();
}
