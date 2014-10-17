
package br.ufc.persis.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Departamento")
public class Departamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToMany(mappedBy = "departamento", targetEntity = Funcionario.class)
	private List<Funcionario> funcionarios;
	
	@OneToMany(mappedBy = "departamento", targetEntity = Projeto.class)
	private List<Projeto> projetos;
	
	private String nome;
	
	private int numero;
	
	public Departamento(int id, List<Funcionario> funcionarios,
			List<Projeto> projetos, String nome, int numero) {
		super();
		this.id = id;
		this.funcionarios = funcionarios;
		this.projetos = projetos;
		this.nome = nome;
		this.numero = numero;
	}

	public Departamento() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public List<Projeto> getProjetos() {
		return projetos;
	}

	public void setProjetos(List<Projeto> projetos) {
		this.projetos = projetos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Departamento [id=" + id + ", funcionarios=" + funcionarios
				+ ", projetos=" + projetos + ", nome=" + nome + ", numero="
				+ numero + "]";
	}

	
}
