package com.intranet.intranet.service;

import java.util.List;
import java.util.Optional;

import com.intranet.intranet.models.Req;

public interface IReqService {

    public List<Req> listarTodasLasReqs();

	public Req guardarReq(Req req);

	public Optional<Req> buscarReqPorId(Long id);

	public void eliminarReqPorId(Long id);

	public List<Req> buscarTodasLasReqsPorQuery(int palabraClave);

	public	void actualizarReq(Long id, Req req);
    
}
