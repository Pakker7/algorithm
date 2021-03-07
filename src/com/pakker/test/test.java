package com.pakker.test;

public class test {


//    create a new package-private class, named Storm, and move all code duplicated in the classes RainStorm and SnowStorm to Storm:
//
//            - the RainStorm and SnowStorm classes shoud inherit from the Storm class.
//            - the Storm class should contain al duplicated code(identical fields, methods, and constructor) from the RainStorm and SnowStorm classes.
//            - the functionality of the RainStorm and SnowStorm classes should stay the same.
//
//            - RainStorm and SnowStorm inhert from Storm
//- Getters are reused
//- Methods are declared in appropriate classes
//- duplicated code in constructors is reused

    class Storm {

        protected double eyeRadius;
        protected double eyePositionX;
        protected double eyePositionY;

        public boolean isInEyeOfTheStorm(double positionX, double positionY) {
            double distance = Math.sqrt(Math.pow(positionX - eyePositionX, 2) +
                    Math.pow(positionY - eyePositionY, 2));
            return distance < eyeRadius;
        }

        public double getEyeRadius() {
            return eyeRadius;
        }

        public double getEyePositionX() {
            return eyePositionX;
        }

        public double getEyePositionY() {
            return eyePositionY;
        }
    }


    class RainStorm extends Storm{

        public RainStorm(double eyeRadius, double eyePositionX, double eyePositionY) {
            this.eyeRadius = eyeRadius;
            this.eyePositionX = eyePositionX;
            this.eyePositionY = eyePositionY;
        }

        @Override
        public boolean isInEyeOfTheStorm(double positionX, double positionY) {
            return super.isInEyeOfTheStorm(positionX, positionY);
        }

        @Override
        public double getEyeRadius() {
            return super.getEyeRadius();
        }

        @Override
        public double getEyePositionX() {
            return super.getEyePositionX();
        }

        @Override
        public double getEyePositionY() {
            return super.getEyePositionY();
        }

        public double amountOfRain() {
            return eyeRadius * 20;
        }

    }

    class SnowStorm extends Storm {
        private double amountOfSnow;

        public SnowStorm(double eyeRadius, double eyePositionX, double eyePositionY, double amountOfSnow) {
            this.eyeRadius = eyeRadius;
            this.eyePositionX = eyePositionX;
            this.eyePositionY = eyePositionY;
            this.amountOfSnow = amountOfSnow;
        }

        @Override
        public boolean isInEyeOfTheStorm(double positionX, double positionY) {
            return super.isInEyeOfTheStorm(positionX, positionY);
        }

        @Override
        public double getEyeRadius() {
            return super.getEyeRadius();
        }

        @Override
        public double getEyePositionX() {
            return super.getEyePositionX();
        }

        @Override
        public double getEyePositionY() {
            return super.getEyePositionY();
        }

        public double getAmountOfSnow() {
            return amountOfSnow;
        }

    }



}
