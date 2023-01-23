public class ExercisesFromInternet {
    public static void main(String[] arg) {
      int [] array={23, -2, 45, 38, 12, 4, 6};

        //checkRisingSeriesInArray(array);// תרגיל 76 בדיקה עם מערך יכול להיות מערך עולה.
        //calculateLargestGapBetweenSortedElements(array);// תרגיל 75 לסדר מערך ולעשות סדר עולה

    }
    public static boolean checkRisingSeriesInArray(int []array){
       int minNum= minNumInAraay(array);
        int maxNum= maxNumInAraay(array);
        boolean check;
        int counter;
        int location=0;
        do{
            check=false;
            counter=0;
            for(int i=0;i<array.length;i++) {
                if (array[i] == minNum + 1) {
                    location = i;
                    check = true;
                    counter++;
                }
            }
            if(counter>1){
                check=false;
            }else minNum = array[location];

        }while ((minNum!=maxNum)&&check);

        if(check && minNum==maxNum){
            check=true;
        }else check=false;
        System.out.println(check);
        return check;

        }//76
    public static int minNumInAraay(int []array){
        int min=array[0];
        for(int i=0;i<array.length;i++){
            if(min>array[i])min=array[i];
        }
        return min;
    }//76
    public static int maxNumInAraay(int []array){
        int max=array[0];
        for(int i=0;i<array.length;i++){
            if(max<array[i])max=array[i];
        }
        return max;
    }//76

    public static int calculateLargestGapBetweenSortedElements(int [] numbers) {
        numbers=arraygoesUpFine(numbers);
        int maxDifference=0;
        for(int i=0;i<numbers.length-1;i++){
            if(numbers[i+1]-numbers[i]>maxDifference)maxDifference=numbers[i+1]-numbers[i];
        }
        System.out.println(maxDifference);
        return maxDifference;
    } //תרגיל 75 לחשב הפרשים המערך עולה
    public static int [] arraygoesUpFine(int [] numbers) {
        int[] newArray = new int[numbers.length];
        for (int t = 0; t < newArray.length; t++) {
            int minNum=minNumInAraay(numbers);
            newArray[t] = minNum;
            numbers=removeNum(numbers,minNum);
        }
        return newArray;
    }// מערך עולה
    public static int [] removeNum(int [] numbers,int num){
        int counter=0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==num)counter++;
        }
        int [] newArray=new int[numbers.length-counter];
        int location=0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]!=num){
                newArray[location]=numbers[i];
                location++;
            }
        }
        return newArray;
    } // להסיר מספר ממערך


    }