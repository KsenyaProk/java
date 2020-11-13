public class Employee {

    String name;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    public Employee(String fullName,String aPosition, String anEmail, String aPhone, int aSalary, int anAge){
        name=fullName;
        position=aPosition;
        email=anEmail;
        phone=aPhone;
        salary=aSalary;
        age=anAge;
    }

    public void employeePrint(){
        System.out.println("\n\tФИО: " + name + "\nДолжность: " + position +
                "\nemail: " + email + "\nТелефон: " + phone
                + "\nЗарплата: " + salary + "\nВозраст: " + age);
    }

}

