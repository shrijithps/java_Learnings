class Lucky{
	public void mymethod(int[] arr) {
		int[] array = new int[arr.length+1];
		int max=0,value=-1;
		for(int a:arr) {
			array[a]++;
		}
		for(int a:arr) {
			value = array[a]==a ? Math.max(value, a) : value;
	}
		System.out.println(value);
}
}

public class LuckyNumber {
	public static void main(String[] args) {
		int[] array = {1,2,2,3,3,3};
		Lucky obj = new Lucky();
		obj.mymethod(array);
	}
}
