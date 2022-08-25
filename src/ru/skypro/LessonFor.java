package ru.skypro;

public class LessonFor {
    public static void main(String[] args) {
      //task1
        int i = 1;
        do {
            System.out.print(i+" ");
            i++;
        } while (i != 11);
        System.out.println();
        for(int j = 10;j>0;j--){
            System.out.print(j+" ");
        }
        System.out.println();
        //task2
        int numOfFriday = 3;
        for(int d = numOfFriday;d<=31;d+=7){
            System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет\n",d);
        }
        //task3
        int currentYear = 2022;
        int previouslyPeriod = currentYear - 200;
        int nextPeriod = currentYear + 100;

        for(int k=0;k<=nextPeriod;k++){
            if(k%79==0 && k>=previouslyPeriod){
                System.out.println(k);
            }
        }



    }
}
