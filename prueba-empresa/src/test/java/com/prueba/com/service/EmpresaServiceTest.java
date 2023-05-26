package com.prueba.com.service;

import com.prueba.com.entity.Empresa;
import com.prueba.com.repository.EmpresaRepository;
import com.prueba.com.service.impl.EmpresaServiceImpl;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.mockito.BDDMockito.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class EmpresaServiceTest{

    @Mock
    private EmpresaRepository empresaRepository;

    @InjectMocks
    private EmpresaServiceImpl empresaService;

    private Empresa empresa;

    @BeforeEach
    public void  setup(){
          empresa=Empresa.builder()
            .idEmpresa(1)
            .ruc("20494074169")
            .razonSocial("FERRETERIA UMBRAL")
            .direccion("Jr chota 250")
            .estado(true)
            .build();
    }

    @DisplayName("Junit prueba metodo test para guardar empresa")
    @Test
    public void  obtenerObjetoEmpresa_WhenGuardarEmpresa_thenRetornarObjetoEmpresaTest(){

      //given
      given(empresaRepository.save(empresa)).willReturn(empresa);
      System.out.println(empresaRepository);
      System.out.println(empresaService);

      //when
      Empresa savedEmpresa= empresaService.createEmpresa(empresa);
      System.out.println(savedEmpresa);
      //then
      assertThat(savedEmpresa).isNotNull();

    }
    @DisplayName("Junit prueba para obtener el registro de los 3 ultimos")
    @Test
    public void  givenEmpresaList_whenObtenerUltimosTresRegistros_thenReturnEmpresaList(){

      Empresa empresa1= Empresa.builder()
        .ruc("20494074169")
        .razonSocial("INVERSIONES AZUL")
        .direccion("Jr Chiclayo 280")
        .estado(true)
        .build();

      Empresa empresa2= Empresa.builder()
        .ruc("20494074456")
        .razonSocial("INVERSIONES NEON")
        .direccion("Jr CHOTA 280")
        .estado(true)
        .build();

       given(empresaRepository.obtenerUltimosTresRegistros(3)).willReturn(Arrays.asList(empresa,empresa1,empresa2));
       //when
       List<Empresa> empresaList=empresaService.obtenerUltimosTresRegistros(3);

       //then
       assertThat(empresaList).isNotNull();
       assertThat(empresaList.size()).isEqualTo(3);


    }






}
