package gtupapers;

import java.io.File;

/*Write a program to check whether the name given from command line is file or not?
If it is a file then print the size of a file and if it is a directory then it should display
the name of all files in it.*/

public class FileorNot {
    public static void main(String[] args) {
        File tempFile = new File("nbproject"); // nbproject is name of a file
        boolean exit = tempFile.isFile();
        System.out.println(exit);
        
        File folder = new File("nbproject");
        File[]  listofiles = folder.listFiles();
        
        for(File file:listofiles)  // Enhanced for loop
        {
            if(file.isFile()){
                
                System.out.println(file.getName());
            }
        }
        
    }
}
