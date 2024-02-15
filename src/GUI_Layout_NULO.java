import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

class VentanaGUI extends JFrame{
	public VentanaGUI(){

		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 500);
		setLocationRelativeTo(null);
		setTitle("GUI - Layout NULO");
		setVisible(true);

		JLabel txtTexto1 = new JLabel("The Classic Form inckudes fields for this list.");
		txtTexto1.setBounds(10, 10, 310, 20);
		add(txtTexto1);

		JLabel txtTexto2 = new JLabel ("FORMS OPTIONS");
		txtTexto2.setBounds(60, 30, 150, 20);
		add(txtTexto2);

		/*--------------------------------------------------------------*/
		JLabel txtTexto3 = new JLabel("A title for your form");
		txtTexto3.setBounds(60, 60, 160, 20);
		add(txtTexto3);

		JTextField textField = new JTextField();
		textField.setBounds(35, 90, 170, 20);
		add(textField);

		// Crear un JCheckBox
		JCheckBox checkBox = new JCheckBox();
		checkBox.setBounds(40, 60, 20, 20); 
		add(checkBox);
		/*--------------------------------------------------------------*/

		JLabel txtTexto4 = new JLabel("Only requerid field");
		txtTexto4.setBounds(60, 125, 160, 20);
		add(txtTexto4);

		// Crear un JRadioButton 
		JRadioButton radioButton = new JRadioButton();
		radioButton.setBounds(40, 125, 160, 20);
		add(radioButton);

		/*---------------------------------------------------------------*/

		JLabel txtTexto5 = new JLabel ("All fields");
		txtTexto5.setBounds(60, 150, 170, 20);
		add(txtTexto5);

		JRadioButton radioB = new JRadioButton();
		radioB.setBounds(40, 150, 160, 20);
		add(radioB);

		JLabel txtTexto = new JLabel("<html>(edit required fields in <font color='blue'>the form builder</font>)</html>");
		txtTexto.setBounds(25, 160, 300, 40);
		add(txtTexto);

		/*---------------------------------------------------------------*/

		JLabel txtTexto6 = new JLabel("Interest group field");
		txtTexto6.setBounds(65, 200, 150, 20);
		add(txtTexto6);

		JTextField textFieldd = new JTextField();
		textFieldd.setBounds(35, 90, 170, 20);
		add(textFieldd);

		// Crear un JCheckBox
		JCheckBox checkBoox = new JCheckBox();
		checkBoox.setBounds(40, 200, 300, 20); 
		add(checkBoox);

		/*---------------------------------------------------------------*/

		JLabel txtTexto7 = new JLabel("Required field indicators");
		txtTexto7.setBounds(65, 225, 150, 20);
		add(txtTexto7);

		JTextField textFieeld = new JTextField();
		textFieeld.setBounds(35, 90, 170, 20);
		add(textFieeld);

		// Crear un JCheckBox
		JCheckBox cheeckBox = new JCheckBox();
		cheeckBox.setBounds(40, 225, 400, 20); 
		add(cheeckBox);
		/*---------------------------------------------------------------*/

		JLabel txtTexto8 = new JLabel("Set form width");
		txtTexto8.setBounds(50, 250, 150, 20);
		add(txtTexto8);

		JTextField textFieldW = new JTextField();
		textFieldW.setBounds(35, 270, 180, 20);
		add(textFieldW);

		/*---------------------------------------------------------------*/
		JLabel label = new JLabel("Enhance your form");
		label.setBounds(35, 300, 150, 20);
		add(label);
		/*---------------------------------------------------------------*/

		JLabel txtTexto9 = new JLabel("Enable evil popup mode");
		txtTexto9.setBounds(65, 330, 150, 20);
		add(txtTexto9);

		JTextField textFiield = new JTextField();
		textFiield.setBounds(35, 90, 170, 20);
		add(textFiield);

		// Crear un JCheckBox
		JCheckBox cheecckBox = new JCheckBox();
		cheecckBox.setBounds(40, 330, 400, 20); 
		add(cheecckBox);
		/*---------------------------------------------------------------*/

		JLabel txtTexto10 = new JLabel("Disable all JavaScript ");
		txtTexto10.setBounds(65, 350, 150, 20);
		add(txtTexto10);

		JTextField texttField = new JTextField();
		texttField.setBounds(35, 90, 170, 20);
		add(texttField);

		// Crear un JCheckBox
		JCheckBox chheckBox = new JCheckBox();
		chheckBox.setBounds(40, 350, 400, 20); 
		add(chheckBox);

		/*---------------------------------------------------------------*/

		JLabel txtTexto11 = new JLabel("Include archive link ");
		txtTexto11.setBounds(65, 370, 150, 20);
		add(txtTexto11);

		JTextField ttextField = new JTextField();
		ttextField.setBounds(35, 90, 170, 20);
		add(ttextField);

		// Crear un JCheckBox
		JCheckBox checkkBox = new JCheckBox();
		checkkBox.setBounds(40, 370, 400, 20); 
		add(checkkBox);
		/*---------------------------------------------------------------*/

		JLabel txtTexto12 = new JLabel("<html>Include <font color='blue'>MonkeyRewards link</font></html>");
		txtTexto12.setBounds(65, 390, 300, 20);
		add(txtTexto12);

		JCheckBox checkbBox = new JCheckBox();
		checkbBox.setBounds(40, 390, 300, 20);
		add(checkbBox);
		/*---------------------------------------------------------------*/


		JLabel txtTexto13 = new JLabel("Preview");
		txtTexto13.setBounds(300, 10, 100, 20);
		add(txtTexto13);

		JLabel labelEmailAddress = new JLabel("Email address");
		labelEmailAddress.setBounds(300, 40, 150, 20);
		add(labelEmailAddress);

		JFormattedTextField txtFF = new JFormattedTextField();
		txtFF.setBounds(300, 70, 200, 20);
		add(txtFF);

		// Crear un JLabel para "First name"
		JLabel txtTexto14 = new JLabel("First name");
		txtTexto14.setBounds(300, 100, 150, 20);
		add(txtTexto14);

		// Crear un JTextField para el primer nombre
		JTextField txtNF = new JTextField();
		txtNF.setBounds(300, 130, 200, 20);
		add(txtNF);

		// Crear un JLabel para "Last name"
		JLabel txtTexto15 = new JLabel("Last name");
		txtTexto15.setBounds(300, 160, 150, 20);
		add(txtTexto15);

		// Crear un JTextField para el apellido
		JTextField txtF = new JTextField();
		txtF.setBounds(300, 190, 200, 20);
		add(txtF);

		/*---------------------------------------------------------------*/


	}


}
public class GUI_Layout_NULO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//PARA QUE EL TEXTO APAREZCA MAS RAPIDO (HILOS)
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub

				//mandar a llamar 
				new VentanaGUI();
			}
		});


	}

}
