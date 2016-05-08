
public class Bagaj {

	private int idBagaj;
	private int greutate;
	private int lungime;
	private int latime;
	private String culoare;
	private String eticheta;
	
	public Bagaj(int idBagaj, int greutate, int lungime, int latime,
			String culoare, String eticheta) {
		super();
		this.idBagaj = idBagaj;
		this.greutate = greutate;
		this.lungime = lungime;
		this.latime = latime;
		this.culoare = culoare;
		this.eticheta = eticheta;
	}

	public int getIdBagaj() {
		return idBagaj;
	}

	public void setIdBagaj(int idBagaj) {
		this.idBagaj = idBagaj;
	}

	public int getGreutate() {
		return greutate;
	}

	public void setGreutate(int greutate) {
		this.greutate = greutate;
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

	public String getCuloare() {
		return culoare;
	}

	public void setCuloare(String culoare) {
		this.culoare = culoare;
	}
	
	
	public String getEticheta() {
		return eticheta;
	}

	public void setEticheta(String eticheta) {
		this.eticheta = eticheta;
	}

	public void modificareGreutate(){
		if(greutate > 30)
			this.greutate = 30;	
		
	}
	
	public boolean verificareGreutateBagaj(){
	    if(greutate == 30)
		    return true;
		else
		 	return false;
			
	}
	
	public void afisareBagaj(){
		
		System.out.println("Id Bagaj:"+idBagaj);
		System.out.println("Greutate Bagaj:"+greutate);
		System.out.println("Lungime Bagaj:"+lungime);
		System.out.println("Latime Bagaj:"+latime);
		System.out.println("Culoare Bagaj:"+culoare);
		System.out.println("Eticheta Bagaj:"+eticheta);
	}
	
}
