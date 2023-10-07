package ExceptionPersonalise;

public class Test {
    public static void main(String[] args) {
        Personne p1=new Personne();
        try {
            p1.setAge(5);
        }catch (AgeNegatifException e)
        {
            System.out.println(e);
        }
        System.out.println("Age :"+p1.getAge());
        try {
            p1.setAge(-5);
        }catch (AgeNegatifException e)
        {
            System.out.println(e);
        }
        System.out.println("Age :"+p1.getAge());





    }
}
