package ejercicio_UI;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class N1_jframe extends JFrame {

	private JPanel contentPane;
	private JTextField campo_radio;
	private JTextField campo_altura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					N1_jframe frame = new N1_jframe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public N1_jframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel etiquetaInfo = new JLabel("Calcular Volumen Sable Laser");
		etiquetaInfo.setFont(new Font("Tahoma", Font.BOLD, 11));
		etiquetaInfo.setBounds(10, 11, 165, 14);
		contentPane.add(etiquetaInfo);

		JLabel intro_radio = new JLabel("Introduce Radio:");
		intro_radio.setFont(new Font("Tahoma", Font.BOLD, 11));
		intro_radio.setBounds(10, 47, 94, 14);
		contentPane.add(intro_radio);

		JLabel intro_altura = new JLabel("Introduce Altura:");
		intro_altura.setFont(new Font("Tahoma", Font.BOLD, 11));
		intro_altura.setBounds(10, 72, 97, 14);
		contentPane.add(intro_altura);

		campo_radio = new JTextField();
		campo_radio.setBounds(130, 44, 86, 20);
		contentPane.add(campo_radio);
		campo_radio.setColumns(10);

		campo_altura = new JTextField();
		campo_altura.setBounds(130, 69, 86, 20);
		contentPane.add(campo_altura);
		campo_altura.setColumns(10);
		JTextArea imprimir = new JTextArea();
		imprimir.setBounds(157, 146, 267, 104);
		contentPane.add(imprimir);
		JButton submit = new JButton("Calcular");

		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double radio_introducido = Double.parseDouble(intro_radio.getText());
				double altura_introducido = Double.parseDouble(intro_altura.getText());
				imprimir.append("Area Sable Laser: " + (Math.pow(radio_introducido, 2) * Math.PI * altura_introducido));
			}
		});
		submit.setBounds(10, 227, 89, 23);
		contentPane.add(submit);
	}
}
