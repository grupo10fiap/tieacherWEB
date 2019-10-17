package com.tieacher.beans;

public class Usuario {
	private String nome;
	private String numero;
	private String email;
	private String password;
	
	public Usuario() 
	{
		
	}
	
	public Usuario(String nome, String numero, String email, String password) {
		this.nome = nome;
		this.numero = numero;
		this.email = email;
		this.password = password;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
