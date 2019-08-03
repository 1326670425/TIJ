/**
 * @Title Machine.java
 * @Package ch09
 * @Description TODO
 * @author �����
 * @date 2019��7��27��
 * @version 1.0
 */
package ch09;
import java.util.*;
import onjava.Operations;

class Bing implements Operations {
    @Override
    public void execute() {
        Operations.show("Bing");
    }
}

class Crack implements Operations {
    @Override
    public void execute() {
        Operations.show("Crack");
    }
}

class Twist implements Operations {
    @Override
    public void execute() {
        Operations.show("Twist");
    }
}

/**
 * @ClassName Machine
 * @Description TODO
 * @author �����
 * @date 2019��7��27��
 * 
 */
public class Machine {
	public static void main(String[] args) {
        Operations.runOps(
            new Bing(), new Crack(), new Twist());
    }
}
