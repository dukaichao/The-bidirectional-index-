package cn.dkc.Nov_21;
/*反转元音字母
输入: "hello"
输出: "holle"*/
public class Demo2 {
	public static void main(String[] args) {
		String str = "edocteel";
		char[] buff = str.toCharArray();
		int start = 0;
		int end = buff.length - 1;
		while(start<end) {
			char temp = '0';
			if(!isEqualChar(buff[start])) {
				start++;
				continue;
			}
			if(!isEqualChar(buff[end])) {
				end--;
				continue;
			}
			if(start<end) {
				temp = buff[start];
				buff[start] = buff[end];
				buff[end] = temp;
			}
			start++;
			end--;
		}
		System.out.println(new String(buff));
	}
	
	public static boolean isEqualChar(char c) {
		char[] arr = {'a','i','e','o','u','A','E','I','O','U'};
		for(int i = 0;i<arr.length;i++) {
			if(c == arr[i])
				return true;
		}
		return false;
	}
}
