package br.com.vendas.dao;

import java.util.List;

import br.com.vendas.model.Cliente;

public interface ClienteDAO {

	public void salvar(Cliente cliente);

	public void atualizar(Cliente cliente);

	public void excluir(Cliente  cliente);

	public List<Cliente> listar();
	
	public Cliente pesquisarPorCodigo(Integer codigoString);
}
