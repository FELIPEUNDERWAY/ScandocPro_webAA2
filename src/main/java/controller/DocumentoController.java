package com.scandoc.controller;

import com.scandoc.model.Documento;
import com.scandoc.repository.DocumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Clase controladora para gestionar las peticiones web de documentos.
 * Utiliza Spring MVC para exponer servicios REST.
 * @author FELIPE
 * @version 1.0
 */
@RestController
@RequestMapping("/api/documentos") // Ruta principal del módulo
public class DocumentoController {

    @Autowired // Spring "inyecta" el repositorio automáticamente aquí
    private DocumentoRepository documentoRepository;

    /**
     * Método para obtener la lista de todos los documentos.
     * @return Lista de objetos Documento
     */
    @GetMapping
    public List<Documento> listarTodos() {
        return documentoRepository.findAll();
    }

    /**
     * Método para registrar un nuevo documento en el sistema.
     * @param documento Objeto documento enviado desde la web
     * @return El documento guardado con su ID generado
     */
    @PostMapping
    public Documento guardar(@RequestBody Documento documento) {
        return documentoRepository.save(documento);
    }
}
