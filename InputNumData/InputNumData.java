import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class InputNumData {

	public static void main(String[] args) throws IOException {
	Scanner sf=new Scanner(new File("E:\\InputNumData\\StupidPlusSigns"));
	int maxIndx=-1;
	String text[]=new String[1000];
	
	while(sf.hasNext())
		{
		maxIndx++;
		text[maxIndx]=sf.next();	
		}
	sf.close();
	
	for(int n=0;n<=maxIndx;n++)
		{
		String text2=text[n].substring(1);
		System.out.println(text2);
		}
	
	}

}
