package br.ufc.persis.model;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class Limpeza extends Funcionario {

	private String cargo;

	private String jornada_trabalho;

	

	public Limpeza(int id, String nome, String endereço, String sexo,
			String data_de_aniversario, double salario,
			List<Dependente> dependentes, Departamento departamento,
			String cargo, String jornada_trabalho) {
		super(id, nome, endereço, sexo, data_de_aniversario, salario,
				dependentes, departamento);
		this.cargo = cargo;
		this.jornada_trabalho = jornada_trabalho;
	}

	public Limpeza() {
		super();
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getJornada_trabalho() {
		return jornada_trabalho;
	}

	public void setJornada_trabalho(String jornada_trabalho) {
		this.jornada_trabalho = jornada_trabalho;
	}

	@Override
	public String toString() {
		return "Limpeza [cargo=" + cargo + ", jornada_trabalho="
				+ jornada_trabalho + "]";
	}

	

}
