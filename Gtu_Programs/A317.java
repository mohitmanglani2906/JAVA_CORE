package gtupapers;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
Write a program that outputs the host name and numerical ip address from local host machine!!!
*/
public class A317 
{
    public static void main(String[] args) {
        try 
        {
            InetAddress add = InetAddress.getLocalHost();
            System.out.println("Local Host Address " + add.getHostAddress());
            System.out.println("Local Host Name " + add.getHostName());
        } 
        catch (UnknownHostException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
