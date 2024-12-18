package com.pakker.inflearn;

import java.util.*;
public class Main_10 {

    public int solution(int n, int c, String[] data) {
        int cnt = 0;
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n; j++) {
                if (i==j) {
                    continue;
                }
               System.out.println(i + "번 학생과 " + j +"번 학생의 비교");
               boolean isAllWin = true;
               for(int k=0; k<c; k++) {

                   String[] row = data[k].split(" ");
                   int mentorRank = -1;
                   int menteeRank = -1;

                   for (int rank = 0; rank < row.length; rank++) {
                       if (Integer.parseInt(row[rank]) == i) mentorRank = rank;
                       if (Integer.parseInt(row[rank]) == j) menteeRank = rank;
                   }

                   if (mentorRank >= menteeRank) {
                       isAllWin = false;
                       break;
                   }
               }

               if(isAllWin){
                   cnt++;
               }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Main_10 main = new Main_10();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        sc.nextLine();
        String[] data = new  String[c];
        for(int i=0; i<c ; i++) {
            data[i] = sc.nextLine();
        }

        System.out.println(main.solution(n, c, data));
    }
}
