package com.BasilSwaggert;

public class Bank {
    String bankName = "Bank of America";
    private String branchLocation;

    public Bank(String branchLocation) {
        this.branchLocation = branchLocation;
    }

    public Bank(String bankName, String branchLocation) {
        this.bankName = bankName;
        this.branchLocation = branchLocation;
    }
    //    public static void changeBank(String new) {
//        System.out.println("The bank is now " + new);
//    }

    public void checkLocation() {
        System.out.println("The current branch location is " + branchLocation);
    }

    public void changeLocation(String loc) {
        this.branchLocation = loc;
        System.out.println("The branch location is changed from " + branchLocation + "to " + loc);
    }

    public void checkBalance() {
        System.out.println("You need to create an account to check the balance");
    }
}
