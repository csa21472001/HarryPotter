public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String fullName, int sorcery, int transgression, int nobility, int honor, int bravery) {
        super(fullName, sorcery, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", nobility " + nobility +
                ", honor " + honor +
                ", bravery " + bravery;
    }

    protected void checkWhoIsTheBetterStudentInGriffndor(Griffindor griffindorStudent) {
        int sumOfQualities_1 = griffindorStudent.getBravery() + griffindorStudent.getHonor() + griffindorStudent.getNobility();
        int sumOfQualities_2 = this.bravery + this.nobility + this.honor;
        if (sumOfQualities_2 > sumOfQualities_1) {
            System.out.println(this.getFullName() + " лучший Гриффиндоровец, чем " + griffindorStudent.getFullName());
        } else if (sumOfQualities_1 > sumOfQualities_2) {
            System.out.println(griffindorStudent.getFullName() + " лучший Гриффиндоровец, чем " + this.getFullName());
        } else {
            System.out.println(griffindorStudent.getFullName() + " и " + this.getFullName() + ". Оба одинаково хороши. ");
        }
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }
}
