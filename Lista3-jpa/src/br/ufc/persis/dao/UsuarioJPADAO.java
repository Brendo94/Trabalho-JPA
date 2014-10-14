package br.ufc.persis.dao;

import br.ufc.persis.model.Usuario;

public class UsuarioJPADAO extends GenericJPADAO<Usuario> implements UsuarioDAO {

	public UsuarioJPADAO() {
		this.persistentClass = Usuario.class;
	}
	
	
}
