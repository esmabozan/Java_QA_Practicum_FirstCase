public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;


    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary > 1000) {
            return this.salary * 0.03;
        } else {
            return 0;
        }
    }

    public double bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        } else
            return 0;
    }

    public double raiseSalary() {
        if (2021 - this.hireYear < 10 && 2021 - this.hireYear > 0) {
            return (this.salary + bonus() - tax()) * 0.05;
        } else if (2021 - this.hireYear > 9 && 2021 - this.hireYear < 20) {
            return (this.salary + bonus() - tax()) * 0.1;
        } else if (2021 - this.hireYear > 19) {
            return (this.salary + bonus() - tax()) * 0.15;
        } else
            System.out.println("Invalid value!");

        return 0;
    }

    public String toString() {
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati: " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş Artışı : " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (salary + bonus() - tax()));
        System.out.println("Toplam Maaş : " + (salary + raiseSalary() + bonus()));

        return null;
    }
}
