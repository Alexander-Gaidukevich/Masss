/**

 */
public class Mass9 {
    public static void main(String[] args) {
        double mass[] = {2, 1, 5, 7, 3, 8, 9, 12, 14, 7, -8, -2};
        double summ = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] % 4 == 0)
                summ = summ + mass[i];
        }
        System.out.println(summ);
        double sum = 0;
        for (int i = 0; i < mass.length; i++){
            if (mass[i] % 7 == 0)
                sum = sum + mass[i];
        }
        System.out.println(sum);
    }
}
