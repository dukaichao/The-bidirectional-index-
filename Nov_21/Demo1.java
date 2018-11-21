package cn.dkc.Nov_21;
/*盛最多水的容器
输入: [1,8,6,2,5,4,8,3,7]
输出: 49*/
public class Demo1 {
	public int maxArea(int[] arr) {
		int max = 0;
		int start = 0;
		int end = arr.length - 1;
		while(start<end) {
			max = Math.max(max, Math.min(arr[end], arr[start])*(end - start));
			if(arr[start]>arr[end]) {
				end--;
			}
			else {
				start++;
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int[] arr = {1,8,6,2,5,4,8,3,7};
		System.out.println(new Demo1().maxArea(arr));
	}
}
