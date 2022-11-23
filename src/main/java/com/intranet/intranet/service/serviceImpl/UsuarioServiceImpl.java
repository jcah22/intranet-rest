package com.intranet.intranet.service.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intranet.intranet.models.Usuario;
import com.intranet.intranet.repository.UsuarioRepository;
import com.intranet.intranet.service.IUsuarioService;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> listarTodosLosUsuarios() {

        return usuarioRepository.findAll();
    }

    @Override
    public Usuario guardarUsuario(Usuario usuario) {

        return usuarioRepository.save(usuario);
    }

    @Override
    public Optional<Usuario> buscarUsuarioPorId(Long id) {

        return usuarioRepository.findById(id);
    }

    @Override
    public void eliminarUsuarioPorId(Long id) {

        usuarioRepository.deleteById(id);

    }

    @Override
    public List<Usuario> buscarTodosLosUsuariosPorQuery(int palabraClave) {

        return null;
    }

    @Override
    public void actualizarUsuario(Long id, Usuario usuario) {
        Usuario usuTemp = usuarioRepository.findById(id).get();
        usuTemp.setApellidoMaterno(usuario.getApellidoMaterno());
        usuTemp.setApellidoPaterno(usuario.getApellidoPaterno());
        usuTemp.setCorreo(usuario.getCorreo());
        usuTemp.setFechaIngreso(usuario.getFechaIngreso());
        usuTemp.setFechaNacimiento(usuario.getFechaNacimiento());
        usuTemp.setFoto(usuario.getFoto());
        usuTemp.setNombres(usuario.getNombres());
        usuTemp.setStatus(usuario.getStatus());
        usuTemp.setTelefono(usuario.getTelefono());
        usuTemp.setUsername(usuario.getUsername());
        usuarioRepository.save(usuTemp);
        
    }




}
