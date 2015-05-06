package br.com.vendas.rn;

import java.util.List;

import br.com.vendas.dao.DAOFactory;
import br.com.vendas.dao.ProdutoDAO;
import br.com.vendas.model.Produto;

public class ProdutoRN {
	
	private ProdutoDAO produtoDAO;
	
	public ProdutoRN() {
		this.produtoDAO = DAOFactory.criarProdutoDAO();
	}
	public void salvar(Produto produto){
		this.produtoDAO.salvar(produto);
	}

	public void alterar(Produto produto){
		this.produtoDAO.atualizar(produto);
	}
	public void excluir(Produto produto){
		this.produtoDAO.excluir(produto);
	}
	public List<Produto> listar(){
		return this.produtoDAO.listar();
	}
}
