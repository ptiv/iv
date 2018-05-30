package com.prog.ctci;

/**
 * 
 * You are given two sorted arrays, A and B, and A has a large enough 
 * buffer at the end to hold B.
 * Write a method to merge B into A in sorted order.
 * 
 * @author ptemkar
 * @date 10/04/13
 */
public class Prog9_1 {

  public int[] merge(int[] arr1, int[] arr2){

    //Number of non-zero elements in arr1. not the actual size of the array
    //Have the pointer point to the index of the last element
    int ptr1=-1;
    for(int i=0 ; i<arr1.length ; i++){
      if(arr1[i]!=0){
        ptr1++;
      }else{
        break;
      }
    }
    int ptr2 = arr2.length-1;

    int finalIndex = arr1.length-1;

    while(ptr1 >= 0 && ptr2 >= 0){
      if(arr1[ptr1] > arr2[ptr2]){
        arr1[finalIndex--] = arr1[ptr1--];
      }else{
        arr1[finalIndex--] = arr2[ptr2--];
      }
    }

    while(ptr1 >= 0){
      arr1[finalIndex--] = arr1[ptr1--];
    }

    while(ptr2 >= 0){
      arr1[finalIndex--] = arr2[ptr2--];
    }
    
    return arr1;

  }

}
