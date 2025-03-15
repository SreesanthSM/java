class niha{
    int age=20;
   
}
class manu extends niha{
String name="sreesanth";
}
public class age1{
public static void main(String[] args) {
    manu S1=new manu();
    System.out.println("name :"+S1.name);
    niha B1=new niha();
    System.out.println("age:"+B1.age);
}
    
}