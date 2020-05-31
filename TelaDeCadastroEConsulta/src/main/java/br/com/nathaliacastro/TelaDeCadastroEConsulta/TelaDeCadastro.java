package br.com.nathaliacastro.TelaDeCadastroEConsulta;

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

import telaCadastro.Produto;

public class TelaDeCadastro  extends JPanel {

	private static final long serialVersionUID = 1L;
	private List<Produto> produtos = new ArrayList<Produto>();

	public TelaDeCadastro() {
		// GridLayout simula uma tabela (tabela com duas colunas)
		this.setLayout(new GridLayout(0, 2, 5, 10));

		JLabel nomeProdutos = new JLabel("Nome");
		this.add(nomeProdutos);

		final JTextField nomeProdutosField = new JTextField();
		this.add(nomeProdutosField);

		JButton btnAdicionar = new JButton("Adicionar");
		this.add(btnAdicionar);
		btnAdicionar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String nome = nomeProdutosField.getText();

				Produto produto = new Produto(nome);

				produtos.add(produto);
				System.out.println("Numero de pedidos: " + produtos.size());

				nomeProdutosField.setText("");
			}

		});

		JButton btnConsulta = new JButton("Consultar");
		btnConsulta.setBounds(210, 150, 100, 30);
		this.add(btnConsulta);
		btnConsulta.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < produtos.size(); i++) {
					System.out.println(produtos.get(i));
				}

				Object[] colunas = { "NOME"};
				Object[][] linhas = new Object[produtos.size()+1][4];
					for (int i = 0; i < produtos.size(); i++) {
					Object[] linha = new Object[] { produtos.get(i).getNome().toUpperCase() };
					linhas[i] = linha;

					}

				JTable tabela = new JTable(linhas, colunas);
				JScrollPane jscroll = new JScrollPane(tabela);
				jscroll.setSize(new Dimension(500, 500));
				JOptionPane.showMessageDialog(null, new JScrollPane(tabela));
				
			}

		});

	}
}
