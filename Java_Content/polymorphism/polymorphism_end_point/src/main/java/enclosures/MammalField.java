package enclosures;

import animals.Mammal;
import staff.Keeper;
import staff.Staff;

public class MammalField extends Enclosure{

    public MammalField(String name, Keeper keeper){
        super(name, keeper);
    }

    public void addAnimal(Mammal mammal){
        this.animals.add(mammal);
    }

}
