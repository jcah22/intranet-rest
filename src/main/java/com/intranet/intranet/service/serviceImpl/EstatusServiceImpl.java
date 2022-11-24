package com.intranet.intranet.service.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intranet.intranet.models.Estatus;
import com.intranet.intranet.repository.EstatusRepository;
import com.intranet.intranet.service.IEstatusService;

@Service
public class EstatusServiceImpl implements IEstatusService {

    @Autowired
    private EstatusRepository estatusRepository;

    @Override
    public List<Estatus> listarTodosLosEstatus() {

        return estatusRepository.findAll();
    }

    @Override
    public Estatus guardarEstatus(Estatus estatus) {

        return estatusRepository.save(estatus);
    }

    @Override
    public Optional<Estatus> buscarEstatusPorId(Long id) {

        return estatusRepository.findById(id);
    }

    @Override
    public void eliminarEstatusPorId(Long id) {

        estatusRepository.deleteById(id);

    }

    @Override
    public List<Estatus> buscarTodasLosEstatusPorQuery(int palabraClave) {

        return null;
    }

    @Override
    public void actualizarEstatus(Long id, Estatus estatus) {
        Estatus estatusTemp = estatusRepository.findById(id).get();
        estatusTemp.setNombre(estatus.getNombre());
        estatusRepository.save(estatusTemp);
    }

}
