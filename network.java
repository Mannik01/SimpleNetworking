import java.io.*;
import java.net.*;

public class network
{
	public static void main(String args[])
	{
		try
		{
			URL newUrl = new URL("http://www.oracle.com/");	
			URLConnection newConnection = newUrl.openConnection();
			newConnection.connect();

			/*BufferedReader in = new BufferedReader(new InputStreamReader(newUrl.openStream()));

			String line;
			while((line = in.readLine()) != null)
			{
				System.out.println(line);
			}

			in.close();*/
		}
		catch(MalformedURLException e)
		{
			System.out.println(e);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
	}
	

}