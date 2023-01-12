package myselfNumber;

public class ArmStrongNumberDemo {
	public static void main(String[] args) {
		
		int num=370;
		int temp=num;
		int r;
		int sum=0;
		
		while (num>0) {
			r=num%10;
			sum=sum+r*r*r;
			num=num/10;
		}
		
		if (temp==sum) {
			System.out.println("Number is Amastrong");
		}
		else {
			System.out.println("Not a Amstrong number");
		}
	}
}
