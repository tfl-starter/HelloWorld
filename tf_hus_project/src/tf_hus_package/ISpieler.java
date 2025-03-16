package tf_hus_package;

public interface ISpieler {
	public String name = "";
	public int entnehmeSteine() throws Exception;
	public int verteileSteine() throws Exception;
	public int spieleZug(int reihe, int mulde) throws Exception;
}
