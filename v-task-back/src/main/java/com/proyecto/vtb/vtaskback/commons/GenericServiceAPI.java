package com.proyecto.vtb.vtaskback.commons;

import java.io.Serializable;
import java.util.List;

public interface GenericServiceAPI<T , String extends Serializable>{
    T save(T entity);
    void delete(String id);
    T get(String id);
    List<T> getAll();
}
