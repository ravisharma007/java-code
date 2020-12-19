import mypack1.PackagePractice;
import mypack1.PackagePractice2;
import mypack1.inner.PackagePracticeInner;

import java.lang.*;

public class Myclass
{
	public static void main(String [] args)
	{
		PackagePractice p0=new PackagePractice();
		p0.display();

		PackagePractice2 p2=new PackagePractice2();
		p2.display();

		PackagePracticeInner p3=new PackagePracticeInner();
		p3.display();
	} 
}