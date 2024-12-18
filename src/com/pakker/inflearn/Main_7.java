package com.pakker.inflearn;
import java.util.*;


public class Main_7 {

    //List<Set<String>>
    //1번학생 Set<> x
    //2번학생 Set<> 4번
    //3번학생 Set<> 4번, 5번
    //4번학생 Set<> 3번, 5번, 2번,
    //5번학생 Set<> 3번, 4번

    public int solution(int[][] data, int totalN) {

        List<Set<Integer>> sameClassList = new ArrayList<>();

        for (int i =1; i <= totalN ; i ++) { //1번 학생을 뜻함
            Set<Integer> sameClassFriend = new HashSet<>();
            for (int j=1; j<= 5; j++) {
                int class_ = data[i][j]; // 1번 학생의 j학년

                for (int k=1; k<= totalN ; k++) { // 비교하는 n번 학생
                    if (i == k) {
                        continue;
                    }
                    if (class_ == data[k][j]) {
                        sameClassFriend.add(k);
                    }
                }
            }
            sameClassList.add(sameClassFriend);
        }

        int result = 0;
        int number = 0;
        for (int i= 1; i<= sameClassList.size(); i++){
            if (result < sameClassList.get(i-1).size() ) {
                result = sameClassList.get(i-1).size();
                number = i;
            }
        }

        return number;
    }

    public static void main(String[] args) {
        Main_7 main = new Main_7();
        Scanner sc = new Scanner(System.in);

        int totalN = sc.nextInt(); // 학생 수
        int[][] data = new int[totalN + 1][6]; // 학생 번호 1~totalN, 학년 1~5

        for (int i = 1; i <= totalN; i++) {
            for (int j = 1; j <= 5; j++) {
                data[i][j] = sc.nextInt();
            }
        }

        System.out.println(main.solution(data, totalN));
    }
}

