/**
 * @Title GreenhouseScheduler.java
 * @Package ch21
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月13日
 * @version 1.0
 */
package ch21;
import java.util.concurrent.*;
import java.util.*;
/**
 * @ClassName GreenhouseScheduler
 * @Description 对比第10章温室控制系统
 * <p>ScheduleThreadPoolExecutor通过调用schedule()（运行一次事务）或者scheduleAtFixedRate()（每隔规定的时间重复执行任务），
 * 可以将Runnable对象设置为将来的某个时刻运行。
 * @author 吴扬颉
 * @date 2019年4月13日
 * 
 */
public class GreenhouseScheduler {
	  private volatile boolean light = false;
	  private volatile boolean water = false;
	  private String thermostat = "Day";
	  public synchronized String getThermostat() {
	    return thermostat;
	  }
	  public synchronized void setThermostat(String value) {
	    thermostat = value;
	  }
	  ScheduledThreadPoolExecutor scheduler =
	    new ScheduledThreadPoolExecutor(10);
	  public void schedule(Runnable event, long delay) {
	    scheduler.schedule(event,delay,TimeUnit.MILLISECONDS);
	  }
	  public void
	  repeat(Runnable event, long initialDelay, long period) {
	    scheduler.scheduleAtFixedRate(
	      event, initialDelay, period, TimeUnit.MILLISECONDS);
	  }
	  class LightOn implements Runnable {
	    public void run() {
	      // Put hardware control code here to
	      // physically turn on the light.
	      System.out.println("Turning on lights");
	      light = true;
	    }
	  }
	  class LightOff implements Runnable {
	    public void run() {
	      // Put hardware control code here to
	      // physically turn off the light.
	      System.out.println("Turning off lights");
	      light = false;
	    }
	  }
	  class WaterOn implements Runnable {
	    public void run() {
	      // Put hardware control code here.
	      System.out.println("Turning greenhouse water on");
	      water = true;
	    }
	  }
	  class WaterOff implements Runnable {
	    public void run() {
	      // Put hardware control code here.
	      System.out.println("Turning greenhouse water off");
	      water = false;
	    }
	  }
	  class ThermostatNight implements Runnable {
	    public void run() {
	      // Put hardware control code here.
	      System.out.println("Thermostat to night setting");
	      setThermostat("Night");
	    }
	  }
	  class ThermostatDay implements Runnable {
	    public void run() {
	      // Put hardware control code here.
	      System.out.println("Thermostat to day setting");
	      setThermostat("Day");
	    }
	  }
	  class Bell implements Runnable {
	    public void run() { System.out.println("Bing!"); }
	  }
	  class Terminate implements Runnable {
	    public void run() {
	      System.out.println("Terminating");
	      scheduler.shutdownNow();
	      // Must start a separate task to do this job,
	      // since the scheduler has been shut down:
	      new Thread() {
	        public void run() {
	          for(DataPoint d : data)
	            System.out.println(d);
	        }
	      }.start();
	    }
	  }
	  // New feature: data collection
	  static class DataPoint {
	    final Calendar time;
	    final float temperature;
	    final float humidity;
	    public DataPoint(Calendar d, float temp, float hum) {
	      time = d;
	      temperature = temp;
	      humidity = hum;
	    }
	    public String toString() {
	      return time.getTime() +
	        String.format(
	          " temperature: %1$.1f humidity: %2$.2f",
	          temperature, humidity);
	    }
	  }
	  private Calendar lastTime = Calendar.getInstance();
	  { // Adjust date to the half hour
		// 修正时间为正点或半点
	    lastTime.set(Calendar.MINUTE, 30);
	    lastTime.set(Calendar.SECOND, 00);
	  }
	  private float lastTemp = 65.0f;
	  // 温度变化方向，围绕初始值随机波动
	  private int tempDirection = +1;
	  private float lastHumidity = 50.0f;
	  // 湿度变化方向，围绕初始值随机波动
	  private int humidityDirection = +1;
	  private Random rand = new Random(47);
	  List<DataPoint> data = Collections.synchronizedList(
	    new ArrayList<DataPoint>());
	  class CollectData implements Runnable {
	    public void run() {
	      System.out.println("Collecting data");
	      synchronized(GreenhouseScheduler.this) {
	        // Pretend the interval is longer than it is:
	    	// 此次时间是上次时间再往后半个小时
	        lastTime.set(Calendar.MINUTE,
	          lastTime.get(Calendar.MINUTE) + 30);
	        // One in 5 chances of reversing the direction:
	        if(rand.nextInt(5) == 4)
	          tempDirection = -tempDirection;
	        // Store previous value:
	        lastTemp = lastTemp +
	          tempDirection * (1.0f + rand.nextFloat());
	        if(rand.nextInt(5) == 4)
	          humidityDirection = -humidityDirection;
	        lastHumidity = lastHumidity +
	          humidityDirection * rand.nextFloat();
	        // Calendar must be cloned, otherwise all
	        // DataPoints hold references to the same lastTime.
	        // For a basic object like Calendar, clone() is OK.
	        data.add(new DataPoint((Calendar)lastTime.clone(),
	          lastTemp, lastHumidity));
	      }
	    }
	  }
	  public static void main(String[] args) {
	    GreenhouseScheduler gh = new GreenhouseScheduler();
	    gh.schedule(gh.new Terminate(), 5000);
	    // Former "Restart" class not necessary:
	    gh.repeat(gh.new Bell(), 0, 1000);
	    gh.repeat(gh.new ThermostatNight(), 0, 2000);
	    gh.repeat(gh.new LightOn(), 0, 200);
	    gh.repeat(gh.new LightOff(), 0, 400);
	    gh.repeat(gh.new WaterOn(), 0, 600);
	    gh.repeat(gh.new WaterOff(), 0, 800);
	    gh.repeat(gh.new ThermostatDay(), 0, 1400);
	    gh.repeat(gh.new CollectData(), 500, 500);
	  }
}
