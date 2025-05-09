package com.certidevs.entities;

import jakarta.persistence.*;

@Entity
@Table (name= "libros") //Personaliza el nombre de la tabla
public class Libro {

    @Id //Indica que este atributo es la clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Indica que el valor de la clave primaria se genera automáticamente
    private Long id;

    @Column(nullable = false)
    private String titulo;

    private String autor;

    private Integer numeroPaginas;

    private Boolean disponible;

    //constructor vacio
    public Libro() {}

    //constructor con parámetros
    public Libro(String titulo, String autor, Integer numeroPaginas, Boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.disponible = disponible;
    }

    //getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(Integer numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                ", disponible=" + disponible +
                '}';
    }
}
