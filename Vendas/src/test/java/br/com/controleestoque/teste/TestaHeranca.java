package br.com.controleestoque.teste;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import br.com.vendas.util.HibernateUtil;

public class TestaHeranca {
	private static Session sessao;
	private static Transaction transacao;

	@BeforeClass
	public static void abreConexao() {
		sessao = HibernateUtil.getSessionFactory().openSession();
		transacao = sessao.beginTransaction();
	}

	@AfterClass
	public static void fechaConexao() {

		try {
			transacao.commit();
		} catch (Throwable e) {
			System.out.println("Nao comitou" + e.getMessage());
			try {
				if (sessao.isOpen())
					;
				sessao.close();
			} catch (Exception ex) {
				System.out.println("Deu problema no fechamento da conexao"
						+ ex.getMessage());
			}
		}
	}


}
