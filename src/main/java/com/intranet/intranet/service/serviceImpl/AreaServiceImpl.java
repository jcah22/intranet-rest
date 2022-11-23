package com.intranet.intranet.service.serviceImpl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.intranet.intranet.models.Area;
import com.intranet.intranet.repository.AreaRepository;
import com.intranet.intranet.service.IAreaService;

@Service
public class AreaServiceImpl implements IAreaService {

    @Autowired
    private AreaRepository areaRepository;

    @Override
    public List<Area> listarTodasLasAreas() {

        return areaRepository.findAll();
    }

    @Override
    public Area guardarArea(Area area) {

        return areaRepository.save(area);
    }

    @Override
    public Optional<Area> buscarAreaPorId(Long id) {

        return areaRepository.findById(id);
    }

    @Override
    public List<Area> buscarTodasLasAreasPorQuery(int palabraClave) {

        return null;
    }

    @Override
    public void eliminarAreaPorId(Long id) {

        areaRepository.deleteById(id);

    }

    @Override
    public void actualizarArea(Long id, Area area) {
        Area areatemp = areaRepository.findById(id).get();
        areatemp.setNombre(area.getNombre());
        areaRepository.save(areatemp);
    }

}
