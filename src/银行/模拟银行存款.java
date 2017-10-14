/*
@author:杨兰
@file:模拟银行存款.java
@package:银行
@project:模拟银行定期存款功能。创建银行定期存款账户类DepositAccount，其中包括：账号、储户姓名、
 * 存款余额、年利率等属性，和开户、存款、查询、计算利息等方法。要求用静态变量存储年利率，
 * 用私有实例变量存储其它属性。提供计算年利息的方法和计算月利息(年利息/12)的方法。另外编写
 * 一个测试程序测试该类，建立Account的对象saver(账号：1234567890，姓名：ZhangSan，定存5000元)，
 * 设置年利率是2.3%，存款2000元，查询余额，计算并显示年利息。
@date time:2017年10月11日下午18:40:56
@location:https://github.com/Gcaption/YinHang.git
*/
package 银行;
public class 模拟银行存款 {
public static void main(String args[]) { 
		
		DepositAccount saver = new DepositAccount("1234567890","ZhangSan",5000);     
		DepositAccount.setinterest(0.023);    //设置年利率 是2.3%
        System.out.println("储户姓名:"+saver.getaccountnumber()); 
		System.out.println("账号 :"+saver.getname());
		System.out.println("定存:"+saver.getbalance());    
		saver.save(2000);              //存款2000元
	}
}
class DepositAccount{                  //存款账户类
	private String accountnumber;      //账号
	private String username;           //储户姓名
	private int balance;               //存款余额
	static double interest;            //年利率
	public static void setinterest(double i) {  //设置年利率   
			interest = i;  
			}
    DepositAccount(String a_number,String u_name,int balance) //构造开户方法
		{  
			this.accountnumber = a_number;   
			this.username = u_name;   
			this.balance = (int) balance;  
		}
	public String getname(){          //查询储户姓名
		return username;
	}
	public String getaccountnumber(){ //查询账号
		return accountnumber;
	}
	public int getbalance(){          //查询余额
		return balance;
	}
	public double year_interest() {    //计算年利息  
		return balance * interest;  
		}
	public double month_interest() {    //计算月利息  
		return balance * interest/12;  
		}
	public void save(int s){            //存款
		System.out.println("存款：" + s);  
		balance += s;  
		System.out.println("账户余额：" + balance);
		System.out.println("年利息：" + year_interest()); 
		System.out.println("月利息：" + month_interest());
	}
}