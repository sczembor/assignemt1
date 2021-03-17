import java.lang.* ;
import java.io.* ;
import java.net.* ;
import java.util.* ;


public class client
{
   public static void main ( String [] args)
   {
      int res;
      int num[]=new int[2];
       
      if (args.length != 2)
      {
         System.out.println("Usage: client <host> <port>");
         System.exit(0);
      }

     try
     {
        // Creat the connections
         String host = args[0];
         Socket sc = new Socket(host,4200); // IDK ADRESS BULLSHIT can  be send as an srgument but now I am too lazy
         
	// insert code here


        DataOutputStream out = new DataOutputStream(sc.getOutputStream());
        DataInputStream in = new DataInputStream(sc.getInputStream());
        InputStreamReader  is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        
        String message;
        boolean done = false;
        byte[] aux = null;
        aux = new byte[256];


        while (!done) {
		// complete the code to communicate with the server
                System.out.println("Write something");

                message = br.readLine();
                out.writeBytes(message);
                out.write('\n'); // insert the ASCII 0 at the end

                in.read(aux);
                String s = new String(aux);
                System.out.println(s);

        }

      }
      catch (Exception e)
      {
         System.err.println("Exception " + e.toString() );
         e.printStackTrace() ;
      }

   }
}

