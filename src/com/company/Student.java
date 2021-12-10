package com.company;

public class Student extends Person {
    private String university;// универ студенттин
    private int course;// окитын курс

    public Student(String nameSurname, int age, Genders gender, int height, double weight, String university,
                   int course) {
        super(nameSurname, age, gender, height, weight);// суперкласс конструктордан шакырылды
        this.university = university;
        this.course = course;
    }

    public String getUniversity() {// гетттеры информацияны полядан алу ушин
        return university;
    }

    public void setUniversity(String university) { //сеттеры информациясы озинин керек орнына кою ушин колдану
        this.university = university;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public int hashCode() {//еки int типтерин хэш код аркылу салыстыру
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + course;
        result = prime * result + ((university == null) ? 0 : university.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {// экуалс объектылардын содержаниесын салыстыру
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (course != other.course)
            return false;
        if (university == null) {
            if (other.university != null)
                return false;
        } else if (!university.equals(other.university))
            return false;
        return true;
    }

    @Override
    public String toString() {// ту стринг конструктордан шакыру
        return "Student [" + super.toString() + ", university=" + university + ", course=" + course + "]";
    }


}
