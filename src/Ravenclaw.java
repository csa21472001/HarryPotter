public class Ravenclaw extends hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int creativity;

    public Ravenclaw(String fullName, int sorcery, int transgression, int smart, int wise, int witty, int creativity) {
        super(fullName, sorcery, transgression);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public static void checkWhoIsTheBetterStudentInRavenclaw(int indexOfStudent_1, int indexOfStudent_2) {
        Ravenclaw[] ravenclaws = getRavenclaws();
        int sumOfQualities_1 = ravenclaws[indexOfStudent_1].getCreativity() + ravenclaws[indexOfStudent_1].getWise() + ravenclaws[indexOfStudent_1].getWitty() + ravenclaws[indexOfStudent_1].getSmart();
        int sumOfQualities_2 = ravenclaws[indexOfStudent_2].getCreativity() + ravenclaws[indexOfStudent_2].getWise() + ravenclaws[indexOfStudent_2].getWitty() + ravenclaws[indexOfStudent_2].getSmart();
        if (sumOfQualities_2 > sumOfQualities_1) {
            System.out.println(ravenclaws[indexOfStudent_2].getFullName() + " лучший Когтеврановец, чем " + ravenclaws[indexOfStudent_1].getFullName());
        } else if (sumOfQualities_1 > sumOfQualities_2) {
            System.out.println(ravenclaws[indexOfStudent_1].getFullName() + " лучший Когтеврановец, чем " + ravenclaws[indexOfStudent_2].getFullName());
        } else {
            System.out.println(ravenclaws[indexOfStudent_1].getFullName() + " и " + ravenclaws[indexOfStudent_2].getFullName() + ". Оба одинаково хороши. ");
        }
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreativity() {
        return creativity;
    }
}
