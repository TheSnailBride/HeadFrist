package ch05;

public class ChocteBoiler {
    private boolean empty;
    private boolean boiled;

    private static ChocteBoiler uniqehocteBoiler;

    private ChocteBoiler(){
        empty = true;
        boiled = false;
    }

    public static synchronized ChocteBoiler getInstance(){
        if(uniqehocteBoiler ==null){
            uniqehocteBoiler = new ChocteBoiler();
        }
        return uniqehocteBoiler;

    }// 1번 스레드에서 getInstance 가 들어갔을때, 2번 스레드도 분기처리가 끝난경우
}
