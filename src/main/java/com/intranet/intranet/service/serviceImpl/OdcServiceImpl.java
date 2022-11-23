package com.intranet.intranet.service.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intranet.intranet.models.Odc;
import com.intranet.intranet.repository.OdcRepository;
import com.intranet.intranet.service.IOdcService;

@Service
public class OdcServiceImpl implements IOdcService {

    @Autowired
    private OdcRepository odcRepository;

    @Override
    public List<Odc> listarTodosLasOdcs() {

        return odcRepository.findAll();
    }

    @Override
    public Odc guardarOdc(Odc odc) {

        return odcRepository.save(odc);
    }

    @Override
    public Optional<Odc> buscarOdcPorId(Long id) {

        return odcRepository.findById(id);
    }

    @Override
    public void eliminarOdcPorId(Long id) {

        odcRepository.findById(id);

    }

    @Override
    public List<Odc> buscarTodasLasOdcsPorQuery(int palabraClave) {

        return null;
    }

    @Override
    public void actualizarArea(Long id, Odc odc) {
        
        Odc odcTemp = odcRepository.findById(id).get();
        odcTemp.setCodigo(odc.getCodigo());
        odcTemp.setDescripcion(odc.getDescripcion());
        odcTemp.setFactura(odc.getFactura());
        odcTemp.setFecha(odc.getFecha());
        odcTemp.setFlete(odc.getFlete());
        odcTemp.setTotal(odc.getTotal());
        odcRepository.save(odcTemp);
        
    }

}
