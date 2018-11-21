package cn.dkc.Nov_21;
/*在数组中找两数之和等于给定目标数的下标，并且返回,已知数组已经按升序排好
输入: numbers = [2, 7, 11, 15], target = 9
输出: [1,2]
解释: 2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。*/
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
