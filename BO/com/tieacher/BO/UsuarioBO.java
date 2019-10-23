package com.tieacher.BO;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.tieacher.beans.Usuario;
import com.tieacher.DAO.UsuarioDAO;

public class UsuarioBO {
	
	public UsuarioBO() {
		
	}
	
	public boolean cadastrarUsuario(Usuario usu) throws Exception 
	{
		if(validarNome(usu.getNome()) && validarSenha(usu.getPassword()) 
				&& validarEmail(usu.getEmail()) && validarTelefone(usu.getTelefone()))
		{
			UsuarioDAO usuDao = new UsuarioDAO();
			if (usuDao.validarExistenciaUsuario(usu.getEmail())) {
				return false;
			}
			usuDao.cadastrarUsuario(usu);
			return true;
		}
		return false;
		
	}
	
	public String validarLoginUsuario(String email, String senha) throws Exception
	{
		UsuarioDAO usuDao = new UsuarioDAO();
		Usuario usu = usuDao.getUsuarioByEmail(email);
		if(usu.getNome() == "")
			return "Email não encontrado";
		if(usu.getPassword() == senha)
			return "OK";
		return "Senha inválida";
	}
	
	private boolean validarNome(String nome)
	{
		if(nome == null || nome.isEmpty())
			return false;
		return true;
	}
	
	private boolean validarSenha(String senha) 
	{
		if(senha == null || senha.isEmpty() || senha.length() < 8  )
			return false;
		return true;
	}
	
	private boolean validarLogin(String login) 
	{
		if(login == null || login.isEmpty() || (login.length() < 5 || login.length() > 10) )
			return false;
		return true;
	}
	
	private boolean validarEmail(String email) 
	{
		if(email == null || email.isEmpty() )
			return false;
	    Matcher emailvalid = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE).matcher(email);
		return emailvalid.find();
	}
	
	private boolean validarTelefone(String telefone)
	{
		if(telefone == null || telefone.isEmpty() || telefone.length() != 9)
			return false;
		return true;
	}
	
}
