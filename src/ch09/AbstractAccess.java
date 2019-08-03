/**
 * @Title AbstractAccess.java
 * @Package ch09
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年7月27日
 * @version 1.0
 */
package ch09;

/**
 * @ClassName AbstractAccess
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年7月27日
 * 
 */
abstract class AbstractAccess {
    private void m1() {}

    // private abstract void m1a(); // illegal

    protected void m2() {}

    protected abstract void m2a();

    void m3() {}

    abstract void m3a();

    public void m4() {}

    public abstract void m4a();
}
