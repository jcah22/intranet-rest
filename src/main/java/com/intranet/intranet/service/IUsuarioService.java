package com.intranet.intranet.service;

import java.util.List;
import java.util.Optional;

import com.intranet.intranet.models.Usuario;

public interface IUsuarioService {

	public List<Usuario> listarTodosLosUsuarios();

	public Usuario guardarUsuario(Usuario usuario);

	public Optional<Usuario> buscarUsuarioPorId(Long id);

	public void eliminarUsuarioPorId(Long id);

	public List<Usuario> buscarTodosLosUsuariosPorQuery(int palabraClave);

	public	void actualizarUsuario(Long id, Usuario usuario);

}
