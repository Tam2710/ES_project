package com.window;

import com.javainuse.model.Tekstil;
import com.window.DroolsTest;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;


public class Window {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
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
	public Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Vrsta garderobe:");
		lblNewLabel.setBounds(10, 11, 92, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Jakna", "Majica", "Pantalone", "Haljina", "Veš"}));
		comboBox.setBounds(10, 36, 92, 22);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Vreme:");
		lblNewLabel_1.setBounds(10, 69, 92, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Hladno", "Osrednje", "Toplo"}));
		comboBox_1.setBounds(10, 94, 92, 22);
		frame.getContentPane().add(comboBox_1);
		
		JLabel lblNewLabel_2 = new JLabel("Prilika:");
		lblNewLabel_2.setBounds(10, 127, 92, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Svakodnevna", "Svečana"}));
		comboBox_2.setBounds(10, 152, 92, 22);
		frame.getContentPane().add(comboBox_2);
		
		JLabel lblNewLabel_3 = new JLabel("Izdržljivo u odnosu na vlagu:");
		lblNewLabel_3.setBounds(10, 185, 150, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Da", "Ne"}));
		comboBox_3.setBounds(10, 210, 92, 22);
		frame.getContentPane().add(comboBox_3);
		
		JLabel lblNewLabel_4 = new JLabel("Izdržljivo u odnosu na trenje:");
		lblNewLabel_4.setBounds(10, 243, 150, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Da", "Ne"}));
		comboBox_4.setBounds(10, 268, 92, 22);
		frame.getContentPane().add(comboBox_4);
		
		JLabel lblNewLabel_5 = new JLabel("Proizvođač/Firma:");
		lblNewLabel_5.setBounds(184, 11, 92, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"TEXTIL doo", "D&B TEXTIL doo", "Gutto doo"}));
		comboBox_5.setBounds(184, 36, 135, 22);
		frame.getContentPane().add(comboBox_5);
		
		JLabel lblNewLabel_6 = new JLabel("Da li je neophodan ugovor za transakciju?");
		lblNewLabel_6.setBounds(184, 69, 210, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"Da", "Ne"}));
		comboBox_6.setBounds(184, 94, 92, 22);
		frame.getContentPane().add(comboBox_6);
		
		JLabel lblNewLabel_7 = new JLabel("Koliko biste platili po metru(kilogramu):");
		lblNewLabel_7.setBounds(184, 127, 210, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Materijal:");
		lblNewLabel_8.setBounds(184, 214, 46, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		JButton btnNewButton = new JButton("Preporuka");
		btnNewButton.setBounds(280, 181, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(184, 237, 185, 53);
		frame.getContentPane().add(textPane);
		
		textField = new JTextField();
		textField.setBounds(184, 153, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				try {
					Tekstil tekstil = new Tekstil();
					
					tekstil.setGarderoba(comboBox.getSelectedItem().toString().toLowerCase());
					tekstil.setVreme(comboBox_1.getSelectedItem().toString().toLowerCase());
					tekstil.setPrilika(comboBox_2.getSelectedItem().toString().toLowerCase());
					tekstil.setOTvlaga(comboBox_3.getSelectedItem().toString().toLowerCase());
					tekstil.setOTtrenja(comboBox_4.getSelectedItem().toString().toLowerCase());
					tekstil.setFirma(comboBox_5.getSelectedItem().toString().toLowerCase());
					tekstil.setUgovor(comboBox_6.getSelectedItem().toString().toLowerCase());
					String text = textField.getText();
					int te = Integer.parseInt(text);
					tekstil.setCena(te);
					DroolsTest.main(null);
					DroolsTest droolsTest = new DroolsTest();
					droolsTest.executeDrools(tekstil);
					
					if(tekstil.getPreporuka()=="Nema preporuke")
						textPane.setText("Ne postoji predlog za takve kriterijume");
					
				} catch (Throwable t) {
		            t.printStackTrace();
		        }
			}
		});
		
		
	}
}
