package basic100._p1;

/*
학생 정보들을 저장하고, 학생 이름으로 검색했을 때 학번을 출력하는 프로그램 작성
- Student 클래스 생성
- String name, no를 가짐 (이름과 학번)
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(new Student("kwak", 1));
        studentArrayList.add(new Student("woo", 2));
        studentArrayList.add(new Student("hyun", 3));
        studentArrayList.add(new Student("king", 4));

        while (true) {
            System.out.println("검색 하시겠습니까? Y, N");
            String go = sc.next();
            if (go.equalsIgnoreCase("y")) {
                System.out.println("학생 이름을 검색하세요");
                String studentName = sc.next();
                int studentNo = -99;
                for (Student student : studentArrayList) {
                    if (student.getName().equals(studentName)) {
                        studentNo = student.getNo();
                        break;
                    }
                }
                System.out.println(studentNo != -99 ? studentNo : studentName);
            } else {
                break;
            }
        }
    }

}


