package com.ioana;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 4, 16, 1000);

        Main.printFibonacciNumbers(10);
        Main.countOccurences("Devi mi-a dat tema");
        Main.reverseSentence("Ana are mere");
        // Main.primeNumber(4);
        Main.secondNumber(numbers);
        Main.arithmeticMean(numbers);
//        Main.palindrome("palindrom");
        Main.palindrom("capac");
        System.out.println(cmmdc(numbers));

    }

    //   1. Metoda sa print primele n numere din Fibonacci
    public static void printFibonacciNumbers(int nr) {
        int a = 0;
        int b = 1;
        int sum = 0;
        System.out.println(a);
        System.out.println(b);
        for (int i = 1; i <= nr; i++) {
            // System.out.println(sum);
            sum = a + b;
            a = b;
            b = sum;
            System.out.println(sum);
        }
    }

    //   2. Metoda care primește un strung și numără de cate ori apare fiecare caracter
    public static void countOccurences(String string) {
        string = string.replaceAll(" ", "");
        HashMap<Character, Integer> charOc = new HashMap<>();
        char[] charString = string.toCharArray();
        for (char c : charString) {
            if (charOc.containsKey(c)) {
                charOc.put(c, charOc.get(c) + 1);

            } else {
                charOc.put(c, 1);
            }
        }
        System.out.println("character occurrence" + charOc);
    }

    //   3. Metoda care primește o propoziție și inversează ordinea cuvintelor
    public static void reverseSentence(String s) {
        String[] words = s.split((" "));
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
            System.out.println(" ");
        }
    }

//   4. Metoda care găsește al n-lea număr prim.
//    public static void primeNumber(int n) { //remainder
//        List<Integer> primenumbers = new ArrayList<>();
//        for (int i = 1; i <= n; i++) {
//            // for (int j=0; j<n; j++){
//            if (n % i == 0)
//        }
//
//    }

    //   5. Metoda să găsească al 2lea cel mai mic număr dintr-un array/lista
    public static void secondNumber(List<Integer> numbers) {
        Collections.sort(numbers);
        System.out.println("sortate " + numbers);
        System.out.println("2nd number " + numbers.get(1));

        //fa-l asta fara collections sort

    }

    //   6. Metoda care calculează media aritmetică a unei liste.
    public static void arithmeticMean(List<Integer> numbers) {
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        System.out.println("am: " + sum / numbers.size());
    }

    //   7. Metoda care verifică dacă un string ii palindrom
    public static boolean isPalindrome(String s) {
        char[] characters = s.toCharArray();
        for (int i = characters.length - 1; i >= 0; i--) {
            for (int j = 0; j < characters.length; j++) {
                if(characters[i] != characters[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void palindrom(String s) {
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        if (s.equals(reverse)) {
            System.out.println(s + " is a palindrome: " + reverse);
        }else {
            System.out.println(s + " is not a palindrome: " + reverse);
        }
    }

    //   8. Metoda care găsește cel mai mare divizor comun într-o listă de numere.
    public static Integer cmmdc(List<Integer> numbers) {
        Collections.sort(numbers);
        Integer firstNumber = numbers.get(0);
        for (Integer i = firstNumber; i>= 1; i--){
            for (Integer number : numbers) {
                if (number % i != 0) {
                    break;
                }
            }
            return i;
        }
        return null;
    }

    //   8. Metoda care găsește cel mai mare divizor comun într-o listă de numere.
    public static Integer cmmdc2(List<Integer> numbers) {
        Collections.sort(numbers);
        Integer firstNumber = numbers.get(0);
        for (Integer i = firstNumber; i >= 1; i--){
            boolean isCmmdc = true;
            for (Integer number : numbers) {
                if (number % i != 0) {
                    isCmmdc = false;
                }
            }
            if (isCmmdc) {
                return i;
            }
        }
        return 1;
    }


    //   9. O metoda care decodează un string aplicând filtru cezar. Decalajul la filtru cezar sa se poată schimba din o variabilă.

}


