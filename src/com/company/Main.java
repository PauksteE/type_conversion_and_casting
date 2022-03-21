package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Conversion that do not
        //Byte to Short
        byte value_byte = 124;
        short value_short = value_byte;
        System.out. println("New value of short from bite 124 is: " + value_short);
       //System.out.println(type(value_short));

        //Conversion that will cause date loss
        int value_int = 123456789;
        float value_float = value_int;
        System.out.println("Value_int: " + value_int);
        System.out.println("Value_float: " + value_float);

        //long to float
        long value_long = 203254654865426544L;
        float value_float_of_long = value_long;
        System.out.println("value_float_of_long: " + value_float_of_long);

        //long to double
        double value_double = value_long;
        System.out.println("New value of double from long: " + value_double );

        int elem1 = 5;
        double elem2 = 3.0;
        System.out.println("suma : " + (elem2 + elem1));

        //Casting.
        //double to float
        double available_balance = 99.9989;
        float float_available_balance = (float) available_balance;
        System.out.println("Float balance: " + float_available_balance);

        //double to long
        long long_balance = (long) available_balance;
        System.out.println("Long balance: " + long_balance);

        //Class work.
        //double to int
        int double_to_int = (int) available_balance;
        System.out.println("int to double: " + double_to_int);
        //float to int
        int float_to_int = (int) float_available_balance;
        System.out.println("float to int " + float_to_int);
        //long to int
        int long_to_int = (int) long_balance;
        System.out.println("Long to int: " + long_to_int);





    }
}
