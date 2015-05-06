package br.com.controleestoque.teste;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import br.com.vendas.model.Cliente;
import br.com.vendas.rn.ClienteRN;
import br.com.vendas.util.HibernateUtil;

public class ClienteTest {

	public static void main(String[] args) {

		Session session = HibernateUtil.getSessionFactory().openSession();

		
		/*Salvar Cliente
		 * ClienteRN clienteRN = new ClienteRN();
		 * Cliente cliente = new Cliente(); cliente.setNome("Carolina");
		 * cliente.setCpf("000000000"); cliente.setDataCadastro(new Date());
		 * cliente.setEndereco("Rua dos sonhos"); cliente.setRenda(3000.00f);
		 * 
		 * Cliente cliente1 = new Cliente(); cliente1.setNome("Jose Santos");
		 * cliente1.setCpf("000000000"); cliente1.setDataCadastro(new Date());
		 * cliente1.setEndereco("Rua dos sonhos1"); cliente1.setRenda(100.00f);
		 * 
		 * Cliente cliente2 = new Cliente(); cliente2.setNome("Ana Maria");
		 * cliente2.setCpf("000000000"); cliente2.setDataCadastro(new Date());
		 * cliente2.setEndereco("Rua dos sonhos3"); cliente2.setRenda(3500.00f);
		 * 
		 * Cliente cliente3 = new Cliente(); cliente3.setNome("Raimundo");
		 * cliente3.setCpf("000000000"); cliente3.setDataCadastro(new Date());
		 * cliente3.setEndereco("Rua dos sonhos4");
		 * cliente3.setRenda(10000.00f); //realizando operação para salvar no
		 * banco session.beginTransaction(); clienteRN.salvar(cliente);
		 * clienteRN.salvar(cliente1); clienteRN.salvar(cliente2);
		 * clienteRN.salvar(cliente3);
		 * 
		 *S
		 *
		 */
		/*Listar Cliente
		Criteria cri = session.createCriteria(Cliente.class);
		List<Cliente> listar = cri.list();
		System.out.println(listar);
		*/
		/*
		 * Remover Cliente
		Cliente cliente = new Cliente();
		cliente.setIdCliente(1L);
		cliente.setNome("Carolina Helena Mesquita");
		ClienteRN clienteRN1 = new ClienteRN();
		cliente.getNome();
		clienteRN1.excluir(cliente);
		System.out.println("Dejesa excluir:" + cliente.getIdCliente());
		*/
		
		
	}

}
