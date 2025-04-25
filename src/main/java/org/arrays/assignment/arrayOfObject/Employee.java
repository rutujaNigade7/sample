package org.arrays.assignment.arrayOfObject;
import java.util.*;

public class Employee {

    int eid;
    String ename;
    Department dept;

    public Employee(int eid,String ename, Department dept) {
        this.eid = eid;
        this.ename = ename;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", dept=" + dept +
                '}';
    }

    public static void main(String args[]){

        int MAX = 100;
        Employee e[] = new Employee[MAX];
        int count=0,flag=0;

        Scanner sc = new Scanner(System.in);

        for(int i=0; ;i++){
            System.out.println("Enter dname : ");
            String dname = sc.next();

            for(int j=i-1;j>=0;j--){
                if(e[j].dept.dname.equals(dname)){
                    flag=1;
                    i--;
                    break;
                }
            }

            if(flag == 0){
                System.out.println("Enter eid : ");
                int eid = sc.nextInt();
                System.out.println("Enter ename : ");
                String ename = sc.next();
                System.out.println("Enter did : ");
                int did = sc.nextInt();

                Employee emp = new Employee(eid, ename, new Department(did, dname));
                e[count] = emp;
                System.out.println(e[count]);
                count++;
            }
            if(count == 3){
                break;
            }
            flag = 0;
        }

        System.out.println("Display all employees");
        for(int i=0;i<count;i++){
            System.out.println(e[i]);
        }
        sc.close();
    }

}
