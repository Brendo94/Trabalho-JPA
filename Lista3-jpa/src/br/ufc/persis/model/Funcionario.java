package br.ufc.persis.model;

import java.util.List;

import javax.persistence.Entity;
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
	
	private String enderešo;
	
	private String sexo;
	
	private String data_de_aniversario;
	
	private double salario;
	
	@OneToMany(mappedBy = "funcionario")
	private List<Dependente> dependentes;
	
	@ManyToOne
	@JoinColumn(name = "departamento_id")
	private Departamento departamento;

	public Funcionario(int id, String nome, String enderešo, String sexo,
			String data_de_aniversario, double salario,
			List<Dependente> dependentes, Departamento departamento) {
		super();
		this.id = id;
		this.nome = nome;
		this.enderešo = enderešo;
		this.sexo = sexo;
		this.data_de_aniversario = data_de_aniversario;
		this.salario = salario;
		this.dependentes = dependentes;
		this.departamento = departamento;
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

	public String getEnderešo() {
		return enderešo;
	}

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
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

	public List<Dependente> getDependentes() {
		return dependentes;
	}

	public void setDependentes(List<Dependente> dependentes) {
		this.dependentes = dependentes;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", enderešo="
				+ enderešo + ", sexo=" + sexo + ", data_de_aniversario="
				+ data_de_aniversario + ", salario=" + salario
				+ ", dependentes=" + dependentes + ", departamento="
				+ departamento + "]";
	}

	
	
}
