package display.led;

public class Display {
	private int value=0;
	private int limit=0;
	private static int step=1;
	
	public Display(int limit) {
		this.limit=limit;
	}
	public void increase(){
	    value++;
	    if(value==limit)
	    {value=0;}
	    }

	public int getValue(){
	    return value;
	    }

	public static void main(String[] args) {
		
		/*Display d=new Display(24);
                for(;;){
                    d.increase();
                    System.out.println(d.getValue());
                    }*/
		
		Display d1=new Display(10);
		d1.step=4;
		System.out.println(d1.step);
		Display d2=new Display(20);
		System.out.println(d2.step);
		//static成员的初始化和对象的创建时没有关系的。
		//在类中static step的初始值是1，不会因每一次对象的初始化生成就将step的值置为1。
		d1.increase();
		System.out.println(d1.getValue());
		System.out.println(d2.getValue());
		System.out.println(d1.step);
		System.out.println(d2.step);
		d1.step=2;
		System.out.println(d1.step);
		System.out.println(d2.step);
		Display.step=3;
		System.out.println(d1.step);
		System.out.println(d2.step);
		//成员变量是在类中，不在对象中。
		//static定义的变量叫做类变量。它不是成员变量，它是类的变量，它不属于任何一个对象，它属于这个类，
		//所以任何一个对象都拥有这个变量，但是它只有一份，这个变量不在任何对象中（对象有办法访问到它所属的那个类里面的变量）
		
		/*例如；public static void f(){
	    value++;
	    }是错的。因为value不是static类型的。*/
		//在static函数中只能去调用别的static函数，只能去访问static的成员变量，不能去访问非static的函数和变量。
		//static的函数和static的成员变量都可以通过类的名字去访问。也可以通过一个对象去调用static（但不能获得对象的具体信息）
		
	}

}
