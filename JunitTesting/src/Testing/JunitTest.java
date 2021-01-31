package Testing;

public class JunitTest {

	public int square(int x) {
		return x*x;
	}
	
	public int countB(String word) {
		int count =0,i;
		for(i=0;i<word.length();i++) {
			if(word.charAt(i)=='b'||word.charAt(i)=='B') {
				count++;
			}
		}
		return count;
	}
}
