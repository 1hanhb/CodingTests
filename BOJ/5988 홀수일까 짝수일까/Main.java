import java.util.*;

public class Main{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		while(N-->0) {
			String s = sc.next();
			System.out.println((s.charAt(s.length()-1)-8)%2 == 0 ? "even":"odd");
		}		
	}
}