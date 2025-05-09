package com.certidevs.entities;

import jakarta.persistence.*;

@Entity //Indica que esta clase es una tabla
@Table(name = "asignaturas")
public class Asignatura {

    @Id //Indica que este atributo es la clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Indica que el valor de la clave primaria se genera automáticamente
    private Long id;

    @Column(nullable = false)
    private String nombre;

    private String descripcion;

    private String nombreDocente;

    private Integer creditos;

    private Boolean optativa;

    //constructor vacio
    public Asignatura() {}

    //constructor con parámetros
    public Asignatura(String nombre, String descripcion, String nombreDocente, Integer creditos, Boolean optativa) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.nombreDocente = nombreDocente;
        this.creditos = creditos;
        this.optativa = optativa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombreDocente() {
        return nombreDocente;
    }

    public void setNombreDocente(String nombreDocente) {
        this.nombreDocente = nombreDocente;
    }

    public Integer getCreditos() {
        return creditos;
    }

    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }

    public Boolean getOptativa() {
        return optativa;
    }

    public void setOptativa(Boolean optativa) {
        this.optativa = optativa;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", nombreDocente='" + nombreDocente + '\'' +
                ", creditos=" + creditos +
                ", optativa=" + optativa +
                '}';
    }
}

