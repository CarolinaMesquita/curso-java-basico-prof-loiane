package br.com.controleestoque.teste;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import br.com.vendas.model.Produto;
import br.com.vendas.rn.ProdutoRN;
import br.com.vendas.util.HibernateUtil;

public class ProdutoTest {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		/*salvar produto
		ProdutoRN produtoRN = new ProdutoRN();
		Produto produto = new Produto();
		produto.setDescricao("Arroz");
		produto.setEstoque(51);
		produto.setDataCadastro(new Date());
		produto.setUnidade("10");

		Produto produto2 = new Produto();
		produto2.setDescricao("Arroz");
		produto2.setEstoque(51);
		produto2.setDataCadastro(new Date());
		produto2.setUnidade("10");

		Produto produto3 = new Produto();
		produto3.setDescricao("Arroz");
		produto3.setEstoque(51);
		produto3.setDataCadastro(new Date());
		produto3.setUnidade("10");

		Produto produto4 = new Produto();
		produto4.setDescricao("Arroz");
		produto4.setEstoque(51);
		produto4.setDataCadastro(new Date());
		produto4.setUnidade("10");
		// realizando operação para salvar no banco
		session.beginTransaction();
		produtoRN.salvar(produto);
		produtoRN.salvar(produto2);
		produtoRN.salvar(produto3);
		produtoRN.salvar(produto4);
		System.out.println("Produto cadastrado com sucesso");
		*/
	
		Criteria cri = session.createCriteria(Produto.class);
		List<Produto> listar = cri.list();
		System.out.println(listar);
		
	}
}
