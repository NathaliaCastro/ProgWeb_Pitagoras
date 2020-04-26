package teladecadastropessoa;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaDeCadastroPessoa {
	private JFrame frame;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDeCadastroPessoa window = new TelaDeCadastroPessoa();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TelaDeCadastroPessoa() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setLayout(new BorderLayout());
		JLabel titulo = new JLabel("<html> <h1> Tela de Cadastro de Pessoa </h1> </html>");
		titulo.setHorizontalAlignment(JLabel.CENTER);
		frame.add(titulo, BorderLayout.NORTH);
		
		TelaDeEntradaDeDados telaDeEntradaDeDados = new TelaDeEntradaDeDados();
		frame.add(telaDeEntradaDeDados);
	}

}
