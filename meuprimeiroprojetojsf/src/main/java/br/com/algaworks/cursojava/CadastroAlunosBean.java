package br.com.algaworks.cursojava;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class CadastroAlunosBean implements Serializable {
	private static final long serialVersionUID = 1L;

	private String nome;
	private String email;

	public void cadastrar() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Email: " + this.email);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
