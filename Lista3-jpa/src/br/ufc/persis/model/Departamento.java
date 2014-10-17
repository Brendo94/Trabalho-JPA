
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
	
	@OneToMany(mappedBy = "Departamento", targetEntity = Funcionario.class)
	private List<Funcionario> funcionarios;
	
	@OneToMany(mappedBy = "Departamento", targetEntity = Projeto.class)
	private List<Projeto> projetos;
	
	private String nome;
	
	private int numero;
	
	public Departamento(String nome, int numero) {
		super();
		this.nome = nome;
		this.numero = numero;
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
		return "Departamento [nome=" + nome + ", numero=" + numero + "]";
	}
	
	
}
