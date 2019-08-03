/**
 * @Title InterfaceCollision.java
 * @Package ch09
 * @Description TODO
 * @author �����
 * @date 2019��7��27��
 * @version 1.0
 */
package ch09;

interface I1 {
    void f();
}

interface I2 {
    int f(int i);
}

interface I3 {
    int f();
}

class C {
    public int f() {
        return 1;
    }
}

class C2 implements I1, I2 {
    @Override
    public void f() {}

    @Override
    public int f(int i) {
        return 1;  // ����
    }
}

class C3 extends C implements I2 {
    @Override
    public int f(int i) {
        return 1; // ����
    }
}

class C4 extends C implements I3 {
    // ��ȫ��ͬ��û����
    @Override
    public int f() {
        return 1;
    }
}

// �����ķ������Ͳ�ͬ
//- class C5 extends C implements I1 {}
//- interface I4 extends I1, I3 {}
