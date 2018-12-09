/*
It is required to maintain and process the status of total 9 resources. 
The status value is to be stored in an integer array of dimension 3x3. 
The valid status of a resource can be one of the followings:
free: indicated by integer value 0
occupied: indicated by integer value 1
inaccessible: indicated by integer value 2
Declare a class called ResourcesStatus, having data member called statusRef, 
referring to a two dimensional array (3x3) of integers to be used to refer to the above mentioned status values.
Define a member method called processStausCount that counts and displays total number of free resources,
total number of occupied resources and total number of inaccessible resources. 
The exception to be raised and handled if total number of occupied resources exceeds total number of free resources. 
The handler marks status of all inaccessible resources as free.
Accept initial status values from command line arguments and initialize the array. 
Raise and handle user defined exception if invalid status value given.
*/
package gtupapers;

class ResourcesStatus 
{
    int statusRef;
    int occ,free,inacc;
    int arr[][] = new int[3][3];
    ResourcesStatus()
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(j==2) arr[i][2]=3;
                else if(i==0||i==1) arr[i][j]=1;
                else arr[i][j]=0;     
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(" " + arr[i][j]);    
            }
            System.out.println("\n");
        }
    }
    void processsStatusCount() throws MyException
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(arr[i][j]==0) free++;
                else if(arr[i][j]==1) occ++;
                else inacc++;
            }
        }
        
        if(occ>free) throw new MyException(" occupied resources are more than free resources ");
        else System.out.println("No problem at all");
    }
}


public class C316 
{
    public static void main(String[] args) 
    {
        ResourcesStatus rs = new ResourcesStatus();
        try{
            rs.processsStatusCount();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }
    }
}
class MyException extends Exception
{

    public MyException(String str)
    {
        super(str);
    }
    
}

