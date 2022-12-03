class Caps{
	public void mymethod(String capslock) {
		String str1 = "";
		for(char c:capslock.toCharArray()) {
			if((int)(c)<91) {
				str1 += (char)(c+32);
			}
			else {
				str1 += c;
			}
		}
		System.out.println(str1);
	}
}
public class CapsLock {
	public static void main(String[] args) {
		String caps = "ABCd";
		Caps obj = new Caps();
		obj.mymethod(caps);
	}
}
