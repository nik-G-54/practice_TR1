public class Employee {
    int ph;
    String name;
    int employeeid = 232;
    int salary = 238734;
    int insentive = 357;

    //private int dob=09082005;
     int countSalary() {
       return salary+insentive;
    }
    int getph(){
         return ph;
    }
    String getname(){
         return name;
    }

    Employee(String empname,int phone){
         name = empname;
         ph=phone;

    }
    void set(int phone){
         ph=phone;
    }
    void set(String name){
         this.name=name;

    }
}
