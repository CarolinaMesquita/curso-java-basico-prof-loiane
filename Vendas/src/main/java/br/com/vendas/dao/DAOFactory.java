package br.com.vendas.dao;

import br.com.vendas.dao.UsuarioDAO;
import br.com.vendas.dao.UsuarioDAOHibernate;
import br.com.vendas.util.HibernateUtil;

public class DAOFactory {
	
	public static UsuarioDAO criarUsuarioDAO() {
		UsuarioDAOHibernate usuarioDAO = new UsuarioDAOHibernate();
		usuarioDAO.setSession(HibernateUtil.getSessionFactory()
				.getCurrentSession());
		return usuarioDAO;
	}

	public static ClienteDAO criarClienteDAO() {
		ClienteDAOHibernate clienteDAOHibernate = new ClienteDAOHibernate();
		clienteDAOHibernate.setSession(HibernateUtil.getSessionFactory()
				.openSession());
		return clienteDAOHibernate;
	}

	public static ProdutoDAO criarProdutoDAO() {
		ProdutoDAOHibernate produtoDAOHibernate = new ProdutoDAOHibernate();
		produtoDAOHibernate.setSession(HibernateUtil.getSessionFactory()
				.openSession());
		return produtoDAOHibernate;
	}

}
