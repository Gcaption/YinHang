/*
@author:����
@file:ģ�����д��.java
@package:����
@project:ģ�����ж��ڴ��ܡ��������ж��ڴ���˻���DepositAccount�����а������˺š�����������
 * ����������ʵ����ԣ��Ϳ���������ѯ��������Ϣ�ȷ�����Ҫ���þ�̬�����洢�����ʣ�
 * ��˽��ʵ�������洢�������ԡ��ṩ��������Ϣ�ķ����ͼ�������Ϣ(����Ϣ/12)�ķ����������д
 * һ�����Գ�����Ը��࣬����Account�Ķ���saver(�˺ţ�1234567890��������ZhangSan������5000Ԫ)��
 * ������������2.3%�����2000Ԫ����ѯ�����㲢��ʾ����Ϣ��
@date time:2017��10��11������18:40:56
@location:https://github.com/Gcaption/YinHang.git
*/
package ����;
public class ģ�����д�� {
public static void main(String args[]) { 
		
		DepositAccount saver = new DepositAccount("1234567890","ZhangSan",5000);     
		DepositAccount.setinterest(0.023);    //���������� ��2.3%
        System.out.println("��������:"+saver.getaccountnumber()); 
		System.out.println("�˺� :"+saver.getname());
		System.out.println("����:"+saver.getbalance());    
		saver.save(2000);              //���2000Ԫ
	}
}
class DepositAccount{                  //����˻���
	private String accountnumber;      //�˺�
	private String username;           //��������
	private int balance;               //������
	static double interest;            //������
	public static void setinterest(double i) {  //����������   
			interest = i;  
			}
    DepositAccount(String a_number,String u_name,int balance) //���쿪������
		{  
			this.accountnumber = a_number;   
			this.username = u_name;   
			this.balance = (int) balance;  
		}
	public String getname(){          //��ѯ��������
		return username;
	}
	public String getaccountnumber(){ //��ѯ�˺�
		return accountnumber;
	}
	public int getbalance(){          //��ѯ���
		return balance;
	}
	public double year_interest() {    //��������Ϣ  
		return balance * interest;  
		}
	public double month_interest() {    //��������Ϣ  
		return balance * interest/12;  
		}
	public void save(int s){            //���
		System.out.println("��" + s);  
		balance += s;  
		System.out.println("�˻���" + balance);
		System.out.println("����Ϣ��" + year_interest()); 
		System.out.println("����Ϣ��" + month_interest());
	}
}