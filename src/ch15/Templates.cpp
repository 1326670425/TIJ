/**
* ��ʵ�������ģ��ʱ��C++�����������м�飬��ˣ���Manipulator<HasF>��ʵ������ʱ�򣬱������Ѿ�֪��HasF�и�f()
* ���������û�и÷������ͻ�õ�һ�������ڴ����������Ͱ�ȫ�õ��˱���
**/
#include<iostream>
using namespace std;

template<class T> class Manipulator{
    T obj;
public:
    Manipulator(T x){ obj = x; }
    void manipulate(){ obj.f(); }
};

class HasF{
public:
    void f(){ cout << "Hasf::f()" << endl; }
};

int main(){
    HasF hf;
    Manipulator<HasF> manipulator(hf);
    manipulator.manipulate();
}