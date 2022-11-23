package com.intranet.intranet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intranet.intranet.models.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa,Long>{
    
}
