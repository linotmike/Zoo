package com.ps;

public class Zoo {
    private String name;
    private String type;
    private int age;
    private String origin;
    private boolean isPublic;


    //constructors

    public Zoo(String name, String type, int age, String origin, boolean isPublic){
        this.name = name;
        this.type= type;
        this.age = age;
        this.origin = origin;
        this.isPublic = isPublic;
    }

    //Getters and Setters

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", age=" + age +
                ", origin='" + origin + '\'' +
                ", isPublic=" + isPublic +
                '}';
    }
}
