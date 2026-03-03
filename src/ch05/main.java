package ch05;

public class main {
    public static void main(String[] args) {

        Singleton singletonInstance = Singleton.getInstance();
        //        SingleTon singleTon = new SingleTon(); 객체 생성 불가

        Singleton.test();
//        Singleton.test1();

        singletonInstance.test1();
        singletonInstance.test();

        Singleton singletontow = Singleton.getInstance();

        singletontow.test1();
    }
}
