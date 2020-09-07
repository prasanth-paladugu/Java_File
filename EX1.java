//EXAMPLE ON FILE CLASS FOR GETTING FILE DETAILS
import java.io.File;										//GIVING LOCATION OF FILE CLASS TO JVM
import java.util.Scanner;									//GIVING LOCATION OF SCANNER CLASS TO JVM
import java.util.Date;										//GIVING LOCATION OF DATE CLASS TO JVM
import static java.lang.System.out;							//GIVING LOCATION OF SYSTEM CLASS TO JVM
public class EX1
{
	public static void main(String[]arg)
	{
		Scanner in=new Scanner(System.in);					//CRREATING AN OBJECT TO SCANNER CLASS
		out.print("ENTER FILE/DIRECTORY NAME :");
		String name=in.nextLine();
		File f=new File(name);
		if(f.exists())										//USING METHODS OF FILE CLASS FOR EXTRACTING DATA OF FILE
		{
			out.println("NAME       :"+f.getName());
			out.println("FILE       :"+f.isFile());
			out.println("DIR        :"+f.isDirectory());
			long a=f.lastModified();
			out.println("DATE(MS)   :"+a);
			Date d=new Date(a);
			out.println("DATE       :"+d);
			out.println("LENGTH     :"+f.length());
			out.println("PATH       :"+f.getPath());
			out.println("WRITEBLE   :"+f.canWrite());
			out.println("READABLE   :"+f.canRead());
			out.println("HIDDEN     :"+f.isHidden());
		}
		else
		{
			out.println("FILE/DIRECTORY NOT FOUND");
		}
	}
}