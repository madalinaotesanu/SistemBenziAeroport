import junit.framework.*;

public class TestAvion extends TestCase {
	
	 public void test() {
		Bagaj b1 = new Bagaj(1,30,50,30,"ALB","Eticheta2");
		Container c1 = new Container(1,50,b1);
		Avion a1 = new Avion(1,22,"Sosire Roma 22","Plecare Bucuresti 20","09.05.2016",c1);
		
		assertEquals(a1 instanceof Avion,true);
		
   }
}


