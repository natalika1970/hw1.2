public class Main {
    public static void main(String[] args) {

        // переменные2 задача 1
        System.out.println ("Переменные2 " + " Задача1");

        int cat = 8;
        byte dog = 7;
        short box = 12;
        long progressTime = 123_894_564L;
        float bigMoney = 1.1235648f;
        double sugar = 1.5;

        System.out.println ( "Значение" + " переменной" + " cat " + "с " +" типом " + "int " + "равно " + "8");
        System.out.println ( "Значение" + " переменной" + " dog " + "с " +" типом " + "byte " + "равно " + "7");
        System.out.println ( "Значение" + " переменной" + " box " + "с " +" типом " + "short " + "равно " + "12");
        System.out.println ( "Значение" + " переменной" + " progressTime " + "с " +" типом " + "long " + "равно " + "123_894_564L");
        System.out.println ( "Значение" + " переменной" + " bigMoney " + "с " +" типом " + "float " + "равно " + "1.1235648f");
        System.out.println ( "Значение" + " переменной" + " sugar " + "с " +" типом " + "double " + "равно " + "1.5");

        // переменные2 задача 2
        System.out.println ("Переменные2 " + " Задача2");
      float a = 27.12f;
      long b = 987_678_965_549L;
      double c = 2.786;
      boolean d = false;
      short f = 569;
      short h = -159;
      long j = 27897L;
      int k = 67;

       System.out.println (a);
       System.out.println (b);
       System.out.println (c);
       System.out.println (d);
       System.out.println (f);
       System.out.println (h);
       System.out.println (j);
       System.out.println (k);

        // переменные2 задача 3
        System.out.println ("Переменные2 " + " Задача3");

        int classOfLudmilaPavlovna = 23;
        int classOfAnnaSergeevna = 27;
        int classOfEkaterinaAndreevna = 30;

       int totalNumberOfStudents = classOfLudmilaPavlovna + classOfAnnaSergeevna + classOfEkaterinaAndreevna;
       System.out.println (totalNumberOfStudents);

       int paper = 480;
       int numberOfListsPerStudent = paper / totalNumberOfStudents;
       System.out.println (numberOfListsPerStudent);
       System.out.println ("На каждого ученика рассчитано " + numberOfListsPerStudent + " листов бумаги.");

        // переменные2 задача 4
        System.out.println ("Переменные2 " + " Задача4");


        int efficientyOfMachineInOneMinute = 16/2;
        System.out.println (efficientyOfMachineInOneMinute);
        int daysInOneMonth = 30;
        int hoursInOneDay =24;
        int quantityOfMinutesInOneHour = 60;

        int efficientyOfMachineInTwentyMinutes = 20 * efficientyOfMachineInOneMinute;
        int efficientyOfMachineInOneDay = hoursInOneDay * quantityOfMinutesInOneHour * efficientyOfMachineInOneMinute;
        int efficientyOfMachineInThreeDays = 3 * hoursInOneDay * quantityOfMinutesInOneHour * efficientyOfMachineInOneMinute;
        int efficientyOfMachineInOneMonth = daysInOneMonth * hoursInOneDay * quantityOfMinutesInOneHour * efficientyOfMachineInOneMinute;

        System.out.println ("За 20 минут машина произвела бутылок " + efficientyOfMachineInTwentyMinutes +  " штук");
        System.out.println ("За сутки машина произвела бутылок " + efficientyOfMachineInOneDay +  " штук");
        System.out.println ("За три дня машина произвела бутылок " + efficientyOfMachineInThreeDays +  " штук");
        System.out.println ("За один месяц машина произвела бутылок " + efficientyOfMachineInOneMonth +  " штук");


        // переменные2 задача 5
        System.out.println ("Переменные2 " + " Задача5");

        int totalCansOfPaint = 120;
        int cansOfPaintForOneClass = 6;
        int quantityOfClasses = totalCansOfPaint / cansOfPaintForOneClass;
        System.out.println (quantityOfClasses);
        int needCansOfWhiteColourForOneClass = 2;
        int needCansOfBrownColourForOneClass = 4;
        int needCansOfWhiteColourForAllClass = needCansOfWhiteColourForOneClass * quantityOfClasses;
        int needCansOfBrownColourForAllClass = needCansOfBrownColourForOneClass * quantityOfClasses;
        System.out.println ("В школе, где " + quantityOfClasses + " классов, нужно " + needCansOfWhiteColourForAllClass + " банок белой краски и " + needCansOfBrownColourForAllClass +  " банок коричневой краски. ");

        // переменные2 задача 6
        System.out.println ("Переменные2 " + " Задача6");

        int bannana = 5;
        int milk = 2;
        int icecream = 2;
        int egg = 4;
        int weightOfBannana = 80;
        int weightOfMilk = 105;
        int weightOfIcecream = 100;
        int weightOfEgg = 70;
        int breakfastWeight = (bannana*weightOfBannana)+(milk*weightOfMilk)+(icecream*weightOfIcecream)+(egg*weightOfEgg);
        System.out.println ("Общий вес завтрака " + breakfastWeight + " гр.");
        int grPerKg = 1000;
        float weightKg = breakfastWeight/1000f;
        System.out.println ("Общий вес завтрака " + weightKg + " кг.");

        // переменные2 задача 7
        System.out.println ("Переменные2 " + " Задача7");
        double sum1 = 250;
        double sum2 = 500;
        double kg = 7;
        double kgInGr = kg * 1000;
        double quantityDays1 = kgInGr / 250;
        double quantityDays2 = kgInGr / 500;
        System.out.println ("При потере 250 гр. в день, результат будет достигнут через " + quantityDays1 +  " дней");
        System.out.println ("При потере 500 гр. в день, результат будет достигнут через " + quantityDays2 +  " дней");
        double averageNumberOfDays = (sum1+sum2)/2;
        double averageNumberOfDaysForResult = kgInGr / averageNumberOfDays;
        int x = 7*1000;
        int y = (250+500)/2;
        int averageNumberOfDaysForResult1 = x/y;
        System.out.println (" чтобы результат был достигнут понадобится " + averageNumberOfDaysForResult1 +  " среднее количество дней");

        // переменные2 задача 8
        System.out.println ("Переменные2 " + " Задача8");

        double salaryOfMashaPerMonth = 67760;
        double salaryOfDenisPerMonth = 83690;
        double salaryOfKristinaPerMonth = 76230;
        double monthInYear = 12;
        double annualIncomeOfMasha = salaryOfMashaPerMonth * monthInYear;
        double annualIncomeOfDenis = salaryOfDenisPerMonth * monthInYear;
        double annualIncomeOfKristina = salaryOfKristinaPerMonth * monthInYear;
        double increaseSalaryOfMashaPerMonth = 67760*1.1;
        double increaseSalaryOfDenisPerMonth = 83690*1.1;
        double increaseSalaryOfKristinaPerMonth = 76230*1.1;
        double increaseOfAnnualIncomeOfMasha = (salaryOfMashaPerMonth * monthInYear)*1.1;
        double increaseOfAnnualIncomeOfDenis = (salaryOfDenisPerMonth * monthInYear)*1.1;
        double increaseOfAnnualIncomeOfKristina = (salaryOfKristinaPerMonth * monthInYear)*1.1;
        double differenceYearIncomeOfMasha = increaseOfAnnualIncomeOfMasha - annualIncomeOfMasha;
        double differenceYearIncomeOfDenis = increaseOfAnnualIncomeOfDenis - annualIncomeOfDenis;
        double differenceYearIncomeOfKristina = increaseOfAnnualIncomeOfKristina - annualIncomeOfKristina;
        System.out.println ("Маша теперь получает " + increaseSalaryOfMashaPerMonth + " рублей в месяц. Годовой доход вырос на " + differenceYearIncomeOfMasha + " рублей");
        System.out.println ("Денис теперь получает " + increaseSalaryOfDenisPerMonth + " рублей в месяц. Годовой доход вырос на " + differenceYearIncomeOfDenis + " рублей");
        System.out.println ("Кристина теперь получает " + increaseSalaryOfKristinaPerMonth + " рублей в месяц. Годовой доход вырос на " + differenceYearIncomeOfKristina + " рублей");
    }
}