package SerializationLs46;

import java.io.Serializable;

public class PersonLs46 implements Serializable {

    private int id;
    private String name;

    public PersonLs46(int id, String name){
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
