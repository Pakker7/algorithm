package com.pakker.test;

public class FindProduct {
//    write a method that, efficiently with respect to time used, finds the first product in an array that occurs only once in that array. if there are no unique products in the array, null should be returned.
//
//for example, firstUniqueProduct(new String[] {"Apple", "Computer", "Apple", "Bag"}) should return "Computer"
//
//            - Example case : java.lang.UnsupportedOperationException at UniqueProduct.firstUniqueProduct(UniqueProduct.java:3)
//            - Several products:java.lang.UnsupportedOperationException at UniqueProduct.firstUniqueProduct(UniqueProduct.java:3)
//            - Performance test on a large number of products :java.lang.UnsupportedOperationException at UniqueProduct.firstUniqueProduct(UniqueProduct.java:3)


    public class UniqueProduct {
        public static String firstUniqueProduct(String[] products) {
            throw new UnsupportedOperationException("Waiting to be implemented.");
        }

        public static void main(String[] args) {
            System.out.println(firstUniqueProduct(new String[] { "Apple", "Computer", "Apple", "Bag"  }));
        }
    }
}
