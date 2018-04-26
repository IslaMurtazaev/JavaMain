package calculus;

public class Exercise {

    final int number;
    boolean solved = false;

    public Exercise(int number) {
        this.number = number;
    }

    public void setSolved(boolean solved){
        this.solved = solved;
    }


    public int getNumber(){
        return number;
    }

    public boolean isSolved(){
        return solved;
    }
}
