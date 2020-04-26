package teladecadastropessoa.model;

public class Informacao {

	public Informacao(String nome, String endereco, int numero) {
		super();
		Nome = nome;
		Endereco = endereco;
		Numero = numero;
	}
	
	@Override
	public String toString() {
		return "Informacao [Nome=" + Nome + ", Endereco=" + Endereco + ", Numero=" + Numero + "]";
	}

	private String Nome;
	private String Endereco;
	private int Numero;
		
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getEndereco() {
		return Endereco;
	}
	public String setEndereco(String endereco) {
		return Endereco = endereco;
	}
	public int getNumero() {
		return Numero;
	}
	public void setNumero(int numero) {
		Numero = numero;
	}

}
