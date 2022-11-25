package hust.soict.dsai.lab01;

import java.util.Scanner;

public class NumberOfDay {
    public static void main(String[] args) {
        int ans = 0;
        int[] days_31 = { 1, 3, 5, 7, 8, 10, 12 };
        int[] days_30 = { 4, 6, 9, 11 };
        String[][] inputMonth = {
                { "January", "Jan", "Jan.", "1" },
                { "February", "Feb", "Feb.", "2" },
                { "March", "Mar", "Mar.", "3" },
                { "April", "Apr", "Apr.", "4" },
                { "May", "May", "May.", "5" },
                { "June", "Jun", "Jun.", "6" },
                { "July", "Jul", "Jul.", "7" },
                { "August", "Aug", "Aug.", "8" },
                { "September", "Sep", "Sep.", "9" },
                { "October", "Oct", "Oct.", "10" },
                { "November", "Nov", "Nov.", "11" },
                { "December", "Dec", "Dec.", "12" }
        };

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Nhap nam muon tinh ngay: ");
        String yearInput = keyboard.nextLine();
        int year = Integer.parseInt(yearInput);
        if (year < 0) {
            System.out.println("Nam khong hop le");
            System.exit(0);
        }

        boolean isLeepYear = (year % 400 == 0) ? true : (year % 4 == 0 && year % 100 != 0 ? true : false);
        System.out.println("Nhap thang muon tinh ngay: ");
        String month = keyboard.nextLine();

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 4; j++) {
                if (month.trim().equals(inputMonth[i][j])) {
                    if (contain(days_31, i + 1)) {
                        ans = 31;
                    } else if (contain(days_30, i + 1)) {
                        ans = 30;
                    } else
                        ans = 28 + (isLeepYear ? 1 : 0);
                }
            }
        }

        System.out.println("Day number: " + ans);
    }

    private static boolean contain(int[] arr, int input) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == input) {
                return true;
            }
        }
        return false;
    }
}