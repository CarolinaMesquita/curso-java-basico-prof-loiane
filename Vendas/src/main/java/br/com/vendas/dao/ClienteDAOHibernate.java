package br.com.vendas.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import br.com.vendas.model.Cliente;
import br.com.vendas.util.HibernateUtil;

public class ClienteDAOHibernate implements ClienteDAO{
	
	private Session session;
	
	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	public void salvar(Cliente cliente) {
		session = HibernateUtil.getSessionFactory().openSession();
		 
		try{
			session.beginTransaction();
			session.save(cliente);
			session.getTransaction().commit();

		}finally{
			session.close();

		}
	}


	public void atualizar(Cliente cliente) {
		session = HibernateUtil.getSessionFactory().openSession();
		
		try{
			session.beginTransaction();
			session.update(cliente);
			session.getTransaction().commit();
		}finally{
			session.close();
		}
		
	}

	public void excluir(Cliente cliente) {
session = HibernateUtil.getSessionFactory().openSession();
		
		try{
			session.beginTransaction();
			session.delete(cliente);
			session.getTransaction().commit();
		}finally{
			session.close();
		}
		
		
	}


	@SuppressWarnings("unchecked")
	public List<Cliente> listar() {
		session = HibernateUtil.getSessionFactory().openSession();
		 
		try{
			Criteria cri = session.createCriteria(Cliente.class);
			List<Cliente> listar = cri.list();
			return listar;
		}finally{
			session.close();
		}
	}

	public Cliente pesquisarPorCodigo(Integer codigoString) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
