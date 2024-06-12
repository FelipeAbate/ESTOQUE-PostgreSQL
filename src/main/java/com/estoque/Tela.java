package com.estoque;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela {

	private JFrame frame;
	private JTextField textFUsuario;
	private JTextField textFieldSenhaUsuario;
	private JLabel lblSenhaUsuario;
	private JButton btnEntrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela window = new Tela();
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
	public Tela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 128, 192));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFUsuario = new JTextField();
		textFUsuario.setBounds(113, 81, 225, 20);
		frame.getContentPane().add(textFUsuario);
		textFUsuario.setColumns(10);
		
		textFieldSenhaUsuario = new JTextField();
		textFieldSenhaUsuario.setBounds(113, 147, 225, 20);
		frame.getContentPane().add(textFieldSenhaUsuario);
		textFieldSenhaUsuario.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Usuário");
		lblUsuario.setBounds(114, 56, 46, 14);
		frame.getContentPane().add(lblUsuario);
		
		lblSenhaUsuario = new JLabel("Senha");
		lblSenhaUsuario.setBounds(113, 122, 46, 14);
		frame.getContentPane().add(lblSenhaUsuario);
		
		btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(checkLogin(textFUsuario.getText(), new String (textFieldSenhaUsuario.getText()))) {
					
					JOptionPane.showMessageDialog(null, "Bem vindo");
				}
				else {
					JOptionPane.showMessageDialog(null, "Senha Incorreta");
				}
				
			}
		});
		btnEntrar.setBounds(113, 195, 89, 23);
		frame.getContentPane().add(btnEntrar);
	}
	
	
	public boolean checkLogin(String login, String senha){
		
		return login.equals("Isabel") && senha.equals("123");
	}
	
}
