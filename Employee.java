package inclass1;
import java.util.*;
public class Employee 
{
    int emp_id;
    static int emp_count=0;
    public Employee(int eid)
    {
        this.emp_id=eid;
        emp_count++;
    }
    public static int showCount()
    {
        return emp_count;
    }
    public static void main(String args[])
    {
        for(int i=0;i<5;i++)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter id for employee "+(i+1)+" : ");
            int eid=sc.nextInt();
            Employee emp=new Employee(eid);
        }
        System.out.println("Number of employees : "+Employee.showCount());
        
    }
}