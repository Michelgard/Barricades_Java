package Barricades;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PanneauLicence extends JPanel{
	
	ClassLoader cldr = this.getClass().getClassLoader();
	static ImageIcon imgTapis;
	final JTextArea edit = new JTextArea(40, 50);
	
	private static final long serialVersionUID = 1L;

	PanneauLicence(){
		String path ="images/tapis_maison.jpg";
	    URL imageURL = cldr.getResource(path);
	    imgTapis = new ImageIcon(imageURL);
	    String inputLine = null;
	    String inputLine2 ="        ";
	    BufferedReader in = null;
	    try{
			path ="fichiers/licence.txt";
			imageURL = cldr.getResource(path);
			InputStreamReader reader = new InputStreamReader(imageURL.openStream());
			in = new BufferedReader(reader);
			
				while ((inputLine = in.readLine()) != null){
					inputLine2 =  inputLine2 + "        " + inputLine + "\n";
				}
			in.close();
        	}
        catch(Exception e2){
        	System.out.println(e2); 
        }
	    edit.setFont(new Font("Verdana",1,12));
	    edit.setText(inputLine2);
	    
	    add( new JScrollPane(edit), BorderLayout.NORTH );
	}
	
	public void paintComponent(Graphics g){
		imgTapis.paintIcon(this, g, 0, 0);
	}
}