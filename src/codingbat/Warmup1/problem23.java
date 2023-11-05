package codingbat.Warmup1;

public class problem23 {
//Q. Given a string, return a string made of the first 2 chars (if present), 
//	however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".

//startOz("ozymandias") → "oz"
//startOz("bzoo") → "z"
//startOz("oxx") → "o"

	public static void main(String[] args) {
		System.out.println(startOz("ozymandias"));
		System.out.println(startOz("bzoo"));
		System.out.println(startOz("oxx"));
		System.out.println(startOz("a"));
	}

	public static String startOz(String str) {
		if(str.length()>=2) {
			if (str.substring(0, 1).equals("o")) {
				if (str.substring(1, 2).equals("z")) {
					return str.substring(0, 1) + str.substring(1, 2);
				} else {
					return str.substring(0, 1);
				}
			} else if (str.substring(1, 2).equals("z")) {
				return str.substring(1, 2);

			} else {
				return "";
			}
		}
		else if(str.equals("o")){
			return str;
		}
		return "";

	}
}
