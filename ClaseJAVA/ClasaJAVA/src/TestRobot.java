import junit.framework.TestCase;

public class TestRobot extends TestCase {
	
	public void test() {
		Bagaj b = new Bagaj(1,30,50,30,"Roz","Eticheta1");
		Container c = new Container(1,50,b);
		Robot r = new Robot(1,"Automatizat","Robocop",c);
		
		assertEquals(r instanceof Robot, true);
	}
}
