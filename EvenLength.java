class Even{
	public void mymethod(int[] array) {
		int count=0;
		for(int a:array) {
			String str = Integer.toString(a);
			if(str.length()%2==0) count++;
			str = "";
		}
		System.out.println(count);
	}
}
public class EvenLength {
	public static void main(String[] args) {
		int[] array = {1,2,22,3333};
		Even obj = new Even();
		obj.mymethod(array);
		
	}

}
