package chek;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

public class chekRgb {

	private JFrame frmColores;
	private JCheckBox chckVerde;
	private JCheckBox chckRojo;
	private JCheckBox chckAzul;
	private JLabel lblColor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					chekRgb window = new chekRgb();
					window.frmColores.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public chekRgb() {
		initialize();
	}

	public void asignarcolor () {
		int r=(chckRojo.isSelected())?255:0;
		int g=(chckVerde.isSelected())?255:0;
		int b=(chckAzul.isSelected())?255:0;
		lblColor.setBackground(new Color (r,g,b));
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmColores = new JFrame();
		frmColores.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno\\Downloads\\descarga.jpg"));
		frmColores.setTitle("COLORES");
		frmColores.setBounds(100, 100, 450, 300);
		frmColores.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmColores.getContentPane().setLayout(null);
		frmColores.setLocationRelativeTo(null);
		
		chckRojo = new JCheckBox("Rojo");
		chckRojo.setFont(new Font("Tahoma", Font.BOLD, 12));
		chckRojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asignarcolor();
			}
		});
		chckRojo.setBounds(39, 52, 97, 23);
		frmColores.getContentPane().add(chckRojo);
		
		chckVerde = new JCheckBox("Verde");
		chckVerde.setFont(new Font("Tahoma", Font.BOLD, 12));
		chckVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asignarcolor();
			}
		});
		chckVerde.setBounds(39, 104, 97, 23);
		frmColores.getContentPane().add(chckVerde);
		
		chckAzul = new JCheckBox("Azul");
		chckAzul.setFont(new Font("Tahoma", Font.BOLD, 12));
		chckAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asignarcolor();
			}
		});
		chckAzul.setBounds(39, 154, 97, 23);
		frmColores.getContentPane().add(chckAzul);
		
		lblColor = new JLabel("");
		lblColor.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblColor.setOpaque(true);
		lblColor.setBounds(190, 26, 234, 224);
		frmColores.getContentPane().add(lblColor);
	}
}
