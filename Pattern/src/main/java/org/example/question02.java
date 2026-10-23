package org.example;

public class question02 {
    question02(int n)
    {

        for (int i = 1; i <=n; i++) {

            for (int s = 1; s <=n-i ; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ;j++) {

                    System.out.print("*");

            }

            for (int t = 1; t <=i-1 ; t++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
