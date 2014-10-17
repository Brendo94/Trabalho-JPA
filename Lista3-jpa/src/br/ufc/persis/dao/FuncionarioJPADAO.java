package br.ufc.persis.dao;

import br.ufc.persis.model.Funcionario;

public class FuncionarioJPADAO extends GenericJPADAO<Funcionario> implements FuncionarioDAO {

	public FuncionarioJPADAO() {
		this.persistentClass = Funcionario.class;
	}
	
	
}
