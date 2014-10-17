package br.ufc.persis.ui;

import java.util.ArrayList;
import java.util.List;

import br.ufc.persis.dao.DepartamentoJPADAO;
import br.ufc.persis.dao.FuncionarioJPADAO;
import br.ufc.persis.model.Departamento;
import br.ufc.persis.model.Funcionario;

public class ConsultaTabela {
	private static List<Departamento> departamentos;
	private static DepartamentoJPADAO departamentoDAO;

	public static void main(String[] args) {

		// Usando o find da classe GenericJPADAO, que ja usa o criteria no
		// método find
		departamentos = new ArrayList<Departamento>();
		departamentoDAO = new DepartamentoJPADAO();
		departamentoDAO.beginTransaction();		
		departamentos.addAll(departamentoDAO.find());
		departamentoDAO.close();

		for (int i = 0; i < departamentos.size(); i++) {
			System.out.println("Id: " + departamentos.get(i).getId() + " Nome: "
					+ departamentos.get(i).getNome() + " Numero: "
					+ departamentos.get(i).getNumero());
		}

	}
}
