package teladecadastropessoa;

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

import org.apache.commons.lang3.StringUtils;

import teladecadastropessoa.model.Informacao;

public class TelaDeEntradaDeDados extends JPanel {

	private List<Informacao> cadastros = new ArrayList<>();
	
	public TelaDeEntradaDeDados() {
		//GridLayout simula uma tabela (tabela com duas colunas)
				this.setLayout(new GridLayout(0, 2, 5, 10));
				
				JLabel nomeDaPessoa = new JLabel("Nome");
				this.add(nomeDaPessoa);
				
				JTextField nomeDaPessoaField= new JTextField();
				this.add(nomeDaPessoaField);
				
				JLabel enderecoDaPessoa = new JLabel("Endereço");
				this.add(enderecoDaPessoa);
				
				JTextField enderecoDaPessoaField= new JTextField();
				this.add(enderecoDaPessoaField);		
				
				JLabel numeroDaCasa = new JLabel("Numero");
				this.add(numeroDaCasa);
				
				JTextField numeroDaCasaField= new JTextField();
				this.add(numeroDaCasaField);
				
				JButton btnAdicionar = new JButton("Adicionar");
				this.add(btnAdicionar);
				btnAdicionar.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						String Nome = StringUtils.capitalize(nomeDaPessoaField.getText());
						String Endereco = StringUtils.capitalize(enderecoDaPessoaField.getText());
						int Numero = Integer.parseInt(numeroDaCasaField.getText());

						Informacao cadastro = new Informacao(Nome, Endereco, Numero); 
						cadastros.add(cadastro);
						
						System.out.println("Cadastros:" + cadastros.size());
						nomeDaPessoaField.setText("");
						enderecoDaPessoaField.setText("");
						numeroDaCasaField.setText("");
						
					}
					
					
				});
					JButton btnExibirTodos = new JButton("Exibir todos");
					this.add(btnExibirTodos);
					btnExibirTodos.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							for(int i = 0; i < cadastros.size(); i++) {
								System.out.println(cadastros.get(i));
								
							}
							
							Object[] titulos = {"Nome", "Endereco", "Numero"};
							Object[][] linhas = new Object[cadastros.size()][2];
								for(int i = 0; i < cadastros.size(); i++) {
								
									Object[] linha = new Object[] {cadastros.get(i).getNome(), cadastros.get(i).getEndereco(), cadastros.get(i).getNumero()};
									linhas[i] = linha;	
								}
							JTable table = new JTable(linhas, titulos);
							JOptionPane.showConfirmDialog(null, new JScrollPane(table));
							
						}
						

						
						
					});
				}
				
			}
