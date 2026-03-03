package ch07;

import java.util.Enumeration;

public class EnumerationIterator implements Iterable<Object>{

    Enumeration<?> enumeration;

    public EnumerationIterator(Enumeration<?> enumeration){
        this.enumeration = enumeration;
    }

    public boolean hasNext(){
        return enumeration.hasMoreElements();
    }
    public Object next(){
        return enumeration.nextElement();
    }
    public void remove(){
        throw new UnsupportedOperationException(); // 기존에 없는 메소드
    }
}
