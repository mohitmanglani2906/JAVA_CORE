
package gtupapers;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
Write a program using BufferedInputStream, FileInputStream,
BufferedOutputStream, FileOutputStream to copy content of one file Test1.txt into
another file Test2.txt
*/

public class C418
{
    public static void main(String[] args) throws Exception
    {
        
      /*  String fromFileName = "gtu.txt";
        String toFileName = "gtu1.txt";
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(fromFileName));
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(toFileName));
        byte[] buff = new byte[32 * 1024];
        int len;
        while ((len = in.read(buff)) > 0)
          out.write(buff, 0, len);
        in.close();
        out.close();*/
        
            FileOutputStream fos=null;
            FileInputStream fis=null;
            BufferedOutputStream bos=null;
            BufferedInputStream bis=null;
       
         try
         {
                File file = new File("gtu1.txt");
                fos = new FileOutputStream(file,true);
                bos  = new BufferedOutputStream(fos);
                String s = "Hi I am mohit manglani using bufferedoutputstream!!!!!!!!";
                byte b[] = s.getBytes();
                bos.write(b);
                
                File file1 = new File("gtu.txt");
                fis= new FileInputStream(file1);
                bis= new BufferedInputStream(fis);
                int len;
                //String thisLine="";
                while((len=fis.read(b))>0)
                {
                    bos.write(b,0,len);    
                }

                   bos.flush();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
         
         
         
         
        /* try{
             File file1 = new File("test2.txt");
             fis = new FileInputStream(file1);
             bis = new BufferedInputStream(fis);
             bis.write(b);
            // bis.flush();
             
             
         }
         catch(Exception e)
         {
             System.out.println(e);
         }*/
        
        
        
        
		/*FileOutputStream fileOutputStream=null;
		BufferedOutputStream bufferedOutputStream=null;
		try {
                    
                        File file=new File("outfile.txt");
			fileOutputStream=new FileOutputStream(file);
			bufferedOutputStream=new BufferedOutputStream(fileOutputStream);
			bufferedOutputStream.write("This is an example of writing data to a file".getBytes());
			bufferedOutputStream.write(" using BufferedOutputStream".getBytes());
			bufferedOutputStream.flush();
			
		} catch (Exception e) {
			e.printStackTrace();*/
        
       
       
        
        
      /*  FileOutputStream fos = new FileOutputStream("gtu.txt",true);
        String s = "Hi I am Mohit I am vvp engineering college ok!!!!!!!!!!!!!";
        byte b[] = s.getBytes();
        fos.write(b);
        
        fos=new FileOutputStream("copy.txt",true);
        fos.write(b);*/
    }
}
