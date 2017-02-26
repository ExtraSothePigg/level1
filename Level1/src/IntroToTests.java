import static org.junit.Assert.*;

import org.junit.Test;

public class IntroToTests {

	@Test
	public void test() {
		assertEquals(7,add(3,4));
		assertEquals(9,squareRoot(3));
		assertEquals("Hi bob",giveGreeting("bob"));
		assertEquals("Hi bob!!!",giveEnthusiasticGreeting("bob"));
		
		assertTrue(isWeekend("Sunday"));
		assertFalse(isWeekend("Thursday"));
		
		assertEquals("A",getGrade(95));
		assertEquals("B",getGrade(82));
		assertEquals("C",getGrade(76));
		assertEquals("D",getGrade(63));
		assertEquals("F",getGrade(30));
		
		assertEquals("StuffStuffStuff",repeat(3,"Stuff"));
		
		Person p = new Person();
		p.setname("Sam");
		p.setage(14);
		p.setdateOfBirth("02/02/02");
		p.setheight(5.5);
		p.setnumberOfKids(3);
		p.setoccupation("babysitting");
		
		assertEquals("Sam",p.getname());
		assertEquals(14,p.getage());
		assertEquals("02/02/02",p.getdateOfBirth());
		assertEquals(5.5,p.getheight(),0.0001);
		assertEquals(3,p.getnumberOfKids());
		assertEquals("babysitting",p.getoccupation());
	}

	String repeat(int i, String s) {
		String y = "";
		for(int x = 0;x<i;x++){
			y = y+s;
		}
		return y;
	}

	String getGrade(int grade) {
		if(grade >=90){
			return "A";
		}else if(grade >=80 &&grade <=89){
			return "B";
		}else if(grade >=70 &&grade <=79){
			return "C";
		}else if(grade >=60 &&grade <=69){
			return "D";
		}else if(grade <=59){
			return "F";
		}else{
		return null;
	}
	}

	String giveEnthusiasticGreeting(String string) {
		return "Hi "+string+"!!!";
	}

	String giveGreeting(String string) {
		return "Hi "+string;
	}

	int squareRoot(int i) {
		return i*i;
	}

	int add(int i, int j) {
		 return i + j;
	}
	boolean isWeekend(String s){
		if(s.equals("Saturday") || s.equals("Sunday")){
			return true;
		}else{
			return false;
		}
	}


}
