import static org.junit.Assert.*;

import org.junit.Test;

public class TestsPassing {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
  @Test
	public void test1(){
		assertEquals("wpaafnfclaekses",weaveStrings("waffles","pancakes"));
	}
  @Test
	public void test2(){
		assertEquals("Mntvrst",removeVowels("MountEverest"));
	}
	@Test
	public void test3(){
		assertEquals("toboRtoboR",reverseRepeat("Robot"));
	}
	
	
	private String reverseRepeat(String string) {
		String rvs = "";
		for(int i = 0; i < string.length();i++){
		rvs += ""+string.charAt(string.length()-i-1);
		}
		rvs = rvs+rvs;
		System.out.println(rvs);
		return rvs;
	}
	private String removeVowels(String string) {
		String noVwl = "";
		for(int i = 0; i < string.length();i++){
			if(string.charAt(i)==('a')||string.charAt(i)==('e')||string.charAt(i)==('i')||string.charAt(i)==('o')||string.charAt(i)==('u')||string.charAt(i)==('A')||string.charAt(i)==('E')||string.charAt(i)==('I')||string.charAt(i)==('O')||string.charAt(i)==('U')){
				noVwl += "";
			}else{
				noVwl += ""+string.charAt(i);
			}
		}
		System.out.println(noVwl);
		return noVwl;
	}
	private String weaveStrings(String s, String s2) {
		String weaved = "";
		if(s.length()>s2.length()){
			for(int i = 0; i < s.length(); i++){
				weaved += ""+s.charAt(i)+s2.charAt(i);
			}
		}else{
			for(int i = 0; i < s2.length(); i++){
				weaved += ""+s.charAt(i)+s2.charAt(i);
			}
			}
		System.out.println(weaved);
		return weaved;
	}

}
