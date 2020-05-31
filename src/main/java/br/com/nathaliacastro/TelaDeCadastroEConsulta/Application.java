package br.com.nathaliacastro.TelaDeCadastroEConsulta;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Application {
	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application window = new Application();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Application() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 400, 245);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setLayout(new BorderLayout());
		JLabel titulo = new JLabel("<html> <h1> Tela de Cadastro e Consulta de produtos </h1> </html>");
		titulo.setHorizontalAlignment(JLabel.CENTER);
		frame.add(titulo, BorderLayout.NORTH);

		TelaDeCadastro telaDeCadastro = new TelaDeCadastro();
		frame.add(telaDeCadastro);
		
	}

}
