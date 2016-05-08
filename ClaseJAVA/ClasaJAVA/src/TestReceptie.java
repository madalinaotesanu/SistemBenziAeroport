import junit.framework.TestCase;

public class TestReceptie extends TestCase {
	
	public void test() {
	
		Bagaj b = new Bagaj(1,30,35, 25,"Negru","Eticheta1");
		Pasager p = new Pasager(1,"Ionescu","Maria",b);
		Receptie r = new Receptie(3,"L-D 8:24",true,b,p);
		
		assertEquals(r instanceof Receptie, true);
		
	}
	

}