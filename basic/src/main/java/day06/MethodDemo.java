package day06;
//方法的演示
public class MethodDemo {
	public static void main(String[] args) {
		//say();
		//say();
		
		//sayHi(); //编译错误，有参则必须传参
		//sayHi(250); //编译错误，参数类型不匹配
		//sayHi("zhangsan"); //String name="zhangsan"
		//sayHi("lisi"); //String name="lisi"
		//sayHi("wangwu"); //String name="wangwu"
		
		//int a = getNum(); //getNum()的值就是return后的那个值
		//System.out.println(a);
		
		//double b = plus(5.5,6.6); //double num1=5.5,double num2=6.6
		//System.out.println(b);
		
		double m=5.5,n=6.6;
		double c = plus(m,n); //double num1=5.5,double num2=6.6
		System.out.println(c);
		
		//a(); //方法的嵌套调用
		System.out.println("over");
	}
	
	//有参有返回值
	public static double plus(double num1,double num2){
		double num = num1+num2;
		return num; //return的是num中的那个数
		//return num1+num2;
	}
	
	//无参有返回值
	public static int getNum(){
		//return; //编译错误，必须返回一个值
		//return 5.6; //编译错误，必须与返回值类型匹配
		return 66; //1.结束方法的执行   2.返回结果给调用方
	}
	
	//有参无返回值
	public static void sayHi(String name){
		System.out.println("大家好，我叫"+name);
		return; //1.结束方法的执行
	}
	
	//无参无返回值
	public static void say(){
		System.out.println("大家好，我叫WKJ");
	}
	
	
	public static void a(){
		System.out.println(111);
		b();
		System.out.println(222);
	}
	public static void b(){
		c();
		System.out.println(333);
	}
	public static void c(){
		System.out.println(444);
		
	}
	
}












