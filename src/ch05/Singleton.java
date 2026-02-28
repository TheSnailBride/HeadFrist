package ch05;

public class Singleton {

    public static Singleton uniqueSingleton =new Singleton();

    private Singleton(){
        System.out.println("싱글톤 새로운 객체 생성");
    }
//    public static SingleTon getInstance(){ // 객체가 두 개 생성 될 수 있음
//        if(uniqueSingleTon == null){
//            uniqueSingleTon =new SingleTon();
//        }
//        return uniqueSingleTon;
//    }

//        public static synchronized Singleton getInstance(){ // 싱크로나이즈 하면 속도는 저하되지만 싱글톤 보장
//        if(uniqueSingleTon == null){
//            uniqueSingleTon =new Singleton();
//        }
//        return uniqueSingleTon;
//    }

    public static Singleton getInstance(){
        return uniqueSingleton;
    }



}
