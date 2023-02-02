package src.arrays;

public class transpoze {
    public static void main(String[] args) {
        int[][] matris = {{2,3,4},{5,6,7}};
        int[][] transpoze = new int[3][2];
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                transpoze[j][i] = matris[i][j];
            }
        }
        System.out.println("Matris :");

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                System.out.print(matris[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Transpoze :");

        for (int i = 0; i < transpoze.length; i++) {
            for (int j = 0; j < transpoze[0].length; j++) {
                System.out.print(transpoze[i][j]+" ");
            }
            System.out.println();
        }
    }
}
