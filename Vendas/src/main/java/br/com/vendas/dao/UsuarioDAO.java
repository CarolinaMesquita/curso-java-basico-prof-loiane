package br.com.vendas.dao;

import java.util.List;

import br.com.vendas.model.Usuario;

public interface UsuarioDAO {

	public void salvar(Usuario usuario);

	public void atualizar(Usuario usuario);

	public void excluir(Usuario usuario);

	public Usuario carregar(Integer codigo);

	public List<Usuario> listar();

	public Usuario buscarPorLogin(String login);

}
