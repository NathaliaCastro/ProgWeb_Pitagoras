package br.com.nathaliacastro.TelaDeCadastroProdutos;

import java.awt.Dimension;
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

import teladecadastro.Produto;

public class TelaEntradaDados extends JPanel {

	private static final long serialVersionUID = 1L;
	private List<Produto> produtos = new ArrayList<Produto>();

	public TelaEntradaDados() {
		// GridLayout simula uma tabela (tabela com duas colunas)
		this.setLayout(new GridLayout(0, 2, 5, 10));

		JLabel nomeDoProduto = new JLabel("Nome");
		this.add(nomeDoProduto);

		final JTextField nomeDoProdutoField = new JTextField();
		this.add(nomeDoProdutoField);

		JLabel precoUnitario = new JLabel("Preço");
		this.add(precoUnitario);

		final JTextField precoUnitarioField = new JTextField();
		this.add(precoUnitarioField);

		JLabel quantidadeEstoque = new JLabel("Quantidade");
		this.add(quantidadeEstoque);

		final JTextField quantidadeEstoqueField = new JTextField();
		this.add(quantidadeEstoqueField);

		JButton btnAdicionar = new JButton("Adicionar");
		this.add(btnAdicionar);
		btnAdicionar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String nome = nomeDoProdutoField.getText();
				double preco = Double.parseDouble(precoUnitarioField.getText());
				int quantidade = Integer.parseInt(quantidadeEstoqueField.getText());

				Produto produto = new Produto(nome, preco, quantidade);

				produtos.add(produto);
				System.out.println("Numero de pedidos: " + produtos.size());

				nomeDoProdutoField.setText("");
				precoUnitarioField.setText("");
				quantidadeEstoqueField.setText("");
			}

		});

		JButton btnRelatorio = new JButton("Relatorio");
		btnRelatorio.setBounds(210, 150, 100, 30);
		this.add(btnRelatorio);
		btnRelatorio.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < produtos.size(); i++) {
					System.out.println(produtos.get(i));
				}

				Object[] colunas = { "NOME", "QUANTIDADE", "PRECO", "TOTAL" };
				Object[][] linhas = new Object[produtos.size()+1][4];
					for (int i = 0; i < produtos.size(); i++) {
					Object[] linha = new Object[] { produtos.get(i).getNome().toUpperCase(),produtos.get(i).getQuantidade(), produtos.get(i).getPreco(), produtos.get(i).getPreco() * produtos.get(i).getQuantidade() };
					linhas[i] = linha;

					}

					int quantidadeSoma = 0;
					double somaPreco = 0;
					double total = 0;

					for (Produto produto : produtos) {
						quantidadeSoma = quantidadeSoma + produto.getQuantidade();
						somaPreco = produto.getQuantidade() * produto.getPreco();
						total = total + somaPreco;
					}
					
					linhas[produtos.size()] = new Object[] {"Valor total:", quantidadeSoma, "", total };

				JTable tabela = new JTable(linhas, colunas);
				JScrollPane jscroll = new JScrollPane(tabela);
				jscroll.setSize(new Dimension(500, 500));
				JOptionPane.showMessageDialog(null, new JScrollPane(tabela));
				
			}

		});

	}

}
