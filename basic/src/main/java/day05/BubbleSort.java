package day05;
//对数组进行冒泡排序
public class BubbleSort {
	public static void main(String[] args) {
		/*
		 * 1)声明整型数组arr，包含10个元素
		 *   每个元素为0到99之间的随机数
		 * 2)冒泡方式对arr数组进行升序排列
		 * 3)输出arr数组中的每一个元素
		 */
		
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++){
			arr[i] = (int)(Math.random()*100);
			System.out.println(arr[i]);
		}
		
		for(int i=0;i<arr.length-1;i++){ //控制轮
			for(int j=0;j<arr.length-1-i;j++){ //控制次数
				if(arr[j]>arr[j+1]){ //每一次都是和它的下一个元素比
					int t = arr[j]; //符合条件则交换
					arr[j] = arr[j+1];
					arr[j+1] = t;
				} 
			}
		}
		
		System.out.println("排序后:");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}










