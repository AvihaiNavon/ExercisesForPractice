import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        //תרגילי קלט
        //radiosCircel();//1
        // perimeterAndAreaRectangle();//2
        // lengthRemainderRightTriangle();//3
        // age2040();//4
        // Average4Num();//5
        // transportationPrice();//6
        //digitNumber();//7
        // digitTensNumber();//8
        //sumOfDigitsOfTwoDigit();//9
        //תרגילי תנאים
        //numberBiggerThanAThousand();//10
        //discountProducts();//11
        //differenceSame();//12
        //studentGradeCategory();//13
        // digitSumTwoDigits();//14
        //consecutiveDigitsInThreeDigits();//15
        //expansionConsecutiveDigitsInThreeDigits();
        //bonusSales();//16
        //לולאות
        //fiveEnenNumber();//17
        //divisibleThree();//18
        //sameTwoDigitNumber();//19
        //פונקציות
        //gcd(12,18);//20
        // numberOfDigits();//21
        //sumOfDigits();//22
        // niceNumber();//23
        //allNiceNumberUpToThousand();//24
        //amontNumInNumber(5,54535643);//25
        //מערכים
        //CratingArray(5,3);//26
        //CratingArray2(6,2);//27
        // CratingArrayRandom(6);//28
        //int[] arrayNum = {5, 5, 9, 5};
        //int[] arrayNum2 = {1, 5, 9, 5};
        // biggerNum(arrayNum);//29
        // amountNumInArray(arrayNum,5);//30
        //removeNumInArray(arrayNum,5);//31
        // biggerSumArray(arrayNum,arrayNum2);//32
        //CreateArrayAndPrintEven();//33
        //createArrayMultiplesNum();//34
        //multiplyThreeEvensArray(arrayNum);//35
        //risingArray(arrayNum);//36
        // sumBiggerElementArray(arrayNum,10);//37
        // distanceNumFromEdges(arrayNum,7);//38
        //summingUpEqualBiggerAndSmallNumbers(arrayNum,50);//39
        int[] arrayNum3 = {1, 2, 2, 5, 5};
        int[] arrayNum4 = {5, 3, 3, 3, 7, 8, 2};
        //cuttingBetweenArray(arrayNum3,arrayNum4);//40
        //unionBetweenArray(arrayNum3,arrayNum4);//41
        //equalValuesArrays(arrayNum3,arrayNum4);//42
        // AverageBetweenArrays(arrayNum3,arrayNum4);//43
        //shift(arrayNum3,true,2);//44
        //digitsWithinAnArrayDigits(arrayNum3);//45
        // removeNumFromNumber(54535643,5);//46

    }

    //תרגילים קלטים
    public static void radiosCircel() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your radios:");
        int radiosUser = scanner.nextInt();
        System.out.println("Circumference of a circle: " + (double) (2 * 3.14 * radiosUser) + ".");
        System.out.println("Area of a circle: " + (double) (3.14 * radiosUser * radiosUser) + ".");

    }//1. שטח והיקף מעגל

    public static void perimeterAndAreaRectangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        int length = scanner.nextInt();
        System.out.println("Enter the width of the rectangle:");
        int width = scanner.nextInt();
        System.out.println("Circumference of a rectangle: " + (2 * (length + width)) + ".");
        System.out.println("Area of a rectangle: " + (length * width) + ".");
    }//2. ביקף ושטח של מלבן

    public static void lengthRemainderRightTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the first perpendicular of the triangle:");
        int perpendicular1 = scanner.nextInt();
        System.out.println("Insert the second perpendicular of the triangle:");
        int perpendicular2 = scanner.nextInt();
        double lengthRemainder = Math.sqrt(Math.pow(perpendicular1, 2) + Math.pow(perpendicular2, 2));
        System.out.println("Length remainder of right triangle: " + lengthRemainder);
    }//3. יתר משולש ישר זווית (משפט פיתגורס)

    public static void age2040() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your age:");
        int age = scanner.nextInt();
        System.out.println("Your age in 2040 is : " + (age + (2040 - 2022)));
    }//4.גיל צפוי ב 2040

    public static void Average4Num() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your number 1:");
        int num1 = scanner.nextInt();
        System.out.println("Insert your number 2:");
        int num2 = scanner.nextInt();
        System.out.println("Insert your number 3:");
        int num3 = scanner.nextInt();
        System.out.println("Insert your number 4:");
        int num4 = scanner.nextInt();
        System.out.println("The average of your number: " + ((double) (num1 + num2 + num3 + num4) / 4));
    }//5. ממוצע 4 מספרים

    public static void transportationPrice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your home distance:");
        int distance = scanner.nextInt();
        System.out.println("Enter your floor:");
        int floor = scanner.nextInt();
        System.out.println("the price of the product:");
        int price = scanner.nextInt();
        System.out.println("Enter the weight of the product:");
        int weight = scanner.nextInt();
        System.out.println("The final amount of the purchase: " + (price + (((distance * 5) + (floor * weight)) * 1.1)));
    }//6. מחיר מוצר כולל הובלה

    public static void digitNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your number:");
        int num = scanner.nextInt();
        System.out.println("The digit of number: " + (num % 10));
    } //7. ספרת אחדות

    public static void digitTensNumber() {
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.println("Insert your number:");
            num = scanner.nextInt();
        } while (!(num < 100 && num > 9));

        System.out.println("The digit tens of number: " + ((num / 10) % 10));
    }//8. ספרת עשרות של מספר דו ספרתי

    public static void sumOfDigitsOfTwoDigit() {
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.println("Insert your number:");
            num = scanner.nextInt();
        } while (!(num < 100 && num > 9));

        System.out.println("The digit tens of number: " + ((num % 10) + (num / 10) % 10));
    }//9. סכום ספרות מספר דו ספרתי

    //תרגילים תנאים
    public static void numberBiggerThanAThousand() {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Insert your number:");
        num = scanner.nextInt();
        if (num > 1000) {
            System.out.println("Success");
        } else System.out.println("Failure");


    }//10. ספרה גדולה מאלף

    public static void discountProducts() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your price of first product :");
        int priceProducts1 = scanner.nextInt();
        System.out.println("Insert your price of second product :");
        int priceProducts2 = scanner.nextInt();
        System.out.println("Insert your price of third product :");
        int priceProducts3 = scanner.nextInt();
        int sumPrice = priceProducts1 + priceProducts2 + priceProducts3;
        if (sumPrice > 500) {
            System.out.println("The total price of the products: " + sumPrice * 0.9);
        } else System.out.println("The total price of the products: " + sumPrice);


    }//11. מחיר מוצרים

    public static void differenceSame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your first number:");
        int firstNum = scanner.nextInt();
        System.out.println("Insert your second number:");
        int secondNum = scanner.nextInt();
        System.out.println("Insert your third number:");
        int thirdNum = scanner.nextInt();
        int difference1;
        int difference2;
        if (firstNum > secondNum) {
            difference1 = firstNum - secondNum;
        } else difference1 = secondNum - firstNum;
        if (thirdNum > secondNum) {
            difference2 = thirdNum - secondNum;
        } else difference2 = secondNum - thirdNum;

        System.out.println("Are the differences the same: " + (difference1 == difference2));


    }// 12. בדיקת הפרשים בין שלושה מספרים

    public static void studentGradeCategory() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your grade:");
        int grade = scanner.nextInt();
        if (grade > 90) {
            System.out.println("Excellent");
        } else if (grade >= 70 && grade <= 90) {
            System.out.println("Good");
        } else System.out.println("Struggling");
    }//13. ציון סטודנט

    public static void digitSumTwoDigits() {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Insert your number:");
        num = scanner.nextInt();
        if (num < 100 && num > 9) {

            System.out.println("The digit tens of number: " + ((num % 10) + (num / 10) % 10));
        }
    } //14. סכום ספרות דו ספרתי

    public static void consecutiveDigitsInThreeDigits() {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Insert your number:");
        num = scanner.nextInt();
        if (num < 1000 && num > 99) {
            boolean check = false;
            if (num % 10 == (num / 10) % 10 + 1 && num % 10 == (num / 100) % 10 + 2) {
                check = true;
            } else if (num % 10 == (num / 10) % 10 - 1 && num % 10 == (num / 100) % 10 - 2) {
                check = true;
            }

            if (check) {
                System.out.println("Consecutive digits in three digits: " + check);
            } else System.out.println("Consecutive digits in three digits: " + check);


        }
    }// 15. ספרות עוקבות תלת ספרתי

    public static void expansionConsecutiveDigitsInThreeDigits() {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Insert your number:");
        num = scanner.nextInt();
        int newNum = num;
        boolean check = false;
        while (newNum > 10) {
            if ((newNum % 10) == ((newNum / 10) % 10 + 1)) {
                check = true;
            } else {
                check = false;
                break;
            }
            newNum /= 10;
        }
        if (!check) {
            newNum = num;
            while (newNum > 10) {
                if (newNum % 10 == (newNum / 10) % 10 - 1) {
                    check = true;
                } else {
                    check = false;
                    break;
                }

                newNum /= 10;
            }
        }

        if (check) {
            System.out.println("Consecutive digits in three digits: " + check);
        } else System.out.println("Consecutive digits in three digits: " + check);


    }// הרחבה מספרים עוקבים

    public static void bonusSales() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your basic salary :");
        int salary = scanner.nextInt();
        System.out.println("Enter the sales target :");
        int target = scanner.nextInt();
        System.out.println("Enter your sales :");
        int sales = scanner.nextInt();
        if (sales >= target) {
            System.out.println("Your monthly salary is :" + (salary * 1.75));
        } else if ((target * 50) / 100 <= sales) {
            System.out.println("Your monthly salary is :" + (salary + 2000));
        } else System.out.println("Your monthly salary is :" + salary);
    }// 16.בונוס מכירות

    //לולאות
    public static void fiveEnenNumber() {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while (counter != 5) {
            System.out.println("Enter your number :");
            int salary = scanner.nextInt();
            if (salary % 2 == 0) counter++;
        }
        System.out.println("You Enter five number even :");
    }// 17. הכנסת חמישה מספרים זוגיים

    public static void divisibleThree() {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        System.out.println("Please enter ten number:");
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println("Please enter " + i + " number:");
            int numUser = scanner.nextInt();
            if (numUser % 3 == 0) counter++;
        }
        System.out.println("You have " + counter + " numbers that divisible by three");
    } // 18.חלוקה בשלוש

    public static void sameTwoDigitNumber() {
        Scanner scanner = new Scanner(System.in);
        int numUser;

        do {
            System.out.println("Please enter same two digit number:");
            numUser = scanner.nextInt();
        } while (!((numUser % 10 == (numUser / 10) % 10) && (numUser < 100 && numUser > 9)));
    }//19. מספר דו ספרתי שווה ספרות

    //פונקציות
    public static int gcd(int number1, int number2) {
        int divisor = 0;
        int numbig;
        int numSmall;
        if (number1 >= number2) {
            numbig = number1;
            numSmall = number2;
        } else {
            numbig = number2;
            numSmall = number1;
        }
        for (int i = 1; i <= numSmall; i++) {
            if (numSmall % i == 0 && numbig % i == 0) {
                divisor = i;
            }
        }
        System.out.println(divisor);
        return divisor;
    }// 20. מחלק משותף מקסימלי

    public static int numberOfDigits() {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        System.out.println("Enter your number:");
        int num = scanner.nextInt();
        if (num < 0) num *= -1;
        while (num > 0) {
            counter++;
            num /= 10;
        }
        System.out.println(counter);
        return counter;
    }// 21. כמות ספרות במספר

    public static int sumOfDigits() {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        System.out.println("Enter your number:");
        int num = scanner.nextInt();
        int sum = 0;
        if (num < 0) num *= -1;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);
        return sum;
    }// 22. סכום ספרות של מספר

    public static boolean niceNumber(int num) {
        Scanner scanner = new Scanner(System.in);
        boolean check = false;
        //System.out.println("Enter your number:");
        // int num=scanner.nextInt();
        int lastNumber = 0;
        if (num < -9) num *= -1;
        if (num > 9) {
            int firstNumber = num % 10;
            while (num > 0) {
                lastNumber = num % 10;
                num /= 10;
            }
            if (firstNumber == lastNumber) check = true;
        }
        //if(check) {
        //   System.out.println("The number is nice number.");
        // }else System.out.println("The number is not nice number.");
        return check;
    }//23. מספר יפה

    public static void allNiceNumberUpToThousand() {
        for (int i = 1; i <= 1000; i++) {
            if (niceNumber(i)) {
                System.out.print(i + ",");
            }
        }
    } //24. כל המספרים היפים עד אלף

    public static int amontNumInNumber(int num, int number) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        if (number < 0) number *= -1;
        while (number > 0) {
            if (number % 10 == num) counter++;
            number /= 10;
        }
        System.out.print(counter);
        return counter;


    }// 25. כמות הפעמים של ספרה במספר

    //מערכים
    public static int[] CratingArray(int length, int num) {
        int[] newArray = new int[length];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = num;
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + ",");
        }
        return newArray;
    }//26.יצירת מערך לפי נתונים

    public static int[] CratingArray2(int length, int num) {
        int[] newArray = new int[length];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = num;
            num += 1;
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + ",");
        }
        return newArray;
    }

    public static int[] CratingArrayRandom(int length) {
        Random random = new Random();
        int[] newArray = new int[length];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = random.nextInt();
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + ",");
        }
        return newArray;
    }// 28. מערך רנדום.

    public static int biggerNum(int[] number) {

        Integer bigger = number[0];
        for (int i = 0; i < number.length; i++) {
            if (bigger < number[i]) bigger = number[i];
        }

        System.out.print(bigger);

        return bigger;
    }// 29.מספר הכי גדול במערך.

    public static int amountNumInArray(int[] number, int num) {
        int counter = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] == num) counter++;
        }
        System.out.print(counter);
        return counter;
    }// 30.כמות הפעמים של מספר במערך.

    public static int[] removeNumInArray(int[] number, int num) {
        int counter = 0;

        for (int i = 0; i < number.length; i++) {
            if (number[i] == num) counter++;
        }
        int[] newArray = new int[number.length - counter];
        int t = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] != num) {
                newArray[t] = number[i];
                t++;
            }
        }
        // for (int j = 0; j < newArray.length; j++) {
        //    System.out.print(newArray[j] + ",");
        //  }

        return newArray;
    } //31.להסיר מספר ממערך.

    public static int biggerSumArray(int[] arrayNumber1, int[] arrayNumber2) {
        int sum1 = 0;
        for (int i = 0; i < arrayNumber1.length; i++) {
            sum1 += arrayNumber1[i];
        }
        int sum2 = 0;
        for (int i = 0; i < arrayNumber2.length; i++) {
            sum2 += arrayNumber2[i];
        }
        int result = 0;
        if (sum1 > sum2) {
            result = 1;
        }
        if (sum2 > sum1) result = 2;
        System.out.println(result);
        return result;

    } //32. סכום מספרים במערך גדול יותר.

    public static void enteringNumbersArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 11);
        }
    } //33. קולטת ערכים למערך.

    public static void printEvenNumber(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) System.out.print(array[i] + ",");
        }
    }//33. מדפיסה ערכים זוגיים במערך

    public static void createArrayAndPrintEven() {
        int[] array = new int[10];
        enteringNumbersArray(array);
        printEvenNumber(array);
    } //33. בונה מערך בגודל 10 ומפעילה פונקציות עד שקולטת נתונים ומדפיסה ערכים זוגיים.

    public static void EnteringMultiplesNumToArray(int[] number, int num) {
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum += 7;
            number[i] = sum;
        }

    }//34. מילוי המערך בערכים של מעפלות המספר.

    public static void printArray(int[] number) {
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + ",");
        }
    }// 34. הדפסת מערך.

    public static void createArrayMultiplesNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length:");
        int length = scanner.nextInt();
        System.out.println("Entering multiples of a number you wont");
        int multiples = scanner.nextInt();
        int[] array = new int[length];
        EnteringMultiplesNumToArray(array, multiples);
        printArray(array);
    }//34. קליטת נתונים ממשתמש של אורך ומכפלת המספר ומסדפיסה את המערך.

    public static void multiplyThreeEvensArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] *= 3;
            }
        }
        printArray(array);
    } // 35. מכפיל בשלוש במקומות זוגיים.

    public static boolean risingArray(int[] array) {
        boolean check = true;
        int num = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= num) check = false;
            num = array[i];
        }
        System.out.println(check);
        return check;
    }// 36.בדיקת מערך עולה.

    public static int sumBiggerElementArray(int[] number, int num) {
        int index = -1;
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum += number[i];
            if (sum > num) {
                index = i;
                break;
            }
        }
        System.out.println(index);
        return index;
    }// 37. המיקום שסכום האיברים גדול מהמספר.

    public static int distanceNumFromEdges(int[] number, int num) {
        int indexFromLeft = -1;
        int indexFromRight = -1;
        int counter = 0;
        int distanceNum = num;
        for (int i = 0; i < number.length; i++) {
            if (number[i] == num && counter == 0) {
                indexFromLeft = i;
                counter++;
            } else if (number[i] == num && counter > 0) {
                indexFromRight = i;
                counter++;

            }
        }
        if (counter == 1) {
            distanceNum = indexFromLeft + (number.length - 1 - indexFromLeft);
        } else if (counter > 1) {
            distanceNum = indexFromLeft + (number.length - 1 - indexFromRight);
        }
        System.out.println(distanceNum);
        return distanceNum;

    }// 38. סכום מרחק קצוות ממספר.

    public static int[] summingUpEqualBiggerAndSmallNumbers(int[] number, int num) {
        int smallAmount = 0;
        int biggerAmount = 0;
        int sameAmount = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] > num) {
                biggerAmount++;
            } else if (number[i] < num) {
                smallAmount++;
            } else sameAmount++;
        }
        int[] array = {smallAmount, sameAmount, biggerAmount};
        printArray(array);
        return array;
    }// 40. כמות מספרים קטנים, שווים וגדולים ממספר.

    public static int[] cuttingBetweenArray(int[] numbers1, int[] numbers2) {
        int[] array = new int[numbers1.length];
        int counter = 0;
        int loction = 0;
        for (int i = 0; i < numbers1.length; i++) {
            for (int t = 0; t < numbers2.length; t++) {
                if (numbers1[i] == numbers2[t]) {
                    array[loction] = numbers1[i];
                    loction++;
                    break;
                }
            }
        }
        int[] newArry = new int[loction];
        for (int i = 0; i < newArry.length; i++) {
            newArry[i] = array[i];
        }
        newArry = ramoveDouble(newArry);
        printArray(newArry);
        return newArry;
    } //40.חיתוך של מערכים.

    public static int[] ramoveDouble(int[] array) {
        int counter = 0;
        int num;
        int loction = 0;
        boolean checkDouble = false;
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int t = i + 1; t < array.length; t++) {
                if (array[i] == array[t]) {
                    checkDouble = true;
                    break;
                }
            }
            if (checkDouble) {
                newArray[loction] = array[i];
                array = removeNumInArray(array, array[i]);
                i--;
                loction++;
                checkDouble = false;
            } else {
                newArray[loction] = array[i];
                loction++;
            }
        }
        int[] newArrayFinal = new int[loction];
        for (int i = 0; i < newArrayFinal.length; i++) {
            newArrayFinal[i] = newArray[i];
        }
        return newArrayFinal;

    }//40. מחיקה איברים כפולים.
    public  static int [] removeDup(int [] array){
        int [] newArray = new int[array.length];
        boolean isExist = false;
        int index = 0;
        int counter =0;
        for (int i = 0;i<array.length;i++){
            for (int j=0;j<newArray.length;j++){
                if (array[i]==newArray[j]){
                    isExist =true;
                    break;
                }
            }
            if (!isExist){
                newArray[index]=array[i];
                index++;
                counter++;
            }else {
                isExist =false;
            }
        }
        int [] finalArray = new int[counter];
        for (int i=0;i<finalArray.length;i++){
            finalArray[i]=newArray[i];
        }
        return finalArray;
}

    public static int[] unionBetweenArray(int[] numbers1, int[] numbers2) {
        int[] array = new int[numbers1.length + numbers2.length];
        int location = 0;
        for (int i = 0; i < numbers1.length; i++) {
            array[i] = numbers1[i];
            location = i;
        }
        location++;
        for (int i = 0; i < numbers2.length; i++) {
            array[location] = numbers2[i];
            location++;
        }
        array = ramoveDouble(array);
        printArray(array);
        return array;


    } //41.איחוד של מערכים.

    public static boolean equalValuesArrays(int[] numbers1, int[] numbers2) {

        boolean check = true;
        boolean checkArray1onArray2 = equalValuesArray1InArray2(numbers1, numbers2);
        boolean checkArray2onArray1 = equalValuesArray1InArray2(numbers2, numbers1);


        System.out.println(checkArray1onArray2 && checkArray2onArray1);

        return checkArray1onArray2 && checkArray2onArray1;
    } //42. בדיקה עם מערכים בעלי ערכים שווים.

    public static boolean equalValuesArray1InArray2(int[] numbers1, int[] numbers2) {
        boolean checkSameNum = false;
        boolean check = true;
        for (int i = 0; i < numbers1.length; i++) {
            for (int t = 0; t < numbers2.length; t++) {
                if (numbers1[i] == numbers2[t]) {
                    checkSameNum = true;
                    break;
                }
            }
            if (!checkSameNum) {
                check = false;
                break;
            }
            checkSameNum = false;
        }
        return check;
    }// 42. בוד ערכים שווים של מערך 1 למערך ה 2.

    public static double[] AverageBetweenArrays(int[] numbers1, int[] numbers2) {
        int biggerLength = numbers1.length;
        if (numbers1.length < numbers2.length) biggerLength = numbers2.length;
        double[] newArray = new double[biggerLength];
        for (int i = 0; i < biggerLength; i++) {
            if (i >= numbers1.length) {
                newArray[i] = (double) (numbers2[i]) / 2;
            } else if (i >= numbers2.length) {
                newArray[i] = (double) (numbers1[i]) / 2;
            } else newArray[i] = (double) (numbers2[i] + numbers1[i]) / 2;
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + ",");
        }
        return newArray;
    }//43. ממוצע בין ערכי מערכים.

    public static int[] rightMove(int[] arrayint) {//שאלה 4
        int[] newArrayInt = new int[arrayint.length];
        newArrayInt[0] = arrayint[arrayint.length - 1];
        for (int i = 1; i < arrayint.length; i++) {
            newArrayInt[i] = arrayint[i - 1];
        }
        return newArrayInt;
    } //44. הזזה מערך ימינה.

    public static int[] leftMove(int[] arrayint) {//צריך לסיים שאלה 4
        int[] newArrayInt = new int[arrayint.length];
        newArrayInt[arrayint.length - 1] = arrayint[0];
        for (int i = 0; i < arrayint.length - 1; i++) {
            newArrayInt[i] = arrayint[i + 1];
        }
        //{5,1,9,7,2}{1,9,7,2,5}
        return newArrayInt;
    }// 44. הזזה מערך שמאלה.

    public static int[] shift(int[] array, boolean left, int shifts) {
        for (int i = 0; i < shifts; i++) {
            if (left) {
                array = leftMove(array);
            } else {
                array = rightMove(array);
            }
        }
        printArray(array);
        return array;
    }//45. הזזת מערך על ידי נתונים.

    public static int[] digitsWithinAnArrayDigits(int[] numbers) {
        int[] newArray = new int[10];
        for (int i = 0; i < newArray.length; i++) {
            int num = i;
            int counter = 0;
            for (int t = 0; t < numbers.length; t++) {
                int numFromNumber = numbers[t];
                if (numFromNumber < 0) numFromNumber *= -1;
                if (num == 0 && numFromNumber == 0) counter++;
                while (numFromNumber > 0) {
                    if (numFromNumber % 10 == num) counter++;
                    numFromNumber /= 10;
                }
            }
            newArray[i] = counter;
        }
        printArray(newArray);
        return newArray;
    }//45. כמות ספרות במערך של מספרים.

    public static int removeNumFromNumber(int number, int num) {
        int newNum = 0;
        while (number > 0) {
            if (number % 10 != num) {
                newNum += number % 10;
                newNum *= 10;
            }
            number /= 10;
        }
        newNum /= 10;
        newNum = turnNumber(newNum);
        System.out.println(newNum);
        return newNum;
    }//46. הסרת ספרה ממספר.

    public static int turnNumber(int number) {
        int newNum = 0;
        while (number > 0) {
            newNum += number % 10;
            newNum *= 10;
            number /= 10;
        }
        newNum /= 10;
        return newNum;
    } //46. הפיכת מספר.

}
