import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class TargolClass2 {
    public static void main(String[] arg) {
        int[] numbers1 = {1, 2, 3, 4, 5};
        int[] numbers2 = {1, 2, 3};
        //mostArrayFollowers(numbers1);//שאלה 41
        //arrayCruet(5);//שאלה 45
        //amountIndexSameSum(numbers1,numbers2,6);//שאלה 46
        //stringToNumArray("sgsdg sgdsdg dsfs sd s");// שאלה 47
        //arrayNumMiss(numbers1);
        // amountIndexSum(numbers1,3);
        // sadrachc(numbers2);
        //sortArray(numbers2);
        //equilibriumPoint(numbers1);
        //findMaxSum(numbers1);
        //money(numbers1);
        //arraySilmtari(numbers1);
        String[] names = {"aa", "abc", "fjrek"};
        //mostWordInArrayWord(names,"abc");
        // mostNumInArray(numbers1);
        //arrayCharCheckWord();
        // printStringRating("Mandalorian ","Trooper Strom");
        //checkStringLitterAB("AAAABABAB");
        //sameNum(numbers1, numbers2);
        //bigOrSmallLetters(names);
        //avgArray(numbers1);
        //reversText("Hi, what'abc up?");
        // finisNum(5643);
        //printNum();
        //changeNumber(5476);
        //amountSeriesNumInArray(numbers1);
        //mostSeriesArray(numbers1);
        //smallSeriesArray(numbers1,numbers2);
        //checkString(names);
        //checkMostNameStreet(names);
        //checkStringLetterArray(names);
        //checkLetters("aBCdefg");
        //mostStringInArray(names);
        //magicArray(numbers1);
        //printLettersFromArray(names);
        //shortStringText("Hello From Java");
        // copyNumS("erty","ertyerty");
        //orderText("abbbcccccccc");
        //   orderText2("abbccc");
        //median(numbers1);
        //checkSumPrime(120);
        //sumArray(numbers1,numbers2);
        //removeAb("sagsgab");
        //checkDsringABCInWord("abcdaabc");
        //multiplesOfNumber(36);



    }

    public static int mostArrayFollowers(int[] numbers) {
        int mostCounter = 0;
        int counter = 1;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i + 1] - 1) {
                counter++;
            } else {
                if (counter > mostCounter) {
                    mostCounter = counter;
                }
                counter = 1;
            }
        }
        if (counter > mostCounter) {
            mostCounter = counter;
        }
        System.out.println(mostCounter);
        return mostCounter;
    }// 41

    public static int[] arrayCruet(int size) {
        Random random = new Random();
        int[] array = new int[size];
        array[0] = random.nextInt(0, 11);
        array[1] = random.nextInt(0, 11);
        int result = array[0] + array[1];

        for (int i = 2; i < array.length; i++) {
            array[i] = result;
            result += array[i - 1];
            System.out.println(array[i]);
        }
        return array;
    }// 45

    public static int amountIndexSameSum(int[] array1, int[] array2, int num) {
        int counter = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] + array2[i] == num) {
                counter++;
            }
        }
        System.out.println(counter);
        return counter;
    }//46

    public static int[] stringToNumArray(String text) {
        String[] newText = text.split(" ");
        int[] numbers = new int[newText.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = newText[i].length();
            System.out.print(numbers[i] + ", ");
        }
        return numbers;
    }//47

    public static int arrayNumMiss(int[] array) {
        int num = 0;
        boolean check = false;
        for (int i = 0; i < array.length; i++) {
            if (num + 1 == array[i]) {
                num = array[i];
                i = 0;
            }
        }
        System.out.println(num + 1);
        return num + 1;
    }

    public static void amountIndexSum(int[] array1, int sum) {
        for (int i = 0; i < array1.length; i++) {
            for (int t = i + 1; t < array1.length; t++) {
                if (array1[i] + array1[t] == sum) {
                    System.out.println(i + "," + t);
                }
            }
        }
    }

    public static void sadrachc(int[] array) {
        int counter = 1;
        int bigCounter = 1;
        int index = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                counter++;
            } else {
                if (counter > bigCounter) {
                    bigCounter = counter;
                    index = i - counter - 1;
                }
                counter = 1;
            }
        }
        if (counter > bigCounter) {
            bigCounter = counter;
            index = (array.length) - counter;
        }
        System.out.println(bigCounter + ", index: " + index);

    }

    public static boolean sortArray(int[] array) {
        int num;
        boolean check = false;
        do {
            check = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    num = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = num;
                    check = false;
                }
            }
        } while (!check);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        return check;
    }

    public static int equilibriumPoint(int[] num) {
        int index = -1;
        int sum1 = 0;
        int sum2 = 0;
        int location = 0;
        for (int i = 0; i < num.length - location; i++) {
            sum1 += num[i];
            for (int t = num.length - 1; t > i + 1; t--) {
                sum2 += num[(num.length - 1) - t];
                location = t;
            }
            if (sum1 == sum2 && i + 2 == location) {
                index = i + 1;
                break;
            }

        }
        System.out.println(index);
        return index;
    } //צריך לבדוק

    public static int findMaxSum(int[] array) {
        int sum = 0;
        int location = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                sum += array[i + 1];
                i += 2;
            } else {
                sum += array[i];

            }
            i++;
            location = i;
        }
        if (location != array.length - 1) {
            if (array[array.length - 2] < array[array.length - 1]) {
                sum += array[array.length - 1];
            } else {
                sum += array[array.length - 2];
            }
        } else sum += array[array.length - 1];
        System.out.println(sum);
        return sum;

    }

    public static boolean arraySilmtari(int[] data) {
        boolean check = true;
        if (data.length % 2 == 0) {
            for (int i = 0; i < data.length / 2; i++) {
                if (data[i] != data[data.length - 1 - i]) {
                    check = false;
                    break;
                }
            }
        } else check = false;
        System.out.println(check);
        return check;
    }

    public static String mostWordInArrayWord(String[] words, String word) {
        int bigCounter = 0;
        int indexBigCounter = -1;
        for (int i = 0; i < words.length; i++) {
            int count = countWord(words[i], word);
            if (count > bigCounter) {
                bigCounter = count;
                indexBigCounter = i;
            }
        }
        String newWord = "";
        if (indexBigCounter != -1) newWord = words[indexBigCounter];
        System.out.println(newWord);
        return newWord;
    }

    public static int countWord(String text, String word) {
        boolean check;
        int counter = 0;
        if (text.length() > word.length()) {
            for (int i = 0; i < text.length() - (word.length() - 1); i++) {
                check = true;
                if (text.charAt(i) == word.charAt(0)) {
                    for (int t = 1; t < word.length(); t++) {
                        if (text.charAt(t) != word.charAt(t)) {
                            check = false;
                        }
                    }
                    if (check) counter++;
                }
            }
        }
        return counter;
    }

    public static int money(int[] array) {
        int money = 0;
        int maxMoney = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = i; j < array.length; j += 2) {
                money += array[j];
            }
            if (maxMoney < money) {
                maxMoney = money;
            }
            money = 0;
        }
        System.out.println(maxMoney);
        return maxMoney;
    }

    public static int checkSum(int[] array, int sum) {
        int counter = 0;
        for (int i = 0; i < sum; i++) {
            if (sum > array[i] && sum % array[i] == 0) {
                counter++;
            }
            for (int t = i + 1; t < array.length; t++) {
                if (sum == array[i] + array[t]) {
                    counter++;
                    break;
                }
            }
            int sumTotal = array[i];
            for (int j = i + 1; j < array.length; j++) {
                sumTotal += array[j];
                if (sum == array[j]) {
                    counter++;
                    break;
                }

            }
        }
        return counter;
    }

    public static int mostNumInArray(int[] numbers) {
        int counter = 0;
        int mostCounter = 0;
        int finisNum = 0;
        for (int i = 0; i < 10; i++) {
            counter = 0;
            for (int t = 0; t < numbers.length; t++) {
                counter += amoutNumInNumber(numbers[t], i);
            }
            if (counter > mostCounter) {
                mostCounter = counter;
                finisNum = i;
            }
        }
        System.out.println(finisNum);
        return finisNum;
    }

    public static int amoutNumInNumber(int number, int num) {
        int counter = 0;
        while (number > 0) {
            if (number % 10 == num) counter++;
            number /= 10;
        }
        return counter;
    }

    public static void arrayCharCheckWord() {
        Scanner scanner = new Scanner(System.in);
        char[] array = new char[20];
        System.out.println("please insert 20 chars: ");
        String name = "";
        for (int i = 0; i < array.length; i++) {
            System.out.println("Please insert your " + (i + 1) + " char: ");
            array[i] = scanner.next().charAt(0);
            name += array[i];
        }
        if (name.contains("abc")) {
            System.out.println("Have abs in array char");
        } else System.out.println("dont have abs in array char");

        for (int i = array.length - 1; i > -1; i--) {
            System.out.print(array[i] + ", ");
        }
    }

    public static void printStringRating(String text1, String text2) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the number of jumps you want");
        int jumps = scanner.nextInt();
        if (text2.length() > text1.length()) {
            text1 = text2;
        }
        String textPrint = "";
        textPrint += text1.charAt(0);

        // for(int i=1;i<text1.length();i+=jumps){
        // for (int t=0;t<jumps;t++){
        //    textPrint += text1.charAt(i+t);
        // }
        // System.out.println(textPrint);
        //   }
        for (int i = 1; i < text1.length(); i += jumps) {
            textPrint += text1.substring(i, i + 2);
            System.out.println(textPrint);
        }

    }

    public static boolean checkStringLitterAB(String text) {
        boolean check = true;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != 'A' && text.charAt(i) != 'B') {
                check = false;
                break;
            }
        }
        System.out.println(check);
        return check;
    }

    public static void sameNum(int[] numbers1, int[] numbers2) {
        int[] sameNum = new int[numbers1.length];
        int counter = 0;
        boolean check;
        for (int i = 0; i < numbers1.length; i++) {
            for (int t = 0; t < numbers2.length; t++) {
                if (numbers1[i] == numbers2[t]) {
                    check = checkNumInArray(sameNum, numbers1[i]);
                    if (!check) {
                        sameNum[counter] = numbers1[i];
                        counter++;
                    }
                    break;
                }
            }
        }
        int[] finelSameNum = new int[counter];
        for (int i = 0; i < finelSameNum.length; i++) {
            finelSameNum[i] = sameNum[i];
            System.out.print(finelSameNum[i] + ", ");
        }
    }

    public static boolean checkNumInArray(int[] array, int num) {
        boolean check = false;
        for (int i = 0; i < array.length; i++) {
            if (num == array[i]) check = true;
        }
        return check;
    }

    public static String bigOrSmallLetters(String[] words) {
        int sumCountBig = 0;
        int sumCountSmall = 0;
        for (int i = 0; i < words.length; i++) {
            for (int t = 0; t < words[i].length(); t++) {
                if (words[i].charAt(t) >= 'a' && words[i].charAt(t) <= 'z') {
                    sumCountSmall++;
                } else if (words[i].charAt(t) >= 'A' && words[i].charAt(t) <= 'Z') {
                    sumCountBig++;
                }
            }
        }
        String result = "";
        if (sumCountBig >= sumCountSmall) {
            result = "big";
        } else {
            result = "small";
        }
        System.out.println(result);
        return result;
    }

    public static int[] avgArray(int[] numbers) {
        int counter = 0;
        int check = 2 % 2;
        int[] avgArray = new int[9];
        for (int i = 2; i <= 10; i++) {
            for (int t = 0; t < numbers.length; t++) {
                if (numbers[t] % i == 0) {
                    avgArray[i - 2] = counter++;
                }
            }
            counter = 0;
        }
        System.out.println(check);
        printArray(avgArray);
        return avgArray;
    }

    public static void printArray(int[] number) {
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + ",");
        }
    }

    public static String reversText(String text) {
        String[] newText = text.split(" ");
        String testName = "";
        String finisName = "";

        for (int i = 0; i < newText.length; i++) {
            boolean check = true;
            for (int t = 0; t < newText[i].length(); t++) {
                if ((newText[i].charAt(t) >= 'a' && newText[i].charAt(t) <= 'z') || (newText[i].charAt(t) >= 'A' && newText[i].charAt(t) <= 'Z')) {
                    testName += newText[i].charAt(t);
                } else if (newText[i].length() - 1 - t <= 1) {
                    testName = reversWord(testName);
                    testName += newText[i].charAt(t);
                    check = false;
                } else {
                    testName += newText[i].charAt(t);
                    newText[i] = newText[i].substring(t);
                    t = 0;
                    finisName += testName;
                    testName = "";

                }
            }
            if (check) testName = reversWord(testName);
            finisName += testName;
            finisName += " ";
            testName = "";
        }
        System.out.println(finisName);
        return finisName;
    }

    public static String reversWord(String word) {
        String newWord = "";
        for (int i = word.length() - 1; i > -1; i--) {
            newWord += word.charAt(i);
        }
        return newWord;
    }

    public static int finisNum(int num) {
        int newNum = 0;
        newNum = num % 10;
        while (num >= 10) {
            num /= 10;
        }
        num = num % 10;
        num *= 10;
        newNum += num;
        System.out.println(newNum);
        return newNum;
    }

    public static void printNum() {
        for (int i = 0; i < 10; i++) {
            for (int t = i + 1; t < 10; t++) {
                if (i + t == 9) {
                    System.out.println(i + ", " + t);
                }
            }
        }
    }

    public static int changeNumber(int num) {
        int finisNum = 0;
        int[] numbers = null;
        int newNum = num;
        int counter = 0;
        while (newNum > 0) {
            newNum /= 10;
            counter++;
        }
        newNum = num;
        numbers = new int[counter];
        for (int i = numbers.length - 1; i > -1; i--) {
            numbers[i] = newNum % 10;
            newNum /= 10;
        }
        int saveNum = 0;
        for (int i = 0; i < numbers.length - 1; i += 2) {//4,5,7,6
            saveNum = numbers[i];
            numbers[i] = numbers[i + 1];
            numbers[i + 1] = saveNum;

            finisNum += numbers[i];
            finisNum *= 10;
            finisNum += numbers[i + 1];
            finisNum *= 10;
        }
        finisNum /= 10;
        System.out.println(finisNum);
        return finisNum;
    }

    public static int amountSeriesNumInArray(int[] numbers) {
        int counter = 0;
        int saveCount = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] < numbers[i + 1]) {
                counter++;
            } else {
                if (counter > 1) {
                    saveCount++;
                }
                counter = 1;
            }
        }
        if (counter > 1) saveCount++;
        System.out.println(saveCount);
        return saveCount;
    }

    public static int[] mostSeriesArray(int[] numbers) {
        int counter = 1;
        int indexBigCounter = 0;
        int bigCounter = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] < numbers[i + 1]) {
                counter++;
            } else {
                if (counter > bigCounter) {
                    bigCounter = counter;
                    indexBigCounter = i;
                }
                counter = 1;
            }
        }

        if (counter > bigCounter) {
            bigCounter = counter;
            indexBigCounter = numbers.length - 1;
        }
        int[] newSeries = new int[bigCounter];
        int location = 0;
        for (int i = indexBigCounter - (bigCounter - 1); i <= indexBigCounter; i++) {
            newSeries[location] = numbers[i];
            location++;
        }
        printArray(newSeries);
        return newSeries;
    }

    public static int[] smallSeriesArray(int[] array1, int[] array2) {
        int smallArray1 = countSmallArray(array1);
        int smallArray2 = countSmallArray(array2);
        int[] array = null;
        if (smallArray1 < smallArray2) {
            array = array1;
        } else if (smallArray2 < smallArray1) {
            array = array2;
        }
        printArray(array);
        return array;
    }

    public static int countSmallArray(int[] array) {
        int counter = 1;
        int mostSmallArray = array.length;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                counter++;
            } else {
                if (counter < mostSmallArray && counter > 1) {
                    mostSmallArray = counter;
                }
                counter = 1;
            }
        }
        if (counter < mostSmallArray && counter > 1) {
            mostSmallArray = counter;
        }
        return mostSmallArray;
    }

    public static boolean checkString(String[] name) {
        boolean check = true;
        int index = 0;
        String checkName = name[0];
        int counter = 0;
        if (checkName.length() == name[1].length()) {
            for (int i = 0; i < checkName.length(); i++) {
                if (checkName.charAt(i) != name[1].charAt(i)) {
                    counter++;
                    index = i;
                }
            }
        } else check = false;
        if (counter > 1 || counter == 0) check = false;
        if (check) {
            for (int i = 2; i < name.length; i++) {
                counter = 0;
                if (name[i].length() == checkName.length()) {
                    for (int t = 0; t < name[i].length(); t++) {
                        if (name[i].charAt(t) != checkName.charAt(t)) {
                            counter++;
                            if (counter > 2 || t != index) {
                                check = false;
                                break;
                            }
                        }
                    }
                    if (counter == 0) {
                        check = false;
                        break;
                    }
                } else {
                    check = false;
                    break;
                }
            }
        }
        System.out.println(check);
        return check;
    }

    public static String checkMostNameStreet(String[] address) {
        String mostNameStreet = "";
        String nameStreet = "";
        int mostCounter = 0;
        int counter = 0;
        for (int i = 0; i < address.length; i++) {
            counter = 0;
            String[] checkStreet = address[i].split(" ");
            nameStreet = checkStreet[1];

            for (int t = 0; t < address.length; t++) {
                if (address[t].contains(nameStreet)) {
                    counter++;
                }
            }
            if (mostCounter < counter) {
                mostCounter = counter;
                mostNameStreet = nameStreet;
            }
        }
        System.out.println(mostNameStreet);
        return mostNameStreet;
    }

    public static boolean checkStringLetterArray(String[] array) {
        boolean check = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].charAt(0) >= array[i + 1].charAt(0)) {
                check = false;
                break;
            }
        }
        System.out.println(check);
        return check;
    }

    public static int[] checkLetters(String text) {
        int[] numberOfLetters = new int[2];

        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                numberOfLetters[1]++;
            } else numberOfLetters[0]++;
        }
        printArray(numberOfLetters);
        return numberOfLetters;
    }

    public static String mostStringInArray(String[] texts) {
        int mostLetters = 0;
        int countLength = 0;
        int index = -1;
        for (int i = 0; i < texts.length; i++) {
            if (!texts[i].contains(" ")) {
                countLength = texts[i].length();
                if (countLength > mostLetters) {
                    mostLetters = countLength;
                    index = i;
                }
            }
        }
        String word;
        if (index == -1) {
            word = "";
        } else word = texts[index];
        System.out.println(word);
        return word;
    }

    public static boolean magicArray(int[] numbers) {
        boolean check = true;
        int num = numbers[0];
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        int checkSum = 0;
        for (int i = 1; i < numbers.length; i++) {
            checkSum = 0;
            num = numbers[i];
            while (num > 0) {
                checkSum += num % 10;
                num /= 10;
            }
            if (sum != checkSum) {
                check = false;
                break;
            }
        }
        System.out.println(check);
        return check;
    }

    public static void printLettersFromArray(String[] words) {
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() % 2 == 0) {
                System.out.print(words[i].charAt(0) + ",");
            } else {
                System.out.print(words[i].charAt(words[i].length() - 1) + ",");
            }
        }
    }

    public static String shortStringText(String text) {
        String[] textArray = text.split(" ");
        String newWord = "";
        for (int i = 0; i < textArray.length; i++) {
            newWord += textArray[i].charAt(0);
            if (i != textArray.length - 1) {
                newWord += ".";
            }
        }
        System.out.println(newWord);
        return newWord;
    }


    public static int copyNumS(String word1, String word2) {
        int numS1 = checkCopeNumS(word1, word2);
        int numFinisS = -1;
        if (numS1 != -1) {
            numFinisS = numS1;
        } else {
            int numS2 = checkCopeNumS(word2, word1);
            if (numS2 != -1) {
                numFinisS = numS2;
            }
        }
        System.out.println(numFinisS);
        return numFinisS;
    }

    public static int checkCopeNumS(String word1, String word2) {
        int counter = 1;
        int numS = -1;
        if (word1.length() % word2.length() == 0) {
            String assWord = word2;
            while (word1.length() > word2.length()) {
                word2 += assWord;
                counter++;
            }
            if (word1.toLowerCase().equals(word2.toLowerCase())) {
                numS = counter;
            }
        }
        return numS;
    }

    public static String orderText(String text) {
        String newText = "";
        char letter = 0;
        while (text != "") {
            letter = mostLetterInTEXT(text);
            newText += letter;
            text = removeLetter(text, letter);
        }
        System.out.println(newText);
        return newText;
    }

    public static String orderText2(String text) {
        char maxLetter = 0;
        System.out.println(maxLetter);
        String newName = "";
        while (!text.equals("")) {
            maxLetter = mostLetterInTEXT(text);
            newName += maxLetter;
            text = text.replace(maxLetter + "", "");
        }
        System.out.println(newName);
        return newName;
    }

    public static char mostLetterInTEXT(String text) {
        int counter = 0;
        int mostCounter = 0;
        char mostLetter = 0;
        for (int i = 0; i < text.length(); i++) {
            counter = 0;
            for (int t = i + 1; t < text.length(); t++) {
                if (text.charAt(i) == text.charAt(t)) {
                    counter++;
                }
            }
            if (counter > mostCounter) {
                mostCounter = counter;
                mostLetter = text.charAt(i);
            } else if (text.length() == 1) {
                mostLetter = text.charAt(0);
            }
        }
        return mostLetter;
    }

    public static String removeLetter(String text, char letter) {
        String newName = "";
        if (text.length() > 1) {
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) != letter) {
                    newName += text.charAt(i);
                }
            }
        } else newName = "";
        return newName;
    }

    public static double median(int[] array) {
        int countBig = 0;
        int countSmall = 0;
        double finisNum = -1;
        if ((array.length - 1) % 2 == 0) {
            int num = (array.length - 1) / 2;
            for (int i = 0; i < array.length; i++) {
                for (int t = 0; t < array.length; t++) {
                    if (array[i] < array[t]) {
                        countBig++;
                    }
                    if (array[i] > array[t]) countSmall++;

                }
                if (countBig == countSmall && countBig == num) {
                    finisNum = array[i];
                    break;
                }
                countBig = 0;
                countSmall = 0;
            }
        } else {
            int num = (array.length - 1) / 2;
            int num1 = 0;
            int num2 = 0;
            for (int i = 0; i < array.length; i++) {
                for (int t = 0; t < array.length; t++) {
                    if (array[i] < array[t]) {
                        countBig++;
                    }
                    if (array[i] > array[t]) countSmall++;
                }
                if (countBig == num && countSmall == num + 1) {
                    num1 = array[i];
                    break;
                }
                countBig = 0;
                countSmall = 0;
            }
            countBig = 0;
            countSmall = 0;
            for (int i = 0; i < array.length; i++) {
                for (int t = 0; t < array.length; t++) {
                    if (array[i] < array[t]) {
                        countBig++;
                    }
                    if (array[i] > array[t]) countSmall++;
                }
                if (countBig == num + 1 && countSmall == num) {
                    num2 = array[i];
                }
                countBig = 0;
                countSmall = 0;
            }
            finisNum = (double) (num1 + num2) / 2;
        }
        System.out.println(finisNum);
        return finisNum;
    }

    public static int[] checkSumPrime(int num) {
        boolean check = true;
        int[] numbers = new int[num];
        int counter = 0;
        if (!isPrime(num)) {
            for (int i = 2; i <= num; i++) {

                if (num % i == 0 && isPrime(i)) {
                    while (num % i == 0) {
                        num /= i;
                        numbers[counter] = i;
                        counter++;
                    }
                }
            }
        } else {
            numbers[counter] = num;
            counter++;
        }
        int[] finisArrayNumbers = new int[counter];
        for (int i = 0; i < finisArrayNumbers.length; i++) {
            finisArrayNumbers[i] = numbers[i];
        }
        printArray(finisArrayNumbers);
        return finisArrayNumbers;
    }

    public static boolean isPrime(int num) {
        boolean check = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                check = false;
                break;
            }
        }
        return check;
    }

    public static int[] sumArray(int[] array1, int[] array2) {
        int bigLengthArray = array1.length;
        if (bigLengthArray < array2.length) {
            bigLengthArray = array2.length;
        }
        int[] array = new int[bigLengthArray];
        for (int i = 0; i < array.length; i++) {
            if (i < array1.length && i < array2.length) {
                array[i] = array1[i] + array2[i];
            } else if (i >= array1.length) {
                array[i] = array2[i];
            } else {
                array[i] = array1[i];
            }
        }
        printArray(array);
        return array;
    }

    public static String removeAb(String word) {
        if (word.contains("a")) {
            word = word.replace("a", "");
        }
        System.out.println(word);
        return word;
    }

    public static int checkDsringABCInWord(String word) {
        int counter = 0;
        String name = "abc";
        System.out.println(name.substring(0, 3));
        for (int i = 0; i < word.length() - 2; i++) {
            if (word.substring(i, i + 3).equals("abc")) {
                counter++;
            }
        }
        System.out.println(counter);
        return counter;
    }
    public static void multiplesOfNumber(int num){
        int finelNum=num;
        for(int i=2;i<num;i++){
            if(num%i==0&&i<finelNum){
                System.out.println(num/i+ "*" + i);
                finelNum=num/i;
            }
        }
    }

}