public class lesson8_character_datatypes {
    public static void main(String[] args) {
        
        // In this example, I will be using an in real life situation on the student grade- how it's ranked.
        // I will be mixing a string datatype here to add subjects.
        char gradeA = 'A';
        char gradeB = 'B';
        char gradeC = 'C';
        char gradeD = 'D';
        char gradeF = 'F';

        String subject1 = "Mathematics";
        String subject2 = "English";
        String subject3 = "Physics";
        String subject4 = "Chemistry";
        String subject5 = "Biology";
        String subject6 = "Physical Education";

        System.out.println(subject1 + ": " + gradeF);
        System.out.println(subject2 + ": " + gradeB);
        System.out.println(subject3 + ": " + gradeC);
        System.out.println(subject4 + ": " + gradeD);
        System.out.println(subject5 + ": " + gradeC);
        System.out.println(subject6 + ": " + gradeA);
    }
    
}