package com.intranet.intranet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intranet.intranet.models.Req;

public interface ReqRepository extends JpaRepository<Req,Long>{
    
}
