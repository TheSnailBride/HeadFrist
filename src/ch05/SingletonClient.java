// SingletonClient.java 수정 예시
package ch05;

public class SingletonClient {
    public static void main(String[] args) {
        // 정상적으로 Enum 인스턴스 참조
        Single single = Single.UNIQUE_INSTANCE;

        // 만약 Single에 메소드가 있다면 이렇게 사용
        // single.someMethod(); 
    }
}