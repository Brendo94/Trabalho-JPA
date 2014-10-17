package br.ufc.persis.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Dependente")
public class Dependente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String nome;

	private String sexo;

	private String data_de_aniversario;

	private String grau_de_parentesco;

	@ManyToOne()
	@JoinColumn(name = "funcionario_id")
	private Funcionario funcionario;



	public Dependente(int id, String nome, String sexo,
			String data_de_aniversario, String grau_de_parentesco,
			Funcionario funcionario) {
		super();
		this.id = id;
		this.nome = nome;
		this.sexo = sexo;
		this.data_de_aniversario = data_de_aniversario;
		this.grau_de_parentesco = grau_de_parentesco;
		this.funcionario = funcionario;
	}

	public Dependente() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getData_de_aniversario() {
		return data_de_aniversario;
	}

	public void setData_de_aniversario(String data_de_aniversario) {
		this.data_de_aniversario = data_de_aniversario;
	}

	public String getGrau_de_parentesco() {
		return grau_de_parentesco;
	}

	public void setGrau_de_parentesco(String grau_de_parentesco) {
		this.grau_de_parentesco = grau_de_parentesco;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	@Override
	public String toString() {
		return "Dependente [id=" + id + ", nome=" + nome + ", sexo=" + sexo
				+ ", data_de_aniversario=" + data_de_aniversario
				+ ", grau_de_parentesco=" + grau_de_parentesco
				+ ", funcionario=" + funcionario + "]";
	}

	

}
