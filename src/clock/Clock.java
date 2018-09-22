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
//һ����ĳ�Ա����������������Ķ���

//ͬһ����Ĳ�ͬ�Ķ���֮����Ի�����ʱ��˵�˽�еĳ�Ա��
//ֻ��������ڲ����Է��ʡ�
//���ڲ�ָ��ĳ�Ա�����Ͷ����ʼ����
//��������Ƕ���Ķ����ǶԶ���ġ�
//ע�⣺�����Clock����main�����ǿ��Է���Clock���˽�г�Ա�ġ�����Ϊmain��������������Clock����?)

//public:
//�κ��˶����Է���
//�κ���ָ�������κ���ĺ��������ʼ���п���ʹ�á�
//ʹ��ָ���ǵ��á����ʻ��������

//����ڷ�����������ǰ��û��дPublic��private������������ᱻ�Զ�����Ϊfriendly��������λ��ͬһ�����е���������Է�������
//���һ�������ǰΪpublic��������κ��˶������������Ķ��������������
//�������ǰ�õ���public����һ��Ҫ���������봦��һ��Դ�����ļ��У����Դ�����ļ����ļ��������������������ͬ��

//���һ����ǰû��public������������ֻ����������������ã�һ������������������Ͳ��������á�
//һ�����뵥Ԫ���ֻ����һ��public�������ζ�ż���һ�����뵥Ԫ��û��public�������Ҳ�������
//ֻҪ��Ҫ�õ����Ǹ��಻�����ڱ�д�İ��о���Ҫimport�������������Ϊc�е��ļ���import�������Ϊc�е�include��
//�������ʵ�ڲ���import�����õ������������ʱ����Ҫ�������ȫ����
//�磺private display.Display hour=new display.Display(24);
//���������п����е�'.',��ʵ���ϱ��ľ������ļ�ϵͳ���ļ��еĲ�Σ�ÿһ�������һ���ļ��в��






