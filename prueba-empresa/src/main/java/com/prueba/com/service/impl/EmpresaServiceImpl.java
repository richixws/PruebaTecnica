package com.prueba.com.service.impl;

import com.prueba.com.entity.Empresa;
import com.prueba.com.repository.EmpresaRepository;
import com.prueba.com.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaServiceImpl implements EmpresaService {

  @Autowired
  private EmpresaRepository empleadoRepository;


  @Override
  public Empresa createEmpresa(Empresa empleado) {

    Empresa newEmpleado=empleadoRepository.save(empleado);
    return newEmpleado;

  }

  @Override
  public List<Empresa> listAllEmpresa() {
    return empleadoRepository.findAll();
  }

  @Override
  public List<Empresa> obtenerUltimosTresRegistros(int limit) {
    return empleadoRepository.obtenerUltimosTresRegistros(limit);
  }


}
