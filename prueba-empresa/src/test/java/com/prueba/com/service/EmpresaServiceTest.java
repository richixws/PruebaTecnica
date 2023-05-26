package com.prueba.com.service;

import com.prueba.com.entity.Empresa;
import com.prueba.com.repository.EmpresaRepository;
import com.prueba.com.service.impl.EmpresaServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class EmpresaServiceTest{

    @Mock
    private EmpresaRepository empresaRepository;

    @InjectMocks
    private EmpresaServiceImpl empresaService;

    private Empresa empresa;

    @BeforeEach
    public void  setup(){


    }






}
