
package gtupapers;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

/*
Write a java program to search a file named the word entered as a filename from command line : if it exits in the system 
then program should print the content of a file on console
*/

public class C417 
{
    public static void main(String[] args) throws Exception
    {
        File file = new File("E:\\java\\java_telusko\\Java Desktop\\gtupapers\\copy.txt");
         // for command line enter command line arguments and use below syntax
         //File file = new File(args[0);
    
        boolean isfile = file.exists();
        if(isfile)
        {
            FileInputStream fis = new FileInputStream(file);
            BufferedInputStream bis = new BufferedInputStream(fis);
            String thisLine="";
            int c;
            while((c=bis.read())!=-1)
            {
                thisLine=thisLine + Character.toString((char)c);  
            }
            System.out.println(thisLine);
                
        }
        else
        {
            System.out.println("file not exits");
        }
        //System.out.println(isfile);
        
    }
}
