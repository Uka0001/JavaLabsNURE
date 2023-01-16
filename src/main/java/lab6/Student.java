package lab6;

import java.util.Map;

public abstract class Student implements Abiturient {
    private boolean isStudentFlag;
    private int yearOfStudying;

    Map<String, Integer> marksMap;

    @Override
    public boolean isStudent() {
        return isStudentFlag;
    }

    @Override
    public int getYear() {
        return isStudent() ? yearOfStudying : 0;
    }

    public boolean isStudentFlag() {
        return isStudentFlag;
    }

    public void setStudentFlag(boolean studentFlag) {
        isStudentFlag = studentFlag;
    }

    public int getYearOfStudying() {
        return yearOfStudying;
    }

    public void setYearOfStudying(int yearOfStudying) {
        this.yearOfStudying = yearOfStudying;
    }

    public Map<String, Integer> getMarksMap() {
        return marksMap;
    }

    public void setMarksMap(Map<String, Integer> marksMap) {
        this.marksMap = marksMap;
    }

    public Student(boolean isStudentFlag, int yearOfStudying, Map<String, Integer> marksMap) {
        this.isStudentFlag = isStudentFlag;
        this.yearOfStudying = yearOfStudying;
        this.marksMap = marksMap;
    }
}
