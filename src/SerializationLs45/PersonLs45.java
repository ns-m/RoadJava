package SerializationLs45;

public class PersonLs45 {

    private int id;
    private String name;

    public PersonLs45(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return id + " : " + name;
    }
}
