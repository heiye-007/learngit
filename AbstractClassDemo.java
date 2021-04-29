public class AbstractClassDemo{
	public static void main(String[] args){
		// A a =new A();
		// a.method1();
		B b=new B();
		b.method1();
		
		A a=new B();
		a.method1();
	}
}
abstract class A{
	private int a;
	private String b;
	public A(){}
	public A(int a,String b){
		this.a=a;
		this.b=b;
	}
	abstract void method1();
}
class B extends A{
	public void method1(){
		System.out.println("我是一个完整的方法");
	}
}