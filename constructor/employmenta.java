package constructor;

public class employmenta {
    String name;
    int emp_id;

    employmenta(String  name, int emp_id){
        this.name=name;
        this.emp_id=emp_id;


    }

    public static void main(String[] args) {
        employmenta e1= new employmenta("tashi",20000);
        employmenta e2=new employmenta("shal",233);

        System.out.println(e1.name+ " " +e2.emp_id);
         System.out.println(e1.name+ " " +e1.emp_id);
          System.out.println(e2.name+ " " +e2.emp_id);
    }
    
}
