public class PrintResult {
    public static void main(String[] args) {

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Иванов Иван", "Директор", "ivivan@mailbox.com", "892312312", 30000, 30);
        employees[1] = new Employee("Друзьев Михаил", "Инженер", "mickhail@mail.com", "8737373737", 25000, 46);
        employees[2] = new Employee("Шапкина Мария", "Секретарь", "maria@mail.com", "8900292092", 24000, 28);
        employees[3] = new Employee("Иванова Дарья", "Диспетчер", "idaria@mailbox.com", "89000000122", 20000, 50);
        employees[4] = new Employee("Громов Андрей", "Водитель", "gromov@mailbox.com", "88000001291", 18000, 54);

        for (Employee employee : employees) {
            if (employee.age > 40) {
                employee.employeePrint();
            }
        }
    }
}
