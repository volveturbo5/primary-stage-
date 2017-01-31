package day02;

//数据类型的演示
public class DataTypeDemo {
	public static void main(String[] args) {
		
		
		/*
		 * 基本类型间的转换:
		 * 1.声明整型变量a并赋值为5
		 *   声明长整型变量b并赋值为a
		 *   声明整型变量c并赋值为b
		 * 2.声明长整型变量d并赋值为100亿
		 *   声明整型变量e并赋值为d，输出e的值
		 * 3.声明浮点型变量f并赋值为56.987
		 *   声明整型变量g并赋值为f，输出g的值
		 * 4.声明byte型变量b1并赋值为5
		 *   声明byte型变量b2并赋值为6
		 *   声明byte型变量b3并赋值为b1+b2 
		 */
		
		/*
		//基本类型间的转换
		int a = 5;
		long b = a; //自动类型转换
		int c = (int)b; //强制类型转换
		
		long d = 5; //自动类型转换
		double e = 5; //自动类型转换
		
		long f = 10000000000L;
		int g = (int)f;
		System.out.println(g); //溢出
		
		double h = 25.98765;
		int i = (int)h;
		System.out.println(i); //精度的丢失
		
		byte b1 = 5; //整数直接量可以直接赋值给byte,short,char，但不能超出范围
		byte b2 = 6;
		byte b3 = (byte)(b1+b2);
		System.out.println(b3); //11
		*/
		
		
		
		
		
		/*
		 * boolean、char的练习:
		 * 1.声明布尔型变量b1并赋值为true
		 *   声明布尔型变量b2并赋值为false
		 *   声明布尔型变量b3并赋值为5-------???
		 * 2.声明字符型变量:
		 *     c1并赋值为字符男，c2并赋值为字符m，
		 *     c3并赋值为字符6，c4并赋值为空格符，
		 *     c5并赋值为空字符------------???
		 *     c6并赋值为中国--------------???
		 *   声明字符型变量c7并赋值为97，输出c7的值
		 *   输出2+2的值，输出'2'+'2'的值
		 *   声明字符型变量c8并赋值为单引号，输出c8的值  
		 */
		
		/*
		//5.char:字符型，2个字节
		char c1 = '女';
		char c2 = 'f';
		char c3 = '5';
		char c4 = ' ';
		//char c5 = 女; //编译错误，必须放在单引号中
		//char c6 = ''; //编译错误，必须有字符
		//char c7 = '女性'; //编译错误，只能有一个字符
		
		char c8 = 65; //0到65535之间
		System.out.println(c8); //A
		
		System.out.println(2+2); //4
		System.out.println('2'+'2'); //100，'2'的码50+'2'的码50
		
		char c9 = '\'';
		System.out.println(c9); //'
		*/
		
		/*
		//4.boolean:布尔型，1个字节，只能取值为true和false
		boolean b1 = true; //true为布尔型直接量
		boolean b2 = false;
		//boolean b3 = 250; //编译错误，数据类型不匹配
		*/
		
		/*
		 * int、long、double的练习:
		 * 1.声明整型变量a并赋值为250
		 *   声明整型变量b并赋值为100亿------???
		 *   输出5/3的值，输出3/5的值
		 *   声明整型变量c并赋值为2147483647,
		 *     在c本身基础之上增1，输出c的值
		 * 2.声明长整型变量d并赋值为100亿
		 *   声明长整型变量e并赋值为10亿*2*10L，输出e的值
		 *   声明长整型变量f并赋值为10亿*3*10L，输出f的值   
		 *   声明长整型变量g并赋值为10亿L*3*10，输出g的值
		 *   声明长整型变量h并赋值为
		 *     System.currentTimeMillis()，输出h的值
		 * 3.声明浮点型变量i并赋值为3.14
		 *   声明浮点型变量j和k，并分别赋值为3.0和2.9，
		 *     输出j-k的值
		 */
		
		/*
		//3.double:浮点型，8个字节，很大很大很大
		double a = 3.14; //3.14为浮点数直接量，默认为double型
		float b = 3.14F;
		
		double c = 6.0;
		double d = 4.9;
		System.out.println(c-d); //1.0999999999999996，舍入误差
		*/
		
		/*
		//2.long:长整型，8个字节，很大很大很大
		long a = 250L; //250L为长整型直接量
		//long b = 10000000000; //编译错误，100亿默认为int型，但超范围了
		long c = 10000000000L;
		
		//运算时有可能溢出，建议在第1个数字后加L
		long d = 1000000000*2*10L;
		System.out.println(d); //200亿
		long e = 1000000000*3*10L;
		System.out.println(e); //溢出了
		long f = 1000000000L*3*10;
		System.out.println(f); //300亿
		
		//获取自1970.1.1零时到此时此刻的毫秒数
		long g = System.currentTimeMillis();
		System.out.println(g);
		*/
		
		/*
		//1.int:整型，4个字节，-21个多亿到21个多亿
		int a = 250; //250叫整数直接量，默认为int型
		//int b = 10000000000; //编译错误，100亿默认为int型，但超出范围了
		
		System.out.println(5/2); //2，两个整数相除，结果还是整数，小数位无条件舍弃了
		System.out.println(2/5); //0
		
		int c = 2147483647; //int的最大值
		c = c+1; //溢出为最小值
		System.out.println(c); //-2147483648
		*/
	}
}

























