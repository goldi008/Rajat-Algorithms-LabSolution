import java.util.Scanner;
public class Denominations {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		int size=0;
		int notes[];
		int amount=0;
		int noteCounter[] = new int[9];
		System.out.println("Enter the size of currency denominations");
		size=read.nextInt();
		notes=new int[size];
		System.out.println("Enter the size of currency denominations value");
		for(int i=0;i<size;i++)
			notes[i]=read.nextInt();
		
		//Arranging Currency in Decending order
		for(int i=0;i<size-1;i++) {
			for(int j=0;j<size-i-1;j++) {
				if(notes[j]<notes[j+1]) {
					int temp=notes[j];
					notes[j]=notes[j+1];
					notes[j+1]=temp;
				}
			}
		}
		
		

		
		System.out.println("Enter the amount you want to pay");
		amount=read.nextInt();
		
		System.out.println("your payment approach in order to give min no of notes will be");
		for (int i = 0; i < size; i++) {
            if (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                amount = amount - noteCounter[i] * notes[i];
            }
        }

		
        for (int i = 0; i < 9; i++) {
            if (noteCounter[i] != 0) {
                System.out.println(notes[i] + " : "
                    + noteCounter[i]);
            }
        }
		

	}

}
