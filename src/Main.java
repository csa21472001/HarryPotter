// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//2
        hogwarts hogwartsStudents = new hogwarts();
        int indexOfStudent = 1;
        String faculty = "Hufflepuff";
        hogwartsStudents.printOneStudent(faculty, indexOfStudent);
//3
        int indexOfStudent_1 = 1;
        int indexOfStudent_2 = 0;
        Ravenclaw.checkWhoIsTheBetterStudentInRavenclaw(indexOfStudent_1, indexOfStudent_2);
        Hufflepuff.checkWhoIsTheBetterStudentInRavenclaw(indexOfStudent_1, indexOfStudent_2);
        Slytherin.checkWhoIsTheBetterStudentInSlytherin(indexOfStudent_1, indexOfStudent_2);
        Griffindor.checkWhoIsTheBetterStudentInGriffndor(indexOfStudent_1, indexOfStudent_2);
//4
        indexOfStudent_1 = 4;
        indexOfStudent_2 = 8;
        hogwartsStudents.checkWhoIsBetterInCommonSkills(indexOfStudent_1, indexOfStudent_2);
    }
}