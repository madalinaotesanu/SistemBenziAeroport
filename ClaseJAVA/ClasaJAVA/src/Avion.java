
public class Avion {
	
	private int idAvion;
	private int ora;
	private String Sosire;
	private String Plecare;
	private String data;
	private Container container;


	public Avion(int idAvion, int ora, String sosire, String plecare,
			String data, Container container) {
		super();
		this.idAvion = idAvion;
		this.ora = ora;
		Sosire = sosire;
		Plecare = plecare;
		this.data = data;
		this.container = container;
	}

	public int getIdAvion() {
		return idAvion;
	}
	
	public void setIdAvion(int idAvion) {
		this.idAvion = idAvion;
	}
	
	public int getOra() {
		return ora;
	}
	
	public void setOra(int ora) {
		this.ora = ora;
	}
	
	public String getSosire() {
		return Sosire;
	}
	
	public void setSosire(String sosire) {
		Sosire = sosire;
	}
	
	public String getPlecare() {
		return Plecare;
	}
	
	public void setPlecare(String plecare) {
		Plecare = plecare;
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public Container getContainer() {
		return container;
	}
	
	public void setContainer(Container container) {
		this.container = container;
	}
	
	public void afisareAvion(){
		System.out.println("ID Avion:" +idAvion);
		System.out.println("Plecare avion:" +Plecare);
		System.out.println("Sosire avion:" +Sosire);
		System.out.println("Data plecare/sosire:" +data);
		System.out.println("Container in avion:");
		container.afisareContainer();
	}
	
	
	

}
