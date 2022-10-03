package com.janettecampbell;

public class Main {

    public static void main(String[] args) {
	// Comparison Operators
        // ==, !=, <=, >=, <, >
        int x = 1;
        int y = 1;
        System.out.println(x == y);

        // Logical Operators
        // &&, ||
        // &&
        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println(isWarm);

        // ||
        // If first evaluation is true will not check rest of OR evaluation
        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean isEligible = hasHighIncome || hasGoodCredit;

        // Combination
        boolean hasCriminalRecord = false;
        boolean isEligible1 = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;

        // if statements
        int temp = 32;
        if (temp > 30) {
            System.out.println("It's a hot day.");
            System.out.println("Drink water.");
        } else if (temp > 20) {
            System.out.println("It's a beautiful day.");
        } else {
            System.out.println("It's a cold day.");
        }

        // Simplifying if statements
        int income = 120_000;
        boolean hasHighIncome1 = (income > 100_000);
        System.out.println(hasHighIncome1);

        // Ternary Operator
        int income1 = 120_000;
        String className = income1 > 100_000 ? "First" : "Economy";
        System.out.println(className);

        // Switch Statements
        String role = "admin";
//        if (role == "admin") {
//            System.out.println("You're and admin.");
//        } else if (role == "moderator") {
//            System.out.println("You're a moderator.");
//        } else {
//            System.out.println("You're a guest.");
//        }

        switch (role) {
            case "admin":
                System.out.println("You're an admin.");
                break;

            case "moderator":
                System.out.println("You're a moderator.");
                break;

            default:
                System.out.println("You're a guest.");
        }
    }
}
