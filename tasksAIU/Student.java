package tasksAIU;

public class Student {

    String name;
    int year;
    String major;

    protected Student(String name, int year, String major) {
        this.name = name;
        this.year = year;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getMajor() {
        return major;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setYear(int year) {
        this.year = year;
    }

    private void setMajor(String major) {
        this.major = major;
    }

    public void doHomeword(String subject){
        System.out.println(subject+" is very dull");
    }
}
