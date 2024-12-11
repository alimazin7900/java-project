package java_programs;
class one{
	public void print_geek()
	{
		System.out.println("white");
	}
}
class two extends one {
	public void print_for() {System.out.println("for");}



}
public class inheritance {

	public static void main(String[] args)
	{
		two g=new two();
		g.print_geek();
		g.print_for();
		g.print_geek();

		
		

	}

}
