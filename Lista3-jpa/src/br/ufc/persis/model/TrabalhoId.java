package br.ufc.persis.model;

import java.io.Serializable;

public class TrabalhoId implements Serializable {
	private static final long serialVersionUID = 1L;

	private Pesquisador pesquisador;
	private Projeto projeto;

	@Override
	public int hashCode() {
		return pesquisador.hashCode() + projeto.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof TrabalhoId) {
			TrabalhoId trabalhoId = (TrabalhoId) obj;
			return trabalhoId.pesquisador.equals(pesquisador)
					&& trabalhoId.projeto.equals(projeto);
		}

		return false;
	}
}
