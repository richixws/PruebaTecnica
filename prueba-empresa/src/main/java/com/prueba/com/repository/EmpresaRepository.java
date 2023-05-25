package com.prueba.com.repository;

import com.prueba.com.entity.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmpresaRepository extends JpaRepository<Empresa,Long> {

    @Query(value = "SELECT * FROM Empresa order by Id_Empresa desc limit :limit", nativeQuery = true)
    List<Empresa> obtenerUltimosTresRegistros(@Param("limit") int limit);

}
