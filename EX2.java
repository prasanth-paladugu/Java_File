//EXAMPLE ON FILE CREATION AND DELETION
import java.io.File;												//GIVING ADDRESS OF THE CLASSES
import java.io.PrintStream;
import java.io.IOException;
public class EX2
{
	public static void main(String[]arg) throws IOException
	{
		PrintStream ps=new PrintStream(System.out);
		File f=new File("PP");										//OBJECT FOR FILE CLASS
		boolean status=f.mkdir();									//CREATING NEW DIRECTORY
		ps.println("DIR IS CREATED :"+status);
		ps.println(new File("DP.txt").createNewFile());				//CREATING NEW FILE
		ps.println(new File("PP").delete());						//DELETING A FILE
	}
}