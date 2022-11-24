package com.intranet.intranet.service.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intranet.intranet.models.Proveedor;
import com.intranet.intranet.repository.ProveedorRepository;
import com.intranet.intranet.service.IProveedorService;

@Service
public class ProveedorServiceImpl implements IProveedorService{

    @Autowired
    private ProveedorRepository proveedorRepository;

    @Override
    public List<Proveedor> listarTodosLosProveedores() {
        
        return proveedorRepository.findAll();

    }

    @Override
    public Proveedor guardarProveedor(Proveedor proveedor) {
        
        return proveedorRepository.save(proveedor);
    }

    @Override
    public Optional<Proveedor> buscarProveedorPorId(Long id) {
        
        return proveedorRepository.findById(id);
    }

    @Override
    public void eliminarProveedorPorId(Long id) {
        proveedorRepository.deleteById(id);
        
    }

    @Override
    public void actualizarProveedor(Long id, Proveedor proveedor) {
        Proveedor proveTemp = proveedorRepository.findById(id).get();
        proveTemp.setCorreo(proveedor.getCorreo());
        proveTemp.setDireccion(proveedor.getDireccion());
        proveTemp.setNombre(proveedor.getNombre());
        proveedorRepository.save(proveTemp);
        
    }
    
}
