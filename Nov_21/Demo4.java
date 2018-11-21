package cn.dkc.Nov_21;
/*��������������֮�͵��ڸ���Ŀ�������±꣬���ҷ���,��֪�����Ѿ��������ź�
����: numbers = [2, 7, 11, 15], target = 9
���: [1,2]
����: 2 �� 7 ֮�͵���Ŀ���� 9 ����� index1 = 1, index2 = 2 ��*/
public class Demo4 {
	public int[] twoSum(int[] arr,int target) {
		int start = 0;
		int end = arr.length - 1;
		while(start < end) {
			if(arr[start] + arr[end] < target) {
				start++;
				continue;
			}else if(arr[start] + arr[end] > target) {
				end--;
				continue;
			}else
				return new int[] {start+1,end+1};
		}
		return new int[]{-1,-1};
	}
	public static void main(String[] args) {
		int[] arr = {1,3,5,7,9};
		int[] array = new Demo4().twoSum(arr, 12);
		for(int i: array)
			System.out.print(i+" ");
	}
}
