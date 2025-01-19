import java.net.*;
import java.io.*;
class server
{
 double area;
    server()
      {
       try
       {
	//create as server socket
	ServerSocket serverSock = new ServerSocket(4000);
	System.out.println("Server started");
	while(true)
	 {
	   //Listen for a connection request from client
	   Socket soc = serverSock.accept();
	   System.out.println("Local Port number of servcer is:"+soc.getLocalPort());
	   DataInputStream din = new DataInputStream(soc.getInputStream());    
	   DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
	   double radius = din.readDouble(); //receive radius from client
	   area = Math.PI*radius*radius;
	   dos.writeDouble(area); //send area back to client
	   din.close();
	   dos.close();
	   soc.close();
	   serverSock.close();
        }
      }
      catch(Exception e)
	{	
	   e.printStackTrace();
	}
    } 
    public static void main(String args[])
     {
      new server();
     }	
  }
	   
	  