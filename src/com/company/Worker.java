package com.company;

public class Worker extends Person {
    private String work;// жұмысы
    private int salary;// жалақысы

    public Worker(String nameSurname, int age, Genders gender, int height, double weight, String work, int salary) {
        super(nameSurname, age, gender, height, weight);// суперклас конструкторын шақырады
        this.work = work;
        this.salary = salary;
    }

    public String getWork() {// геттер-сеттерлар...
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int hashCode() {//  еки int типтерин хэш код аркылу салыстыру
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + salary;   //хэшкод икволстан караганда тезирек орындалады
        result = prime * result + ((work == null) ? 0 : work.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {// экуалс объектылардын содержаниесын салыстыру
        if (this == obj)//конструктор аркылы шыгару
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Worker other = (Worker) obj;
        if (salary != other.salary)
            return false;
        if (work == null) {
            if (other.work != null)
                return false;
        } else if (!work.equals(other.work))
            return false;
        return true;
    }

    @Override
    public String toString() {// то стринг конструктордан
        return "Worker [" + super.toString() + ", work=" + work + ", salary=" + salary + "]";
    }

}


