/**

 */
public class Mass8 {
    public static void main(String[] args) {
        double mass[] = {1, 5, 2, 7, 4, 8, 9, -8, 6};
        double max = mass[0];
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > max) {
                max = mass[i];
            }
        }
        System.out.println(max);
        double min = mass[0];
        for (int i = 0; i < mass.length; i++) {
            if (min > mass[i]) {
                min = mass[i];
            }
        }
        System.out.println(min);
        double summ = max + min;
        System.out.println(summ);
    }
}
