package com.company;

public class Pensioner extends Person {
    private int year;// зейнетке шыққанына неше жыл болғаны
    private int pensionAmount;// зейнетақы мөлшері

    public Pensioner(String nameSurname, int age, Genders gender, int height, double weight, int year,
                     int pensionAmount) {
        super(nameSurname, age, gender, height, weight);// суперкласс конструкторын шақырады
        this.year = year;
        this.pensionAmount = pensionAmount;
    }

    public int getYear() {// геттер-сеттерлар...

        return year;
    }

    public void setYear(int year) {

        this.year = year;
    }

    public int getPensionAmount() {
        return pensionAmount;
    }

    public void setPensionAmount(int pensionAmount) {
        this.pensionAmount = pensionAmount;
    }

    @Override
    public int hashCode() {// еки int типтерин хэш код аркылу салыстыру
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + pensionAmount;
        result = prime * result + year;
        return result;
    }

    @Override
    public boolean equals(Object obj) {// экуалсты объектарды тенестиру ушин колдану
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pensioner other = (Pensioner) obj;
        if (pensionAmount != other.pensionAmount)
            return false;
        if (year != other.year)
            return false;
        return true;
    }

    @Override
    public String toString() {// то стрингты конструктормен шакыру
        return "Pensioner [" + super.toString() + ", year=" + year + ", pensionAmount=" + pensionAmount + "]";
    }

}

