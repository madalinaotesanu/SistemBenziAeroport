
public class Pasager {
	private int idPasager;
	private String numePasager;
	private String prenumePasager;
	private Bagaj bagaj;
	
	
	public Pasager(int idPasager, String numePasager, String prenumePasager,
			Bagaj bagaj) {
		super();
		this.idPasager = idPasager;
		this.numePasager = numePasager;
		this.prenumePasager = prenumePasager;
		this.bagaj = bagaj;
	}

	public int getIdPasager() {
		return idPasager;
	}
	
	public void setIdPasager(int idPasager) {
		this.idPasager = idPasager;
	}
	
	public String getNumePasager() {
		return numePasager;
	}
	
	public void setNumePasager(String numePasager) {
		this.numePasager = numePasager;
	}
	
	public String getPrenumePasager() {
		return prenumePasager;
	}
	
	public void setPrenumePasager(String prenumePasager) {
		this.prenumePasager = prenumePasager;
	}
	
	public Bagaj getBagaj() {
		return bagaj;
	}
	
	public void setBagaj(Bagaj bagaj) {
		this.bagaj = bagaj;
	}
	
	

}