package org.java.reviced.loop;

public class While {
    public static void main(String[] args) {
        System.out.println("while");

//clasic while loop
        int n=1;


         while(n<5){

             System.out.println(n);
             n++;


         }

        System.out.println("do while");

//         do while loop
//
        do{
            System.out.println(n);
            n++;

        }
        while (n<10);




        //print table
        System.out.println("table");


        int i=1;
        int table=10;

        do {
            int r= table*i;
        System.out.println(r);
        i++;
        }while(i<=10);



    }
}
