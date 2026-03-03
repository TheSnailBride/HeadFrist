package ch06;

public class LightOnCommand implements Command{

    Light light;

    public LightOnCommand(Light light){
        this.light = light;
        System.out.println("불을 켭니다");
    }

    @Override
    public void execute() {
        light.on();
    }
}
