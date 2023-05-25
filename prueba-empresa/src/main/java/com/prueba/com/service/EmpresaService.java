package com.prueba.com.service;

import com.prueba.com.entity.Empresa;

import java.util.List;

public interface EmpresaService {

    Empresa createEmpresa(Empresa empleado);
    List<Empresa> listAllEmpresa();

    List<Empresa> obtenerUltimosTresRegistros(int limit);



}
