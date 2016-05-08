
public class Banda {
	private int idBanda;
	private int lungime;
	private int latime;
	private boolean cantar;
	private String tipBanda;
	private String sensBanda;
	
	public Banda(int idBanda, int lungime, int latime, boolean cantar,
			String tipBanda, String sensBanda) {
		super();
		this.idBanda = idBanda;
		this.lungime = lungime;
		this.latime = latime;
		this.cantar = cantar;
		this.tipBanda = tipBanda;
		this.sensBanda = sensBanda;
	}

	public int getIdBanda() {
		return idBanda;
	}

	public void setIdBanda(int idBanda) {
		this.idBanda = idBanda;
	}

	public int getLungime() {
		return lungime;
	}

	public void setLungime(int lungime) {
		this.lungime = lungime;
	}

	public int getLatime() {
		return latime;
	}

	public void setLatime(int latime) {
		this.latime = latime;
	}

	public boolean isCantar() {
		return cantar;
	}

	public void setCantar(boolean cantar) {
		this.cantar = cantar;
	}

	public String getTipBanda() {
		return tipBanda;
	}

	public void setTipBanda(String tipBanda) {
		this.tipBanda = tipBanda;
	}

	public String getSensBanda() {
		return sensBanda;
	}

	public void setSensBanda(String sensBanda) {
		this.sensBanda = sensBanda;
	}
	
	public void afisareBanda(){
		
		System.out.println("ID Banda:" +idBanda);
		System.out.println("Lungime banda:" +lungime);
		System.out.println("Latime banda:" +latime);
		System.out.println("Are banda cantar?" +cantar);
		System.out.println("Sensul benzii este:" +sensBanda);
		System.out.println("Tipul benzii este:" +tipBanda);
	}
	
	
	
	

}
