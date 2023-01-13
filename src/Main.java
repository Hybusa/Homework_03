public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1:");

        byte byteTest = 2;
        short shortTest = 5;
        int intTest = 154;
        long longTest = 1546054;
        float floatTest = 15.54f;
        double doubleTest = 15.45687;


        System.out.println("Значение переменной byteTest с типом "
                + ((Object) byteTest).getClass().getSimpleName() + " имеет значение " + byteTest);

        System.out.println("Значение переменной shortTest с типом "
                + ((Object) shortTest).getClass().getSimpleName() + " имеет значение " + shortTest);

        System.out.println("Значение переменной intTest с типом "
                + ((Object) intTest).getClass().getSimpleName() + " имеет значение " + intTest);

        System.out.println("Значение переменной longTest с типом "
                + ((Object) longTest).getClass().getSimpleName() + " имеет значение " + longTest);

        System.out.println("Значение переменной floatTest с типом "
                + ((Object) floatTest).getClass().getSimpleName() + " имеет значение " + floatTest);

        System.out.println("Значение переменной doubleTest с типом "
                + ((Object) doubleTest).getClass().getSimpleName() + " имеет значение " + doubleTest);

        System.out.println();

    }

    public static void task2() {

        System.out.println("Задача 2:");

        float float2 = 27.12f;
        long long2 = 987678965549L;
        double double2 = 2.786;
        short sort2 = 569;
        short short22 = -159;
        int int22 = 27897;
        byte byte2 = 67;

        System.out.println("Done");

        System.out.println();
    }

    public static void task3() {

        System.out.println("Задача 3:");

        byte studLP = 23;
        byte studAS = 27;
        byte studEA = 30;
        short paper = 480;

        int studTotal = studLP + studAS + studEA;
        int paperPerStud = paper / studTotal;

        System.out.println("На каждого ученика расчитано " + paperPerStud + " листов бумаги.");

        System.out.println();
    }

    public static void task4() {

        System.out.println("Задача 4:");

        byte bottleProductionPer2Min = 16;
        int bottleProductionPerMin = bottleProductionPer2Min / 2;

        byte mins = 20;
        byte hours = 24;
        byte days = 3;
        byte months = 1;

        System.out.println("За " + mins + " минут станок произведет " + bottleProductionPerMin * mins + " бутылок");

        System.out.println("За " + hours + " часа станок произведет "
                + bottleProductionPerMin * hoursToMinutes(hours) + " бутылок");

        System.out.println("За " + days + " дня станок произведет "
                + bottleProductionPerMin * hoursToMinutes(daysToHours(days)) + " бутылок");

        System.out.println("За " + months + " месяц станок произведет "
                + bottleProductionPerMin * hoursToMinutes(daysToHours(monthsToDays(months))) + " бутылок");

        System.out.println();


    }

    public static void task5() {

        System.out.println("Задача 5:");

        short nOfCans = 120;
        byte whitePerClass = 2;
        byte brownPerClass = 4;

        int nOfClasses = nOfCans / (whitePerClass + brownPerClass);

        System.out.println("В школе, где " + nOfClasses + " классов, нужно " + nOfClasses * whitePerClass
                + " банок белой краски и " + nOfClasses * brownPerClass + " банок коричневой краски");

        System.out.println();
    }

    public static void task6() {

        System.out.println("Задача 6:");

        byte nBanana = 5;
        byte wBanana = 80;
        int wBananaTotal = nBanana * wBanana;

        short nMilk = 200;
        float wMilk = 105/100f;
        float wMilkTotal = nMilk * wMilk;

        short nICream = 2;
        short wICream = 100;
        int wICreamTotal = nICream * wICream;

        short nEgg = 4;
        short wEgg = 70;
        int wEggTotal = nEgg * wEgg;

        float wBreakfastTotal = wBananaTotal + wMilkTotal + wICreamTotal + wEggTotal;

        System.out.println("Завтрак в граммах: " + wBreakfastTotal);

        float wBreakfastTotalKg = wBreakfastTotal/100;

        System.out.println("Завтрак в кг: " + wBreakfastTotalKg);

        System.out.println();
    }

    public static void task7() {

        System.out.println("Задача 7:");

        byte wToLooseKg = 7;
        int wToLooseInG = wToLooseKg * 1000;
        short dailyLossG1 = 250;
        short dailyLossG2 = 500;

        int daysToLoose1 = wToLooseInG / dailyLossG1;
        int daysToLoose2 = wToLooseInG / dailyLossG2;
        int dailyLossAverage = (dailyLossG1 + dailyLossG2)/2;

        double daysToLooseAverage = (double) wToLooseInG / dailyLossAverage;



        System.out.println("В первом случае, при сбросе " + dailyLossG1 + " г/день, уйдет " + daysToLoose1 +  " дней");

        System.out.println("Во втором случае, при сбросе " + dailyLossG2 + " г/день, уйдет " + daysToLoose2 +  " дней");

        System.out.printf("В среднем, при средней потере веса " + dailyLossAverage
                + " поднадобится %.2f дней.\n", daysToLooseAverage);

        System.out.println();
    }

    public static void task8() {

        System.out.println("Задача 8:");

        int salaryMashaNow = 67760;
        int salaryDenisNow = 83690;
        int salaryKrisNow = 76230;
        double raiseIndexPercent = 1.1;

        double salaryMashaWill = raisePercent(salaryMashaNow, raiseIndexPercent);
        double salaryDenisWill = raisePercent(salaryDenisNow, raiseIndexPercent);
        double salaryKrisWill = raisePercent(salaryKrisNow, raiseIndexPercent);

        double yearlyIncreaseMasha = differenceNowAndWillNMonths(salaryMashaNow, salaryMashaWill, 12);
        double yearlyIncreaseDenis = differenceNowAndWillNMonths(salaryDenisNow, salaryDenisWill, 12);
        double yearlyIncreaseKris = differenceNowAndWillNMonths(salaryKrisNow, salaryKrisWill, 12);

        System.out.printf("Маша теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей\n",
                salaryMashaWill, yearlyIncreaseMasha );

        System.out.printf("Денис теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей\n",
                salaryDenisWill, yearlyIncreaseDenis);

        System.out.printf("Кристина теперь получает  %.2f рублей. Годовой доход вырос на %.2f рублей\n",
                salaryKrisWill, yearlyIncreaseKris);

        System.out.println();
    }


    public static int hoursToMinutes(int t) {
        return t * 60;
    }

    public static int daysToHours(int t) {
        return t * 24;
    }

    public static int monthsToDays(int t) {
        return t * 30;
    }

    public static double raisePercent(int n, double percentIndex) {
        return (n*percentIndex) ;
     }

    public static double differenceNowAndWillNMonths(int now, double willBe, int months ) {
        return (willBe - now)*months ;
    }

}



