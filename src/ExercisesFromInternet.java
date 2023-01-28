import java.util.Scanner;

public class ExercisesFromInternet {
    public static void main(String[] arg) {
        int[] array = {1,3,4,5,7,9,4,2,0};

        //checkRisingSeriesInArray(array);// תרגיל 76 בדיקה עם מערך יכול להיות מערך עולה.
        //calculateLargestGapBetweenSortedElements(array);// תרגיל 75 לסדר מערך ולעשות סדר עולה
        //arrayArrangement(array);
       // biggerAvgNumber();
        //phoneNumber();
        //arrayWithoutDuplication(array);
        ascendingDescendingArray(array);

    }

    public static boolean checkRisingSeriesInArray(int[] array) {
        int minNum = minNumInAraay(array);
        int maxNum = maxNumInAraay(array);
        boolean check;
        int counter;
        int location = 0;
        do {
            check = false;
            counter = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == minNum + 1) {
                    location = i;
                    check = true;
                    counter++;
                }
            }
            if (counter > 1) {
                check = false;
            } else minNum = array[location];

        } while ((minNum != maxNum) && check);

        if (check && minNum == maxNum) {
            check = true;
        } else check = false;
        System.out.println(check);
        return check;

    }//76

    public static int minNumInAraay(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) min = array[i];
        }
        return min;
    }//76

    public static int maxNumInAraay(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) max = array[i];
        }
        return max;
    }//76

    public static int calculateLargestGapBetweenSortedElements(int[] numbers) {
        numbers = arraygoesUpFine(numbers);
        int maxDifference = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i + 1] - numbers[i] > maxDifference) maxDifference = numbers[i + 1] - numbers[i];
        }
        System.out.println(maxDifference);
        return maxDifference;
    } //תרגיל 75 לחשב הפרשים המערך עולה

    public static int[] arraygoesUpFine(int[] numbers) {
        int[] newArray = new int[numbers.length];
        for (int t = 0; t < newArray.length; t++) {
            int minNum = minNumInAraay(numbers);
            newArray[t] = minNum;
            numbers = removeNum(numbers, minNum);
        }
        return newArray;
    }// מערך עולה

    public static int[] removeNum(int[] numbers, int num) {
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == num) counter++;
        }
        int[] newArray = new int[numbers.length - counter];
        int location = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != num) {
                newArray[location] = numbers[i];
                location++;
            }
        }
        return newArray;
    } // להסיר מספר ממערך

    public static int[] arrayArrangement(int[] numbers) {
        do {
            for (int i = 0; i < numbers.length - 1; i++) {
                int num = numbers[i];
                if (num > numbers[i + 1]) {
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = num;
                }
            }
        } while (!checkArrayArrangement(numbers));
        printArray(numbers);
        return numbers;
    }//סידור מערך בסדר עולה.

    public static boolean checkArrayArrangement(int[] numbers) {
        Boolean check = true;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                check = false;
            }
        }
        return check;
    }// בדיקת מערך עולה.

    public static void printArray(int[] number) {
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + ",");
        }
    }// 34. הדפסת מערך.

    public static void biggerAvgNumber() {
        Scanner scanner = new Scanner(System.in);
        int[] numberUser = new int[10];
        int sum = 0;
        for (int i = 0; i < numberUser.length; i++) {
            System.out.println("Insert your " + (i + 1) + " number: ");
            numberUser[i] = scanner.nextInt();
            sum += numberUser[i];
        }
        double avgSim = (double) sum / 10;
        for (int i = 0; i < numberUser.length; i++) {
            if (numberUser[i] > avgSim) {
                System.out.print(numberUser[i] + ",");
            }
        }

    }
    public static String phoneNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your phone number");
       String numberPhone=scanner.nextLine();
       String newPhoneNumber="";
       if(numberPhone.length()==10 && numberPhone.charAt(0)=='0'&&numberPhone.charAt(1)=='5'){
           newPhoneNumber="05"+numberPhone.charAt(2)+"-"+numberPhone.substring(3);
       }
        if(numberPhone.length()==11 && numberPhone.charAt(0)=='0'&&numberPhone.charAt(1)=='5'&&numberPhone.charAt(3)=='-'){
            newPhoneNumber=numberPhone;
        }
        if(numberPhone.indexOf("972")==0&&numberPhone.indexOf("5")==3&&numberPhone.length()==12){
            newPhoneNumber="05"+numberPhone.charAt(4)+"-"+numberPhone.substring(5);
        }
        System.out.println(newPhoneNumber);
        return newPhoneNumber;

    }
    public static int[] arrayWithoutDuplication(int [] numbers){
        int [] newNumbers=new int[numbers.length];
        int counter=0;
        boolean check=false;
        for(int i=0;i<numbers.length-1;i++){
            check=false;
            for(int t=i+1;t<numbers.length;t++){
                if(numbers[i]==numbers[t]){
                    check=true;
                    break;
                }
            }
            if(!check){
                newNumbers[counter]=numbers[i];
                counter++;
            }

        }
        int [] arrayWithoutDuplication=new int[counter+1];
        for(int i=0;i<arrayWithoutDuplication.length;i++){
            arrayWithoutDuplication[i]=newNumbers[i];
        }
        printArray(arrayWithoutDuplication);
        return arrayWithoutDuplication;
    }
    public static int ascendingDescendingArray(int [] array){
        int index=-1;
        boolean checkUp=true;
        int maxNum=array[0];
        int counterUp=0;
        int counterDown=0;
        boolean checkDowm=true;
        for(int i=0;i<array.length-1;i++) {
            if (checkUp) {
                if (array[i] < array[i + 1]) {
                    index = i;
                    counterUp++;
                } else {
                    checkUp = false;
                    for (int t=i;t<array.length-1;t++){
                        if(array[t]>array[t+1]){
                            counterDown++;
                        }else checkDowm=false;
                    }

                }
            }
        }
        if(!checkDowm){
            index=-1;
        }else index++;
        System.out.println(index);
        return index;
        }
    }
