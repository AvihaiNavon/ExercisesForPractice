import java.util.Random;
import java.util.Scanner;

public class TargolClass {
    public static void main(String[] arg) {
        //int[] numbers1 = {0, 0, 2, 10, 12, 0, 0, 0, 22, 24, 12, 4, 0, 9, 0, 9, 15, 0, 0, 9, 0, 6, 0};
       int[] numbers2 = {1,2,3,6,9,8,9,10,11,12};
        //sequenceOfIdenticalValues(numbers1, 2);// שאלה 1 א
        //biggerSumOfIdenticalValues(numbers1);//שאלה 1 ב
        // operationsAccount(1,5,7,7);//שאלה 2
        //coclation("6-1*4");//שאלה 3
        // family(numbers1,numbers2);//שאלה 5
        //arrayOrder(numbers1);//שאלה 6
        //String [] names={"AfdsfBA","FSAfesadqeERT","eRwSssSeR"};
        // poldrom(names);//שאלה 7
        //checkPoldromExtra("Race Car");
        //double[] numbersDouble = {33.234,32,156.234,5};
        // arrayDouble(numbersDouble);//שאלה 4
        //maxSumTwo(numbers2);
       // howMantSeq(numbers1);
        //howMantSeqq(numbers1);
        //rowsEqualASquareMatrix(numbers2);
        //deleteANum(2432572,2);
        //password("dsgsgasd1$");
        //reverseLetters("Hello");
        //char [] letter={'I','A','T','C','N'};
        //amountChar("I want it, I got it",letter);
        //String [] names={"Variables","Conditions","Loops","Arrays","Strings"};
        //findCharInArray(names,'a');
        //user();
        //letterInText("i want it, i got it");
        //diamond();
        //diamond2();
        //primeNumbers();
        //pibonachi();
       // pibonachi2();
        //narkisisti(153);
        //missingNumber(1234678);
        //arrayOrders(numbers2);
        Scanner scanner=new Scanner(System.in);
        char a=scanner.next().charAt(0);
        System.out.println(a);


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

    public static boolean checkPoldromExtra(String text) {
        String newName = "";
        text = text.toLowerCase();
        for (int i = text.length() - 1; i > -1; i--) {
            if (text.charAt(i) > 'a' && text.charAt(i) < 'z') {
                newName += text.charAt(i);
            }
        }
        String newText = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) > 'a' && text.charAt(i) < 'z') {
                newText += text.charAt(i);
            }
        }
        System.out.println(newText.equals(newName));
        return newText.equals(newName);
    }

    public static int maxSumTwo(int[] arrayNum) {
        int sum = arrayNum[0] + arrayNum[1];
        for (int i = 1; i < arrayNum.length - 1; i++) {
            if (arrayNum[i] + arrayNum[i + 1] > sum) {
                sum = arrayNum[i] + arrayNum[i + 1];
            }
        }
        System.out.println(sum);
        return sum;
    }
    public static int howMantSeqq(int[] numbers) {
        int counter=0;
        int countSum=0;
        for (int i=0;i<numbers.length;i++){
            if(numbers[i]!=0){
                counter++;
            }else if(counter>1){
                countSum++;
                counter=0;

            }else counter=0;
        }
        System.out.println(countSum);
        return countSum;

    }

    public static int howMantSeq(int[] numbers) {
        int counter = 0;
        int counterRain=0;
        int sum;
        boolean check=false;
        for (int i = 0; i < numbers.length; i++) {
            while (numbers[i] != 0) {
                check = true;
                counterRain++;
                i++;
            }

            if (check&&counterRain>1) {
                counter++;
                i--;
            }
            check = false;
            counterRain=0;
        }
        System.out.println(counter);
        return counter;
    }
    public static boolean rowsEqualASquareMatrix(int [] array){
        int rows= (int) Math.sqrt(array.length);
        int sum=0;
        int index=0;
        int sumRows=0;
        boolean check=false;
        for (int j=0;j<rows;j++){
            sumRows+=array[j];
        }
        for (int i=0;i<rows;i++){
            for (int t=0;t<rows;t++){
                sum+=array[index];
                index++;
            }
            if(sum==sumRows){
                check=true;
                sum=0;
            }else check=false;
        }
        System.out.println(check);
        return check;
    }
    public static int deleteANum(int number,int num){
        int newNum=0;
        while (number>0){
            if(number%10!=num){
                newNum+=(number%10);
                newNum*=10;
            }
            number/=10;
        }
        newNum/=10;
        int finalNum=0;
        while (newNum>0){
                finalNum+=(newNum%10);
            finalNum*=10;
            newNum/=10;
            }

        finalNum/=10;
        System.out.println(finalNum);
        return newNum;
    }
    public static boolean password(String password){
        boolean checkNum=false;
        boolean checkChar=false;
        if(password.length()>=8&&password.length()<=10){
            for (int i=0;i<password.length();i++) {
                if (password.charAt(i) >= '0' && password.charAt(i) <= '9') {
                    checkNum = true;
                } else if (password.charAt(i) == '%' || password.charAt(i) == '$' || password.charAt(i) == '_') {
                    checkChar = true;
                }

                if (checkChar && checkNum) {
                    break;
                }
            }
        }
        System.out.println((checkChar && checkNum));
        return (checkChar && checkNum);
    }
    public static String reverseLetters(String name){
        String newName="";
        for(int i=name.length()-1;i>-1;i--){
            newName+=name.charAt(i);
        }

        System.out.println(newName);
        return newName;
    }
    public static char amountChar(String text,char[]letters){
        int counter=0;
        text=text.toUpperCase();
        int bigCounter=0;
        char letter='_';
        for(int i=0;i<letters.length;i++){
            for(int t=0;t<text.length();t++){
                if(text.charAt(t)==letters[i])counter++;
            }
            if(counter>bigCounter){
                bigCounter=counter;
                letter=letters[i];
            }
            counter=0;
        }
        System.out.println(letter);
        return letter;
    }
    public static String [] findCharInArray(String[]texts,char x){
        boolean checkCharInText=false;
        String [] newTexts=new String[texts.length];
        int location=0;
        String [] finelTexts=null;;
        for(int i=0;i<texts.length;i++) {
            for (int t = 0; t < texts[i].length(); t++) {
                if (texts[i].charAt(t) == x) {
                    checkCharInText = true;
                    break;
                }
            }
            if (checkCharInText) {
                newTexts[location] = texts[i];
                checkCharInText = false;
                location++;
            }
        }
             finelTexts=new String[location];
            for(int j=0;j<finelTexts.length;j++){
                finelTexts[j]=newTexts[j];
                System.out.println(finelTexts[j]);
            }


        return finelTexts;
    }
    public static void user(){
        Scanner scanner=new Scanner(System.in);
        boolean checkUserName=true;
        String password;
        String userName;
        do {
            do {
                System.out.println("Insert your user name:");
                userName = scanner.nextLine();
                for (int i = 0; i < userName.length(); i++) {
                    if (userName.charAt(i) == '*') {
                        checkUserName = false;
                        break;
                    } else checkUserName = true;
                }
            } while (!checkUserName);
            do {
                System.out.println("Insert your password: ");
                password = scanner.nextLine();
            } while (!password(password));
        }while (password.equals(userName));
        System.out.println("success");
    }
    public static String letterInText(String text){
        String [] newText=text.split(" ");
        String firstLetter="";
        boolean check=true;
        for(int i=0;i<newText.length;i++){
            for(int t=0;t<firstLetter.length();t++){
                if(newText[i].charAt(0)==firstLetter.charAt(t)){
                    check=false;

                }
            }
            if(check){
                firstLetter+=newText[i].charAt(0);
            }
            check=true;
        }
        System.out.println(firstLetter);
        return firstLetter;
    }
    public static void diamond(){
        Scanner scanner = new Scanner(System.in);
        int numUser;
        do {
            System.out.println("Enter an odd number greater than 3");
            numUser=scanner.nextInt();
        }while (!(numUser>3&&numUser%2==1));
        boolean check=true;

        int num1=numUser/2;
        int num2=numUser-num1-num1;
        for(int i=0;i<numUser;i++){
            printRowsDiamond(num1,' ');
            printRowsDiamond(num2,'*');
            printRowsDiamond(num1,' ');
            System.out.println();
            if(check) {
                num1 -= 1;
                num2 += 2;
            }else {
                num1 += 1;
                num2 -= 2;
            }
            if(num1==0)check=false;
        }
    }
    public static void diamond2(){
        Scanner scanner = new Scanner(System.in);
        int numUser;
        do {
            System.out.println("Enter an odd number greater than 3");
            numUser=scanner.nextInt();
        }while (!(numUser>3&&numUser%2==1));
        boolean check=true;

        for (int i = 1; i <= numUser; i += 2) { //loop for rows
            for (int j = 1; j <= i; j++) { //loop for prints
                if(j==1){
                    for(int k=i; k<=numUser; k+=2){ //loop for spaces
                        System.out.print(" ");}
                }
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = numUser-2; i >= 1; i -=2) { //loop for rows in the opposite order
            for (int j = i; j >= 1; j--) { //loop for prints in the opposite order
                if(j==i){
                    for(int k=i; k<=numUser; k+=2){ //loop for spaces in the opposite order
                        System.out.print(" ");}
                }
                System.out.print("*");
            }
            System.out.println(" ");
 }
}


    public static void printRowsDiamond(int num,char diamondRows) {
        for (int i = 0; i < num; i++) {
            System.out.print(diamondRows);
        }
    }
    public static void primeNumbers(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Insert your numbers you want:");
        int number=scanner.nextInt();
        boolean check;
        System.out.print("2,");
        int numbers=3;
        for (int i=1;i<number;i++){
            check=true;
            for(int t=2;t<numbers;t++){
                if(numbers%t==0) {
                    check = false;
                    break;
                }
            }
            if(check){
                System.out.print(numbers+",");
            }else i--;
            numbers++;
        }
    }
    public static boolean pibonachi (){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Insert your number");
        int number=scanner.nextInt();
        int firstNumber=0;
        int secondNumber=1;
        int result;
        int newNum=1;
        int newResult=0;
        int counter=0;

        do{
            result=firstNumber+secondNumber;
            newResult=result;
            while (newResult>0){
                counter++;
                newResult/=10;
            }
            newNum*=(Math.pow(10,counter));
            newNum+=result;
            firstNumber=secondNumber;
            secondNumber=result;
            counter=0;

        }while (newNum<number);
        System.out.println(newNum==number);
        return newNum==number;

    }
    public static void pibonachi2() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int tempSum = 0;
        int firstNumber = 0;
        int secondNumber = 1;
        System.out.println("Enter a number");
        number = scanner.nextInt();
        if ((number == 0) || (number == 1)) {
            System.out.println("This is fib");
        } else {
            do {
                tempSum = firstNumber + secondNumber;
                firstNumber = secondNumber;
                secondNumber = tempSum;
            }
            while (tempSum < number);
            if (tempSum > number) {
                System.out.println("This is not fib");
            } else {
                System.out.println("This is fib");
            }
        }
    }
    public static boolean narkisisti(int num){
        int newNum=num;
        int counter=0;
        while (newNum>0){
            counter++;
            newNum/=10;
        }
        newNum=num;
        int sum=0;
        while (newNum>0){
            sum+=Math.pow((newNum%10),counter);
            newNum/=10;
        }
        System.out.println(sum==num);
        return sum==num;
    }
    public static int missingNumber(int num){
        int numMisiing=0;
        while (num>0){
            if(num%10!=(num/10)%10+1){
                numMisiing=num%10-1;
                break;
            }
            num/=10;
        }
        System.out.println(numMisiing);
        return numMisiing;
    }
    public static int [] arrayOrders(int [] array){
        int counter=0;
        for(int i=0;i<array.length;i++){
            for(int t=i+1;t<array.length;t++){
                if(array[i]==array[t]&&array[i]!=0){
                    array[t]=0;
                    counter++;
                }
            }
        }
        for (int i=0;i<array.length-counter;i++){
            if(array[i]==0) {
                for (int t = i + 1; t < array.length; t++) {
                    if(array[t]!=0){
                        array[i]=array[t];
                        array[t]=0;
                        break;
                    }
                }
            }
            System.out.print(array[i]);
        }
        return array;

    }
    public static int mostArrayFollowers(int [] numbers){
        int mostCounter=0;
        int counter=1;
        for(int i=0;i<numbers.length-1;i++){
            if(numbers[i]==numbers[i+1]-1){
                counter++;
            }else {
                if(counter>mostCounter) {
                    mostCounter = counter;
                }
                    counter=1;
                }
            }
        if(counter>mostCounter) {
            mostCounter = counter;
        }
        System.out.println(mostCounter);
        return mostCounter;
        }



    }



