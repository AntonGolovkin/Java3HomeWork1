package ru.geekbrains.java3.homework1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        Integer arr1[] = {1, 2, 3, 4, 5, 6, 7};
        String arr2[] = {"A", "B", "C"} ;
        swap(arr1,3,5);
        swap(arr2,1,2);

        String[] arrayOfStrings = {"A", "B", "C", "D"};
        asList(arrayOfStrings);

        Box<Orange> orange1 = new Box<>();
        Box<Orange> orange2 = new Box<>();
        Box<Apple> apple1 = new Box<>();
        Box<Apple> apple2 = new Box<>();
        orange1.addFruit(new Orange(),30);
        orange2.addFruit(new Orange(),45);
        apple1.addFruit(new Apple(),25);
        apple2.addFruit(new Apple(),30);
        System.out.println("Box 1: "+ orange1.getWeight());
        System.out.println("Box 2: "+ orange2.getWeight());
        System.out.println("Box 3: "+ apple1.getWeight());
        System.out.println("Box 4: "+ apple2.getWeight());
        System.out.println("Box 1 equals box 3: "+ orange1.compare(apple1));
        System.out.println("Box 2 equals box 4: "+orange2.compare(apple2));
        orange1.pourTo(orange2);
        apple1.pourTo(apple2);
        System.out.println("Box 1: "+ orange1.getWeight());
        System.out.println("Box 2: "+ orange2.getWeight());
        System.out.println("Box 3: "+ apple1.getWeight());
        System.out.println("Box 4: "+ apple2.getWeight());
    }
    public static void swap(Object[] arr, int n1, int n2){
        System.out.println(Arrays.toString(arr));
        Object sw = arr[n1];
        arr[n1]=arr[n2];
        arr[n2]=sw;
        System.out.println(Arrays.toString(arr));
    }
    public static <T> void asList(T[]arr){
        ArrayList<T> alt = new ArrayList<>(Arrays.asList(arr));
        
    }
}



