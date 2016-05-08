import junit.framework.TestCase;


public class TestBandaDisponibila extends TestCase {
	
	public void test() {
		
		Banda banda1 = new Banda(1,30,2,true,"Automata","Functionala-dreapta");
		banda1.getSensBanda();
		
		assertEquals(banda1 instanceof Banda, true);
		
	}
	

}