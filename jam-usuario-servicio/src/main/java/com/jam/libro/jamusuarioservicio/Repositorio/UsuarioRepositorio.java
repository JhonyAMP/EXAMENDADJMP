package com.jam.libro.jamusuarioservicio.Repositorio;

import com.jam.libro.jamusuarioservicio.Entidad.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
}
