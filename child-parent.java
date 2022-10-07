
class parent
{
    public void func()
    {
        System.out.println("Hello Parent");
        func2();
    }
    public void func2()
    {
        System.out.println("Hello Parent func2");
        
    }
}


class child extends parent
{
    public void func2()
    {
        System.out.println("Hello child func2");
    }
}

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		parent ref = new child();
		
		ref.func();
	}
}
