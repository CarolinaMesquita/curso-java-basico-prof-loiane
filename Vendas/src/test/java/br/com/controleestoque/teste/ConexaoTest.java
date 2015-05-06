package br.com.controleestoque.teste;

import org.hibernate.Session;

import br.com.vendas.util.HibernateUtil;

public class ConexaoTest {

	public static void main(String[] args) {
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			System.out.println("Conectou!!");
		}finally{

			session.close();
		}
	}

}
