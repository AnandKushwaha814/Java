import java.util.*;
import java.io.*;
public class consoleUser {
    public static void main(String[] args) {
        String str; 
        char ch[];
        Console obj=System.console();
        System.out.print("Enter username: ");
        str=obj.readLine();
        System.out.print("Enter password: ");
        ch=obj.readPassword();
        String a=String.valueOf(ch);                // showing password
        System.out.println("username is: "+str);
        System.out.println("password is: "+ch);
        System.out.print("password is: "+a);        // showing password
    }
}
