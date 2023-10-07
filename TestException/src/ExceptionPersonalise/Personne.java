package ExceptionPersonalise;

public class Personne {

    private int id;
    private String nom;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeNegatifException{
        if(age>0)
        this.age = age;
        else throw new AgeNegatifException("L'age doit être positif");
    }
}
