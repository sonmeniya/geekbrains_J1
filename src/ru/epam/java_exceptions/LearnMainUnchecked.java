package ru.epam.java_exceptions;

public class LearnMainUnchecked {
    public static void main(String[] args) {
        String [] numbers = {"12", "0", "T-", "8", "33"};
        int result;
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            try{
                result = Integer.parseInt(numbers[i]);
                sum += 100 / result;
            }catch (NumberFormatException | ArithmeticException e){
                System.err.println(e);
            }
        }
        System.out.println(sum);
    }

}
