package tf_hus_package;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestHusSpiel {

	@Test
	public void test() {
		  ISpielbrett spielbrett = new Spielbrett();
		  ISpieler spieler1 = new Spieler();
		  ISpieler spieler2 = new Spieler();
		  System.out.print( spielbrett.toString() );
		  try {
			spieler1.spieleZug(1, 1);
		  } catch (Exception e) {
			System.err.println("\nException: " + e.getMessage());
		  }
		
//		fail("Not yet implemented");
	}

}
