package problem02;

public interface Arithmetic {
	int calculate( int a, int b );
}

//
class Sum implements Arithmetic{

	@Override
	public int calculate(int a, int b) {
		return a+b;
	}
	
}

class Mul implements Arithmetic{

	@Override
	public int calculate(int a, int b) {
		return a*b;
	}
	
}

class Sub implements Arithmetic{

	@Override
	public int calculate(int a, int b) {
		return a-b;
	}
	
}

class Div implements Arithmetic{

	@Override
	public int calculate(int a, int b) {
		return a/b;
	}
	
}