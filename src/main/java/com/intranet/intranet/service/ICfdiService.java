package com.intranet.intranet.service;

import java.util.List;
import java.util.Optional;

import com.intranet.intranet.models.Cfdi;

public interface ICfdiService {

	public List<Cfdi> listarTodosLosCfdis();

	public Cfdi guardarCfdi(Cfdi cfdi);

	public Optional<Cfdi> buscarCfdiPorId(Long id);

	public void eliminarCfdiPorId(Long id);

	public List<Cfdi> buscarTodosLosCfdisPorQuery(int palabraClave);

	public void actualizarCfdi(Long id, Cfdi cfdi);

}
