package lesson2.hw.task3;

//{
//        id: 1,
//        name: 'vasya',
//        surname: 'pupkin',
//        email: 'lesson5_io.asd@lesson5_io.asd.com',
//        age: 31,
//        gender: 'MALE',
//        skills: [{title: 'java', exp: 10}, {title: 'js', exp: 10}, {title: 'c++', exp: 10}],
//        car: {model: 'toyota', year: 2021, power: 250}
//        }


import lesson2.enums.Gender;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Developer developer = new Developer(
                1,
                "asd",
                "asd",
                "asd",
                31,
                Gender.FEMALE,
                Arrays.asList(
                        new Skill("qweqwe", 123),
                        new Skill("qweqwe", 123),
                        new Skill("qweqwe", 123))

        );
    }
}



