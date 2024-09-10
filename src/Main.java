public class Main {
    public static void main(String[] args) {
        //Задача №1
        int incomeA = 15000;
        int totalA = 0;
        int i = 0;
        while (totalA < 2_459_000){
            totalA = totalA + incomeA;
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalA + " рублей.");
        }
        System.out.println();

        //Задача №2
        int a = 0;
        while (a < 10){
            a++;
            System.out.print(a + " ");
        }
        System.out.println();
        for (; a > 0; a--){
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println();

        //Задача №3
        int population = 12_000_000;
        int birthRate = 17; // на 1000 человек
        int mortalityRate = 8; // на 1000 человек
        int b = 1;
        for (; b <= 10; b++){
            population = population + population * birthRate/1000 - population * mortalityRate/1000;
            System.out.println("Год " + b + " численность населения составляет " + population + ".");
        }
        System.out.println();

        //Задача №4
        int contribution = 15000;
        int month = 0;
        while (contribution < 12_000_000){
            contribution = contribution + contribution*7/100;
            month++;
            System.out.println("Месяц " + month + ", размер вклада - " + contribution + " рублей.");
        }
        System.out.println();

        //Задача №5
        int contributionA = 15000;
        int monthA = 0;
        do {
            contributionA = contributionA + contributionA * 7 / 100;
            monthA++;
            if (monthA % 6 == 0) {
                System.out.println("Месяц " + monthA + ", размер вклада - " + contributionA + " рублей.");
            }
        }
        while (contributionA < 12_000_000);
        System.out.println();

        //Задача №6
        int contributionB = 15000;
        int monthB = 0;
        int yearB = 0;
        do {
            contributionB = contributionB + contributionB * 7 / 100;
            monthB++;
            if (monthB % 6 == 0){
                System.out.println("Месяц " + monthB + ", сумма " + contributionB + " рублей.");
                if (monthB % 12 == 0){
                    yearB++;
                }
            }
        } while (yearB < 9);
        System.out.println();

        //Задача №7
        int friday = 5; // Число первой пятницы от 1 до 7
        for (int d = 1; d <=31; d++){
            if (d == friday){
                System.out.println("Сегодня пятница, " + d + "-е число. Необходимо подготовить отчет.");
                friday += 7;
            }
        }
        System.out.println();

        //Задача №8
        int interval = 79;
        int yearC = 0;
        while (yearC < 2124){
            if (yearC >= 1824) {
                System.out.println(yearC);
            }
            yearC = yearC + interval;
        }
    }
}
