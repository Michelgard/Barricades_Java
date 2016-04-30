package Barricades;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class PanneauVersion extends JPanel{
	
	ClassLoader cldr = this.getClass().getClassLoader();
	static ImageIcon imgTapis;
	
	private static final long serialVersionUID = 1L;

	PanneauVersion(){
		String path ="images/tapis_maison.jpg";
	    URL imageURL = cldr.getResource(path);
	    imgTapis = new ImageIcon(imageURL);
	    
	    JLabel label = new JLabel("<html><center>Barricades<br>Copyright Michel Cavaud 2016. <br>Tous droits réservés. <br>Version 0.6 Avril 2016 <br>raspberrypi.gard@gmail.com <br>http://rasp-pi.fr.nf/</html>");
	    			
	    label.setPreferredSize(new Dimension(400, 400));
	    label.setFont(new Font("Verdana",1,20));
	    label.setBorder(new LineBorder(Color.BLACK));
	    label.setOpaque(true);
	    label.setBackground(Color.GREEN);
	    label.setHorizontalAlignment(JLabel.CENTER);
	    label.setVerticalAlignment(JLabel.CENTER);
	    add(label);
	}
	
	public void paintComponent(Graphics g){
		imgTapis.paintIcon(this, g, 0, 0);
	}

}