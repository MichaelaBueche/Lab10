package lab10;

public class Palindrome {

	public Palindrome() {
		System.out.println("The largest palindrome made from the product of two 4-digit numbers is "+maxPalindrome()+".");
	}
	private int maxPalindrome() {
		int maxP=0;//max palindrome
		int mult=0;//two 4-digit product
		for(int i=1000;i<=9999;i++) {//go through all 4 digit numbers
			for(int j=1000;j<=9999;j++) {//go through all 4 digit numbers
				mult=i*j;
				if(isPalindrome(mult)&&maxP<mult)//if is palindrome and larger than current max
					maxP=mult;//max palindrome is i*j
			}
		}
		return maxP;		
	}
	private boolean isPalindrome(int num) {
		int temp=num;//copy of num
		int reNum=0;//reverse num
		while(num>0) {//go through all digits of num
			reNum=reNum*10+num%10;//reverse num
			num=num/10;
		}
		if(reNum==temp)//if reverse is same as original number
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		new Palindrome();
	}
}