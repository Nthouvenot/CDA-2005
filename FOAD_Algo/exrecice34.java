package crm.algorithme.exercices;

public class exrecice34 {
    public static void main(String[] args) {
        int i2=0, tableauEntier[] = {5, 21, 3, 12, 4, 36, 54, 22};
        for(int i = 0; i < tableauEntier.length; i++) {
            while(tableauEntier[i2] < tableauEntier.length && tableauEntier[i] > tableauEntier[i2]) {
                int tmpCase;
                tmpCase = tableauEntier[i2];
                tableauEntier[i2] = tableauEntier[i];
                tableauEntier[i2] = tmpCase;
                i2++;
            }

        }
    }
}
