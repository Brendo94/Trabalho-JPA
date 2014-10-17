package br.ufc.persis.model;
import javax.persistence.Entity;

@Entity
public class Pesquisador extends Funcionario {

	private String area_de_atuacao;

	public Pesquisador(int id, String nome, String endere�o, String sexo,
			String data_de_aniversario, double salario) {
		super(id, nome, endere�o, sexo, data_de_aniversario, salario);

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

	@Override
	public String toString() {
		return "Pesquisador [area_de_atuacao=" + area_de_atuacao + "]";
	}

}