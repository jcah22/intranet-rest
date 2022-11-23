package com.intranet.intranet.service.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intranet.intranet.models.Directivo;
import com.intranet.intranet.repository.DirectivoRepository;
import com.intranet.intranet.service.IDirectivoService;

@Service
public class DirectivoServiceImpl implements IDirectivoService {

    @Autowired
    private DirectivoRepository directivoRepository;

    @Override
    public List<Directivo> listarTodosLosDirectivos() {

        return directivoRepository.findAll();
    }

    @Override
    public Directivo guardarDirectivo(Directivo directivo) {

        return directivoRepository.save(directivo);
    }

    @Override
    public Optional<Directivo> buscarDirectivoPorId(Long id) {

        return directivoRepository.findById(id);
    }

    @Override
    public void eliminarDirectivoPorId(Long id) {

        directivoRepository.deleteById(id);

    }

    @Override
    public List<Directivo> buscarTodosLosDirectivosPorQuery(int palabraClave) {

        return null;
    }

    @Override
    public void actualizarDirectivo(Long id, Directivo d) {
        Directivo directivoTemp = directivoRepository.findById(id).get();
        directivoTemp.setNombre(d.getNombre());
        directivoRepository.save(directivoTemp);
        
    }

}
