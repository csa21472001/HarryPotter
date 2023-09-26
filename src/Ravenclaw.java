public class Ravenclaw extends Hogwarts {
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

    @Override
    public String toString() {
        return super.toString() +
                ", smart = " + smart +
                ", witty = " + witty +
                ", creativity = " + creativity +
                ", wise = " + wise;
    }

    protected void checkWhoIsTheBetterStudentInRavenclaw(Ravenclaw ravenclawStudent) {

        int sumOfQualities_1 = ravenclawStudent.getSmart() + ravenclawStudent.getWitty() + ravenclawStudent.getCreativity() + ravenclawStudent.getWise();
        int sumOfQualities_2 = this.smart + this.witty + this.creativity + this.wise;
        if (sumOfQualities_2 > sumOfQualities_1) {
            System.out.println(this.getFullName() + " лучший Когтеврановец, чем " + ravenclawStudent.getFullName());
        } else if (sumOfQualities_1 > sumOfQualities_2) {
            System.out.println(ravenclawStudent.getFullName() + " лучший Когтеврановец, чем " + this.getFullName());
        } else {
            System.out.println(ravenclawStudent.getFullName() + " и " + this.getFullName() + ". Оба одинаково хороши. ");
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
