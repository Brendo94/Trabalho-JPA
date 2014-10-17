package br.ufc.persis.ui;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
//
//import br.ufc.persis.dao.UsuarioJPADAO;
//import br.ufc.persis.model.Usuario;

public class ConsultaTabela {
//	private static List<Usuario> usuarios;
//	private static UsuarioJPADAO usuarioDAO;

	public static void main(String[] args) {
//
//		EntityManagerFactory emf = Persistence
//				.createEntityManagerFactory("usuarios");
//		EntityManager em = emf.createEntityManager();
//
//		List<Usuario> l = em.createNamedQuery("Usuario.findUsuario",
//				Usuario.class).getResultList();
//
//		for (Usuario u : l) {
//			System.out.println("Id: " + u.getId() + " Login: "
//					 + u.getLogin() + " Senha: "
//					 + u.getSenha() + "Seguidores: " + u.getSeguidores());
//		}
//		em.close();

		 
		
//		Usando o find da classe GenericJPADAO, que ja usa o criteria no método find
//		 usuarios = new ArrayList<Usuario>();
//		 usuarioDAO = new UsuarioJPADAO();
//		 usuarioDAO.beginTransaction();
//		 usuarios.addAll(usuarioDAO.find());
//		 usuarioDAO.close();
//		
//		 for (int i = 0; i < usuarios.size(); i++) {
//		 System.out.println("Id: " + usuarios.get(i).getId() + " Login: "
//		 + usuarios.get(i).getLogin() + " Senha: "
//		 + usuarios.get(i).getSenha());
//		 }

	}
}
