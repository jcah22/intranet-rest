package com.intranet.intranet.service.serviceImpl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.intranet.intranet.models.Cfdi;
import com.intranet.intranet.repository.CfdiRepository;
import com.intranet.intranet.service.ICfdiService;

@Service
public class CfdiServiceImpl implements ICfdiService {

    @Autowired
    private CfdiRepository cfdiRepository;

    @Override
    public List<Cfdi> listarTodosLosCfdis() {

        return cfdiRepository.findAll();
    }

    @Override
    public Cfdi guardarCfdi(Cfdi cfdi) {

        return cfdiRepository.save(cfdi);
    }

    @Override
    public Optional<Cfdi> buscarCfdiPorId(Long id) {

        return cfdiRepository.findById(id);
    }

    @Override
    public void eliminarCfdiPorId(Long id) {

        cfdiRepository.deleteById(id);

    }

    @Override
    public List<Cfdi> buscarTodosLosCfdisPorQuery(int palabraClave) {

        return null;
    }

    @Override
    public void actualizarCfdi(Long id, Cfdi cfdi) {
        Cfdi cfdiTemp = cfdiRepository.findById(id).get();
        cfdiTemp.setCodigo(cfdi.getCodigo());
        cfdiTemp.setNombre(cfdi.getNombre());
        cfdiRepository.save(cfdiTemp);

    }

}
