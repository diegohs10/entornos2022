package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.DropMode;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextField;

public class Misventanas {

	private JFrame frame;
	private JTextField txtDatosDeDepartamento;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Misventanas window = new Misventanas();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Misventanas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 128));
		panel.setForeground(new Color(255, 255, 128));
		panel.setBounds(24, 55, 387, 141);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setForeground(Color.BLUE);
		textField.setBackground(new Color(238, 130, 238));
		textField.setBounds(192, 26, 56, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(192, 55, 158, 19);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(192, 84, 158, 19);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JTextPane txtpnCdigoDepartamento = new JTextPane();
		txtpnCdigoDepartamento.setBackground(new Color(255, 255, 128));
		txtpnCdigoDepartamento.setFont(new Font("Arial Black", Font.PLAIN, 12));
		txtpnCdigoDepartamento.setText("Código Departamento:");
		txtpnCdigoDepartamento.setBounds(20, 26, 172, 19);
		panel.add(txtpnCdigoDepartamento);
		
		JTextPane txtpnNombreDepartamento = new JTextPane();
		txtpnNombreDepartamento.setText("Nombre Departamento:");
		txtpnNombreDepartamento.setFont(new Font("Arial Black", Font.PLAIN, 12));
		txtpnNombreDepartamento.setBackground(new Color(255, 255, 128));
		txtpnNombreDepartamento.setBounds(20, 55, 172, 19);
		panel.add(txtpnNombreDepartamento);
		
		JTextPane txtpnLocalidadDepartamento = new JTextPane();
		txtpnLocalidadDepartamento.setForeground(new Color(0, 0, 0));
		txtpnLocalidadDepartamento.setText("Localidad Departamento:");
		txtpnLocalidadDepartamento.setFont(new Font("Arial Black", Font.PLAIN, 12));
		txtpnLocalidadDepartamento.setBackground(new Color(255, 255, 128));
		txtpnLocalidadDepartamento.setBounds(20, 84, 185, 19);
		panel.add(txtpnLocalidadDepartamento);
		
		txtDatosDeDepartamento = new JTextField();
		txtDatosDeDepartamento.setFont(new Font("Arial Black", Font.PLAIN, 15));
		txtDatosDeDepartamento.setToolTipText("");
		txtDatosDeDepartamento.setHorizontalAlignment(SwingConstants.CENTER);
		txtDatosDeDepartamento.setBackground(SystemColor.menu);
		txtDatosDeDepartamento.setForeground(new Color(0, 0, 255));
		txtDatosDeDepartamento.setText("DATOS DE DEPARTAMENTO");
		txtDatosDeDepartamento.setBounds(51, 10, 319, 35);
		frame.getContentPane().add(txtDatosDeDepartamento);
		txtDatosDeDepartamento.setColumns(10);
		
		JButton btnNewButton = new JButton("Insertar Datos");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnNewButton.setBounds(73, 218, 137, 28);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnLimpiarDatos = new JButton("Limpiar Datos");
		btnLimpiarDatos.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnLimpiarDatos.setBounds(220, 218, 137, 28);
		frame.getContentPane().add(btnLimpiarDatos);
	}
}
