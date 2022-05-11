package br.com.entra21.prova01.descubra.seu.signo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.println("Let's discover your zodiac sign!");

        disoveringYourZodiacSign(getUserName());
        validatingDayAndMonth();

    }

    public static void disoveringYourZodiacSign(String userName) {
        System.out.println("----------------------------------------------------");
    }

    public static String getUserName() {
        String userName;
        Scanner input = new Scanner(System.in);
        System.out.println("Tell me your name::");
        userName = input.nextLine();
        return userName;
    }

    public static void validatingDayAndMonth() {
        byte birthday, birthMonth;
        final byte MAX_DAY_MONTH = 31;
        Scanner input = new Scanner(System.in);

        System.out.println("Tell me the day you were born:");
        birthday = input.nextByte();

        // validating max days
        if (birthday >= 1 && birthday <= MAX_DAY_MONTH) {
            System.out.println("You were born on  " + birthday);
        } else {
            System.out.println("This month has only 31 days!");
            System.exit(0);
        }
        System.out.println("----------------------------------------------------");

        System.out.println("Tell me the month you were born:");
        System.out.println("----------------------------------------------------");
        System.out.println("  1 | January     2 | February     3 | March");
        System.out.println("  4 | April       5 | May          6 | June");
        System.out.println("  7 | July        8 | August       9 | September");
        System.out.println(" 10 | October    11 | November    12 | December");
        System.out.println("----------------------------------------------------");

        // validando meses
        birthMonth = input.nextByte();
        if (birthMonth == 2 && birthday > 29) {
            System.out.println("This month has only 29 days!");
            System.exit(0);
        } else if (birthMonth == 4 || birthMonth == 6 || birthMonth == 9
                || birthMonth == 11 && birthday > 30) {
            System.out.println("This month has only 30 days!");
            System.exit(0);

        } else if (birthMonth >= 1 && birthMonth <= 12) {
            System.out.println("You were  born on" + birthMonth);
            System.out.println("----------------------------------------------------");
        } else {
            System.out.println("Invalid month!");
            System.exit(0);
        }

        // validating birthday, month and zodiac sign
        switch (birthMonth) {
            case 1:
                if (birthday <= 20) {
                    System.out.println("Your zodiac sign is CAPRICORN");
                    System.out.println(
                            "Rather than waiting for things to happen to you, take action. Arrange for to meet up with a family member");
                    break;
                } else
                    System.out.println("Your zodiac sign is AQUARIUS");
                System.out.println(
                        "Sit down and have a think about what your goals are in the remainder of the year. There are better days ahead.");
                break;

            case 2:
                if (birthday <= 19) {
                    System.out.println("Your zodiac sign is AQUARIUS");
                    System.out.println(
                            "Sit down and have a think about what your goals are in the remainder of the year. There are better days ahead.");
                    break;
                } else
                    System.out.println("Your zodiac sign is PISCES");
                System.out.println(
                        "Some conversations are likely to occur about your living situation. Consider how you can best use your money.");
                break;

            case 3:
                if (birthday <= 20) {
                    System.out.println("Your zodiac sign is PISCES");
                    System.out.println(
                            "Some conversations are likely to occur about your living situation. Consider how you can best use your money.");
                    break;
                } else
                    System.out.println("Your zodiac sign is ARIES");
                System.out.println(
                        "Catch up on any things that are on your to-do list. Think about making some changes to your routine.");
                break;

            case 4:
                if (birthday <= 20) {
                    System.out.println("Your zodiac sign is ARIES");
                    System.out.println(
                            "Catch up on any things that are on your to-do list. Think about making some changes to your routine.");
                    break;
                } else
                    System.out.println("Your zodiac sign is TAURUS");
                System.out.println(
                        "Get your finances in order by putting some money aside. Give yourself a chance to relax.");
                break;

            case 5:
                if (birthday <= 20) {
                    System.out.println("Your zodiac sign is TAURUS");
                    System.out.println(
                            "Get your finances in order by putting some money aside. Give yourself a chance to relax.");
                    break;
                } else
                    System.out.println("Your zodiac sign is GEMINI");
                System.out.println(
                        "Have some deep conversations with a close friend. Create some plans for yourself and a loved one.");
                break;

            case 6:
                if (birthday <= 20) {
                    System.out.println("Your zodiac sign is GEMINI");
                    System.out.println(
                            "Have some deep conversations with a close friend. Create some plans for yourself and a loved one.");
                    break;
                } else
                    System.out.println("Your zodiac sign is CANCER");
                System.out.println(
                        "Treat yourself if the opportunity presents itself. Don't be afraid of asking for something you desire.");
                break;

            case 7:
                if (birthday <= 21) {
                    System.out.println("Your zodiac sign is CANCER");
                    System.out.println(
                            "Treat yourself if the opportunity presents itself. Don't be afraid of asking for something you desire.");
                    break;
                } else
                    System.out.println("Your zodiac sign is LEO");
                System.out.println(
                        "Get in touch with an old friend and reconnect. Put in the hard work today to make tomorrow easier.");
                break;

            case 8:
                if (birthday <= 22) {
                    System.out.println("Your zodiac sign is LEO");
                    System.out.println(
                            "Get in touch with an old friend and reconnect. Put in the hard work today to make tomorrow easier.");
                    break;
                } else
                    System.out.println("Your zodiac sign is VIRGO");
                System.out.println(
                        "Let your feelings come to the fore today. Start to pay off some of the money you owe.");
                break;

            case 9:
                if (birthday <= 22) {
                    System.out.println("Your zodiac sign is VIRGO");
                    System.out.println(
                            "Let your feelings come to the fore today. Start to pay off some of the money you owe.");
                    break;
                } else
                    System.out.println("Your zodiac sign is LIBRA");
                System.out.println(
                        "Organise a trip away from home with your friends. Keep an eye out for any new connections in your love life.");
                break;

            case 10:
                if (birthday <= 22) {
                    System.out.println("Your zodiac sign is LIBRA");
                    System.out.println(
                            "Organise a trip away from home with your friends. Keep an eye out for any new connections in your love life.");
                    break;
                } else
                    System.out.println("Your zodiac sign is SCORPIO");
                System.out.println(
                        "New opportunities are on the horizon. Make sure you create time to see those closest to you.");
                break;

            case 11:
                if (birthday <= 21) {
                    System.out.println("Your zodiac sign is SCORPIO");
                    System.out.println(
                            "New opportunities are on the horizon. Make sure you create time to see those closest to you.");
                    break;
                } else
                    System.out.println("Your zodiac sign is SAGITTARIUS");
                System.out.println(
                        "Address something that you have been putting off for a long time. Let your romantic side take centre stage.");
                break;

            case 12:
                if (birthday <= 21) {
                    System.out.println("Your zodiac sign is SAGITTARIUS");
                    System.out.println(
                            "Address something that you have been putting off for a long time. Let your romantic side take centre stage.");
                    break;
                } else
                    System.out.println("Your zodiac sign is CAPRICORN");
                System.out.println(
                        "Rather than waiting for things to happen to you, take action. Arrange for to meet up with a family member");
                break;

            default:
                System.out.println("\n!            INVALID MONTH               !");
                System.out.println("----------------------------------------------------");
                System.exit(0);
        }
    }

}
