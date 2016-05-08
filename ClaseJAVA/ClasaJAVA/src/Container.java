
public class Container {
	private int idContainer;
	private int greutateContainer;
	private Bagaj bagaj;
	
	
	
	public Container(int idContainer, int greutateContainer, Bagaj bagaj) {
		super();
		this.idContainer = idContainer;
		this.greutateContainer = greutateContainer;
		this.bagaj = bagaj;
	}

	public int getIdContainer() {
		return idContainer;
	}
	
	public void setIdContainer(int idContainer) {
		this.idContainer = idContainer;
	}
	
	public int getGreutateContainer() {
		return greutateContainer;
	}
	
	public void setGreutateContainer(int greutateContainer) {
		this.greutateContainer = greutateContainer;
	}
	
	public Bagaj getBagaj() {
		return bagaj;
	}
	
	public void setBagaj(Bagaj bagaj) {
		this.bagaj = bagaj;
	}
	
	public void afisareContainer(){
		System.out.println("ID Container:" +idContainer);
		System.out.println("Greutate container:" +greutateContainer);
		System.out.println("Bagajul din container este:");
		bagaj.afisareBagaj();
		}
	
	

}
