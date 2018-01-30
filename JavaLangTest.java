
public class JavaLangTest {

	public static void main(String[] args) {
		new JavaLangTest();
	}
	
	public JavaLangTest() {		
		testIf();
		testFor();
		testWhile();
		testSwitch();
		testDoWhile();
	}
	
	private void testIf() {
		boolean isTrue = true;
		if( isTrue ) {
			System.out.println("if isTrue is true");
		} else {
			System.out.println("if isTrue is false");
		}
	}
	
	private void testFor() {
		for( int i = 0; i < 2; i++ ) {
			System.out.println("for i is " + i);
		}
	}
	
	private void testWhile() {
		int i = 0;
		while( i < 3 ) {
			System.out.println("while i is "+ i);
			i++;
		}
	}
	
	private void testDoWhile() {
		int i = 4;
		do {
			System.out.println("do while i is "+ i);
			i++;
		} while( i < 3 );
	}
	
	private void testSwitch() {
		int s = 3;
		switch( s ) {
			case 1:
				System.out.println("case of s is " + s );
				break;
			case 2:
				System.out.println("case of s is " + s );
				break;
			case 3:
				System.out.println("case of s is " + s );
				break;
			default:
				System.out.println("default case when s is "+ s );
		}
	}
	
}
