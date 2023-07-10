import java.util.Arrays;

public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String fullName, int sorcery, int transgression, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(fullName, sorcery, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", cunning = " + cunning +
                ", determination = " + determination +
                ", ambition = " + ambition +
                ", resoursefulness = " + resourcefulness +
                ", thirstForPower = " + thirstForPower;
    }

    protected void checkWhoIsTheBetterStudentInSlytherin(Slytherin slytherinStudent) {

        int sumOfQualities_1 = slytherinStudent.getCunning() + slytherinStudent.getDetermination() + slytherinStudent.getAmbition() + slytherinStudent.getResourcefulness() + slytherinStudent.getThirstForPower();
        int sumOfQualities_2 = this.cunning + this.determination + this.ambition + this.resourcefulness + this.thirstForPower;
        if (sumOfQualities_2 > sumOfQualities_1) {
            printWhoIsBetterStudent(this, slytherinStudent);
        } else if (sumOfQualities_1 > sumOfQualities_2) {
            printWhoIsBetterStudent(slytherinStudent, this);
        } else {
            System.out.println(slytherinStudent.getFullName() + " и " + this.getFullName() + ". Оба одинаково хороши. ");
        }
    }

    public void printWhoIsBetterStudent(Slytherin betterStudent, Slytherin worseStudent) {
        System.out.println(betterStudent.getFullName() + " лучший Cлизериновец, чем " + worseStudent.getFullName());
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }
}
