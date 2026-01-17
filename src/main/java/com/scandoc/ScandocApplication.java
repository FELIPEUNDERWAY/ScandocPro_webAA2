package com.scandoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Esta es la clase principal que inicia toda la aplicación ScanDoc Pro.
 * Gracias a la anotación @SpringBootApplication, el sistema sabe que debe
 * activar Spring e Hibernate automáticamente.
 * * @author FELIPE
 * @version 1.0
 */
@SpringBootApplication // Esta etiqueta "mágica" configura todo el Framework por ti
public class ScandocApplication {

    /**
     * El método main es el primer código que ejecuta Java al iniciar.
     * @param args Argumentos de inicio (opcionales)
     */
    public static void main(String[] args) {
        // Esta línea le dice a Spring: "Arranca el proyecto ScanDoc"
        SpringApplication.run(ScandocApplication.class, args);
    }
}
