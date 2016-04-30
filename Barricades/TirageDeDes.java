package Barricades;

import java.net.URL;

import javax.swing.ImageIcon;

public class TirageDeDes {
	
	ClassLoader cldr = this.getClass().getClassLoader();
	String path;
	URL imageURL;
	int[][] valeurImageDe = {{2, 3, 4 ,5}, {1, 3, 4, 6}, {1, 2, 5 ,6}, {1, 2, 5, 6}, {1, 3, 4, 6}, {2, 3, 4, 5}};
	
	static ImageIcon[][] imgDe = new ImageIcon[6][4];
	
	TirageDeDes(){
		for(int i = 0; i< 6; i++){
			for(int j = 0; j < 4; ++j){
				path = "des/" + (i + 1) + "-" + valeurImageDe[i][j] + ".png";
				imageURL = cldr.getResource(path);
				imgDe[i][j] = new ImageIcon(imageURL);
			}
		}
		
	}

}
