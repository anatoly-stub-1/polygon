package local.polygon.gitstudy;

public class MyClass
{
	private static final TextProvider LOREM = new Lorem();

	public static void main(String[] args)
	{
		String text = fetchLoremText();
		System.out.println(text);
	}

	private static String fetchLoremText()
	{
		String text = LOREM.fetchText();
		return text;
	}
}
