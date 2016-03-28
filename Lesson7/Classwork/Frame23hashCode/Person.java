package Lesson7.Classwork.Frame23hashCode;


import java.util.HashMap;

public class Person {

    private String name;
    private int age;
    private long salary;
    private Adress adress;


    Person() {

    }


    Person(String name, int age, long salary, Adress adress) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.adress = adress;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person p = (Person) obj;
            if ((p.name != null && name.equals(p.name)) && (p.age > 0 && p.age == age) && (p.salary == p.salary)) {
                return true;
            }
        }

        return false;
    }


    @Override
    public int hashCode() {
        int result = 25;
        result = 37 * result + name.hashCode();
        result = 37 * result + age;
        result = 37 * result + new Long(salary).hashCode();
        result = 37 * result + adress.hashCode();
        return result;
    }


    public String getAdress() {
        return adress.getCity() + " " + adress.getStreet() + " " + adress.getHouse();
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }


    public static void main(String[] args) {
        Person p = new Person();
        HashMap<String, Person> hm = new HashMap<>();
        hm.put("Irina", new Person("Irina", 25, 1000, new Adress("Moscow", "Standartnaya", 21)));
        hm.put("Anton", new Person("Anton", 21, 5000, new Adress("Moscow", "Standartnaya", 21)));
        hm.put("Lubov", new Person("Lubov", 61, 10000, new Adress("Moscow", "Injenernaia", 26)));


        System.out.println(hm.containsKey("Anton"));
        System.out.println(hm.containsKey("ALen'"));
        System.out.println(hm.containsValue(new Person("Lubov", 61, 10000, new Adress("Moscow", "Standartnaya", 21))));

        System.out.println();

        for (String key : hm.keySet()) {
            System.out.println("Key: " + key);
        }

        System.out.println();

        for (Person value : hm.values()) {
            System.out.println("Value: " + value.getName() + " " + value.getAge() + " " + value.getSalary() + " " + value.getAdress());
        }
        System.out.println();
        System.out.println(hm.get("Irina"));
        System.out.println(hm.get("Anton"));
        System.out.println();
        Person p1 = new Person("Anton", 21, 5000, new Adress("Moscow", "Standartnaya", 21));
        Person p2 = new Person("Irina", 25, 1000, new Adress("Moscow", "Standartnaya", 21));
        System.out.println(p1.equals(p2));
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}
