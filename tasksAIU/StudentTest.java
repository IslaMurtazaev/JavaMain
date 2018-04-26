package tasksAIU;

public class StudentTest {

    public static void main(String[] args) {

        Student islam = new Student("Islam", 1,"CS");
        Student islam1 = islam; // two reference variables can point to the same object
        islam = null;
        System.out.println(islam1.getName()+" has been studying for "+islam1.getYear()+" year");
        System.out.println(islam1.getName()+"'s major is "+islam1.getMajor());

        StudentAIU[] COM17 = new StudentAIU[50];
        COM17[0] = new StudentAIU("Shabdan", 1, "CS");
        COM17[1] = new StudentAIU("Danyshman", 1 , "CS");
        COM17[0].doHomeword("Russian Language");
    }

}
