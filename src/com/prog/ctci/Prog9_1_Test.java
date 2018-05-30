package com.prog.ctci;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class Prog9_1_Test {

  int[] arr1 = new int[6];
  int[] arr2 = new int[3];
  Prog9_1 prog9_1 = new Prog9_1();
  
  @Test
  public void testMerge1(){
    arr1[0]=2;
    arr1[1]=4;
    arr1[2]=6;
    
    arr2[0]=1;
    arr2[1]=3;
    arr2[2]=5;
    
    prog9_1.merge(arr1, arr2);
    Assert.assertArrayEquals(new int[] {1,2,3,4,5,6}, arr1);
    
  }
  
  @Test
  public void testMerge2(){
    arr1[0]=1;
    arr1[1]=9;
    arr1[2]=15;
    
    arr2[0]=4;
    arr2[1]=7;
    arr2[2]=18;
    
    prog9_1.merge(arr1, arr2);
    Assert.assertArrayEquals(new int[] {1,4,7,9,15,18}, arr1);
  }
  
}
