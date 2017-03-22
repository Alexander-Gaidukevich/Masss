/**
 */
public class Mass10 {
    public static void main(String[] args) {
        double mass[] = {3, 4, 5, 7, 8, 6, 10, 2, 15, 17, 12};

        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > 10) {
                mass[i] = mass[i] * 2;
            } else {
                mass[i] = mass[i] * 3;
            }
            System.out.println(mass[i]);
        }
    }
}
