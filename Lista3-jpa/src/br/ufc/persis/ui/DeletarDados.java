package br.ufc.persis.ui;

import br.ufc.persis.dao.DepartamentoJPADAO;

public class DeletarDados {
	
	private static DepartamentoJPADAO departamentoDAO;

	public static void main(String[] args) {

		departamentoDAO = new DepartamentoJPADAO();
		departamentoDAO.beginTransaction();
		departamentoDAO.delete(departamentoDAO.find(2));
		departamentoDAO.close();

	}

}
