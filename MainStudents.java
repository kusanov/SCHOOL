package School;

public class MainStudents {
    public static void main(String[] args) {

        StudentStream student1 = new StudentStream("Кусанов Сергей");
        student1.setSchoolClass("11А");
        System.out.println("Первый ученик: " + student1.getFIO());
        System.out.println("Класс: " + student1.getSchoolClass());

        student1.addLearningSubject(new LearningSubject(ESubject.МАТЕМАТИКА,9.0));
        student1.addLearningSubject(new LearningSubject(ESubject.ЛИТЕРАТУРА,8.0));
        student1.addLearningSubject(new LearningSubject(ESubject.ФИЗИКА,9.0));
        student1.addLearningSubject(new LearningSubject(ESubject.ХИМИЯ,8.0));
        student1.addLearningSubject(new LearningSubject(ESubject.ФИЗКУЛЬТУРА,8.0));
        System.out.println("Средний балл первого ученика: " + student1.getAvg());

        StudentStream student2 = new StudentStream("Кусанов Александр");
        student2.setSchoolClass("11Б");
        System.out.println("Второй Ученик: " + student2.getFIO());
        System.out.println("Класс: " + student2.getSchoolClass());

        student2.addLearningSubject(new LearningSubject(ESubject.МАТЕМАТИКА,10.0));
        student2.addLearningSubject(new LearningSubject(ESubject.ЛИТЕРАТУРА,8.0));
        student2.addLearningSubject(new LearningSubject(ESubject.ФИЗИКА,8.0));
        student2.addLearningSubject(new LearningSubject(ESubject.ХИМИЯ,9.0));
        student2.addLearningSubject(new LearningSubject(ESubject.ФИЗКУЛЬТУРА,8.0));
        System.out.println("Средний балл второго ученика: " + student2.getAvg());
    }

    }
