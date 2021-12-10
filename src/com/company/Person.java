package com.company;

public abstract class Person {
    private String nameSurname;// аты-жөні
    private int age;// жасы
    private Genders gender;// жынысы
    private int height;// бойы2

    private double weight;// салмағы

    public Person(String nameSurname, int age, Genders gender, int height, double weight) {// конструктор
        super();
        this.nameSurname = nameSurname;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }

    public String getNameSurname() {// геттерлар мен сеттерлар...
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Genders getGender() {
        return gender;
    }

    public void setGender(Genders gender) {
        this.gender = gender;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public int hashCode() {// хэш код, программадан автоматты түрде генерацияланады
        final int prime = 31; //еки int типтерин хэш код аркылу салыстыру
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((gender == null) ? 0 : gender.hashCode());
        result = prime * result + height;
        result = prime * result + ((nameSurname == null) ? 0 : nameSurname.hashCode());
        long temp;
        temp = Double.doubleToLongBits(weight);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {// экуалс, программадан автоматты түрде генерацияланады
        if (this == obj) //экуалс объектылардын содержаниесын салыстыру ушин
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (age != other.age)
            return false;
        if (gender != other.gender)
            return false;
        if (height != other.height)
            return false;
        if (nameSurname == null) {
            if (other.nameSurname != null)
                return false;
        } else if (!nameSurname.equals(other.nameSurname))
            return false;
        if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
            return false;
        return true;
    }

    @Override
    public String toString() {// то стринг объект жайлы ақпаратты шығарады
        return "nameSurname=" + nameSurname + ", age=" + age + ", gender=" + gender + ", height=" + height + ", weight="
                + weight;
    }

}


