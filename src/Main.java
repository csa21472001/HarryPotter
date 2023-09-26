// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {

        Slytherin[] slytherins = new Slytherin[3];
        slytherins[0] = new Slytherin("Драко Малфой", 59, 65, 66, 69, 79, 65, 77);
        slytherins[1] = new Slytherin("Грэхэм Монтегю", 63, 68, 56, 59, 55, 59, 41);
        slytherins[2] = new Slytherin("Грегори Гойл", 47, 55, 51, 55, 65, 48, 67);
        Griffindor[] griffindors = new Griffindor[3];
        griffindors[0] = new Griffindor("Гарри Поттер", 63, 71, 66, 69, 79);
        griffindors[1] = new Griffindor("Гермиона Грейнджер", 75, 69, 56, 59, 60);
        griffindors[2] = new Griffindor("Рон Уизли", 57, 62, 51, 55, 65);
        Ravenclaw[] ravenclaws = new Ravenclaw[3];
        ravenclaws[0] = new Ravenclaw("Чжоу Чанг", 69, 71, 66, 69, 79, 65);
        ravenclaws[1] = new Ravenclaw("Падма Патил", 72, 75, 56, 59, 55, 59);
        ravenclaws[2] = new Ravenclaw("Маркус Белби", 67, 78, 51, 55, 65, 48);
        Hufflepuff[] hufflepuffs = new Hufflepuff[3];
        hufflepuffs[0] = new Hufflepuff("Захария Смит", 63, 71, 66, 69, 79);
        hufflepuffs[1] = new Hufflepuff("Седрик Диггори", 75, 69, 56, 59, 55);
        hufflepuffs[2] = new Hufflepuff("Джастин Финч-Флетчли", 57, 62, 51, 55, 65);
//2
        System.out.println(hufflepuffs[2]);
//3
        ravenclaws[0].checkWhoIsTheBetterStudentInRavenclaw(ravenclaws[1]);
        hufflepuffs[0].checkWhoIsTheBetterStudentInHufflepuf(hufflepuffs[1]);
        slytherins[0].checkWhoIsTheBetterStudentInSlytherin(slytherins[1]);
        griffindors[0].checkWhoIsTheBetterStudentInGriffndor(griffindors[1]);
//4
        hufflepuffs[0].checkWhoIsBetterInCommonSkills(ravenclaws[1]);
    }
}