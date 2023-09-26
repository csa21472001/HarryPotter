public abstract class Hogwarts {
    //    overall
    private String fullName;
    private int sorcery;
    private int transgression;

    public Hogwarts(String fullName, int sorcery, int transgression) {
        this.fullName = fullName;
        this.sorcery = sorcery;
        this.transgression = transgression;
    }

    public Hogwarts() {
    }

    public String getFullName() {
        return fullName;
    }

    public int getSorcery() {
        return sorcery;
    }

    public int getTransgression() {
        return transgression;
    }

    public void checkWhoIsBetterInCommonSkills(Hogwarts studentToCompare) {
        int sumOfQualities_1 = studentToCompare.sorcery + studentToCompare.transgression;
        int sumOfQualities_2 = this.sorcery + this.transgression;
        if (sumOfQualities_2 > sumOfQualities_1) {
            printWhoIsBetterStudent(this, studentToCompare);
        } else if (sumOfQualities_1 > sumOfQualities_2) {
            printWhoIsBetterStudent(studentToCompare, this);
        } else {
            System.out.println(studentToCompare.getFullName() + " и " + this.getFullName() + ". Оба одинаково хороши. ");
        }
    }

    public static void printWhoIsBetterStudent(Hogwarts betterStudent, Hogwarts worseStudent) {
        System.out.println(betterStudent.getFullName() + " просто лучше, чем " + worseStudent.getFullName());
    }

    @Override
    public String toString() {
        return
                "name of student = " + fullName +
                        ", sorcery = " + sorcery +
                        ", transgression = " + transgression;
    }

}



