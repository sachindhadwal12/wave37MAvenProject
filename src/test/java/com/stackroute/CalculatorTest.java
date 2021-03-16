package com.stackroute;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CalculatorTest {
    Calculator calculator;


    @BeforeEach
  void setUp(){
//        Arrange
   calculator  = new Calculator();
        System.out.println("Before each method");
  }

   @Test
    public void shouldReturnJunit(){

      String result = calculator.displayData();
      assertEquals("Welcome",result);
    }

    @Test
    public void shoudlReturnLenghtOfText(){
        String result = calculator.displayData();
        int res = result.length();
        assertEquals(7,res);
    }

    @Disabled
  @Test
    public void shouldReturnSumOfTheTwoNumbers(){
//   Act
      int result = calculator.add(3,5);
//      Assert
      assertEquals(8,result);
  }

  @Test

    public void checkNumberShouldnotbeNegativeValue(){
        calculator.a=5;
        assertEquals(5,calculator.a);
  }




  @ParameterizedTest
    @ValueSource(ints = {1,3,5,7,9, Integer.MAX_VALUE})
    public void ShoudlReturnOddValues(int Number){
        assertTrue(calculator.isOdd(Number));
    }

//    test case for checking the size of List

    @Test
    public void ShouldReturnSizeofList(){
        List<String> list = mock(List.class);
        when(list.size()).thenReturn(5);
        assertTrue(list.size()==5);

    }


    @Test
    public void shouldchecktheindexOfValues(){
        List<String> list = new ArrayList<>();
        List<String> stringList = spy(list);
        when(stringList.size()).thenReturn(10);
        assertEquals(10,stringList.size());
        list.add("mike");
        list.add("John");
        assertEquals("John",stringList.get(1));
    }



}