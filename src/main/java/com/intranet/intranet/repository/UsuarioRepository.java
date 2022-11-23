package com.intranet.intranet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intranet.intranet.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Long>{
    
}
