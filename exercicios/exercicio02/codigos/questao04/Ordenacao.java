package questao04;


import java.util.Arrays;
import java.util.Random;

public class Ordenacao {
    public void ordenar(int[] array) {
        Arrays.sort(array);
        }
    public void embaralhar(int[] array) {
         Random random = new Random();
         for (int i = array.length - 1; i>0; i--){
            int j = random.nextInt( i + 1);
            int temp = array[i];
            array[i]=array[i];
            array[j]=temp;
         }
        }
}
