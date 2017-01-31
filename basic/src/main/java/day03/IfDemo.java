package day03;
//分支结构的演示
public class IfDemo {
	public static void main(String[] args) {
		int num = 8;
		switch(num){ //byte,short,int,char
		case 3: //相当于if(num==1){
			System.out.println(111);
			break;
		case 1: //以此为入口
			System.out.println(222);
			break; //跳出switch
		case 2:
			System.out.println(333);
			break;
		default: //所有case都没匹配时执行
			System.out.println(666);
		}
	}
}

















