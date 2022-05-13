package y2p3;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class baslangic {
	public baslangic() {
		tahta a = new tahta();
		
		JFrame frame = new JFrame("YAZLAB2 PROJE3");
		frame.setSize(600, 600);
		frame.setLocation(500, 0);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(Color.white);
		
		JLabel bas_iLabel = new JLabel();
		JLabel bas_jLabel = new JLabel();
		JLabel hedef_iLabel = new JLabel();
		JLabel hedef_jLabel = new JLabel();
		JLabel engelSayisiLabel = new JLabel();
		
		JTextField bas_iTextField = new JTextField(100);
		JTextField bas_jTextField = new JTextField(100);
		JTextField hedef_iTextField = new JTextField(100);
		JTextField hedef_jTextField = new JTextField(100);
		JTextField engelSayisiTextField = new JTextField(100);
		
		JButton basla = new JButton("BAÞLA");
		basla.setSize(100,40);
		basla.setLocation(250, 400);
		basla.setBackground(Color.darkGray);
		basla.setForeground(Color.black);
		
		bas_iLabel.setText("baþlangýç noktasýnýn x koordinat deðeri: ");
		bas_jLabel.setText("baþlangýç noktasýnýn y koordinat deðeri: ");
		hedef_iLabel.setText("hedef noktasýnýn x koordinat deðeri: ");
		hedef_jLabel.setText("baþlangýç noktasýnýn j koordinat deðeri: ");
		engelSayisiLabel.setText("engel(kýrmýzý kýsýmlarýn) sayýsý: ");
		
		bas_iLabel.setLocation(10, 50);
		bas_iLabel.setSize(400, 100);
		bas_iTextField.setLocation(300, 90);
		bas_iTextField.setSize(40, 25);
		
		bas_jLabel.setLocation(10, 90);
		bas_jLabel.setSize(400, 100);
		bas_jTextField.setLocation(300, 130);
		bas_jTextField.setSize(40, 25);
		
		hedef_iLabel.setLocation(10, 130);
		hedef_iLabel.setSize(400, 100);
		hedef_iTextField.setLocation(300, 170);
		hedef_iTextField.setSize(40, 25);
		
		hedef_jLabel.setLocation(10, 170);
		hedef_jLabel.setSize(400, 100);
		hedef_jTextField.setLocation(300, 210);
		hedef_jTextField.setSize(40, 25);
		
		engelSayisiLabel.setLocation(10, 210);
		engelSayisiLabel.setSize(400, 100);
		engelSayisiTextField.setLocation(300, 250);
		engelSayisiTextField.setSize(40, 25);
		
		frame.getContentPane().add(basla);	
		frame.getContentPane().add(bas_iLabel);	
		frame.getContentPane().add(bas_iTextField);	
		frame.getContentPane().add(bas_jLabel);
		frame.getContentPane().add(bas_jTextField);	
		frame.getContentPane().add(hedef_iLabel);	
		frame.getContentPane().add(hedef_iTextField);	
		frame.getContentPane().add(hedef_jLabel);	
		frame.getContentPane().add(hedef_jTextField);
		frame.getContentPane().add(engelSayisiLabel);
		frame.getContentPane().add(engelSayisiTextField);
		
		basla.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int strb_i = Integer.parseInt(bas_iTextField.getText());
				int strb_j = Integer.parseInt(bas_jTextField.getText());
				int strh_i = Integer.parseInt(hedef_iTextField.getText());
				int strh_j = Integer.parseInt(hedef_jTextField.getText());
				int str_e = Integer.parseInt(engelSayisiTextField.getText());
				frame.setVisible(false);
				a.Islemler(strb_i, strb_j, strh_i, strh_j, str_e);
				
			}
		});
	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
	}

}
