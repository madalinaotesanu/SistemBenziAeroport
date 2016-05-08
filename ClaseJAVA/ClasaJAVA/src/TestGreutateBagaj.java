import junit.framework.*;

public class TestGreutateBagaj extends TestCase {
	public TestGreutateBagaj(String name){
		super(name);	
	}
	
	public void testSetGreutate(){
		
		Bagaj b1 = new Bagaj(1,45,35, 25,"Negru","Eticheta1");
		b1.setGreutate(30);
		assertEquals(b1.getGreutate(), 30);
	}

	public void testGetGreutate(){
		Bagaj b1 = new Bagaj(1,45,35, 25,"Negru","Eticheta1");
		b1.setGreutate(30);
		assertEquals(30, b1.getGreutate());
	}
	
	public static void main(String args[]){
		TestGreutateBagaj t = new TestGreutateBagaj("test");
		t.testGetGreutate();
		t.testSetGreutate();
	}
}
