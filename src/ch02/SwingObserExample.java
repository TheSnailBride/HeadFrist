package ch02;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserExample {

    JFrame frame;

    public static void main(String[] args) {
        SwingObserExample example = new SwingObserExample();
        example.go();
    }

    public void go(){
        frame = new JFrame("옵저버 패턴 예제");

        JButton button = new JButton("할까 말까 ? ");

        button.addActionListener(new AngelListner());
        button.addActionListener(new DevilListner());

        frame.add(button);

        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    class AngelListner implements ActionListener{ //내부 클래스
        public void actionPerformed(ActionEvent event){
            System.out.println("하지마 후회할걸");
        }
    }

    class DevilListner implements ActionListener{
        public void actionPerformed(ActionEvent event){
            System.out.println("그냥 저질러 버려");
        }
    }
}
