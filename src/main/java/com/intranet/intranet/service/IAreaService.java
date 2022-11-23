package com.intranet.intranet.service;

import java.util.List;
import java.util.Optional;

import com.intranet.intranet.models.Area;

public interface IAreaService {

	public List<Area> listarTodasLasAreas();

	public Area guardarArea(Area area);

	public Optional<Area> buscarAreaPorId(Long id);

	public void eliminarAreaPorId(Long id);

	public List<Area> buscarTodasLasAreasPorQuery(int palabraClave);

	public void actualizarArea(Long id, Area area);

}
