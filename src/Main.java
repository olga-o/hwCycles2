public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");
        int targetSumOfSavings = 2_459_000;
        int monthlyPayment = 15000;
        int currentSumOfSavings = 0;
        int currentMonthOfSavings = 1;

        while (currentSumOfSavings <= targetSumOfSavings) {
            currentSumOfSavings += monthlyPayment + currentSumOfSavings / 100;
            System.out.println("Месяц " + currentMonthOfSavings + ", сумма накоплений равна " + currentSumOfSavings + " рублей");
            currentMonthOfSavings++;
        }

        //Task 2
        System.out.println("\nTask 2");
        int i = 1;
        while (i < 11) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }

        //Task 3
        System.out.println("\nTask 3");

        int totalPopulation = 12_000_000;
        int birthratePerBase = 17;
        int deathratePerBase = 8;
        int rateBase = 1000;

        int bornInYear;
        int deadInYear;

        for (int j = 1; j <= 10; j++) {
            bornInYear = birthratePerBase * totalPopulation / rateBase;
            deadInYear = deathratePerBase * totalPopulation / rateBase;
            totalPopulation = totalPopulation + bornInYear - deadInYear;

            System.out.println("Год " + j + ", численность населения составляет " + totalPopulation);
        }

        //Task 4
        System.out.println("\nTask 4");

        int startSum = 15000;
        int totalSavings = startSum;
        int monthsToTarget = 1;
        int targetSum = 12_000_000;
        int interestRate = 7;

        while (totalSavings < targetSum) {
            totalSavings = totalSavings + totalSavings * interestRate / 100;
            System.out.println("Месяц " + monthsToTarget + ", сумма накоплений " + totalSavings);
            monthsToTarget++;
        }

        monthsToTarget--;
        System.out.println("Василию нужно будет копить " + monthsToTarget + " месяцев");

        //Task 5
        System.out.println("\nTask 5");

        totalSavings = startSum;
        monthsToTarget = 1;

        while (totalSavings < targetSum) {
            totalSavings = totalSavings + totalSavings * interestRate / 100;
            if (monthsToTarget % 6 == 0) {
                System.out.println("Месяц " + monthsToTarget + " , сумма накоплений " + totalSavings);
            }
            monthsToTarget++;
        }

        //Task 6
        System.out.println("\nTask 6");

        totalSavings = startSum;
        int currentSavingsPeriodInMonths = 1;
        int targetSavingsPeriodInYears = 9;

        while (currentSavingsPeriodInMonths <= targetSavingsPeriodInYears * 12) {
            totalSavings = totalSavings + totalSavings * interestRate / 100;
            if (currentSavingsPeriodInMonths % 6 == 0) {
                System.out.println("Месяц " + currentSavingsPeriodInMonths + " , сумма накоплений " + totalSavings);
            }
            currentSavingsPeriodInMonths++;
        }

        //Task 7
        System.out.println("\nTask 7");

        int firstFridayNumber = 3;
        int totalDaysInMonth = 31;
        int currentDayOfMonth = 1;

        while (currentDayOfMonth <= totalDaysInMonth) {
            if (currentDayOfMonth % 7 == firstFridayNumber) {
                System.out.println("Сегодня пятница, " + currentDayOfMonth + "-е число. Необходимо подготовить отчет.");
            }
            currentDayOfMonth++;
        }

        //Task 8
        System.out.println("\nTask 8");
        int currentYear = 2024;
        int startOfCalculation = currentYear - 200;
        int endOfCalculation = currentYear + 100;
        int period = 79;

        int yearCometCameLast = (startOfCalculation / period) * period + period;

        while (yearCometCameLast < endOfCalculation) {
            System.out.println(yearCometCameLast);
            yearCometCameLast += period;
        }
        System.out.println();
    }
}