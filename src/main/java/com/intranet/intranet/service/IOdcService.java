package com.intranet.intranet.service;

import java.util.List;
import java.util.Optional;

import com.intranet.intranet.models.Odc;

public interface IOdcService {

	public List<Odc> listarTodosLasOdcs();

	public Odc guardarOdc(Odc odc);

	public Optional<Odc> buscarOdcPorId(Long id);

	public void eliminarOdcPorId(Long id);

	public List<Odc> buscarTodasLasOdcsPorQuery(int palabraClave);

	public void actualizarArea(Long id, Odc odc);

}
