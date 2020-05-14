package br.com.nathaliacastro.TelaDeLogin.bean;
import java.io.Serializable;

// JavaBean: classe java com atributos privados com get e set
public class LoginBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String usuario;
	private String senha;

// Construtor padrao vazio
	public LoginBean() {
	}
	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

// Nao pertence ao JavaBean, linhas a parte. Valida as informacoes inseridas
	public boolean isValid() {
		String usuarioEsperado = "admin";
		String senhaEsperada = "admin";
		
		return usuarioEsperado.equals(usuario) && senhaEsperada.equals(senha);
		
	}
}
