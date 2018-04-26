package tasksAIU;

import java.util.Scanner;

public class Input {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String userName;

        System.out.println("My name is Hagrid");
        System.out.println("What is your name pal? ");
        userName = scanner.nextLine();
        System.out.printf("Welcome to Hogwarts school of witchcraft and wizardry %s!\n",userName);

        System.out.println("Tell what is your surname age and weight? ");
        String surname = scanner.next();
        int age = scanner.nextInt();
        System.out.printf("So, your surname is %s and you are %d years old.", surname, age);

    }
}
