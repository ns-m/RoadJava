package SerializationLs47;

import java.io.Serializable;

public class PersonLs47 implements Serializable {

    private static final long serialVersionUID = -7117068370294114932L;
    //private static final long serialVersionUID = -3639333299274329106L;

    //private transient int id;
    private int id;
    //private transient String name;
    private String name;

    //new field
    private int age;
    private byte type;

    public PersonLs47(int id, String name){
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
