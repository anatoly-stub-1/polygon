package local.polygon.gitstudy;

public class MyClass
{
	public static void main(String[] args)
	{
		TextProvider lorem  = new Lorem();
		String text = lorem.fetchText();
		System.out.println(text);
	}
}
