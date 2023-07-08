import java.util.Arrays;
public class hogwarts {
    //    overall
    private String fullName;
    private int sorcery;
    private int transgression;
    private static Slytherin[] slytherins;
    private static Griffindor[] griffindors;
    private static Ravenclaw[] ravenclaws;
    private static Hufflepuff[] hufflepuffs;
    public hogwarts(String fullName, int sorcery, int transgression) {
        this.fullName = fullName;
        this.sorcery = sorcery;
        this.transgression = transgression;
    }
    public hogwarts() {
        slytherins = new Slytherin[3];
        slytherins[0] = new Slytherin("Драко Малфой", 59, 65, 66, 69, 79, 65, 77);
        slytherins[1] = new Slytherin("Грэхэм Монтегю", 63, 68, 56, 59, 55, 59, 41);
        slytherins[2] = new Slytherin("Грегори Гойл", 47, 55, 51, 55, 65, 48, 67);

        griffindors = new Griffindor[3];
        griffindors[0] = new Griffindor("Гарри Поттер", 63, 71, 66, 69, 79);
        griffindors[1] = new Griffindor("Гермиона Грейнджер", 75, 69, 56, 59, 60);
        griffindors[2] = new Griffindor("Рон Уизли", 57, 62, 51, 55, 65);

        ravenclaws = new Ravenclaw[3];
        ravenclaws[0] = new Ravenclaw("Чжоу Чанг", 69, 71, 66, 69, 79, 65);
        ravenclaws[1] = new Ravenclaw("Падма Патил", 72, 75, 56, 59, 55, 59);
        ravenclaws[2] = new Ravenclaw("Маркус Белби", 67, 78, 51, 55, 65, 48);

        hufflepuffs = new Hufflepuff[3];
        hufflepuffs[0] = new Hufflepuff("Захария Смит", 63, 71, 66, 69, 79);
        hufflepuffs[1] = new Hufflepuff("Седрик Диггори", 75, 69, 56, 59, 55);
        hufflepuffs[2] = new Hufflepuff("Джастин Финч-Флетчли", 57, 62, 51, 55, 65);
    }
    public void printOneStudent(String faculty, int indexOfStudent) {
        if (faculty.equalsIgnoreCase("Slytherin")) {
            System.out.println("slytherin student: \n" + slytherins[indexOfStudent] );
        } else if (faculty.equalsIgnoreCase("Griffindor")) {
            System.out.println("griffindor student: \n" + griffindors[indexOfStudent] );
        } else if (faculty.equalsIgnoreCase("Ravenclaw")) {
            System.out.println("ravenclaw student: \n" + ravenclaws[indexOfStudent] );
        } else if (faculty.equalsIgnoreCase("Hufflepuff")) {
            System.out.println("hufflepuff student: \n" + hufflepuffs[indexOfStudent] );
        } else {
            System.out.println("Enter right name of faculty!!!");
        }
    }
    public void checkWhoIsBetterInCommonSkills(int indexOfStudent_1, int indexOfStudent_2) {
        hogwarts[] allStudents = new hogwarts[slytherins.length + griffindors.length + ravenclaws.length + hufflepuffs.length];
        int srcIndex = 0;
        int destIndex = 0;
//
        System.arraycopy(slytherins, srcIndex, allStudents, destIndex, slytherins.length);
        System.arraycopy(griffindors, srcIndex, allStudents, slytherins.length, griffindors.length);
        System.arraycopy(ravenclaws, srcIndex, allStudents, slytherins.length + griffindors.length, ravenclaws.length);
        System.arraycopy(hufflepuffs, srcIndex, allStudents, slytherins.length + griffindors.length + ravenclaws.length, hufflepuffs.length);

        int sumOfQualities_1 = allStudents[indexOfStudent_1].getSorcery() + allStudents[indexOfStudent_1].getTransgression();
        int sumOfQualities_2 = allStudents[indexOfStudent_2].getTransgression() + allStudents[indexOfStudent_2].getSorcery();

        if (sumOfQualities_2 > sumOfQualities_1) {
            System.out.println(allStudents[indexOfStudent_2].getFullName() + " обладает бОльшей мощностью магии, чем " + allStudents[indexOfStudent_1].getFullName());
        } else if (sumOfQualities_1 > sumOfQualities_2) {
            System.out.println(allStudents[indexOfStudent_1].getFullName() + " обладает бОльшей мощностью магии, чем " + allStudents[indexOfStudent_2].getFullName());
        } else {
            System.out.println(allStudents[indexOfStudent_1].getFullName() + " и " + allStudents[indexOfStudent_2].getFullName() + ". Оба одинаково хороши. ");
        }
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

    public static Slytherin[] getSlytherins() {
        return slytherins;
    }

    public static Ravenclaw[] getRavenclaws() {
        return ravenclaws;
    }

    public static Griffindor[] getGriffindors() {
        return griffindors;
    }

    public static Hufflepuff[] getHufflepuffs() {
        return hufflepuffs;
    }

    @Override
    public String toString() {
        return
                "name of student = " + fullName +
                        ", sorcery = " + sorcery +
                        ", transgression = " + transgression;
    }

}
//    public String toStringSlytherin(int indexOfStudent) {
//        return
//                ", cunning = " + slytherins[indexOfStudent].getCunning() +
//                        ", determination = " + slytherins[indexOfStudent].getDetermination() +
//                        ", ambition = " + slytherins[indexOfStudent].getAmbition() +
//                        ", resoursefulness = " + slytherins[indexOfStudent].getResourcefulness() +
//                        ", thirstForPower = " + slytherins[indexOfStudent].getThirstForPower();
//    }
//
//    public String toStringRavenclaw(int indexOfStudent) {
//        return
//                ", smart = " + ravenclaws[indexOfStudent].getSmart() +
//                        ", witty = " + ravenclaws[indexOfStudent].getWitty() +
//                        ", creativity = " + ravenclaws[indexOfStudent].getCreativity() +
//                        ", wise = " + ravenclaws[indexOfStudent].getWise();
//    }
//
//    public String toStringHufflepuff(int indexOfStudent) {
//        return
//                ", hardworking = " + hufflepuffs[indexOfStudent].getHardworking() +
//                        ", loyality = " + hufflepuffs[indexOfStudent].getLoyality() +
//                        ", honest = " + hufflepuffs[indexOfStudent].getHonest();
//    }
//
//    public String toStringGriffindor(int indexOfStudent) {
//        return
//                ", nobility = " + griffindors[indexOfStudent].getNobility() +
//                        ", honor = " + griffindors[indexOfStudent].getHonor() +
//                        ", bravery = " + griffindors[indexOfStudent].getBravery();
//    }

//    public int checkForNull(int indexOfStudent) {
//
//        if (newUnitOrSalary >= 10 || newUnitOrSalary < 0) {
//            throw new IllegalArgumentException("В массиве нет указанного индекса!");
//        } else if (employees[newUnitOrSalary] == null) {
//            throw new IllegalArgumentException("Пустое поле! Изменить данные невозможно!");
//        }
//        return newUnitOrSalary;
//    }
//    hogwarts
//    ravenclaw
//     hufflepuff
//    slytherin



