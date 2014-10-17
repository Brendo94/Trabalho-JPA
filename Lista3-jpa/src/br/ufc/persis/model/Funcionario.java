package br.ufc.persis.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Funcionario")
public class Funcionario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String nome;
	
	private String endereço;
	
	private String sexo;
	
	private String data_de_aniversario;
	
	private double salario;
	
	@OneToMany(mappedBy = "funcionario")
	private List<Dependente> dependentes;
	
	@ManyToOne
	@JoinColumn(name = "departamento_id")
	private Departamento departamento;
	
	public Funcionario(int id, String nome, String endereço, String sexo,
			String data_de_aniversario, double salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereço = endereço;
		this.sexo = sexo;
		this.data_de_aniversario = data_de_aniversario;
		this.salario = salario;
	}

	public Funcionario() {
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

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
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

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", endereço="
				+ endereço + ", sexo=" + sexo + ", data_de_aniversario="
				+ data_de_aniversario + ", salario=" + salario + "]";
	}
	
	
}
