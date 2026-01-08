package org.java.reviced.loop;

public class ControlStatement {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {



            //break statement
            if(i==4){
                break;
            }

            //continue statement
            if (i==2){
                continue;


            }

            System.out.println(i);


        }
    }
}
