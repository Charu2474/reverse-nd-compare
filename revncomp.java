import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner h=new Scanner(System.in);
        String str=h.nextLine();
        System.out.println("Enter the actual word");
        System.out.println(str);
        System.out.println("Enter the word the student has typed");
        String str2=h.nextLine();
        System.out.println(str2);   
        String res="";
        int length=str.length();
        for(int i=length-1;i>=0;i--)
        {
            res=res+str.charAt(i);
        }
        if(!str2.equals(res))
        {
            System.out.println("It is wrong");
        }
        else
        {
            System.out.println("It is correct");
        }
    }
}
