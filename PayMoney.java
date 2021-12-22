import java.util.Scanner;
public class PayMoney {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		int list[];
		int size=0;
		int t=0;
		int target=0;
		int sum=0;
		System.out.println("Enter the size of transaction Array");
		size=read.nextInt();
		list=new int[size];
		System.out.println("Enter the value of array");
		for(int i=0;i<size;i++)
			list[i]=read.nextInt();
		System.out.println("Enter the total number of targets that needs to be achived");
		t=read.nextInt();
		System.out.println("Enter the value of target");
		target=read.nextInt();
		for(int i=0;i<size;i++) {
			sum=sum+list[i];
			if(sum>=target) {
				System.out.println("Target achived after "+(i+1)+" transaction");
				break;
			}
			
		}
		if(sum<target) {
			System.out.println("Target is not achived");
		}

	}

}
