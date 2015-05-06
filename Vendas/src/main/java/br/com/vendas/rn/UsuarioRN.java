package br.com.vendas.rn;

import java.util.List;

import br.com.vendas.dao.DAOFactory;
import br.com.vendas.dao.UsuarioDAO;
import br.com.vendas.model.Usuario;

public class UsuarioRN {
	private Usuario usuario;
	private UsuarioDAO usuarioDAO;
	
	public UsuarioRN() {
		this.usuarioDAO = DAOFactory.criarUsuarioDAO();
		this.usuario = new Usuario();
	}
	public Usuario carregar(Integer codigo){
		return this.usuarioDAO.carregar(codigo);
	}
	public Usuario buscarPorLogin(String login){
		return this.usuarioDAO.buscarPorLogin(login);
	}
	public void salvar(Usuario usuario){
		Integer codigo = usuario.getCodigo();
		if(codigo==null|| codigo == 0){
			usuario.getPermissao().add("ROLE_USUARIO");
			this.usuarioDAO.salvar(usuario);
						
		}else{
			this.usuarioDAO.atualizar(usuario);
		}
	}
	public void excluir(Usuario usuario){
		
		this.usuarioDAO.excluir(usuario);
	}
	public List<Usuario> listar(){
		return this.usuarioDAO.listar();
	}

}
