import junit.framework.TestCase;

public class TestContainer extends TestCase {
	
	public void test() {
		Bagaj b = new Bagaj(1,30,50,30,"Roz","Eticheta1");
		Container c = new Container(1,50,b);
		
		assertEquals(c instanceof Container, true);
		
	}
	

}