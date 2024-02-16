import java.awt.Color;

import javax.swing.*;

class VentanaGui extends JFrame{
	public VentanaGui() {

		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 450);
		setLocationRelativeTo(null);
		setTitle("GUI - Layout NULO");
		setVisible(true);


		JLabel txtTexto1 = new JLabel("The Classic Form includes all visible fields for this list.");
		txtTexto1.setBounds(10, 10, 380, 20);
		add(txtTexto1);

		JLabel txtTexto2 = new JLabel("FORMS OPTIONS");
		txtTexto2.setBounds(80, 30, 380, 20);
		add(txtTexto2);

		/*--------------------------------------------------------------*/


		JLabel txtTexto4 = new JLabel("Include the following: ");
		txtTexto4.setBounds(10, 50, 380, 20);
		add(txtTexto4);

		JCheckBox checkTitle = new JCheckBox("A title for your from");
		checkTitle.setBounds(10, 68, 380, 20);
		add(checkTitle);

		JTextField Caja1 = new JTextField(10);
		Caja1.setBounds(10, 90, 250, 20);
		add(Caja1);

		JRadioButton txtTexto5 = new JRadioButton("Only requerid field");
		txtTexto5.setBounds(10, 110, 300, 20);
		add(txtTexto5);

		JRadioButton radioalf= new JRadioButton("All fields");
		radioalf.setBounds(10, 130, 300, 20);
		add(radioalf);

		JLabel txtTextoAz = new JLabel("<html>(edit required fields in <font color='blue'>the form builder</font>)</html>");
		txtTextoAz.setBounds(20, 150, 380, 20);
		add(txtTextoAz);
		/*--------------------------------------------------------------*/

		JCheckBox txtTexto6 = new JCheckBox("Interest group field");
		txtTexto6.setBounds(10, 190, 380, 20);
		add(txtTexto6);

		JCheckBox txtTexto7 = new JCheckBox("Required field indicators");
		txtTexto7.setBounds(10, 215, 380, 20);
		add(txtTexto7);

		/*--------------------------------------------------------------*/

		JLabel txtTexto8 = new JLabel("Set form width");
		txtTexto8.setBounds(10, 240, 380, 20);
		add(txtTexto8);

		JTextField Caja2= new JTextField(10);
		Caja2.setBounds(10, 260, 250, 20);
		add(Caja2);

		/*--------------------------------------------------------------*/

		JLabel txtTexto9 = new JLabel("Enhance your form");
		txtTexto9.setBounds(10, 280, 380, 20);
		add(txtTexto9);


		JCheckBox txtTexto10 = new JCheckBox("Enable evil popup made");
		txtTexto10.setBounds(10, 310, 380, 20);
		add(txtTexto10);

		JCheckBox txtTexto11 = new JCheckBox("Disable all Java Script");
		txtTexto11.setBounds(10, 330, 380, 20);
		add(txtTexto11);

		JCheckBox txtTexto12 = new JCheckBox("Include archive link");
		txtTexto12.setBounds(10, 350, 380, 20);
		add(txtTexto12);

		JCheckBox txtTexto13 = new JCheckBox("<html>Include <font color='blue'>MonkeyRewards link</font></html>");
		txtTexto13.setBounds(10, 370, 380, 20);
		add(txtTexto13);
		/*--------------------------------------------------------------*/

		JLabel txtTexto14 = new JLabel("Preview");
		txtTexto14.setBounds(400, 10, 380, 20);
		add(txtTexto14);

		/*JPanel panel2 = new JPanel();
		panel2.setBounds(400, 40, 380, 100);
		panel2.setBorder(BorderFactory.createTitledBorder(""));
		getContentPane().add(panel2);*/


		JLabel txtTexto15 = new JLabel("Email Address ");
		txtTexto15.setBounds(400, 30, 380, 20);
		add(txtTexto15);
		JTextField Caja3 = new JTextField(10);
		Caja3.setBounds(400, 50, 380, 20);
		add(Caja3);

		JLabel txtTexto16 = new JLabel("First Name ");
		txtTexto16.setBounds(400, 68, 380, 20);
		add(txtTexto16);
		JTextField Caja4= new JTextField(10);
		Caja4.setBounds(400, 85, 380, 20);
		add(Caja4);

		JLabel txtTexto17 = new JLabel("Last Name ");
		txtTexto17.setBounds(400, 100, 380, 20);
		add(txtTexto17);
		JTextField Caja5= new JTextField(10);
		Caja5.setBounds(400, 120, 380, 20);
		add(Caja5);

		/*--------------------------------------------------------------*/
		JButton btnSubscribe = new JButton("Subscribe");
		btnSubscribe.setBounds(10, 150, 180, 20);
		/*panel2.add(btnSubscribe);*/

		/*--------------------------------------------------------------*/

		JLabel txtComentarios= new JLabel("Copy/paste onto your site ");
		txtComentarios.setBounds(400, 180, 380, 20);
		add(txtComentarios);

		JTextArea areaComentarios = new JTextArea(10, 20);
		areaComentarios.setBounds(400, 200, 380, 80);
		add(areaComentarios);
	}

}

public class GUI_Layout_NULO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				new VentanaGui();

			}
		});
	}

}