package edu.busca.buscaBinaria;

public class BuscaBinaria {

    public static void main(String[] args) {
        
        int [] numeros = {2,3,6,9,10};

        System.out.println(buscaBinaria(numeros, 10));
    }

    public static int buscaBinaria(int [] numeros, int item){

        int baixo = 0;
        int alto = numeros.length - 1;

        while (baixo <= alto) {
            
            int meio = (baixo + alto) / 2;
            int chute = numeros[meio];

            if(chute == item){
                return meio;
            } else if (chute > item){
                alto = meio - 1;
            } else {
                baixo = meio + 1;
            }
        }

        return -1;
    }
}
