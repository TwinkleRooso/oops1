import Graphics.Area;
public class test_package{
	public static void main(String[] args)
	{
		Area A=new Area();
		System.out.println("****computation of Area of Different Figures***");
		System.out.println("\n__Rectangle__");
		A.rectangle();
		System.out.println("\n__Triangle__");
		A.triangle();
		System.out.println("\n__square__");
		A.square();
		System.out.println("\n__Circle__");
		A.circle();
		}
}