package _1_enums;

public class Main {
    public static void main(String[] args) {

        Season season = Season.SUMMER;

        // check enum using if

        if(season == Season.SUMMER) {
            System.out.println("Spring time!");
        }

        // check enum using switch

        switch (season) {
            case Season.SPRING:
                System.out.println("Spring time!");
                break;
            case Season.SUMMER:
                System.out.println("Summer time!");
            case Season.FALL:
                System.out.println("Fall time!");
                break;
            case Season.WINTER:
                System.out.println("Winter is coming!");
                break;
            default:
                System.out.println("I don't recognize this season!");

        }

    }
}