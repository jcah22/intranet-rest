package com.intranet.intranet.service;

import java.util.List;
import java.util.Optional;

import com.intranet.intranet.models.Proveedor;

public interface IProveedorService {

    public List<Proveedor> listarTodosLosProveedores();

    public Proveedor guardarProveedor(Proveedor proveedor);

    public Optional<Proveedor> buscarProveedorPorId(Long id);

    public void eliminarProveedorPorId(Long id);

    public void actualizarProveedor(Long id, Proveedor proveedor);

}
