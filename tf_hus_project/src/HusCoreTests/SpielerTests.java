package HusCoreTests;

import static org.junit.Assert.*;
import org.junit.Test;

import HusCore.*;
import junit.framework.AssertionFailedError;
import tf_JHusGame.Platz;
import tf_JHusGame.Spielbrett;
import tf_JHusGame.Spieler;

public class SpielerTests {

	private Spielbrett spielbrett; 
	private Spieler spieler;

	private void startZiel(int startReihe, int startSpalte, int zielReihe, int zielSpalte) {
		assertEquals(spieler.nächsterPlatzImUhrzeigersinn(startReihe, startSpalte).get_reihe() , new Platz(zielReihe, zielSpalte).get_reihe() );
		assertEquals(spieler.nächsterPlatzImUhrzeigersinn(startReihe, startSpalte).get_spalte(), new Platz(zielReihe, zielSpalte).get_spalte() );		
	}
	
	@Test
	public void NächsterPlatzImUhrzeigersinnFindetNächstenPlatzSpieler1() {
		
		spielbrett = new Spielbrett();
		spieler = new Spieler(1, "Eins", spielbrett);
		int reihe1 = 0;
		int reihe2 = 1;
		
		startZiel(reihe1,0,reihe1,1);
		startZiel(reihe1,1,reihe1,2);
		startZiel(reihe1,2,reihe1,3);
		startZiel(reihe1,3,reihe1,4);
		startZiel(reihe1,4,reihe1,5);
		startZiel(reihe1,5,reihe1,6);
		startZiel(reihe1,6,reihe1,7);
		startZiel(reihe1,7,reihe2,7);
		startZiel(reihe2,7,reihe2,6);
		startZiel(reihe2,6,reihe2,5);
		startZiel(reihe2,5,reihe2,4);
		startZiel(reihe2,4,reihe2,3);
		startZiel(reihe2,3,reihe2,2);
		startZiel(reihe2,2,reihe2,1);
		startZiel(reihe2,1,reihe2,0);
		startZiel(reihe2,0,reihe1,0);
	}
	
	@Test
	public void NächsterPlatzImUhrzeigersinnFindetNächstenPlatzSpieler2() {
		spielbrett = new Spielbrett();
		spieler = new Spieler(2, "Zwei", spielbrett);
		int reihe1 = 2;
		int reihe2 = 3;
		
		startZiel(reihe1,0,reihe1,1);
		startZiel(reihe1,1,reihe1,2);
		startZiel(reihe1,2,reihe1,3);
		startZiel(reihe1,3,reihe1,4);
		startZiel(reihe1,4,reihe1,5);
		startZiel(reihe1,5,reihe1,6);
		startZiel(reihe1,6,reihe1,7);
		startZiel(reihe1,7,reihe2,7);
		startZiel(reihe2,7,reihe2,6);
		startZiel(reihe2,6,reihe2,5);
		startZiel(reihe2,5,reihe2,4);
		startZiel(reihe2,4,reihe2,3);
		startZiel(reihe2,3,reihe2,2);
		startZiel(reihe2,2,reihe2,1);
		startZiel(reihe2,1,reihe2,0);
		startZiel(reihe2,0,reihe1,0);
	}

	@Test
	public void NächsterPlatzImUhrzeigersinnEntdecktFehler() {
		spielbrett = new Spielbrett();
		spieler = new Spieler(2, "Zwei", spielbrett);
		int reihe1 = 2;
		
		try {
			startZiel(reihe1,0,reihe1,2);	
		
		} catch (IllegalArgumentException e) {
			assertTrue(e.getMessage().contains("expected:<1> but was:<2>"));
		}
	}
}
