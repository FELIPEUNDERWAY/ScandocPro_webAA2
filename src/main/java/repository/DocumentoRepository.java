package com.scandoc.repository;

import com.scandoc.model.Documento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Interfaz que define las operaciones de base de datos para la entidad Documento.
 * Al extender de JpaRepository, Spring implementa automáticamente los métodos
 * de guardar, eliminar y buscar.
 * @author FELIPE
 * @version 1.0
 */
@Repository // Indica que este componente maneja el acceso a datos
public interface DocumentoRepository extends JpaRepository<Documento, Long> {
    // Aquí podrías agregar búsquedas personalizadas en el futuro,
    // por ahora, JpaRepository ya nos da todo lo necesario.
}
