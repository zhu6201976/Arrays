/**
Arrays�����ࣺ�����������飨����������������ĸ��ַ���

���÷�����
	ʹ�ö��ַ�����
		Arrays.binarySearch(int[] array, int value);
	��������ת���ַ�������ʽ���
		Arrays.toString(int[] array);
	��������
		Arrays.sort(int[] array);
	����ָ��������
		Arrays.copyOf(int[] array, int length);
		Arrays.copyOf(int[] array, int from, int to);
		System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 
	�ж����������Ƿ����
		Arrays.equels();
	ʹ��ָ��Ԫ���������
		Arrays.fill();
*/

import java.util.Scanner;
import java.util.Arrays;
public class Test{
	public static void main(String[] args){
		
		int[] numbers = {34,4,56,17,90,65};
		// ��ӡԭ����
		System.out.println(Arrays.toString(numbers));
		
		// �����в���100��������±�
		System.out.println(Arrays.binarySearch(numbers,100));
			
		// ��С������������
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		
		// ����numbers2��������ԭ����4��Ĭ��Ϊ0��ֵ
		int[] numbers2 = Arrays.copyOf(numbers,10);
		System.out.println(Arrays.toString(numbers2));
		
		System.out.println("-----------------------");
		// System.arrycopy
		int[] src = {1,2,3,4,5,6,7,8,9,10};
        int[] copy = new int[src.length];
        System.arraycopy(src,0,copy,0,5);
        System.out.println(Arrays.toString(copy));
		
		// ���10��500Ĭ��ֵ������
		int[] numbers3 = new int[10];
		Arrays.fill(numbers3,500);
		System.out.println(Arrays.toString(numbers3));
	
	}
		
}



