package tasksMIT;

public class Assignment2 {

    public static void main(String[] args) {
        double employee1 = (salary(7.50, 35));
        double employee2 = (salary(8.20, 47));
        double employee3 = (salary(10.00, 73));
        System.out.println(employee1+" "+employee2+" "+employee3);
    }

    public static double salary(double basePay, int hoursWorked){

        if (basePay < 8 || hoursWorked > 60){
            return 0;
        } else if (hoursWorked > 40){
            return (40 * basePay + (hoursWorked - 40) * (basePay*1.5));
        } else {
            return hoursWorked * basePay;
        }

    }
}
