package com.intranet.intranet.service;

import java.util.List;
import java.util.Optional;

import com.intranet.intranet.models.Empresa;

public interface IEmpresaService {

	public List<Empresa> listarTodasLasEmpresas();

	public Empresa guardarEmpresa(Empresa empresa);

	public Optional<Empresa> buscarEmpresaPorId(Long id);

	public void eliminarEmpresaPorId(Long id);

	public void actualizarArea(Long id, Empresa empresa);

	

}
