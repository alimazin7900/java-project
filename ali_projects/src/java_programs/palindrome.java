package java_programs;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int r,sum=0,temp;
int n=453;
temp=n;
while(n>0) {
	r=n%10;
	sum=(sum*10)+r;
	n=n/10;
	
}
if(temp==sum)
	System.out.println("palindrome number");
else
	System.out.println("not palindrome");
	}

}
