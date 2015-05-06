package br.com.vendas.dao;

import java.util.List;

import br.com.vendas.model.Produto;

public interface ProdutoDAO {
	
	public void salvar(Produto produto);

	public void atualizar(Produto produto);

	public void excluir(Produto produto);

	public List<Produto> listar();

}
