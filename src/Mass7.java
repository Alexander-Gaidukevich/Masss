/**
 * 1. найти сумму серединного и последнег элемента массива.
 * 2. создать 2 массива размерностью 10 и перемножить элементы, найти сумму всех элементов двух массивов
 * найти элементы кратные 6
 */
public class Mass7 {
    public static void main(String[] args) {
        double[] mass1 = new double[]{2, 4, 6, 9, 2, 4, 12, 5, 8, 1, 7, -5, -7};
        double[] mass2 = new double[]{2, 1, 3, 6, 5, 5, 7, 9, 4, 8, -5, -7};

//        int sered = mass1.length / 2;
//        double summaSP = mass1[sered] + mass1[mass1.length - 1];
//        System.out.println("Сумма серединного и последнего элемента массива = " + summaSP);
//
//        int sered2 = mass2.length / 2;
//        double summaSP2 = sered2 + mass2[mass2.length - 1];
//        System.out.println("Сумма серединного и последнего элемента массива = " + summaSP2);
//
//        double mult1 = 0;
//        double summa1 = 0;
//        for (int i = 0; i < mass1.length; i++) {
//
//            mult1 = mass1[i] * mass1[i];
//            summa1 = summa1 + mass1[i];
//        }
//        System.out.println("Перемноженные элементы первого массива = " + mult1);
//        System.out.println("Сумма первого массива = " + summa1);

        double mult2 = 1;
        double summa2 = 0;
        for (int i = 0; i < mass2.length; i++) {

            mult2 = mult2 * (mass1[i] * mass2[i]);
            summa2 = summa2 + (mass1[i] + mass2[i]);
        }
        System.out.println("Перемноженные элементы второго массива = " + mult2);
        System.out.println("Сумма второго массива = " + summa2);

//        double summaOb = 0;
//        summaOb = summa1 + summa2;
//        System.out.println("Сумма всех элементов двух массивов = " + summaOb);

        for (int i = 0; i < mass1.length; i++) {
            if (mass1[i] % 6 == 0)
                System.out.println("Элементы кратные 6 = " + mass1[i]);
        }
    }
}
