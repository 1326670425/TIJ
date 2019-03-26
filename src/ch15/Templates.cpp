/**
* 当实例化这个模板时，C++编译器将进行检查，因此，在Manipulator<HasF>被实例化的时候，编译器已经知道HasF有个f()
* 方法。如果没有该方法，就会得到一个编译期错误，这样类型安全得到了保障
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