class Person {
    private String name;
    private int age;

    public Person(String n, int a) {
        name = n;
        age = a;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Employee extends Person {
    private double salary;

    public Employee(String n, int a, double s) {
        super(n, a); // Revisi 1, memanggil constructor Person dengan super() agar artibut name dan age terinisialisasi.
        salary = s;
    }

    public void showSalary() {
        System.out.println("Salary: " + salary);
        //^Revisi 2 Mengganti koma (,) dengan titik koma (;)
    }
}

public class MainApp {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 25, 5000.0);
        //^Revisi 3 Mengubah 5.000 menjadi 5000.0 agar sesuai dengan format angka dalam tipe data double
        emp.display();
        emp.showSalary();
        //Revisi 4 menambahkan dan memanggil showSalary {} supaya gaji juga dicetak
    }
}
