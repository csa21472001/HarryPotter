public class Griffindor extends hogwarts {
    int nobility;
    int honor;
    int bravery;
    public Griffindor(String fullName,int sorcery,int transgression,int nobility, int honor, int bravery) {
        super ( fullName,sorcery,transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }
    public static void checkWhoIsTheBetterStudentInGriffndor (int indexOfStudent_1, int indexOfStudent_2){
        Griffindor[] griffindors = getGriffindors();
        int sumOfQualities_1 = griffindors[indexOfStudent_1].getBravery() + griffindors[indexOfStudent_1].getHonor() + griffindors[indexOfStudent_1].getBravery() ;
        int sumOfQualities_2 = griffindors[indexOfStudent_2].getBravery() + griffindors[indexOfStudent_2].getHonor() + griffindors[indexOfStudent_2].getBravery();
        if (sumOfQualities_2 > sumOfQualities_1) {
            System.out.println(griffindors[indexOfStudent_2].getFullName() + " лучший Гриффиндоровец, чем " + griffindors[indexOfStudent_1].getFullName());
        } else if (sumOfQualities_1 > sumOfQualities_2) {
            System.out.println(griffindors[indexOfStudent_1].getFullName() + " лучший Гриффиндоровец, чем " + griffindors[indexOfStudent_2].getFullName());
        } else {
            System.out.println(griffindors[indexOfStudent_1].getFullName() + " и " + griffindors[indexOfStudent_2].getFullName() + ". Оба одинаково хороши. ");
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
