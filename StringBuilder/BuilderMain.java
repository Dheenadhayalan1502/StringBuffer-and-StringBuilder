
package StringBuilder;

import java.util.Scanner;
public class BuilderMain 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name");
        String name=sc.nextLine();
        System.out.println("enter department");
        String department=sc.nextLine();
        System.out.println("enter year");
        int year=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        sb.append(name.substring(0, 3).toUpperCase());
        sb.append("-");
        sb.append(department.substring(0, 3).toUpperCase());
        sb.append("-");
        sb.append(year);
        System.out.println(sb);
        
    }
    
    
}
