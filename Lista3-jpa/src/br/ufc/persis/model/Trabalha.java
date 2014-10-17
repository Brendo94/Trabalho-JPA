package br.ufc.persis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "trabalhos")
@IdClass(TrabalhoId.class)
public class Trabalha {

	@Id
	@ManyToOne
	@JoinColumn(name = "id_pesquisador")
	private Pesquisador pesquisador;

	@Id
	@ManyToOne
	@JoinColumn(name = "id_projeto")
	private Projeto projeto;

	@Column(name = "horas_trabalhadas")
	private int horas_trabalhadas;

	public Pesquisador getPesquisador() {
		return pesquisador;
	}

	public void setPesquisador(Pesquisador pesquisador) {
		this.pesquisador = pesquisador;
	}

	public int getHoras_trabalhadas() {
		return horas_trabalhadas;
	}

	public void setHoras_trabalhadas(int horas_trabalhadas) {
		this.horas_trabalhadas = horas_trabalhadas;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

	@Override
	public String toString() {
		return "Trabalha [pesquisador=" + pesquisador + ", projeto=" + projeto
				+ ", horas_trabalhadas=" + horas_trabalhadas + "]";
	}

}
