package lab6;

import java.util.Map;

public class StudentPartTime extends Student{

    public StudentPartTime(boolean isStudentFlag, int yearOfStudying, Map<String, Integer> marksMap) {
        super(isStudentFlag, yearOfStudying, marksMap);
    }

    @Override
    public Integer getMark(String discipline) {
        return marksMap.getOrDefault(discipline, 0);
    }
}
