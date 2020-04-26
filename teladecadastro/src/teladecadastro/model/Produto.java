package teladecadastro.model;
public class Produto {

	public Produto(String nome, int quantidade) {
		super();
		Nome = nome;
		Quantidade = quantidade;
	}
	
	@Override
	public String toString() {
		return "Produto [Nome=" + Nome + ", Quantidade=" + Quantidade + "]";
	}

	private String Nome;
	private int Quantidade;
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public int getQuantidade() {
		return Quantidade;
	}
	public void setQuantidade(int quantidade) {
		Quantidade = quantidade;
	}

}
