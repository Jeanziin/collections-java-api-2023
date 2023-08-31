package main.list.Ordination;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdinationPeople {

    private List<People> listPeople;

    public OrdinationPeople(){
        this.listPeople = new ArrayList<>();
    }

    public void addPeople(String name, Integer age, Double height){
        this.listPeople.add(new People(name, age, height));
    }

    public List<People> sortByAge(){
        List<People>  peopleByAge = new ArrayList<>(listPeople);
        Collections.sort(peopleByAge);
        return  peopleByAge;
    }

    public List<People> sortByHeight(){
        List<People> peopleByHight = new ArrayList<>(listPeople);
        Collections.sort(peopleByHight, new ComparatorHight());
        return  peopleByHight;
    }
}
