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
import javax.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = { "id" }))
public class Projeto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String nome;

	private int periodo_desenvolvimento;
	
	@ManyToOne
	@JoinColumn(name = "departamento_id")
	private Departamento departamento;
	
	@OneToMany(mappedBy = "projeto", targetEntity = Trabalha.class, fetch = FetchType.LAZY)
	private List<Trabalha> trabalhos;
		

	public Projeto(int id, String nome, int periodo_desenvolvimento,
			Departamento departamento, List<Trabalha> trabalhos) {
		super();
		this.id = id;
		this.nome = nome;
		this.periodo_desenvolvimento = periodo_desenvolvimento;
		this.departamento = departamento;
		this.trabalhos = trabalhos;
	}
	
	public Projeto() {
		
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

	public int getPeriodo_desenvolvimento() {
		return periodo_desenvolvimento;
	}

	public void setPeriodo_desenvolvimento(int periodo_desenvolvimento) {
		this.periodo_desenvolvimento = periodo_desenvolvimento;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<Trabalha> getTrabalhos() {
		return trabalhos;
	}

	public void setTrabalhos(List<Trabalha> trabalhos) {
		this.trabalhos = trabalhos;
	}

	@Override
	public String toString() {
		return "Projeto [id=" + id + ", nome=" + nome
				+ ", periodo_desenvolvimento=" + periodo_desenvolvimento
				+ ", departamento=" + departamento + ", trabalhos=" + trabalhos
				+ "]";
	}

	

}
