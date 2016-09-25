import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc= new Scanner( System.in);
		System.out.println("Please enter your name.");
		String y=sc.nextLine();
		for(int x=y.length(); x>=1;x-- ){
			System.out.print(y.substring(x-1,x).toLowerCase());
		}
		System.out.println();

	}

}
