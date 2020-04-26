package br.com.nathaliacastro.TelaDeCadastroProdutos;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaApplication {
	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaApplication window = new TelaApplication();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TelaApplication() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setLayout(new BorderLayout());
		JLabel titulo = new JLabel("<html> <h1> Tela de Cadastro de Produtos </h1> </html>");
		titulo.setHorizontalAlignment(JLabel.CENTER);
		frame.add(titulo, BorderLayout.NORTH);

		TelaEntradaDados telaDeEntradaDeDados = new TelaEntradaDados();
		frame.add(telaDeEntradaDeDados);
		
	}

}
