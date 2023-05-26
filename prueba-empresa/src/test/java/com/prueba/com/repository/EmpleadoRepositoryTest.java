package com.prueba.com.repository;

import com.prueba.com.entity.Empresa;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

@DataJpaTest
public class EmpleadoRepositoryTest {

     @Autowired
     private EmpresaRepository empresaRepository;

     private Empresa empresa;

     @BeforeEach
     public void setup(){
           empresa= Empresa.builder()
             .ruc("20494074169")
             .razonSocial("FERRETERIA E INVERSIONES A & G E.I.R.L.")
             .direccion("Jr Chiclayo 280")
             .estado(true)
             .build();

     }

     @DisplayName("JUnit prueba para guardar empresa")
     @Test
     public void obtenerEmpresa_guardar_returnGuardarEmpresaTest(){

       empresa= Empresa.builder()
         .ruc("20494074169")
         .razonSocial("INVERSIONES AZUL")
         .direccion("Jr Chiclayo 280")
         .estado(true)
         .build();

       //when
       Empresa savedEmpresa=empresaRepository.save(empresa);
       //then
       assertThat(savedEmpresa).isNotNull();
       assertThat(savedEmpresa.getIdEmpresa()).isGreaterThan(0);

     }
     @DisplayName("Junit obtener los 3 ultimos registros")
     @Test
     public void obtenerEmpresa_obtenerUltimosTresRegistrosTest(){

       Empresa empresa1= Empresa.builder()
         .ruc("20494074169")
         .razonSocial("INVERSIONES AZUL")
         .direccion("Jr Chiclayo 280")
         .estado(true)
         .build();

       Empresa empresa2= Empresa.builder()
         .ruc("20494074169")
         .razonSocial("INVERSIONES AZUL")
         .direccion("Jr Chiclayo 280")
         .estado(true)
         .build();

       empresaRepository.save(empresa);
       empresaRepository.save(empresa1);
       empresaRepository.save(empresa2);
       int limit= 3;

       //when
       List<Empresa> listEmpresa=empresaRepository.obtenerUltimosTresRegistros(limit);
       //then
       assertThat(listEmpresa).isNotNull();
       assertThat(listEmpresa.size()).isEqualTo(3);

     }





}
