  
package pack;

public class Test {
    public static void main(String[] args) {
        Graduate graduate = new Graduate();
        graduate.setName("shw");//设置姓名
        graduate.setmoney(6400, 2000);//设置每学期的费用,月工资
        System.out.println("shw学费为："+graduate.getxuefei());
        System.out.println("shw年收入为："+graduate.getsalary()); 
        System.out.println("shw纳税额："+((graduate.getsalary()*0.25)-1005));
        graduate.setmoney(5000, 2500);//设置每学期的费用,月工资
        System.out.println("hw学费为："+graduate.getxuefei());
        System.out.println("hw年收入为："+graduate.getsalary()); 
        System.out.println("hw纳税额："+((graduate.getsalary()*0.25)-1005)); 
        }
        
        
}