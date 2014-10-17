package br.ufc.persis.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
public class Pesquisador extends Funcionario {

	private String area_de_atuacao;

	@OneToMany(mappedBy = "pesquisador", targetEntity = Trabalha.class, fetch = FetchType.LAZY)
	private List<Trabalha> trabalhos;

	public Pesquisador(int id, String nome, String endereço, String sexo,
			String data_de_aniversario, double salario,
			List<Dependente> dependentes, Departamento departamento,
			String area_de_atuacao, List<Trabalha> trabalhos) {
		super(id, nome, endereço, sexo, data_de_aniversario, salario,
				dependentes, departamento);
		this.area_de_atuacao = area_de_atuacao;
		this.trabalhos = trabalhos;
	}

	public Pesquisador() {
		super();
	}

	public String getArea_de_atuacao() {
		return area_de_atuacao;
	}

	public void setArea_de_atuacao(String area_de_atuacao) {
		this.area_de_atuacao = area_de_atuacao;
	}

	public List<Trabalha> getTrabalhos() {
		return trabalhos;
	}

	public void setTrabalhos(List<Trabalha> trabalhos) {
		this.trabalhos = trabalhos;
	}

	@Override
	public String toString() {
		return "Pesquisador [area_de_atuacao=" + area_de_atuacao
				+ ", trabalhos=" + trabalhos + "]";
	}

}
