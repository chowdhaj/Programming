import java.io.*;
import java.util.*;

class CheckLetter
{
public static void main(String[] args) throws IOException
{
int flag=0;
char symbol;
System.out.println("Please enter any key");
symbol = (char)System.in.read();
if ((symbol >= 'A') && (symbol <= 'Z'))
{
System.out.println("The symbol is an uppercase letter");
flag=1;
}
else
{
System.out.println("The symbol is not an uppercase letter");
} 
if(flag==0)
{ 
if((symbol >= 'a') && (symbol <= 'z'))
{
System.out.println("The symbol is a lowercase letter");
}
else
{
System.out.println("The symbol is not a letter"); 
}
} 
} 
} 
