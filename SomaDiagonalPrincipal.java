import java.util.Scanner;
public class SomaDiagonalPrincipal {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int [][] m =  {
            {1, 2, 3, 4,},
            {2, 3, 4, 5,},
            {3, 4, 5, 6,},
            {4, 5, 6, 7,}};

        for ( int i = 0; i < m.length; i++){
            for ( int j = 0; j < m[i].length; j++){
                System.out.print("[" + m[i][j] + "]");
            }
            System.out.println();
        }

        int soma = 0;
        for ( int i = 0; i < m.length; i++){
            for ( int j = 0; j < m[i].length;j++){
                if ( i == j){
                soma = soma + m[i][j];
                }
            }
        }
        System.out.println("soma dos elementos abaixo da diag principal: " + soma);
    }
}
