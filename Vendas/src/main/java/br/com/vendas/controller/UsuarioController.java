package br.com.vendas.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;


import br.com.vendas.model.Usuario;
import br.com.vendas.rn.UsuarioRN;

@ManagedBean(name = "usuarioController")
@RequestScoped
public class UsuarioController implements Serializable {

	private static final long serialVersionUID = -6979789478620187375L;

	private Usuario usuario;
	private String confirmaSenha;
	private List<SelectItem> idiomas;
	private List<Usuario> lista;
	private String destinoSalvar;
	
	
	public UsuarioController() {
		usuario = new Usuario();
	}

	
	

	public List<Usuario> getLista() {
		if (this.lista == null) {
			UsuarioRN usuarioRN = new UsuarioRN();
			this.lista = usuarioRN.listar();
		}
		return lista;
	}

	public void setLista(List<Usuario> lista) {
		this.lista = lista;
	}

	public String getDestinoSalvar() {
		return destinoSalvar;
	}

	public void setDestinoSalvar(String destinoSalvar) {
		this.destinoSalvar = destinoSalvar;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getConfirmaSenha() {
		return confirmaSenha;
	}

	public void setConfirmaSenha(String confirmaSenha) {
		this.confirmaSenha = confirmaSenha;
	}

	public List<SelectItem> getIdiomas() {
		if (this.idiomas == null) {
			this.idiomas = new ArrayList<SelectItem>();
			this.idiomas.add(new SelectItem("pt_BR", "Portugu�s"));
			this.idiomas.add(new SelectItem("en_US", "English"));
			this.idiomas.add(new SelectItem("es_ES", "Espanol"));
		}
		return idiomas;
	}

	public void setIdiomas(List<SelectItem> idiomas) {
		this.idiomas = idiomas;
	}

	public String novo() {
		this.usuario = new Usuario();
		this.usuario.setAtivo(true);
		return "usuario";
	}

	public String salvar() {
		FacesContext fc = FacesContext.getCurrentInstance();
		String senha = this.usuario.getSenha();
		if (!senha.equals(this.confirmaSenha)) {
			FacesMessage fm = new FacesMessage(
					"A senha n�o foi confirmada corretamente");
			fc.addMessage(null, fm);
			return null;
		}
		UsuarioRN usuarioRN = new UsuarioRN();
		usuarioRN.salvar(this.usuario);
	
		return "usuarioSucesso";
	}

	public String editar() {
		this.confirmaSenha = this.usuario.getSenha();
		return "public/usuario";
	}

	public String excluir() {
		UsuarioRN usuarioRN = new UsuarioRN();
		usuarioRN.excluir(this.usuario);
		this.lista = null;
		return null;

	}

	public String ativar() {
		if (this.usuario.isAtivo())
			this.usuario.setAtivo(false);
		else
			this.usuario.setAtivo(true);

		UsuarioRN usuarioRN = new UsuarioRN();
		usuarioRN.salvar(this.usuario);

		return null;

	}
	public String atribuiPermissao(Usuario usuario,String permissao){
		this.usuario = usuario;
		Set<String> permissoes = this.usuario.getPermissao();
		if(permissoes.contains(permissao)){
			permissoes.remove(permissao);
		}else{
			permissoes.add(permissao);
		}
		return null;
	}

}
