package tf_hus_package;

public class Spielbrett implements ISpielbrett {

//	public int Spielbrett() {
	Spielbrett() {
//           Mulde   0   1   2   3   4   5   6   7 
//	    			 2,  2,  2,  2,  2,  2,  2,  2, // Reihe 0 
//	    			 2,  2,  2,  2,  0,  0,  0,  0, // Reihe 1 
//	    			 0,  0,  0,  0,  2,  2,  2,  2, // Reihe 2 
//	    			 2,  2,  2,  2,  2,  2,  2,  2  // Reihe 3 
//			Reihe 1
			muldenliste[0][0] = 2;
			muldenliste[0][1] = 2;
			muldenliste[0][2] = 2;
			muldenliste[0][3] = 2;
			muldenliste[0][4] = 2;
			muldenliste[0][5] = 2;
			muldenliste[0][6] = 2;
			muldenliste[0][7] = 2;
//			Reihe 2
			muldenliste[1][0] = 2;
			muldenliste[1][1] = 2;
			muldenliste[1][2] = 2;
			muldenliste[1][3] = 2;
			muldenliste[1][4] = 0;
			muldenliste[1][5] = 0;
			muldenliste[1][6] = 0;
			muldenliste[1][7] = 0;
//			Reihe 3
			muldenliste[2][0] = 0;
			muldenliste[2][1] = 0;
			muldenliste[2][2] = 0;
			muldenliste[2][3] = 0;
			muldenliste[2][4] = 2;
			muldenliste[2][5] = 2;
			muldenliste[2][6] = 2;
			muldenliste[2][7] = 2;
//			Reihe 4
			muldenliste[3][0] = 2;
			muldenliste[3][1] = 2;
			muldenliste[3][2] = 2;
			muldenliste[3][3] = 2;
			muldenliste[3][4] = 2;
			muldenliste[3][5] = 2;
			muldenliste[3][6] = 2;
			muldenliste[3][7] = 2;
			
		};		

	@Override
	public String toString() {
	    String str = ""; 
	    for (int i = 0; i <=3; i++) {
	      str = str + "\nReihe " + i + ": ";
	      for (int j = 0; j <=7; j++) {
	        str = str + muldenliste[i][j] + "|";
	      }
	    }
		return "Spielbrett = " + str;
	}

	@Override
	public int getMulde(int reihe, int mulde) throws Exception {
		
		if (  reihe < 0 || reihe > 3 ) { throw new Exception("falscher Wert für Reihe: " + reihe); }
		if (  mulde < 0 || mulde > 7 ) { throw new Exception("falscher Wert für Mulde: " + mulde); }
		
		return muldenliste[reihe][mulde];
	}

	@Override
	public void setMulde(int reihe, int mulde, int neuerWert) throws Exception {
		
		if (  reihe < 0 || reihe > 3 ) { throw new Exception("falscher Wert für Reihe: " + reihe); }
		if (  mulde < 0 || mulde > 7 ) { throw new Exception("falscher Wert für Mulde: " + mulde); }
		
		muldenliste[reihe][mulde] = neuerWert;
	}

}
