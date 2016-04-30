package Barricades;

public class Place {
	//position de la place en carré
	private int posX;
	private int posY;
	private int posX2;
	private int posY2;
	
	//posibilité de déplacement entre place
	private int[] tabDir;
	
	//couleur de la place 1 vide, 2 noir, 3 jaunde, 4 vert, 5 rouge, 6 bleu
	private int couleur;
	
	//Si pion sur la place
	private Pion position = null;
	
	//numero de la place dans le tableau des place
	private int numeroPlace;
	
	public Place(int x, int y, int coul, int[] tab, int numPlace){
		//position place
		setPosX(x);
		setPosY(y);
		setPosX2(x + 40);
		setPosY2(y + 40);
		//couleur de la place 1 vide, 2 noir, 3 jaune, 4 vert, 5 rouge, 6 bleu
		setCouleur(coul);
		
		//direction posible de la place haut, droite, bas, gauche
		setTabDir(tab);
		
		setNumeroPlace(numPlace);
		
		//pas de pion au démarrage
		setPosition(null);
		
	}

	public void AffichagePlace(){	
		System.out.println(getPosX() + " / " + getPosY() + " et " + getPosX2() + " / " + getPosY2());
		System.out.println(getNumeroPlace());
	}
	
	// set et get
	public int getPosX() {
		return posX;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}
	public int getPosY() {
		return posY;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}
	public int getPosX2() {
		return posX2;
	}
	public void setPosX2(int posX2) {
		this.posX2 = posX2;
	}
	public int getPosY2() {
		return posY2;
	}
	public void setPosY2(int posY2) {
		this.posY2 = posY2;
	}

	public int getCouleur() {
		return couleur;
	}

	public void setCouleur(int couleur) {
		this.couleur = couleur;
	}

	public int[] getTabDir() {
		return tabDir;
	}

	public void setTabDir(int[] tabDir) {
		this.tabDir = tabDir;
	}

	public Pion getPosition() {
		return position;
	}

	public void setPosition(Pion position) {
		this.position = position;
	}

	public int getNumeroPlace() {
		return numeroPlace;
	}

	public void setNumeroPlace(int numeroPlace) {
		this.numeroPlace = numeroPlace;
	}
}
