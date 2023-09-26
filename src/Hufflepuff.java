public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyality;
    private int honest;

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

    protected void checkWhoIsTheBetterStudentInHufflepuf(Hufflepuff hufflepuffStudent) {

        int sumOfQualities_1 = hufflepuffStudent.getHardworking() + hufflepuffStudent.getLoyality() + hufflepuffStudent.getHonest();
        int sumOfQualities_2 = this.hardworking + this.loyality + this.honest;
        if (sumOfQualities_2 > sumOfQualities_1) {
            System.out.println(this.getFullName() + " лучший Пуффендуевец, чем " + hufflepuffStudent.getFullName());
        } else if (sumOfQualities_1 > sumOfQualities_2) {
            System.out.println(hufflepuffStudent.getFullName() + " лучший Пуффендуевец, чем " + this.getFullName());
        } else {
            System.out.println(hufflepuffStudent.getFullName() + " и " + this.getFullName() + ". Оба одинаково хороши. ");
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
