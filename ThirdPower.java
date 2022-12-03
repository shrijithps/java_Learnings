class Third{
	public boolean mymethod(int num) {
		if(num==1) {
			return true;
		}
		else if(num/4>=1 && num%4==0) {
			return mymethod(num/4);
		}
		else {
			return false;
		}
	}
}
public class ThirdPower {
	public static void main(String[] args) {
		Third obj = new Third();
		System.out.println(obj.mymethod(56));
	}

}
