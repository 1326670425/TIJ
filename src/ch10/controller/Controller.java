/**
 * @Title Controller.java
 * @Package ch10.controller
 * @Description TODO
 * @author �����
 * @date 2019��1��7��
 * @version 1.0
 */
package ch10.controller;
import java.util.*;
/**
 * @ClassName Controller
 * @Description ���������¼���ʵ�ʿ��ƿ��
 * @author �����
 * @date 2019��1��7��
 * 
 */
public class Controller {
	private List<Event> eventList = new ArrayList<Event>();
	public void addEvent(Event c){ eventList.add(c); }
	public void run(){
		while(eventList.size() > 0){
			for(Event e : new ArrayList<Event>(eventList)){
				if(e.ready()){
					System.out.println(e);
					e.action();
					eventList.remove(e);
				}
			}
		}
	}
}
