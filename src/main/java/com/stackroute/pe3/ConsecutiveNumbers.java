package com.stackroute.pe3;

public class ConsecutiveNumbers {
    public String consecutiveCheck(String strings){


            String[] s =strings.split(",");
            int arr[] = new int[s.length];

            for(int i=0; i<s.length; i++) {

                arr[i] = Integer.parseInt(s[i]);
            }
            for(int i=0;i<arr.length-1;i++){
             int result=   arr[i+1]-arr[i];
                if(result==1){


                }

            }



        return "consecutive";



        }

    }

