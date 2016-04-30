package Barricades;

public class lesPlaces {
	
	private int tabPlace[][] = { 
	{0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0},
	{1,1,1,1,1,1,1,1,2,1,1,1,1,1,1,1,1},
	{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
	{1,1,1,1,1,1,1,1,2,1,1,1,1,1,1,1,1},
	{0,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0},
	{0,0,0,0,0,0,1,1,2,1,1,0,0,0,0,0,0},
	{0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0},
	{0,0,0,0,1,1,2,1,1,1,2,1,1,0,0,0,0},
	{0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0},
	{0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0},
	{0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0},
	{2,1,1,1,2,1,1,1,2,1,1,1,2,1,1,1,2},
	{1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1},
	{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
	{0,3,0,3,0,4,0,4,0,5,0,5,0,6,0,6,0},
	{0,3,3,3,0,4,4,4,0,5,5,5,0,6,6,6,0}
	};

	private int tabPlaceHaut[][] = { 
	{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	{0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0},
	{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
	{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
	{0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0},
	{0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0},
	{0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0},
	{0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0},
	{0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0},
	{0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0},
	{0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0},
	{0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0},
	{1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1},
	{1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1},
	{0,1,1,1,0,1,1,1,0,1,1,1,0,1,1,1,0},
	{0,1,1,0,0,1,1,0,0,1,1,0,0,1,1,0,0}
	};
	
	private int tabPlaceDroite[][] = { 
	{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
	{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
	{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	{0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0},
	{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	{0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0,0},
	{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	{0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0},
	{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
	{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
	{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
	};
	
	private int tabPlaceBas[][] = { 
	{0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0},
	{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
	{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
	{0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0},
	{0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0},
	{0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0},
	{0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0},
	{0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0},
	{0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0},
	{0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0},
	{0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0},
	{1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1},
	{1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1},
	{0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0},
	{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
	};
	
	private int tabPlaceGauche[][] = { 
	{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	{0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
	{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	{0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
	{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	{0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0},
	{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	{0,0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0},
	{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	{0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0},
	{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	{0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
	{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	{0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
	{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
	};

	private Place tabDesPlaces[] = new Place[133];
	
	private int departX = 10;
	private int departY = 14;
	private int dep = 40;
	
	//construction de toutes les places
	public lesPlaces(){
		int z = 0;
		for (int i = 0; i < 16; ++i){
			for (int j = 0; j < 17; ++j){
				if (getTabPlace()[i][j] != 0){
					int tabDir[] = {tabPlaceHaut[i][j], tabPlaceDroite[i][j], tabPlaceBas[i][j], tabPlaceGauche[i][j]};
					tabDesPlaces[z] = new Place(departX + (j * dep), departY + (i * dep), getTabPlace()[i][j], tabDir, z);
					//tabDesPlaces[z].AffichagePlace();
					++z;
				}
			}
		}
		//place pour barricades en attente
		int tabDir[] = {0, 0, 0, 0};
		tabDesPlaces[132] = new Place(50, 250, 0, tabDir, 132);
	}
	
	public void placementPionDepart(){
		int h = 0;
		for (int i = 112; i < 132; ++i){
			//pion positionné sur une place
			tabDesPlaces[i].setPosition(Fenetre.desPions.getPions().get(h));
			
			// position x et y de la place sur le pion
			Fenetre.desPions.getPions().get(h).moveTo(tabDesPlaces[i].getPosX(), tabDesPlaces[i].getPosY());
			
			// numero  place sur le pion
			Fenetre.desPions.getPions().get(h).setPlace(tabDesPlaces[i]);
			++h;
		}
		for(int i = 0; i<112; ++i){
			if(tabDesPlaces[i].getCouleur() == 2){
				//pion positionné sur une place
				tabDesPlaces[i].setPosition(Fenetre.desPions.getPions().get(h));
				// position x et y de la place sur le pion
				Fenetre.desPions.getPions().get(h).moveTo(tabDesPlaces[i].getPosX(), tabDesPlaces[i].getPosY());
				// numero  place sur le pion
				Fenetre.desPions.getPions().get(h).setPlace(tabDesPlaces[i]);
				++h;
			}
		}
		//System.out.println(Fenetre.desPions.getPions().size());
	}
	
	public Place bonnePosition(int x, int y){
		
		boolean placex = false;
		boolean placey = false;
		for (int i = 0; i < tabDesPlaces.length; ++i){
			placex = ((x > tabDesPlaces[i].getPosX()) && (x < tabDesPlaces[i].getPosX2()));
			placey = ((y > tabDesPlaces[i].getPosY()) && (y < tabDesPlaces[i].getPosY2()));
			if (placex && placey){
				return tabDesPlaces[i];
			} 
		}
		return null;
		
		
	}
	
	// Get et set variables
	public int[][] getTabPlace() {
		return tabPlace;
	}

	public void setTabPlace(int tabPlace[][]) {
		this.tabPlace = tabPlace;
	}

	public Place[] getTabDesPlaces() {
		return tabDesPlaces;
	}

	public void setTabDesPlaces(Place tabDesPlaces[]) {
		this.tabDesPlaces = tabDesPlaces;
	}
}
