import junit.framework.*;

public class TestBagaj extends TestCase {
	
	public void test() {
		
		BagajPierdut b1 = new BagajPierdut(1,30,35, 25,"Negru","Eticheta1",22,"09.05.2016");
		assertEquals(b1 instanceof Bagaj,true);
		
		
		BagajPierdut b2 = new BagajPierdut(2,30,40, 25,"Gri","Eticheta2",22,"09.05.2016");
		assertEquals(b2 instanceof Bagaj,true);
		
		BagajPierdut b3 = new BagajPierdut(3,30,25, 25,"Albastru","Eticheta3",22,"09.05.2016");
		assertEquals(b3 instanceof Bagaj,true);
	}
}
