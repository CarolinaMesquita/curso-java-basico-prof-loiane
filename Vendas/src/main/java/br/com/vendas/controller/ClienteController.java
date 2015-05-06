package br.com.vendas.controller;


import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import br.com.vendas.model.Cliente;
import br.com.vendas.rn.ClienteRN;

@ManagedBean(name="clienteController")
@RequestScoped
public class ClienteController {
	
	private Cliente clienteSelecionado = new Cliente();
	private List<Cliente> listarTodos = null;
	
	public Cliente getClienteSelecionado() {
		return clienteSelecionado;
	}


	public void setClienteSelecionado(Cliente clienteSelecionado) {
		this.clienteSelecionado = clienteSelecionado;
	}


	public List<Cliente> getListarTodos() {
		ClienteRN clienteRN = new ClienteRN();
		if(listarTodos == null){
			listarTodos = clienteRN.listar();
		}
		
		return listarTodos;
	}


	public void salvar(){
		ClienteRN clienteRN = new ClienteRN();
		clienteSelecionado.setDataCadastro(new Date());
		clienteRN.salvar(clienteSelecionado);
		FacesMessage fm = new FacesMessage("Cliente cadastrado com sucesso!");
		FacesContext fc = FacesContext.getCurrentInstance();
		fc.addMessage(null, fm);
		
		}
	public void excluir() {
		ClienteRN clienteRN = new ClienteRN();
		clienteRN.excluir(this.clienteSelecionado);
		this.listarTodos = null;
	}
	public void alterar(){
		ClienteRN clienteRN = new ClienteRN();
		clienteRN.alterar(this.clienteSelecionado);
		this.listarTodos = null;
		FacesMessage fm = new FacesMessage("Cliente atualizado com sucesso!");
		FacesContext fc = FacesContext.getCurrentInstance();
		fc.addMessage(null, fm);
	}

	public String novo() {
		this.clienteSelecionado = new Cliente();
		return "cliente";
	}

}

