class parent
{
    public void func(){System.out.println("Hello Parent");}
}


class child extends parent
{
    public void func(){System.out.println("Hello Child");}
}

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		parent ref = new child();
		
		ref.func();
	}
}
