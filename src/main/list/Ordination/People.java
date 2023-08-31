package main.list.Ordination;

public class People implements  Comparable<People>{
    private String name;
    private Integer age;
    private Double height;

    public People(String name, Integer age, Double height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    public int compareTo(People people) {
        return Integer.compare(age, people.getAge());
    }
    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }


}
