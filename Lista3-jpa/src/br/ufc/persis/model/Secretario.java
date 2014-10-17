package br.ufc.persis.model;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class Secretario extends Funcionario {

	private String grau_de_parentesco;

	

	public Secretario(int id, String nome, String endereço, String sexo,
			String data_de_aniversario, double salario,
			List<Dependente> dependentes, Departamento departamento,
			String grau_de_parentesco) {
		super(id, nome, endereço, sexo, data_de_aniversario, salario,
				dependentes, departamento);
		this.grau_de_parentesco = grau_de_parentesco;
	}

	public Secretario() {
		super();
	}

	public String getGrau_de_parentesco() {
		return grau_de_parentesco;
	}

	public void setGrau_de_parentesco(String grau_de_parentesco) {
		this.grau_de_parentesco = grau_de_parentesco;
	}

	@Override
	public String toString() {
		return "Secretario [grau_de_parentesco=" + grau_de_parentesco + "]";
	}

	

}
