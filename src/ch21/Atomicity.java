/**
 * @Title Atomicity.java
 * @Package ch21
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月10日
 * @version 1.0
 */
package ch21;

/**
 * @ClassName Atomicity
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月10日
 * 
 */
public class Atomicity {
	int i;
	void f1(){ i++; }
	void f2(){ i += 3; }
}
/* javap -c Atomicity
 * void f1():
 * 	Code:
 * 		0: aload_0
 * 		1: dup
 * 		2: getfield
 * 		5: iconst_1
 * 		6: iadd
 * 		7: putfield
 * 		10:return
 * void f2():
 * 	Code:
 * 		0: aload_0
 * 		1: dup
 * 		2: getfield
 * 		5: iconst_3
 * 		6: iadd
 * 		7: putfield
 * 		10:return
 * get和put之间还有一些其它指令，不是原子操作
 */