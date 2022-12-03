class Armstrong{
	public boolean method(String str) {
		int len=str.length(),sum=0;
		for(char c:str.toCharArray()) {
			int a = c-'0';
				sum+=Math.pow(a, len);
			}
		return sum==Integer.parseInt(str);
	}
}

class ArmstrongNumber {
	public static void main(String[] args) {
		Armstrong obj = new Armstrong();
		System.out.println(obj.method(Integer.toString(156)));
	}
}
