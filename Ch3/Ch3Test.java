public class Ch3Test
{
	public static void main(String[] args)
	{
		byte a = 120;
		byte b = 121;
		int c = a + b;
		System.out.println(c);
		
		byte d = 5;
		//d = d + 6;
		d += 6;
		System.out.println(d);
		
		System.out.println("97和'a'是否相等 " + (97 == 'a'));
		
		System.out.println("绝对路径是C:\\codes\\");
	}
}