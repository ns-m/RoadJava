package SerializationLs45;

import java.io.Serializable;

public class PersonLs45 implements Serializable {

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
