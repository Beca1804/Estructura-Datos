package SecondPartial;

public class LinealSearch {
    public static int seacrhNumber (int num){

        int[] radomNumbers= {10,9,8,7,6,5,4,3,2,1};

        for (int index = 0; index < radomNumbers.length; index++) {
            if (radomNumbers[index] == num) {
                return index;
            }
        }
        return -1;
    }


    
}
