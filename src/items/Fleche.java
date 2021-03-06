package items;

import java.awt.image.BufferedImage;

import GUI.ImageContainer;
import acteurs.Archer;
import acteurs.Personnage;
import main.Game;

public class Fleche extends Consommable {

	public Fleche(Game game) {
		super(game);
		
	}

	
	public void useOn(Personnage perso) {
		if(perso.getClass().getName() == "acteurs.Archer"){
			((Archer)perso).incrementFleche(); //Casting car par le if, on est s�r que perso est un Archer
		}

	}

	
	public BufferedImage getImage() {
		
		return ImageContainer.imageFleche;
	}

}
