package com.prueba.com.controller;

import com.prueba.com.entity.Empresa;
import com.prueba.com.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmpresaController {

    @Autowired
    private EmpresaService empleadoService;

    @PostMapping("/empresas")
    public ResponseEntity<Empresa> agregarEmpleado(@RequestBody Empresa empleado){

         return new ResponseEntity<>(empleadoService.createEmpresa(empleado), HttpStatus.CREATED);
    }

    @GetMapping("/empresas")
  public ResponseEntity<List<Empresa>> listarEmpleados(){

    return ResponseEntity.ok().body(empleadoService.listAllEmpresa());

  }

  @GetMapping("/empresas/registro")
  public ResponseEntity<List<Empresa>> listarEmpleados(@RequestParam("limit") int limit){

    return ResponseEntity.ok().body(empleadoService.obtenerUltimosTresRegistros(limit));

  }

 }
