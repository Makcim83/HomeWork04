public class Main {
    public static void main(String[] args) {
        System.out.println("Homework Part 1");
        int ageFaceControl = 88;
        System.out.println("Ваш возраст " + ageFaceControl + " лет");
        if (ageFaceControl >= 18) {
            System.out.println("Поздравляем, вы достегли возраста совершеннолетия !");
        }
        if (ageFaceControl < 18) {
            System.out.println("С совершеннолетием поздравлять пока рано");
        }

        System.out.println("Homework Part 2");
        int ageStudent = 19;
        System.out.println("Ваш возраст " + ageStudent + " лет");
        if (ageStudent >= 24) {
            System.out.println("Вы уже не студент и пора бы поискать работу");
        } else if (ageStudent >= 18) {
            System.out.println("Вы окончили школу и можете отправляться в университет");
        } else if (ageStudent >= 7) {
            System.out.println("Вы школьник и ходите в школу");
        }

        System.out.println("Homework Part 3");
        int amountVanPlaces = 102;
        int amountSittingVanPlaces = 60;
        int passengersInVan = 0;
        int amountStandingVanPlaces = amountVanPlaces - amountSittingVanPlaces;
        int freeStandingPlaces;
        int freeSittingPlaces;

        if (passengersInVan >= amountVanPlaces) {
            System.out.println("Все места заняты, свободных нет");
        } else if (passengersInVan >= amountSittingVanPlaces) {
            freeStandingPlaces = amountVanPlaces - passengersInVan;
            System.out.println("Все сидячие места заняты, осталось " + freeStandingPlaces + " стоячих мест");
        } else if (passengersInVan <= 0) {
            System.out.println("В вагоне нет пассажиров, свободно " + amountSittingVanPlaces + " сидячих и " + amountStandingVanPlaces + " стоячих мест");
        } else if (passengersInVan < amountSittingVanPlaces) {
            freeSittingPlaces = amountSittingVanPlaces - passengersInVan;
            freeStandingPlaces = amountStandingVanPlaces;
            System.out.println("В вагоне осталось " + freeSittingPlaces + " сиячих мест и " + freeStandingPlaces + " стоячих мест");
        }

        System.out.println("Homework Part 4");
        int agePeople = 23;
        if (2 < agePeople && agePeople <= 6) {
            System.out.println("Если возраст человека равен " + agePeople + " то ему нужно ходить в детский сад");
        }
        if (7 <= agePeople && agePeople <= 18) {
            System.out.println("Если возраст человека равен " + agePeople + " то ему нужно ходить в школу");
        }
        if (18 < agePeople && agePeople < 24) {
            System.out.println("Если возраст человека равен " + agePeople + " то его место в университете");
        }
        if (agePeople >= 24) {
            System.out.println("Если возраст человека равен " + agePeople + " то ему пора ходить на работу");
        }

        System.out.println("Homework Part 5");
        int ageChild = 13;
        System.out.println("Возраст ребенка " + ageChild + " лет");
        if (ageChild < 5) {
            System.out.println("Ребенок не может кататься на аттакционе");
        }
        if (5 <= ageChild && ageChild < 14) {
            System.out.println("Ребенок может кататься на аттакционе в сопровождении взрослого");
        }
        if (14 <= ageChild) {
            System.out.println("Ребенок может кататься на аттракционе без сопровождения взрослого");
        }

        System.out.println("Homework Part 6");
        int one = 11;
        int two = 9;
        int three = 14;
        if (one > two && one > three) {
            System.out.println("число one наибольшее (" + one + ")");
        }
        if (two > one && two > three) {
            System.out.println("число two наибольшее (" + two + ")");
        } else if (three > one && three > two) {
            System.out.println("число three наибольшее (" + three + ")");
        } else if (one == two || one == three || two==three) {
            System.out.println("Несколько чисел являются наибольшими");
        }

    }
}