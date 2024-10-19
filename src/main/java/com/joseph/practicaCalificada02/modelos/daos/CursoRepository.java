package com.joseph.practicaCalificada02.modelos.daos;

import com.joseph.practicaCalificada02.modelos.entidades.Curso;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CursoRepository extends MongoRepository<Curso, String> {

}
