  
package pack;

public class Test {
    public static void main(String[] args) {
        Graduate graduate = new Graduate();
        graduate.setName("shw");//��������
        graduate.setmoney(6400, 2000);//����ÿѧ�ڵķ���,�¹���
        System.out.println("shwѧ��Ϊ��"+graduate.getxuefei());
        System.out.println("shw������Ϊ��"+graduate.getsalary()); 
        System.out.println("shw��˰�"+((graduate.getsalary()*0.25)-1005));
        graduate.setmoney(5000, 2500);//����ÿѧ�ڵķ���,�¹���
        System.out.println("hwѧ��Ϊ��"+graduate.getxuefei());
        System.out.println("hw������Ϊ��"+graduate.getsalary()); 
        System.out.println("hw��˰�"+((graduate.getsalary()*0.25)-1005)); 
        }
        
        
}