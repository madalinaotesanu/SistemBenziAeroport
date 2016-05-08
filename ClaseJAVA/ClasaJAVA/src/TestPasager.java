import junit.framework.TestCase;

public class TestPasager extends TestCase {
	
	public void test() {
	
		Bagaj b = new Bagaj(1,30,35, 25,"Negru","Eticheta1");
		Pasager p = new Pasager(1,"Ionescu","Maria",b);
		
		assertEquals(p instanceof Pasager, true);
		
	}
	

}