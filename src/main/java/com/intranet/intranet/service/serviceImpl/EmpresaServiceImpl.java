package com.intranet.intranet.service.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intranet.intranet.models.Empresa;
import com.intranet.intranet.repository.EmpresaRepository;
import com.intranet.intranet.service.IEmpresaService;

@Service
public class EmpresaServiceImpl implements IEmpresaService {

    @Autowired
    private EmpresaRepository empresaRepository;

    @Override
    public List<Empresa> listarTodasLasEmpresas() {

        return empresaRepository.findAll();
    }

    @Override
    public Empresa guardarEmpresa(Empresa empresa) {

        return empresaRepository.save(empresa);
    }

    @Override
    public Optional<Empresa> buscarEmpresaPorId(Long id) {

        return empresaRepository.findById(id);
    }

    @Override
    public void eliminarEmpresaPorId(Long id) {

        empresaRepository.deleteById(id);

    }

    @Override
    public void actualizarArea(Long id, Empresa empresa) {
        Empresa empTemp = empresaRepository.findById(id).get();
        empTemp.setCorreo(empresa.getCorreo());
        empTemp.setDireccion(empresa.getDireccion());
        empTemp.setNombre(empresa.getNombre());
        empTemp.setRfc(empresa.getRfc());
        empTemp.setTelefono(empresa.getTelefono());
        empresaRepository.save(empTemp);
    }

}
