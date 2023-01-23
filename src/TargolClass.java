import java.util.Random;

public class TargolClass {
    public static void main(String[] arg) {
        int[] numbers1 = {3, 2, 2, 2, 2, 5, 5, 6, 1, 3, 1, 1, 2};
        int[] numbers2 = {33, 32, 156, 5};
        //sequenceOfIdenticalValues(numbers1, 2);// שאלה 1 א
        //biggerSumOfIdenticalValues(numbers1);//שאלה 1 ב
        // operationsAccount(1,5,7,7);//שאלה 2
        //coclation("6-1*4");//שאלה 3
        // family(numbers1,numbers2);//שאלה 5
        //arrayOrder(numbers1);//שאלה 6
        //String [] names={"AfdsfBA","FSAfesadqeERT","eRwSssSeR"};
        // poldrom(names);//שאלה 7
        //double[] numbersDouble = {33.234,32,156.234,5};
        // arrayDouble(numbersDouble);//שאלה 4

    }

    public static int sequenceOfIdenticalValues(int[] numbers, int num) {
        int countBlock = 1;
        int counter = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i + 1]) {
                countBlock++;
            } else {
                if (countBlock > 0) {
                    if (countBlock >= num) counter++;
                    countBlock = 1;
                }
            }
        }
        if (countBlock > 0) {
            if (countBlock >= num) counter++;
            countBlock = 1;
        }

        System.out.println(counter);
        return counter;
    } //שאלה 1 א

    public static int[] biggerSumOfIdenticalValues(int[] numbers) {
        int countBlock = 1;
        int sum = 0;
        int biggerSum = 0;
        int index = -1;
        int araaycount = 1;
        sum = (numbers[0]);
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i + 1]) {
                sum += numbers[i];
                countBlock++;
            } else {
                if (countBlock > 1) {
                    if (sum > biggerSum) {
                        biggerSum = sum;
                        index = numbers[i];
                        araaycount = countBlock;
                    }
                }
                sum = (numbers[i + 1]);
                countBlock = 1;
            }

        }
        int[] arrayNew = new int[araaycount];
        for (int i = 0; i < arrayNew.length; i++) {
            arrayNew[i] = index;
        }
        for (int i = 0; i < arrayNew.length; i++) {
            System.out.print(arrayNew[i] + ",");
        }

        return arrayNew;
    }//שאלה 1 ב

    public static int[] operationsAccount(int num1, int num2, int num3, int n) {
        int bigNum;
        if (num1 > num2 && num1 > num3) {
            bigNum = num1;
        } else if (num2 > num1 && num2 > num3) {
            bigNum = num2;
        } else bigNum = num3;
        int[] numbers = new int[n];
        numbers[0] = bigNum;
        for (int i = 1; i < numbers.length; i++) {
            bigNum += bigNum;
            numbers[i] = bigNum;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ",");
        }
        return numbers;
    }//שאלה 2

    public static int coclation(String text) {
        int sum = 0;
        // איך ניתן להמיר תו לאינט
        int num1 = text.charAt(0) - '0';
        char operationAccount = text.charAt(1);
        int num2 = text.charAt(2) - '0';
        char operationAccount2 = text.charAt(3);
        int num3 = text.charAt(4) - '0';
        if (operationAccount == '*') {
            if (operationAccount2 == '+') {
                sum = num1 * num2 + num3;
            } else sum = num1 * num2 - num3;
        }
        if (operationAccount2 == '*') {
            if (operationAccount == '+') {
                sum = num1 + num2 * num3;
            } else sum = num1 - num2 * num3;
            System.out.println(sum);
        }
        if (operationAccount2 == '+') {
            if (operationAccount == '+') {
                sum = num1 + num2 + num3;
            } else if (operationAccount == '-') sum = num1 - num2 + num3;
            if (operationAccount2 == '-') {
                if (operationAccount == '+') {
                    sum = num1 + num2 - num3;
                } else if (operationAccount2 == '-') sum = num1 + num2 + num3;
                System.out.println(sum);
            }
            System.out.println(sum);
        }
        return sum;
    }//שאלה 3

    public static boolean[] arrayDouble(double[] numbers) {
        boolean[] newArray = new boolean[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 1 == 0) {
                newArray[i] = true;
            } else newArray[i] = false;
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + ", ");
        }
        return newArray;
    }//שאלה 4

    public static int family(int[] array1, int[] array2) {
        int max = 0;
        int index = -1;
        for (int i = 0; i < array1.length; i++) {
            for (int t = 0; t < array2.length; t++) {
                if (sameSum(array1[i], array2[t])) {
                    if (sumDigit(array1[i]) > max) {
                        max = sumDigit(array1[i]);
                        index = i;
                    }
                }
            }
        }
        System.out.println(index);
        return index;

    }//שאלה 5

    public static boolean sameSum(int a, int b) {
        int sum1 = 0;
        int sum2 = 0;
        while (a > 0) {
            sum1 += a % 10;
            a /= 10;
        }
        while (b > 0) {
            sum2 += b % 10;
            b /= 10;
        }
        return sum1 == sum2;

    }

    public static int sumDigit(int a) {
        int sum1 = 0;
        while (a > 0) {
            sum1 += a % 10;
            a /= 10;
        }

        return sum1;

    }

    public static boolean arrayOrder(int[] number) { //o(n)
        boolean check = false;
        if (number.length > 4 && number.length % 2 == 0) {
            int sum1 = 0;
            int sum2 = 0;
            for (int i = 0; i < number.length / 2; i++) {
                sum1 += number[i];
            }
            for (int i = number.length / 2; i < number.length; i++) {
                sum2 += number[i];
            }
            if (sum1 == sum2) {
                int min = number[0];
                int max = number[0];
                int indexMin = 0;
                int indexMax = 0;
                for (int i = 1; i < number.length; i++) {
                    if (number[i] < min) {
                        min = number[i];
                        indexMin = i;
                    }
                    if (number[i] > max) {
                        max = number[i];
                        indexMax = i;
                    }
                }
                if (indexMin < number.length / 2 && indexMax > number.length / 2) {
                    check = true;
                }
            }

        }
        System.out.println(check);
        return check;
    }//שאלה 6

    public static String poldrom(String[] texts) {
        String maxName = "";
        int maxSmallLetter = 0;
        String name = "";
        for (int i = 0; i < texts.length; i++) {
            int counterSmallLetter = 0;
            name = "";
            for (int t = 0; t < texts[i].length(); t++) {
                if (texts[i].charAt(t) >= 'a' && texts[i].charAt(t) <= 'z') {
                    counterSmallLetter++;
                } else {
                    name += texts[i].charAt(t);
                }
            }
            if (checkPoldrom(name) && counterSmallLetter > maxSmallLetter) {
                maxSmallLetter = counterSmallLetter;
                maxName = texts[i];
            }
            counterSmallLetter = 0;
        }
        System.out.println(maxName);


        return maxName;
    }//שאלה 7

    public static boolean checkPoldrom(String texts) {
        String name = "";
        for (int i = texts.length() - 1; i > -1; i--) {
            name += texts.charAt(i);
        }
        return texts.equals(name);
    }
}


