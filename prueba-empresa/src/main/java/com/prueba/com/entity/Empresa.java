package com.prueba.com.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "empresa")
public class Empresa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idEmpresa;

    @Column(length = 11)
    private String ruc;

    @Column(length = 255,name = "razon_social")
    private String razonSocial;

    @Column(length = 255)
    private String direccion;

    private boolean estado;

  public long getIdEmpresa() {
    return idEmpresa;
  }

  public void setIdEmpresa(long idEmpresa) {
    this.idEmpresa = idEmpresa;
  }

  public String getRuc() {
    return ruc;
  }

  public void setRuc(String ruc) {
    this.ruc = ruc;
  }

  public String getRazonSocial() {
    return razonSocial;
  }

  public void setRazonSocial(String razonSocial) {
    this.razonSocial = razonSocial;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public boolean isEstado() {
    return estado;
  }

  public void setEstado(boolean estado) {
    this.estado = estado;
  }
}
