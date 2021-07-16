package company;

public class A4_Que_1 {

	public static void main(String[] args) {
		
		Add addFunction =(x, y) -> x + y;
		System.out.println("The addition is: " +addFunction.add(12, 3)); 
		
		Sub subFunction =(x, y) -> x - y;
		System.out.println("The subraction is: " +subFunction.sub(12, 3)); 
		
		Mul mulFunction =(x, y) -> x * y;
		System.out.println("The multiplication is: " +mulFunction.mul(12, 3)); 
		
		Divide divideFunction =(x, y) -> x / y;
		System.out.println("The division is: " +divideFunction.divide(12, 3)); 
		
	}
	
	interface Add{
		int add(int a, int b);
		}
	interface Sub{
		int sub(int a, int b);
		}
	interface Mul{
		int mul(int a, int b);
		}
	interface Divide{
		int divide(int a, int b);
		}
}
