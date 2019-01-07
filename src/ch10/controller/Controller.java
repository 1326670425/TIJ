/**
 * @Title Controller.java
 * @Package ch10.controller
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月7日
 * @version 1.0
 */
package ch10.controller;
import java.util.*;
/**
 * @ClassName Controller
 * @Description 管理并触发事件的实际控制框架
 * @author 吴扬颉
 * @date 2019年1月7日
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
