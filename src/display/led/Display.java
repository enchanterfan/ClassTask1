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
		//static��Ա�ĳ�ʼ���Ͷ���Ĵ���ʱû�й�ϵ�ġ�
		//������static step�ĳ�ʼֵ��1��������ÿһ�ζ���ĳ�ʼ�����ɾͽ�step��ֵ��Ϊ1��
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
		//��Ա�����������У����ڶ����С�
		//static����ı�������������������ǳ�Ա������������ı��������������κ�һ����������������࣬
		//�����κ�һ������ӵ�����������������ֻ��һ�ݣ�������������κζ����У������а취���ʵ����������Ǹ�������ı�����
		
		/*���磻public static void f(){
	    value++;
	    }�Ǵ�ġ���Ϊvalue����static���͵ġ�*/
		//��static������ֻ��ȥ���ñ��static������ֻ��ȥ����static�ĳ�Ա����������ȥ���ʷ�static�ĺ����ͱ�����
		//static�ĺ�����static�ĳ�Ա����������ͨ���������ȥ���ʡ�Ҳ����ͨ��һ������ȥ����static�������ܻ�ö���ľ�����Ϣ��
		
	}

}
