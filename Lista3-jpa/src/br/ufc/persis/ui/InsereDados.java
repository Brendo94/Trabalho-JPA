package br.ufc.persis.ui;

import java.util.ArrayList;
import java.util.List;

import br.ufc.persis.dao.UsuarioJPADAO;
import br.ufc.persis.model.Usuario;

public class InsereDados {	
	private static List<Usuario> usuarios = null;
	private static UsuarioJPADAO usuarioDAO;
	public static void main(String[] args) {
								
		Usuario userA = new Usuario();
        userA.setLogin("Marcilio");
        userA.setSenha("123");        	
        
        Usuario userB = new Usuario();
        userB.setLogin("Sergim");
        Usuario userC = new Usuario();
        userC.setLogin("Brendo");
        
        usuarios = new ArrayList<Usuario>();
				        
        usuarios.add(userB);
        usuarios.add(userC);
		
		usuarioDAO = new UsuarioJPADAO();
		usuarioDAO.beginTransaction();
		usuarioDAO.save(userA);
		usuarioDAO.commit();
		usuarioDAO.close();
	}
}
