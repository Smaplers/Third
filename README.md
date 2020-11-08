# Third
Java课程作业项目
一、实验目的
1.掌握Java中抽象类和抽象方法的定义；
2.掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法
3.了解异常的使用方法，并在程序中根据输入情况做异常处理
二。实验目的
1.某学校为了给学生提供勤工俭学机会，也减轻授课教师的部分压力，准许博士研究生参与课程的助教工作。此时，该博士研究生有双重身份：学生和助教教师。
2.设计两个管理接口：学生管理接口和教师管理接口。学生接口必须包括缴纳学费、查学费的方法；教师接口包括发放薪水和查询薪水的方法。
3.设计博士研究生类，实现上述的两个接口，该博士研究生应具有姓名、性别、年龄、每学期学费、每月薪水等属性。
4.编写测试类，并实例化至少两名博士研究生，统计他们的年收入和学费。根据两者之差，算出每名博士研究生的年应纳税金额。
三、实验要求
1.在博士研究生类中实现各个接口定义的抽象方法;
2.对年学费和年收入进行统计，用收入减去学费，求得纳税额；
3.国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用static final修饰定义。
4.实例化研究生类时，可采用运行时通过main方法的参数args一次性赋值，也可采用Scanner类实现运行时交互式输入。
5.根据输入情况，要在程序中做异常处理。
四、实验步骤
根据实验内容，设立两个接口，学生管理接口和教师管理接口，并声明缴纳学费，查询学费（学生管理接口），支付薪水，查询薪水（教师管理接口）
根据实验内容，设计博士研究生类，并利用set与get方法来实现以上两个接口，同时添加姓名，性别，年龄，每学期学费，每月薪水属性。
对博士研究生类进行复写（toString），以便在Test类中输出。
自定义异常类Aexception，以便在Test类中能使用户输入正确的姓名。
1.定义两个接口teacher student 并声明方法
2.在Graduate类中写出研究生应有的属性及学费和工资的算法并实现两个接口中的方法
3.在test中写出纳税额的算法输入月工资和学费，经过计算输出结果
五。核心代码
package pack;
public class Graduate implements StudentInterface, TeacherInterface{
    private String name;
    private String sex;
    private int age;
    private double xuefei;
    private double salary;
    public void setName(String a) {
        name = a;
    }
    public void setSex(String a) {
        sex = a;
    }
    public void setAge(int a) {
        age = a;
    }
    public void setmoney(double a, double b) {
        xuefei = a;
        salary = b;
    }
    public double setxuefei(){
        return 0;
    }
    public double getxuefei(){//返回每学年的费用
        return xuefei * 2;
    }
    public double setsalary(){
        return 0;
    }
    public double getsalary(){//返回年收入
        return salary * 12;
    }

}
六。实验感想
这次实验主要体现了抽象类，接口与异常处理的使用，掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法
当程序完成后，学会了对程序细节的优化，抽象类与接口的使用，
可以在接口中去仅仅做函数的声明，在其余抽象类中去实现相关函数的方法，且相同函数声明在不同类中能用不同的方法的实现。
在企业生产中，可以分配给不同员工，写不同的任务，并且可以同时在测试类中体现。
