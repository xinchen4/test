package headfirst;
import java.util.Arrays;
import java.util.Stack;
public class StringUtils {
	
	/**
	 * 反转一个字符串
	 * @param str
	 * @return
	 * @throws Exception if the {@code str} argument is an empty String
	 */
	public static String reverseStr(String str) throws Exception{
		if (str.isEmpty()) {
			throw new Exception("String empty");
		}
		char temp[]=str.toCharArray();
		System.out.println(temp);
//		swap character
		int index = 0;
		int check = str.length() / 2;
		while (index < (str.length() / 2)) {
			char holder = temp[index];
			temp[index] = temp[str.length() - index - 1];
			temp[str.length() - index - 1] = holder;

			index++;
		}
		System.out.println(temp);

		return new String(temp);
	}
	
	/**
	 * 简单冒泡排序算法
	 * @param a int数组
	 */
	public static void bubbleSort(int[] a){
		if (a.length == 0) {
			System.out.println("int array length is 0");
			return;
		}
//		标记无序区最后一个key的位置，初始状态为数组最后1个元素
		int bound = a.length - 1;
		while (bound != 0) {
//			对无序区的每一个元素和其相邻元素比较
			for (int i = 0; i < bound; i++) {
//				如果无序则交换
				if (a[i] > a[i + 1]) {
					int hold = a[i];
					a[i] = a[i + 1];
					a[i + 1] = hold;
				}
//				每趟比较后，无序区位置标记－1
				bound--;
			}			
		}
//		System.out.println("tes");
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
	}
	
	public static boolean isBracketMatch(String sequence){
		if (sequence.isEmpty()) {
			System.out.println("length is 0");
		}
		char[] ch = sequence.toCharArray();
		
		 Stack<Character> stack = new Stack<Character>();
		 for (int i = 0; i < sequence.length(); i++) {
			if (ch[i]=='('||ch[i]=='['||ch[i]=='{') {
				stack.push(ch[i]);
			}else if (ch[i]==')'||ch[i]==']'||ch[i]=='}') {
				if (stack.isEmpty()) {
					return false;
				}
				switch (ch[i]) {
				case ')':
					if (stack.peek() == '(') {
						stack.pop();
					} else {
						return false;
					}
					break;
				case ']':
					if (stack.peek() == '[') {
						stack.pop();
					} else {
						return false;
					}
					break;
				case '}':
					if (stack.peek() == '{') {
						stack.pop();
					} else {
						return false;
					}
					break;

				default:
					break;
				}
			}
		}
		 return stack.isEmpty();
	}
	
	/**
	 * <b>Problem 24</b><br/>
	 * test if the string is palindromic, such as "lol", "level"
	 *
	 * @param str
	 *            String object
	 * @return true if the string is palindromic, false if not
	 * 
	 * @throws Exception
	 *             if the string is null
	 */
	public static boolean isPalindromic(String str) throws Exception {
		if (str == null || str == "") {
			throw new Exception("String empty or not initialized!");
		}
		int head = 0;
		int tail = str.length() - 1;
		while (head < tail) {
			if (str.charAt(head) == str.charAt(tail)) {
				head++;
				tail--;
			} else {
				return false;
			}

		}
		return true;
	}

	public static void strSort(String str) throws Exception {
		if (str.isEmpty()) {
			throw new Exception("string is empty!");
		}
		char charArray[] = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			if (str.toLowerCase().charAt(i)<'a'||str.toLowerCase().charAt(i)>'z') {
				throw new Exception("string is not all letters!");
			}
			
		}
	}
	/**
	 * util function to convert string of integers, like "12245", to int
	 * @param str the input string of integers
	 * @return converted int
	 * @throws Exception 
	 */
	public static int StringToInt(String str) throws Exception {
		if (str.isEmpty()) {
			throw new Exception("String empty!");
		}
		boolean isMinus = false;
		int temp = 0;
		for (int i = 0; i < str.length(); i++) {
			char digit = str.charAt(i);
//			test if  the first char is "-"
			if (i == 0) {
				if (digit == '-') {
					isMinus = true;
					continue;
				} else if (digit == '+') {
					continue;
				}
			}
			if (digit < '0' || digit > '9') {
				throw new Exception("not valid string!");
			}
			temp = temp * 10 + (digit - '0');

		}
		temp = isMinus?(-1)*temp:temp;
		return temp;
	}
	/**
	 * @param str
	 * @return
	 * @throws Exception
	 */
	public static double StringToFloat(String str) throws Exception {
		if (str.isEmpty()) {
			throw new Exception("String empty!");
		}
		//TODO
//		if (!isFloatStr(str)) {
//			throw new Exception("not float string!");
//		}
		double temp = 0;
//		按小数点"."分割字符串
		String[] slice = str.split("\\.");
//		整数部分
		int integerPart = StringToInt(slice[0]);
//		小数部分
		double decimalPart = 0;
//		如果小数和整数部分都存在，计算小数部分的数值
		if (slice.length == 2) {
			decimalPart = StringToInt(slice[1])*Math.pow(10, -1*slice[1].length());
		}
				
		temp = integerPart + decimalPart;
		return temp;
	}
	
	public static boolean isFloatStr(String str) throws Exception{
		if (str.isEmpty()) {
			throw new Exception("String empty!");
		}
		String regex = "^[-\\+]?[.\\d]*$";
		return str.matches(regex);
		
	}
	
	public static int subStringIndex(String s, String t){
		int i=0;
		int j=0;
		return 0;
	
	}
	
	/**
	 * @param s ASCII String
	 * @return
	 * @throws Exception
	 */
	public static char first (String s) {
		if (s.isEmpty()) {
			return 0;
		}
		char[] temp = s.toCharArray();
		final int TABLESIZE = 256;
		int[] hashTable = new int[TABLESIZE];
		for (int i = 0; i < hashTable.length; i++) {
			hashTable[i]=0;
		}
		int index=0;
		while (index<temp.length) {
			hashTable[temp[index]]++;
			index++;
		}
		for (int i = 0; i < hashTable.length; i++) {
			if (hashTable[i]==1) {
				return (char) i;
			}
		}
		return 0;

	}
	
	public static int maxSum(int[] array){
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				
			}
			
		}
	}
	
	public static void main(String[] args) {
		try {
			System.out.println(reverseStr("12519"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        int[] arrayToSort = new int[] { 48, 5, 89, 80, 81, 23, 45, 16, 2 };
        bubbleSort(arrayToSort);
        System.out.println(arrayToSort);
        Stack<String> teststack = new Stack<String>();
        String str = "{{}}";
        teststack.push(str.substring(0, 1));
        String top=teststack.peek();
        String brack = "{";
        boolean strIsSame = (brack == top) ;
        System.out.println(first("abbca"));
        try {
			System.out.println(StringToFloat("1435"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        int num = 10;
        String pre = String.valueOf(num);
       
        
	}
	
	

}
