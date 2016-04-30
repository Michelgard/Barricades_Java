package Barricades;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

public class Fenetre  extends JFrame {

	private static final long serialVersionUID = 1L;
	private ImageIcon imgTapis;
	ClassLoader cldr = this.getClass().getClassLoader();
	
	static JMenuBar menu_bar1;
	static JMenu menu1;
	static JMenu menu2;
	static JMenu menu3;
	
	PanneauDep pan = new PanneauDep();
	static PanneauJeu panJeu = new PanneauJeu();
	static PanneauVersion panVersion= new PanneauVersion();
	static PanneauLicence panLicence= new PanneauLicence();
	static PanneauRegles panRegles= new PanneauRegles();
	
	static lesPlaces placement;
	static lesPions desPions;
	static TirageDeDes lesDes;
	
	static String[] couleursJoueurs = {"jaune", "vert", "rouge", "bleu"}; 
	static int nbJoueur = 4;
	static Joueur[] joueurs;
	
	public Fenetre(){
		setTitle("Les barricades");
		setSize (700,725);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		/*String path ="images/icone.gif";
		URL imageURL = cldr.getResource(path);
		setIconImage(new ImageIcon(imageURL).getImage());*/
		
		menu_bar1 = new JMenuBar();
		
		menu1 = new JMenu("Partie");
		JMenuItem debut = new JMenuItem("Nouvelle une partie");
		JMenuItem retour = new JMenuItem("Revenir au jeu");
		JMenuItem fin = new JMenuItem("Fin");
		menu1.add(debut);
		menu1.add(retour);
		menu1.add(fin);
		menu_bar1.add(menu1);
		
		menu3 = new JMenu("Joueurs");
		menu3.setMnemonic(KeyEvent.VK_O);

		ButtonGroup group = new ButtonGroup();
		
		JRadioButtonMenuItem menuItem2 = new JRadioButtonMenuItem("2");
	    group.add(menuItem2);
	    menu3.add(menuItem2);

	    JRadioButtonMenuItem menuItem3 = new JRadioButtonMenuItem("3");
	    group.add(menuItem3);
	    menu3.add(menuItem3);

	    JRadioButtonMenuItem menuItem4 = new JRadioButtonMenuItem("4");
	    menuItem4.setSelected(true);
	    group.add(menuItem4);
	    menu3.add(menuItem4);

	    menu_bar1.add(menu3);
	    
		menu2 = new JMenu("A Propos");
		JMenuItem regles = new JMenuItem("La Règle du jeu");
		JMenuItem licence = new JMenuItem("Licence");
		JMenuItem version = new JMenuItem("Version");
		menu2.add(regles);
		menu2.add(licence);
		menu2.add(version);
		menu_bar1.add(menu2);
		
		setJMenuBar(menu_bar1);
		
		debut.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				desPions = new lesPions();
				placement = new lesPlaces();
				placement.placementPionDepart();
				
				lesDes = new TirageDeDes();
				
				if(menuItem2.isSelected()){
					nbJoueur = 2;
				}
				else if(menuItem3.isSelected()){
					nbJoueur = 3;
				}
				else if(menuItem4.isSelected()){
					nbJoueur = 4;
				}
				//System.out.println(nbJoueur);
				joueurs = new Joueur[nbJoueur];
				for (int i = 0; i < nbJoueur; ++i){
					joueurs[i] = new Joueur(couleursJoueurs[i]);
				}
				Random r = new Random();
				int valeur = r.nextInt(nbJoueur);
				
				joueurs[valeur].setJoue(true);
				setContentPane(panJeu);
				setVisible(true);
			}
		});
		
		retour.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(desPions != null){
					setContentPane(panJeu);
					setVisible(true);
				}
			}
		});
		
		fin.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				setContentPane(pan);
				setVisible(true);
			}
		});
		
		version.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				setContentPane(panVersion);
				setVisible(true);
			}
		});
		
		licence.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				setContentPane(panLicence);
				setVisible(true);
			}
		});
		
		regles.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				setContentPane(panRegles);
				setVisible(true);
			}
		});
		
		setContentPane(pan);
		setVisible(true);
	}

	public ImageIcon getImgTapis() {
		return imgTapis;
	}

	public void setImgTapis(ImageIcon imgTapis) {
		this.imgTapis = imgTapis;
	}
}
