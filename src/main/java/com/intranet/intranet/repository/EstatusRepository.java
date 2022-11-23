package com.intranet.intranet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intranet.intranet.models.Estatus;

public interface EstatusRepository extends JpaRepository<Estatus,Long> {
    
}
