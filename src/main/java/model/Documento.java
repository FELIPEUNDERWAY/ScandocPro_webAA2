package com.scandoc.model;

import jakarta.persistence.*;

/**
 * Clase que representa un documento en el sistema ScanDoc Pro.
 * Esta entidad es gestionada por Hibernate para persistencia en base de datos.
 * @author FELIPE
 * @version 1.0
 */
@Entity // Le indica a Hibernate que esta clase es una tabla
@Table(name = "documentos") // Nombre de la tabla en la base de datos
public class Documento {

    @Id // Define la llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ID autoincremental
    private Long id;

    @Column(nullable = false) // El nombre no puede ser nulo
    private String nombre;

    @Column(name = "tipo_archivo")
    private String tipo;

    /**
     * Constructor vacío obligatorio para el framework Hibernate.
     */
    public Documento() {
    }

    // Getters y Setters (Estándares de codificación para acceder a datos privados)
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
