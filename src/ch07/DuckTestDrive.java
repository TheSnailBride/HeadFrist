package ch07;

public class DuckTestDrive {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("칠면조가 말하길");
        turkey.gobble();
        turkey.fly();

        System.out.println("\n오리가 말하길");
        testDuck(duck);

        System.out.println("\n칠면조 어댑터");
        testDuck(turkeyAdapter);

        System.out.println("\n오리 어댑터");
        Turkey DuckAdapter = new DuckAdapter(duck);
        testTurkey(DuckAdapter);
    }

    static void testDuck(Duck duck){ // turkey 객체로 실행하는게 아니라 duck 객체로 실행함
        duck.quack();
        duck.fly();
    }
    static void testTurkey(Turkey turkey){
        turkey.gobble();
        turkey.fly();
    }
}
