public class Hufflepuff extends hogwarts {
    int hardworking;
    int loyality;
    int honest;

    public Hufflepuff(String fullName, int sorcery, int transgression, int hardworking, int loyality, int honest) {
        super(fullName, sorcery, transgression);
        this.hardworking = hardworking;
        this.loyality = loyality;
        this.honest = honest;
    }
    @Override
    public String toString() {
        return super.toString() +
                ", hardworking = " + hardworking +
                ", loyality = " + loyality +
                ", honest = " + honest;
    }
    public static void checkWhoIsTheBetterStudentInRavenclaw(int indexOfStudent_1, int indexOfStudent_2) {
        Hufflepuff[] hufflepuffs = getHufflepuffs();
        int sumOfQualities_1 = hufflepuffs[indexOfStudent_1].getHardworking() + hufflepuffs[indexOfStudent_1].getHonest() + hufflepuffs[indexOfStudent_1].getLoyality();
        int sumOfQualities_2 = hufflepuffs[indexOfStudent_2].getHardworking() + hufflepuffs[indexOfStudent_2].getHonest() + hufflepuffs[indexOfStudent_2].getLoyality();
        if (sumOfQualities_2 > sumOfQualities_1) {
            System.out.println(hufflepuffs[indexOfStudent_2].getFullName() + " лучший  Пуффендуйевец, чем " + hufflepuffs[indexOfStudent_1].getFullName());
        } else if (sumOfQualities_1 > sumOfQualities_2) {
            System.out.println(hufflepuffs[indexOfStudent_1].getFullName() + " лучший Пуффендуйевец, чем " + hufflepuffs[indexOfStudent_2].getFullName());
        } else {
            System.out.println(hufflepuffs[indexOfStudent_1].getFullName() + " и " + hufflepuffs[indexOfStudent_2].getFullName() + ". Оба одинаково хороши. ");
        }
    }


    public int getHardworking() {
        return hardworking;
    }

    public int getLoyality() {
        return loyality;
    }

    public int getHonest() {
        return honest;
    }
}
