package botonrandio;





import java.awt.Color;

import java.awt.EventQueue;



import javax.swing.ButtonGroup;

import javax.swing.JFrame;

import java.awt.Toolkit;

import javax.swing.JLabel;

import javax.swing.border.BevelBorder;

import javax.swing.JRadioButton;

import java.awt.Font;

import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;



public class boton 

{



	private JFrame frmBotonRadio;

	private JLabel lblColor;



	/**

	 * Launch the application.

	 */

	public static void main(String[] args) 

	{

		EventQueue.invokeLater(new Runnable()

		{

			public void run()

			{

				try {

					boton window = new boton();

					window.frmBotonRadio.setVisible(true);

				} 

				catch (Exception e)

				{

					e.printStackTrace();

				}

			}

		});

	}



	/**

	 * Create the application.

	 */

	public boton()

	{

		initialize();

	}



	/**

	 * Initialize the contents of the frame.

	 */

	private void initialize() {

		frmBotonRadio = new JFrame();

		frmBotonRadio.setTitle("Boton Radio");

		frmBotonRadio.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno\\Downloads\\cecytem.jpg"));

		frmBotonRadio.setBounds(100, 100, 577, 388);

		frmBotonRadio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frmBotonRadio.getContentPane().setLayout(null);

		frmBotonRadio.setLocationRelativeTo(null);

		

		lblColor = new JLabel("");

		lblColor.setOpaque(true);

		lblColor.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));

		lblColor.setBounds(276, 27, 231, 296);

		frmBotonRadio.getContentPane().add(lblColor);

		

		JRadioButton radRojo = new JRadioButton("Rojo");

		radRojo.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e)

			{

				lblColor.setBackground(Color.red);

			}

		});

		radRojo.setFont(new Font("Tahoma", Font.BOLD, 12));

		radRojo.setBounds(39, 26, 109, 23);

		frmBotonRadio.getContentPane().add(radRojo);

		

		JRadioButton radVerde = new JRadioButton("Verde");

		radVerde.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) 

			{

				lblColor.setBackground(Color.green);

			}

		});

		radVerde.setFont(new Font("Tahoma", Font.BOLD, 12));

		radVerde.setBounds(39, 66, 109, 23);

		frmBotonRadio.getContentPane().add(radVerde);

		

		JRadioButton radAzul = new JRadioButton("Azul");

		radAzul.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e)

			{

				lblColor.setBackground(Color.blue);

			}

		});

		radAzul.setFont(new Font("Tahoma", Font.BOLD, 12));

		radAzul.setBounds(39, 103, 109, 23);

		frmBotonRadio.getContentPane().add(radAzul);

		

		

		

		JRadioButton radRosa = new JRadioButton("Rosa");

		radRosa.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e)

			{

				lblColor.setBackground(Color.pink);

			}

		});

		radRosa.setFont(new Font("Tahoma", Font.BOLD, 12));

		radRosa.setBounds(39, 144, 109, 23);

		frmBotonRadio.getContentPane().add(radRosa);

		

		JRadioButton radNegro = new JRadioButton("Negro");

		radNegro.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) 

			{

				lblColor.setBackground(Color.black);

			}

		});

		radNegro.setFont(new Font("Tahoma", Font.BOLD, 12));

		radNegro.setBounds(39, 180, 109, 23);

		frmBotonRadio.getContentPane().add(radNegro);

		

		JRadioButton radAmarillo = new JRadioButton("Amarillo");

		radAmarillo.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) 

			{

				lblColor.setBackground(Color.yellow);

			}

		});

		radAmarillo.setFont(new Font("Tahoma", Font.BOLD, 12));

		radAmarillo.setBounds(39, 221, 109, 23);

		frmBotonRadio.getContentPane().add(radAmarillo);

		

		JRadioButton radNaranja = new JRadioButton("Naranja");

		radNaranja.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) 

			{

				lblColor.setBackground(Color.orange);

			}

		});

		radNaranja.setFont(new Font("Tahoma", Font.BOLD, 12));

		radNaranja.setBounds(39, 261, 109, 23);

		frmBotonRadio.getContentPane().add(radNaranja);

		

		JRadioButton radGris = new JRadioButton("Gris");

		radGris.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) 

			{

				lblColor.setBackground(Color.gray);

			}

		});

		radGris.setFont(new Font("Tahoma", Font.BOLD, 12));

		radGris.setBounds(39, 304, 109, 23);

		frmBotonRadio.getContentPane().add(radGris);

		

		ButtonGroup grupo= new ButtonGroup();

		grupo.add(radAzul);

		grupo.add(radRojo);

		grupo.add(radVerde);

		grupo.add(radRosa);

		grupo.add(radAmarillo);

		grupo.add(radNegro);

		grupo.add(radNaranja);

		grupo.add(radGris);

		

	}

}

