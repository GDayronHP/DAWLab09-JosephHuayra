package com.joseph.practicaCalificada02.modelos.daos;

import com.joseph.practicaCalificada02.modelos.entidades.Alumno;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AlumnoRepository extends MongoRepository<Alumno, String> {

}
