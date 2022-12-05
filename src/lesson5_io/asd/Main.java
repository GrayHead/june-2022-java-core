package lesson5_io.asd;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<UserCandidate> usersCandidate = new ArrayList<>();


        ArrayList<Skills> vasiaSkills = new ArrayList<>();
        vasiaSkills.add(new Skills("Skill-1", 1));
        vasiaSkills.add(new Skills("Skill-2", 2));
        vasiaSkills.add(new Skills("Skill-3", 3));

        usersCandidate.add(new UserCandidate(
                1,
                "Вася",
                "Пупкин",
                "pupkin@gmail.com",
                31,
                Gender.Male,
                vasiaSkills,
                new Car(CarModel.HONDA, "2017", 200)
        ));

        ArrayList<Skills> petyaSkills = new ArrayList<>();
        petyaSkills.add(new Skills("Skill-4", 3));
        petyaSkills.add(new Skills("Skill-5", 2));

        usersCandidate.add(new UserCandidate(
                2,
                "Петя",
                "Петров",
                "petrov@gmail.com",
                49,
                Gender.Male,
                petyaSkills,
                new Car(CarModel.HONDA, "2000", 200)
        ));
        ArrayList<Skills> nikolaSkills = new ArrayList<>();
        vasiaSkills.add(new Skills("Skill-4", 3));
        usersCandidate.add(new UserCandidate(
                3,
                "Николай",
                "Конопенко",
                "konopenko@gmail.com",
                33,
                Gender.Male,
                nikolaSkills,
                new Car(CarModel.HONDA, "2018", 200)
        ));
        ArrayList<Skills> dariaSkills = new ArrayList<>();
        dariaSkills.add(new Skills("Skill-4", 3));
        dariaSkills.add(new Skills("Skill-8", 2));
        usersCandidate.add(new UserCandidate(
                4,
                "Дарья",
                "Пупкина",
                "daria@gmail.com",
                23,
                Gender.Female,
                dariaSkills,
                new Car(CarModel.HONDA, "2011", 200)
        ));
        ArrayList<Skills> egorSkills = new ArrayList<>();
        egorSkills.add(new Skills("Skill-4", 3));
        egorSkills.add(new Skills("Skill-5", 2));
        egorSkills.add(new Skills("Skill-6", 2));
        egorSkills.add(new Skills("Skill-7", 1));
        egorSkills.add(new Skills("Skill-8", 2));
        usersCandidate.add(new UserCandidate(
                5,
                "Егор",
                "Жилин",
                "gulin@gmail.com",
                21,
                Gender.Male,
                egorSkills,
                new Car(CarModel.HONDA, "2019", 200)
        ));
        ArrayList<Skills> anastasiaSkills = new ArrayList<>();
        anastasiaSkills.add(new Skills("Skill-4", 3));
        anastasiaSkills.add(new Skills("Skill-5", 2));
        anastasiaSkills.add(new Skills("Skill-6", 2));
        anastasiaSkills.add(new Skills("Skill-7", 1));
        anastasiaSkills.add(new Skills("Skill-8", 2));
        anastasiaSkills.add(new Skills("Skill-8", 2));
        anastasiaSkills.add(new Skills("Skill-8", 2));
        usersCandidate.add(new UserCandidate(
                6,
                "Анастасия",
                "Журавченко",
                "guravchenko@gmail.com",
                23,
                Gender.Female,
                anastasiaSkills,
                new Car(CarModel.HONDA, "2020", 200)
        ));
        ArrayList<Skills> nataliaSkills = new ArrayList<>();
        nataliaSkills.add(new Skills("Skill-4", 3));
        nataliaSkills.add(new Skills("Skill-7", 1));
        nataliaSkills.add(new Skills("Skill-8", 2));
        usersCandidate.add(new UserCandidate(
                7,
                "Наталья",
                "Петрова",
                "petrova@gmail.com",
                20,
                Gender.Female,
                vasiaSkills,
                new Car(CarModel.HONDA, "2019", 200)
        ));
        ArrayList<Skills> igorSkiills = new ArrayList<>();
        igorSkiills.add(new Skills("Skill-4", 3));
        igorSkiills.add(new Skills("Skill-5", 2));
        igorSkiills.add(new Skills("Skill-6", 2));
        igorSkiills.add(new Skills("Skill-7", 1));
        igorSkiills.add(new Skills("Skill-8", 2));
        usersCandidate.add(new UserCandidate(
                8,
                "Игорь",
                "Пушкин",
                "pushkin@gmail.com",
                29,
                Gender.Male,
                igorSkiills,
                new Car(CarModel.HONDA, "2019", 200)
        ));
        ArrayList<Skills> natalia1Skills = new ArrayList<>();
        natalia1Skills.add(new Skills("Skill-4", 3));
        natalia1Skills.add(new Skills("Skill-5", 2));
        natalia1Skills.add(new Skills("Skill-6", 2));
        natalia1Skills.add(new Skills("Skill-7", 1));
        natalia1Skills.add(new Skills("Skill-8", 2));
        usersCandidate.add(new UserCandidate(
                9,
                "Наталья",
                "Роса",
                "rosa@gmail.com",
                20,
                Gender.Female,
                natalia1Skills,
                new Car(CarModel.HONDA, "2019", 200)
        ));
        ArrayList<Skills> vasia1Skills = new ArrayList<>();
        vasia1Skills.add(new Skills("Skill-4", 3));
        vasia1Skills.add(new Skills("Skill-5", 2));
        vasia1Skills.add(new Skills("Skill-6", 2));
        vasia1Skills.add(new Skills("Skill-7", 1));
        vasia1Skills.add(new Skills("Skill-8", 2));
        usersCandidate.add(new UserCandidate(
                10,
                "Вася",
                "Васильев",
                "vasilyev@gmail.com",
                25,
                Gender.Male,
                vasia1Skills,
                new Car(CarModel.HONDA, "2019", 200)
        ));
        System.out.println("ArraList initial size: " + usersCandidate.size());

        /*Створити HashSet з 10 об'єктів, проітерувати її, видалити всіх чоловіків*/
        System.out.println();

        Set<UserCandidate> userCandidateSet = new HashSet<>(usersCandidate);

        System.out.println(userCandidateSet); //1

    }
}
