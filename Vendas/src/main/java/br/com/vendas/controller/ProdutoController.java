package br.com.vendas.controller;

import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import br.com.vendas.model.Produto;
import br.com.vendas.rn.ProdutoRN;

@ManagedBean(name="produtoController")
public class ProdutoController {
	
	private Produto produtoSelecionado = new Produto();
	private List<Produto> listarTodos = null;
	
	public Produto getClienteSelecionado() {
		return produtoSelecionado;
	}


	public void setProdutoSelecionado(Produto produtoSelecionado) {
		this.produtoSelecionado = produtoSelecionado;
	}


	public List<Produto> getListarTodos() {
		ProdutoRN produtoRN = new ProdutoRN();
		if(listarTodos == null){
			listarTodos = produtoRN.listar();
		}
		
		return listarTodos;
	}


	public void salvar(){
		ProdutoRN produtoRN = new ProdutoRN();
		produtoSelecionado.setDataCadastro(new Date());
		produtoRN.salvar(produtoSelecionado);
		FacesMessage fm = new FacesMessage("Produto cadastrado com sucesso!");
		FacesContext fc = FacesContext.getCurrentInstance();
		fc.addMessage(null, fm);
		
		}
	public void excluir() {
		ProdutoRN produtoRN = new ProdutoRN();
		produtoRN.excluir(this.produtoSelecionado);
		this.listarTodos = null;
	}

	public String novo() {
		this.produtoSelecionado = new Produto();
		return "produto";
	}


}
