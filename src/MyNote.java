public class MyNote {

    private static MyNote unique;

    private MyNote(){
        System.out.println("나의 노트가 만들어 졌습니다.");
    }

    public static MyNote getInstance(){
        return new MyNote();
    }

    public static void test(){
        System.out.println("test");
    }
}
