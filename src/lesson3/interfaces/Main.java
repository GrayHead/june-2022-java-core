package lesson3.interfaces;

public class Main {
    public static void main(String[] args) {

//        Singer singer = new User(1, "vasya");
//        singer.sing();
//
//        Singer singer2 = new Student();
//        singer2.sing();
//
//        foobar(new Student());
//
//        Runner runner = new User();
//        runner.run(11);


//        Singer singer = new Singer(){
//            @Override
//            public int run(int avgSpeed) {
//                return 0;
//            }
//
//            @Override
//            public void stop() {
//
//            }
//
//            @Override
//            public void sing() {
//
//            }
//        };


        someStuff(10, 20, (a, b) -> a + b);
        someStuff(10, 20, (a, b) -> a - b);
        someStuff(10, 20, (a, b) -> a * b);
        someStuff(10, 20, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a/b;
            }
        });

        Calculator calculator = new Calculator(){
            @Override
            public int calc(int a, int b) {
                return 0;
            }
        };

        calculator.asdqwe();

        Calculator.foo();

    }

    public static int someStuff(int a, int b, Calculator calculator) {
        int calc = calculator.calc(a, b);
        return calc;
    }

    public static void foobar(Singer singer) {
        /////////
        /////////
        /////////
        /////////
        singer.sing();
        /////////
        /////////
        /////////
        /////////


    }
}
