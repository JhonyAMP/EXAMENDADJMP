package com.jam.libro.jamlibroservicio.Repositorio;

import com.jam.libro.jamlibroservicio.Entidad.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepositorio extends JpaRepository<Libro, Long> {
}