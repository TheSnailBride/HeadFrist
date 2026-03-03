package ch05;

public class Singleton {

    public static Singleton uniqueSingleton =new Singleton();

    int num =11;

    private Singleton(){
        num=20;
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

    public static void test(){
        System.out.println("여긴 메소드라서 실행 된다");
    }
    public void test1(){
        System.out.println("여긴 static 이 아니라서 실행 안됨");
        System.out.println(num);
    }



}
