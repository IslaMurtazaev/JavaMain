package headFirst;

public class MyException {

    public void takeRisk(int balance) throws BadException {
        if (balance < 0){
            throw new BadException();
        } else {
            System.out.println("I have $"+balance);
        }
    }

    private class BadException extends RuntimeException {} // Declaring an inner class for new MyException

    public static void main(String[] args) {
        try {
            MyException a = new MyException();
            a.takeRisk(-100);
//        } catch (BadException ex){
//            System.out.println("You are bankrupt");
//        } catch (Exception ex){
//            ex.printStackTrace();
        } finally {
            System.out.println("Thanks for using DosCredo bank!");
        }
        System.out.println("I am never going to run (");
    }
}
