
class construction
{
      public construction() {
         System.out.println("hi from constructor body");
}
public construction(int a,int b)
{
      int c=a+b;
      System.out.println(c);
}
}
public class constructiontest{

	public static void main(String[] args) {
		new construction(12,13);
	}

}
