/**
 * @Title RecoverCADState.java
 * @Package ch18
 * @Description TODO
 * @author �����
 * @date 2019��4��3��
 * @version 1.0
 */
package ch18;
import java.io.*;
import java.util.*;
/**
 * @ClassName RecoverCADState
 * @Description TODO
 * @author �����
 * @date 2019��4��3��
 * 
 */
public class RecoverCADState {
	  @SuppressWarnings("unchecked")
	  public static void main(String[] args) throws Exception {
	    ObjectInputStream in = new ObjectInputStream(
	      new FileInputStream("CADState.out"));
	    // Read in the same order they were written:
	    List<Class<? extends Shape>> shapeTypes =
	      (List<Class<? extends Shape>>)in.readObject();
	    Line.deserializeStaticState(in);
	    List<Shape> shapes = (List<Shape>)in.readObject();
	    System.out.println(shapes);
	  }
}
