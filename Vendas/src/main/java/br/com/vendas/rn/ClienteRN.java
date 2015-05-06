package br.com.vendas.rn;

import java.util.List;

import org.hibernate.Query;

import br.com.vendas.dao.ClienteDAO;
import br.com.vendas.dao.DAOFactory;
import br.com.vendas.model.Cliente;

public class ClienteRN {
	
	private ClienteDAO clienteDAO;

	public ClienteRN() {
		this.clienteDAO = DAOFactory.criarClienteDAO();
	}

	public void salvar(Cliente cliente) {
		this.clienteDAO.salvar(cliente);
	}
	public void alterar(Cliente cliente){
		this.clienteDAO.atualizar(cliente);
	}
	public List<Cliente> listar() {
		return this.clienteDAO.listar();
	}

	public void excluir(Cliente cliente) {
		this.clienteDAO.excluir(cliente);
		
	}

		

}
