import java.util.Arrays;

public class ElemanlarinFrekansi {

    static boolean isFind (int [] diz, int value){
        for (int i : diz){
            if (i == value){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int [] list = {10, 20, 20, 10, 10, 20, 5, 20};
        System.out.println("Dizi: " + Arrays.toString(list));
        System.out.println("Tekrar Sayıları");
        int [] list2 = new int[list.length];
        int startIndex = 0;
        int counter = 1;

        for (int i = 0; i < list.length; i++){
            if (isFind(list2, list[i])){
                for (int j = 0; j < list.length; j++){
                    if ((i != j) && list[i] == list[j]){
                        counter++;
                    }
                }
            }
            if (isFind(list2, list[i])){
                list2[startIndex++] = list[i];
                System.out.println(list[i] + " sayısı " + counter + " kere tekrar edildi.");
            }
            counter = 1;
        }

    }

}
