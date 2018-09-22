package clock;

import display.led.Display;

public class Clock{
    private Display hour=new Display(24);
    private Display minute=new Display(60);

    public void start(){
        while(true){
            minute.increase();
            if(minute.getValue()==0){
                hour.increase();
                }
            System.out.printf("%02d:%02d\n",hour.getValue(),minute.getValue());
            }
        }

    public static void main(String[] args)
    {
        Clock clock=new Clock();
        clock.start();
     }
}
//一个类的成员变量可以是其他类的对象

//同一个类的不同的对象之间可以互相访问别人的私有的成员。
//只有这个类内部可以访问。
//类内部指类的成员函数和定义初始化。
//这个限制是对类的而不是对对象的。
//注意：在这个Clock类中main函数是可以访问Clock类的私有成员的。（因为main函数被定义在了Clock类中?)

//public:
//任何人都可以访问
//任何人指的是在任何类的函数或定义初始化中可以使用。
//使用指的是调用、访问或定义变量。

//如果在方法（函数）前面没有写Public或private，则这个方法会被自动定义为friendly，且与它位于同一个包中的其他类可以访问它。
//如果一个类的类前为public，则表明任何人都可以用这个类的定义来定义变量。
//且如果类前用的是public则有一个要求：这个类必须处在一个源代码文件中，这个源代码文件的文件名必须和这个类的名字相同。

//如果一个类前没有public，则表明这个类只能在这个包中起作用，一旦出了这个包则这个类就不能起作用。
//一个编译单元最多只能有一个public（这就意味着即是一个编译单元中没有public定义的类也不会出错。
//只要需要用到的那个类不在正在编写的包中就需要import它（包可以理解为c中的文件，import可以理解为c中的include）
//或者如果实在不用import，在用到其他包里的类时就需要给出类的全名。
//如：private display.Display hour=new display.Display(24);
//包的名字中可以有点'.',点实际上表达的就是在文件系统里文件夹的层次，每一个点代表一个文件夹层次






