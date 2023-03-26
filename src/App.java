import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o tamanho da primeira lista?");
        int sizeArray1 = sc.nextInt();

        System.out.println("Qual o tamanho da segunda lista?");
        int sizeArray2 = sc.nextInt();

        String[] array1 = new String[sizeArray1];
        String[] array2 = new String[sizeArray2];
        List<String> result = new ArrayList<>();

        for (int i = 0; i < sizeArray1; i++) {
            System.out.println("Qual o valor de posição " + (i + 1) + " da primeira lista?");
            String valueArray1 = sc.next();
            array1[i] = valueArray1;
        }

        for (int i = 0; i < sizeArray2; i++) {
            System.out.println("Qual o valor de posição " + (i + 1) + " da segunda lista?");
            String valueArray2 = sc.next();
            array2[i] = valueArray2;
            for (int j = 0; j < sizeArray1; j++) {
                if (array2[i].equals(array1[j])) {
                    result.add(array2[i]);
                }
            }
        }
        System.out.println("Valores em comum nas duas listas: " + result);
    }
}
