package hackerrank.algorithms.grading_students;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        for (int i = 0; i < grades.size(); i++) {
            int curr = grades.get(i);

            if (curr < 38) {
                continue;
            }

            grades.set(i, curr += findNextMultiple(curr));
        }

        return grades;
    }

    public static int findNextMultiple(int num) {
        if (num % 5 == 0) {
            return 0;
        }

        int times = 0;

        while (num % 5 != 0) {
            if (times >= 2) {
                return 0;
            }
            
            times++;
            num++;
        }

        return times;
    }


    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(4, 73, 67, 38, 33));
        System.out.println(gradingStudents(arr));
    }
}
