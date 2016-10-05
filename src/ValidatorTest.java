
import static org.junit.Assert.*;
import org.mockito.*;
import org.junit.Test;
public class ValidatorTest {
    //  Two LLs with different sizes should never be equal.
    //  Create two linked lists, both of which have the same value in the initial node,
    // but one has several more nodes. 
    // They should not be equal to each other.
    //@Test
	
	
	
	//test if would generate visitor type number less than 0 or bigger than 4
	@Test
	public void testVisitorTypeNum() {
		Visitor v = new Visitor();
		Generator gen=new Generator();
		v.setType(gen);
		assertFalse(v.type<0);
		assertFalse(v.type>4);
		
	}
    

	
	
	//test if the input is a word whether the program immediately ceases execution
//	@Test
//    public void ifArgumentIsNotAnInteger() {
//        assertFalse(new ValidatorTest().validateArgumentType(new String[] { "test" }));
//    }

	
	//test if visitor type would be equal to generator's returned type
	//set generator's return value to 3
	//the result of visitor type should also be 3
	@Test

	public void testGenerator() {
		Visitor v = new Visitor();
		Generator gen=Mockito.mock(Generator.class);
		Mockito.when(gen.Generator(4)).thenReturn(3);
		v.setType(gen);
		assertEquals(3,v.type);
	}


	//test if returns the right type of visitor
	@Test
	public void testType() {
		Type t = new Type();
		assertEquals("Student", t.Type(0));
		assertEquals("Professor", t.Type(1));
		assertEquals("Business Person", t.Type(2));
		assertEquals("Blogger", t.Type(3));
	}
	
	//set number 1 change from student to driver
	//the returned message should change to "Visitor 1 is a driver."
	@Test
	public void testGetType() {
		Visitor v = new Visitor();
		v.n=1;
		v.type=1;
		Type t=Mockito.mock(Type.class);
		Mockito.when(t.Type(1)).thenReturn("driver");
		assertEquals("Visitor 1 is a driver.", v.getType(t));
	}
	
	//test if returns the right Location
	@Test
	public void testLocation() {
		Location l = new Location();
		assertEquals("The Cathedral of Learning", l.Location(0));
		assertEquals("Squirrel Hill", l.Location(1));
		assertEquals("The Point", l.Location(2));
		assertEquals("Downtown", l.Location(3));
	}
	
	//test if returns the right value in the preference matrix
	//the assigned preMatrix={{false,true,true,true},{true,true,true,true},{false,true,false,true},{false,false,false,false}}
	@Test
	public void testPreMatrix(){
		Preference p=new Preference();
		//student
		assertFalse(p.Preference(0, 0));
		for(int i=1;i<4;i++){
			assertTrue(p.Preference(0, i));
		}
		//Professor
		for(int i=0;i<4;i++){
			assertTrue(p.Preference(1, i));
		}
		//BizPerson
		assertFalse(p.Preference(2, 0));
		assertFalse(p.Preference(2, 2));
		assertTrue(p.Preference(2, 1));
		assertTrue(p.Preference(2, 3));
		//Blogger
		for(int i=0;i<4;i++){
			assertFalse(p.Preference(3, i));
		}
	}

	//test visiting
	//set number to 1, Location to "parking lot", generator number to 1, type to 1
	@Test
		public void testVisiting(){
		Preference pre=new Preference();
		Generator gen=Mockito.mock(Generator.class);
		Mockito.when(gen.Generator(5)).thenReturn(1);
		Location locs=Mockito.mock(Location.class);
		Mockito.when(locs.Location(1)).thenReturn("parking lot");
		Visitor v=new Visitor();
		v.n=1;
		v.type=1;
		assertEquals("Visitor 1 is going to parking lot!",v.visitinfo(locs, pre, gen));
	}
}
