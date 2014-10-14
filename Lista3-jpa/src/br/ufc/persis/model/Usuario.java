package br.ufc.persis.model;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({ @NamedQuery(name = "Usuario.findUsuario", query = "from Usuario") })
@Table(name = "UsuarioTwiiter")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String login;

	private String senha;

	@ManyToMany
	@JoinTable(name = "users_seguidores", joinColumns = @JoinColumn(name = "id_seguidor"), inverseJoinColumns = @JoinColumn(name = "seguidor_id"))
	private List<Usuario> seguidores = new ArrayList<Usuario>();

	public Usuario() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public List<Usuario> getSeguidores() {
		return seguidores;
	}

	public void setSeguidores(List<Usuario> seguidores) {
		this.seguidores = seguidores;
	}
}
