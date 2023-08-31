package main.list.Search.SumOfNumbers;

import java.util.ArrayList;
import java.util.List;

public class SumOfNumbers {
    List<Integer> sumNumber;

    public SumOfNumbers(){
        this.sumNumber = new ArrayList<>();
    }

    public void addNumber(Integer number){
        sumNumber.add(new Integer(number));
    }

    public Integer calculateSum(){
            Integer totalNumber = 0;

            for(Integer number : sumNumber){
                totalNumber += number;
            }
            return totalNumber;
    }

    public int findTheBiggestNumber() {
        int biggestNumber = Integer.MIN_VALUE;
        if (!sumNumber.isEmpty()) {
            for (Integer number : sumNumber) {
                if (number >= biggestNumber) {
                    biggestNumber = number;
                }
            }
            return biggestNumber;
        } else {
            throw new RuntimeException("list is empty!");
        }
    }

    public int findTheSmallestNumber() {
        int smallestNumber = Integer.MAX_VALUE;
        if (!sumNumber.isEmpty()) {
            for (Integer number : sumNumber) {
                if (number <= smallestNumber) {
                    smallestNumber = number;
                }
            }
            return smallestNumber;
        } else {
            throw new RuntimeException("list is empty!");
        }
    }

    public void displayNumbers() {
        if (!sumNumber.isEmpty()) {
            System.out.println(this.sumNumber);
        } else {
            System.out.println("list is empty!");
        }
    }

    public static void main(String[] args) {

        SumOfNumbers sumNumbers = new SumOfNumbers();


        sumNumbers.addNumber(5);
        sumNumbers.addNumber(0);
        sumNumbers.addNumber(0);
        sumNumbers.addNumber(-2);
        sumNumbers.addNumber(10);


        System.out.println("Números adicionados:");
        sumNumbers.displayNumbers();


        System.out.println("Soma dos números = " + sumNumbers.calculateSum());


        System.out.println("Maior número = " + sumNumbers.findTheBiggestNumber());


        System.out.println("Menor número = " + sumNumbers.findTheSmallestNumber());
    }
}