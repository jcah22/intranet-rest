package com.intranet.intranet.service;

import java.util.List;
import java.util.Optional;

import com.intranet.intranet.models.Directivo;

public interface IDirectivoService {

	public List<Directivo> listarTodosLosDirectivos();

	public Directivo guardarDirectivo(Directivo directivo);

	public Optional<Directivo> buscarDirectivoPorId(Long id);

	public void eliminarDirectivoPorId(Long id);

	public List<Directivo> buscarTodosLosDirectivosPorQuery(int palabraClave);

	public	void actualizarDirectivo(Long id, Directivo d);

}
