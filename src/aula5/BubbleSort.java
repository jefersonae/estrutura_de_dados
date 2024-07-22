package aula5;

public class BubbleSort {
    public static void bubble(int[] n){
        for (int i = 0; i < n.length ;i++){
            for (int j = i + 1; j < n.length;j++){
                if (n[i] > n[j]){
                    int temp = n[j];
                    n[j] = n[i];
                    n[i] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] test = {2,3,10,1};

        bubble(test);

        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i] + " / ");
        }
    }
}
