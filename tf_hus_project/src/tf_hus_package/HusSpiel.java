package tf_hus_package;

//import java.util.Iterator; 
import java.util.ArrayList;

//Spielfeld
//Muldenliste
//Steine
//4 Reihen
//8 Mulden
//Grundstellung
//Spiel
//Spielfeld
//Spieler
//Spieler
//2 Reihen
//8 Mulden
//entnehmeSteine
//verteileSteine
//plündereGegnerischeSteine
//spieleZug

public class HusSpiel {
  public ISpielbrett spielbrett;
  public ISpieler spieler1;
  public ISpieler spieler2;
  public HusSpiel() {
	  spielbrett = new Spielbrett();
	  spieler1 = new Spieler();
	  spieler2 = new Spieler();
	  spielbrett.toString();
}
}
