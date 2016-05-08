
public class Receptie {
	
	private int idReceptie;
	private String program;
	private boolean preluare;
	private Bagaj bagaj;
	private Pasager pasager;
	
	
	public Receptie(int idReceptie, String program, boolean preluare,
			Bagaj bagaj, Pasager pasager) {
		super();
		this.idReceptie = idReceptie;
		this.program = program;
		this.preluare = preluare;
		this.bagaj = bagaj;
		this.pasager = pasager;
	}
	
	public int getIdReceptie() {
		return idReceptie;
	}
	
	public void setIdReceptie(int idReceptie) {
		this.idReceptie = idReceptie;
	}
	
	public String getProgram() {
		return program;
	}
	
	public void setProgram(String program) {
		this.program = program;
	}
	
	public boolean isPreluare() {
		return preluare;
	}
	
	public void setPreluare(boolean preluare) {
		this.preluare = preluare;
	}
	
	public Bagaj getBagaj() {
		return bagaj;
	}
	
	public void setBagaj(Bagaj bagaj) {
		this.bagaj = bagaj;
	}
	
	public Pasager getPasager() {
		return pasager;
	}
	
	public void setPasager(Pasager pasager) {
		this.pasager = pasager;
	}
	
	

}
