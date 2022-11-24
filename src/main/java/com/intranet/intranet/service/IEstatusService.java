package com.intranet.intranet.service;

import java.util.List;
import java.util.Optional;

import com.intranet.intranet.models.Estatus;

public interface IEstatusService {

    public List<Estatus> listarTodosLosEstatus();

	public Estatus guardarEstatus(Estatus estatus);

	public Optional<Estatus> buscarEstatusPorId(Long id);

	public void eliminarEstatusPorId(Long id);

	public List<Estatus> buscarTodasLosEstatusPorQuery(int palabraClave);

	public void actualizarEstatus(Long id, Estatus estatus);

    

}
