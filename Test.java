/**
Arrays工具类：用来操作数组（比如排序和搜索）的各种方法

常用方法：
	使用二分法查找
		Arrays.binarySearch(int[] array, int value);
	数组内容转成字符串的形式输出
		Arrays.toString(int[] array);
	数组排序
		Arrays.sort(int[] array);
	复制指定的数组
		Arrays.copyOf(int[] array, int length);
		Arrays.copyOf(int[] array, int from, int to);
		System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 
	判断两个数组是否相等
		Arrays.equels();
	使用指定元素填充数组
		Arrays.fill();
*/

import java.util.Scanner;
import java.util.Arrays;
public class Test{
	public static void main(String[] args){
		
		int[] numbers = {34,4,56,17,90,65};
		// 打印原数组
		System.out.println(Arrays.toString(numbers));
		
		// 数组中查找100这个数的下标
		System.out.println(Arrays.binarySearch(numbers,100));
			
		// 从小到大排序后输出
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		
		// 数组numbers2拷贝，比原来多4个默认为0的值
		int[] numbers2 = Arrays.copyOf(numbers,10);
		System.out.println(Arrays.toString(numbers2));
		
		System.out.println("-----------------------");
		// System.arrycopy
		int[] src = {1,2,3,4,5,6,7,8,9,10};
        int[] copy = new int[src.length];
        System.arraycopy(src,0,copy,0,5);
        System.out.println(Arrays.toString(copy));
		
		// 填充10个500默认值的数组
		int[] numbers3 = new int[10];
		Arrays.fill(numbers3,500);
		System.out.println(Arrays.toString(numbers3));
	
	}
		
}



