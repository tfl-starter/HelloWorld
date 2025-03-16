package HusCoreTests;

import static org.junit.Assert.*;

import org.junit.Test;

import tf_JHusGame.Platz;

public class PlatzTests {

	@Test
	public void spalteIstAusserhalbDesSpielbrettsTest() {
		Platz cut;
		try {
			cut = new Platz(0,8);
		} catch (IllegalArgumentException e) {
			assertTrue(e.getMessage().contains("not in range 0..7"));
		}
	}
	public void reiheIstAusserhalbDesSpielbrettsTest() {
		Platz cut;
		try {
			cut = new Platz(4,1);
		} catch (IllegalArgumentException e) {
			assertTrue(e.getMessage().contains("not in range 0..3"));
		}
	}

}
