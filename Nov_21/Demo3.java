package cn.dkc.Nov_21;
/*判断回文，该回文只包含数字和字符
输入: "race a car"
输出: false*/
public class Demo3 {
	public boolean isHuiWen(String s) {
		String str = s.toLowerCase();
		char[] buff = str.toCharArray();
		int start = 0;
		int end = buff.length - 1;
		while(start<end) {
			if(!isChar(buff[start])&&!isNum(buff[start])) {
				start++;
				continue;
			}
			if(!isChar(buff[end])&&!isNum(buff[end])) {
				end--;
				continue;
			}
			if(buff[start]!=buff[end])
				return false;
			start++;
			end--;
		}
		return true;
	}
	public static boolean isChar(char c) {
		if(96<c&&c<123)
			return true;
		return false;
	}
	
	public static boolean isNum(char c) {
		int i =  c - '0';
		if(0<=i&&i<=9)
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		String s = "a ba";
		System.out.println(new Demo3().isHuiWen(s));
	}
}
