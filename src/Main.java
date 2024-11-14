import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("Tableau");
        Random rand = new Random();
        int[] tab = rand.ints(1, 90).limit(5).toArray();
        int[] tab2 = tab.clone();

        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + "; ");
        }


        System.out.println("\n\nClassement Partiel");
        int buffer = 0;
        for (int i = 0; i < tab.length - 1; i++) {
            if (tab[i] > tab[i + 1]) {
                buffer = tab[i];
                tab[i] = tab[i + 1];
                tab[i + 1] = buffer;
            }
        }
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + "; ");
        }


        System.out.println("\n\nClassement total");
        for (int j = 0; j < tab.length; j++) {
            for (int i = 0; i < tab.length - 1; i++) {
                if (tab[i] > tab[i + 1]) {
                    buffer = tab[i];
                    tab[i] = tab[i + 1];
                    tab[i + 1] = buffer;
                }
            }
        }
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + "; ");
        }


        System.out.println("\n\nClassement décroissant");
        for (int j = 0; j < tab.length; j++) {
            for (int i = 0; i < tab.length - 1; i++) {
                if (tab[i] < tab[i + 1]) {
                    buffer = tab[i];
                    tab[i] = tab[i + 1];
                    tab[i + 1] = buffer;
                }
            }
        }
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + "; ");
        }


        System.out.println("\n\nClassement direct");

        for (int j = 0; j < tab2.length; j++) {

            for (int k = 0; k < j; k++) {

               if (tab2[k] > tab2[k + 1]) {
                   System.out.print("\u001B[32m" + tab2[k] + "; " + tab2[k+1] + "; ");
               }
                System.out.print("\u001B[0m" + tab2[k] + "; ");


               /* if (k > tab2.length - j ) {
                    System.out.print("\u001B[32m" + tab2[k] + "; ");
                }else{
                    System.out.print("\u001B[0m" + tab2[k] + "; ");
                }

                */
            }

            for (int i = 0; i < tab2.length - 1; i++) {
                if (tab2[i] > tab2[i + 1]) {
                    buffer = tab2[i];
                    tab2[i] = tab2[i + 1];
                    tab2[i + 1] = buffer;
                }
            }
        }
    }
}
