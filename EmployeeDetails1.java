public class EmployeeDetails1
{
int empId;
String empName;
float empSal;
public EmployeeDetails1(){
}
public EmployeeDetails1(int empId,String empName,float empSal)
{
this.empId=empId;
this.empName=empName;
this.empSal=empSal;
}
public void calculateSalary()
{
System.out.println("employee salary:"+(empsal+2000));
}
public static void main(String[] args)
{
EmployeeDetails1 ed= new EmployeeDetails1();
ed.calculateSalary();
}
)
