public class Person {
    private String name;
    private String surName;
    private Home home;

    public Person(String name, String surName, Home home) {
        this.name = name;
        this.surName = surName;
        this.home = home;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public Home getHome() {
        return home;
    }

    public void setHome(Home home) {
        this.home = home;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", home=" + home.getClass().getSimpleName() +
                '}';
    }
}
