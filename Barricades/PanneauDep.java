package Barricades;

import java.awt.Graphics;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanneauDep extends JPanel{
	
	ClassLoader cldr = this.getClass().getClassLoader();
	static ImageIcon imgTapis;
	
	private static final long serialVersionUID = 1L;

	PanneauDep(){
		String path ="images/tapis_maison.jpg";
	    URL imageURL = cldr.getResource(path);
	    imgTapis = new ImageIcon(imageURL);
		
	}
	
	public void paintComponent(Graphics g){
		imgTapis.paintIcon(this, g, 0, 0);
	}

}
