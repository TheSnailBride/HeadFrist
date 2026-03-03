package ch06;

import java.util.concurrent.ConcurrentMap;

public class SimpleRemoteControl {
    Command slot;
    public SimpleRemoteControl(){

    }
    public void setCommand(Command command){
        slot = command;
    }
    public void buttonWasPressed(){
        slot.execute();
    }
}
