package leeCodePractice;
import java.util.Scanner;

/**
 * This is the java doc I crate in this file.
 * @author allen
 *
 */

public class LeetCode258_Add_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //JOptionPane.showMessageDialog(null, "Hi there");
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please input a number for testing:");
		int x = keyboard.nextInt();
		keyboard.close();
		answer u = new answer();
		
		
		System.out.println(u.addDigit(x));
		
	}

}

class answer{
	public static int addDigit(int num){
		//int result=0;
		int sum=0;
		
		if(num<10){
			return num;
			
		}else if(num==10){
			return 1;
		}else{
		
		while(Math.ceil(Math.log10((double)num)) > 1){	
		int x = (int) Math.ceil(Math.log10((double)num));
		sum = num%10;
		//System.out.println(sum);
		
		for(double i=x;i>1;i--){
			sum += (int)Math.floor((num/Math.pow(10,i-1)));
			//System.out.println(sum);
			num = num - (int)Math.pow(10, i-1)*(int)Math.floor((num/Math.pow(10,i-1)));
			//System.out.println(num);
		 }
		 num=sum;
		}
		
		if(num==10){
			return 1;
		}else{
		   return sum;
		  }
		}
	}
	
	
}
