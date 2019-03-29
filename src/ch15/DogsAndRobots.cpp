/*
* C++中的潜在类型机制
*/
class Dog{
public:
    void speak(){}
    void sit(){}
    void reproduce(){}
};

class Robot{
public:
    void speak(){}
    void sit(){}
    void oilChange(){}
};

template<class T> void perform(T anything){
    anything.speak()
    anything.sit()
}

int main(){
    Dog d;
    Robot r;
    perform(d);
    perform(r);
}