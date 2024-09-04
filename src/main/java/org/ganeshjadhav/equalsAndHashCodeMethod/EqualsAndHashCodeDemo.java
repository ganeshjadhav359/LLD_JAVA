package org.ganeshjadhav.equalsAndHashCodeMethod;

public class EqualsAndHashCodeDemo {
    private String name;
    private String birthDate;

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return  false;
        if(!birthDate.equals(((EqualsAndHashCodeDemo) obj).getBirthDate())) return false;
        return name.equals(((EqualsAndHashCodeDemo) obj).getName());
    }
}
