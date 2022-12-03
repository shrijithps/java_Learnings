class BinaryConversion{
	public void method(int num) {
		int i=0;
		int[] array = new int[10];
		while(num>0) {
			array[i] = num%2;
			num=num/2;
			i++;
		}
		for(int u:array) System.out.print(u);
	}
}
class Binary_Conversion {
	public static void main(String[] args) {
		int num=8;
		BinaryConversion obj = new BinaryConversion();
		obj.method(num);
	}

}
