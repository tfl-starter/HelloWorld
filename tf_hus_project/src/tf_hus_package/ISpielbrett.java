package tf_hus_package;

public interface ISpielbrett {
	int[][] muldenliste = new int[4][8]; // 4 Reihen & 8 Mulden
	public int getMulde(int reihe, int mulde) throws Exception;
	public void setMulde(int reihe, int mulde, int neuerWert) throws Exception;
}