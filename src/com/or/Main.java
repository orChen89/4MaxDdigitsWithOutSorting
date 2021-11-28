package com.or;

public class Main {

    public static void main(String[] args) {

                int[] arr = {6, 9, 3, 4, 8};

                maxDigits(arr);

            }
            static void maxDigits(int[] arr) {

                int max = 1;
                int secondMax = 1;
                int thirdMax = Integer.MIN_VALUE;
                int fourthMax = Integer.MIN_VALUE;

                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] > max) {
                        max = arr[i];
                    }
                    if (arr[i] < max) {
                        secondMax = arr[i];
                    }
                    for (int j = 0; j < arr.length; j++) {
                        if (arr[j] > secondMax && arr[j] < max) {
                            secondMax = arr[j];
                        }
                    }
                }for (int j = 0; j < arr.length ; j++) {
                    if (arr[j] > thirdMax && arr[j] < secondMax ){
                        thirdMax = arr[j];
                    }
                }
                for (int i = 0; i < arr.length ; i++) {
                    if (arr[i] < thirdMax && arr[i] > fourthMax){
                        fourthMax = arr[i];
                    }

                }
                System.out.print(max);
                System.out.print(secondMax);
                System.out.print(thirdMax);
                System.out.print(fourthMax);

            }
        }



