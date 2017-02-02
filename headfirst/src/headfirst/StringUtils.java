package headfirst;

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
	
	
	
	public static void main(String[] args) {
		try {
			System.out.println(reverseStr(""));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
