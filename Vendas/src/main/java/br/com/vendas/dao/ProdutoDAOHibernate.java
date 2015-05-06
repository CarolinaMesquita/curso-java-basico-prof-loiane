package br.com.vendas.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import br.com.vendas.model.Produto;
import br.com.vendas.util.HibernateUtil;

public class ProdutoDAOHibernate implements ProdutoDAO{
	
	private Session session;
	
	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	public void salvar(Produto produto) {
		session = HibernateUtil.getSessionFactory().openSession();
		 
		try{
			session.beginTransaction();
			session.save(produto);
			session.getTransaction().commit();

		}finally{
			session.close();

		}
	}
	public void atualizar(Produto produto) {
		session = HibernateUtil.getSessionFactory().openSession();
		 
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.saveOrUpdate(produto);
			session.getTransaction().commit();
		}finally{
			session.close();

		}
	}
	public void excluir(Produto produto) {
		session = HibernateUtil.getSessionFactory().openSession();
		 
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.delete(produto);
			session.getTransaction().commit();

		}finally{
			session.close();

		}
	}


	@SuppressWarnings("unchecked")
	public List<Produto> listar() {
		session = HibernateUtil.getSessionFactory().openSession();
		 
		try{
			Criteria cri = session.createCriteria(Produto.class);
			List<Produto> listar = cri.list();
			return listar;
		}finally{
			session.close();
		}
}
}
