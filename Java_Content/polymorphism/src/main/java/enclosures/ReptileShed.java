package enclosures;

import animals.Reptile;
import staff.Staff;

public class ReptileShed extends Enclosure{

    public ReptileShed(String name, Staff keeper){
        super(name, keeper);
    }

    public void addAnimal(Reptile reptile){
        this.animals.add(reptile);
    }

}
