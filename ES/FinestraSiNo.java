package ES;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

//Descripcio: Finestra que pregunta a l'usuari sobre una accio

public class FinestraSiNo extends JDialog{
	
	private int eleccio;//eleccio de l'usuari
	/**
     * @pre --
     * @post genera una finestra de pregunta
     * @param t pregunta a realitzar
     */
	public FinestraSiNo(String t){
		setTitle("Escull:");
		
		
		JPanel panell = new JPanel();
		panell.setBackground(Color.decode("#4F4F4F"));
		panell.setLayout(new BoxLayout(panell, BoxLayout.Y_AXIS));
		
		JPanel ptext = new JPanel();
		ptext.setBackground(Color.decode("#4F4F4F"));
		JLabel text = new JLabel(t);
		ptext.add(text);
		
		text.setForeground(Color.yellow);
		panell.add(ptext);
		OmplirBotons(panell);
		getContentPane().add(panell, BorderLayout.CENTER);
		setModal(true);
	    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	    pack(); 
	    
	}
	/**
     * @pre --
     * @post afegeix els botons a la finestra
     * @param p panell principal de la finestra
     */
	private void OmplirBotons(JPanel panell){
		JPanel botons = new JPanel();
		botons.setBackground(Color.decode("#4F4F4F"));
		JButton si = new JButton("NO");
		si.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { 
  			  	eleccio = 0;
				dispose();
				setVisible(false);
			}} );
		JButton no = new JButton("SI");
		no.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { 
  			  	eleccio = 1;
				dispose();
				setVisible(false);
			}} );
		botons.add(si);
		botons.add(no);
		panell.add(botons);
	}
	/**
     * @pre --
     * @post obtenim l'eleccio de l'usuari
     * @return retorna la opcio escollida
     */
	public int seleccionar(){
		setLocationRelativeTo(null);
		setVisible(true);
		return eleccio;
		
	}
 
}