
public class BagajPierdut extends Bagaj {
	
	private int ora;
	private String data;
	
	public BagajPierdut(int idBagaj, int greutate, int lungime, int latime,
			String culoare, String eticheta, int ora, String data) {
		super(idBagaj, greutate, lungime, latime, culoare, eticheta);
		this.ora = ora;
		this.data = data;
	}
	public int getOra() {
		return ora;
	}
	public void setOra(int ora) {
		this.ora = ora;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	

	

}
