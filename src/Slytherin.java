import java.util.Arrays;

public class Slytherin extends hogwarts {
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

    public static void checkWhoIsTheBetterStudentInSlytherin(int indexOfStudent_1, int indexOfStudent_2) {
        Slytherin[] slytherins = getSlytherins();
        int sumOfQualities_1 = slytherins[indexOfStudent_1].getCunning() + slytherins[indexOfStudent_1].getDetermination() + slytherins[indexOfStudent_1].getAmbition() + slytherins[indexOfStudent_1].getResourcefulness() + slytherins[indexOfStudent_1].getThirstForPower();
        int sumOfQualities_2 = slytherins[indexOfStudent_2].getCunning() + slytherins[indexOfStudent_2].getDetermination() + slytherins[indexOfStudent_2].getAmbition() + slytherins[indexOfStudent_2].getResourcefulness() + slytherins[indexOfStudent_2].getThirstForPower();
        if (sumOfQualities_2 > sumOfQualities_1) {
            System.out.println(slytherins[indexOfStudent_2].getFullName() + " лучший Слизериновец, чем " + slytherins[indexOfStudent_1].getFullName());
        } else if (sumOfQualities_1 > sumOfQualities_2) {
            System.out.println(slytherins[indexOfStudent_1].getFullName() + " лучший Слизериновец, чем " + slytherins[indexOfStudent_2].getFullName());
        } else {
            System.out.println(slytherins[indexOfStudent_1].getFullName() + " и " + slytherins[indexOfStudent_2].getFullName() + ". Оба одинаково хороши. ");
        }
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
