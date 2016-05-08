
public class Robot {
	
	private int idRobot;
	private String tipRobot;
	private String numeRobot;
	private Container container;
	
	public Robot(int idRobot, String tipRobot, String numeRobot,
			Container container) {
		super();
		this.idRobot = idRobot;
		this.tipRobot = tipRobot;
		this.numeRobot = numeRobot;
		this.container = container;
	}

	public int getIdRobot() {
		return idRobot;
	}

	public void setIdRobot(int idRobot) {
		this.idRobot = idRobot;
	}

	public String getTipRobot() {
		return tipRobot;
	}

	public void setTipRobot(String tipRobot) {
		this.tipRobot = tipRobot;
	}

	public String getNumeRobot() {
		return numeRobot;
	}

	public void setNumeRobot(String numeRobot) {
		this.numeRobot = numeRobot;
	}

	public Container getContainer() {
		return container;
	}

	public void setContainer(Container container) {
		this.container = container;
	}
	
	
	
	

}
