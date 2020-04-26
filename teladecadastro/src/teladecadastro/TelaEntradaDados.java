package teladecadastro;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import teladecadastro.model.Produto;

public class TelaEntradaDados extends JPanel {

	private List<Produto> produtos = new ArrayList<>();
	
	public TelaEntradaDados() {
		
		//GridLayout simula uma tabela (tabela com duas colunas)
		this.setLayout(new GridLayout(0, 2, 5, 10));
		
		JLabel nomeDoProduto = new JLabel("Nome do produto");
		this.add(nomeDoProduto);
		
		JTextField nomeDoProdutoField = new JTextField();
		this.add(nomeDoProdutoField);
		
		
		JLabel quantidadeDoPoduto = new JLabel("Quantidade do produto");
		this.add(quantidadeDoPoduto);
		
		JTextField quantidadeDoPodutoField = new JTextField();
		this.add(quantidadeDoPodutoField);		
		
		JButton btnAdicionar = new JButton("Adicionar");
		this.add(btnAdicionar);
		btnAdicionar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String Nome = nomeDoProdutoField.getText();
				int Quantidade = Integer.parseInt(quantidadeDoPodutoField.getText());

				Produto produto = new Produto(Nome, Quantidade);
				produtos.add(produto);
				
				System.out.println("Quantidade cadastrada:" + produtos.size());
				nomeDoProdutoField.setText("");
				quantidadeDoPodutoField.setText("");
				
			}
			
			
		});
		
		
		JButton btnExibirTodos = new JButton("Exibir todos");
		this.add(btnExibirTodos);
		btnExibirTodos.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for(int i = 0; i < produtos.size(); i++) {
					
				System.out.println(produtos.get(i));
						
				}
				
				Object[] titulos = {"Nome", "Quantidade"};
				Object[][] linhas = new Object[produtos.size()][2];
					for(int i = 0; i < produtos.size(); i++) {
					
						Object[] linha = new Object[] {produtos.get(i).getNome(), produtos.get(i).getQuantidade()};
						linhas[i] = linha;	
					}
				JTable table = new JTable(linhas, titulos);
				JOptionPane.showConfirmDialog(null, new JScrollPane(table));
				
			}
			

			
			
		});
	}
	
}
