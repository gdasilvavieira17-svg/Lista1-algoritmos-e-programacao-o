void main() {
    Random random = new Random();
    int[] numeros = new int[1000];
    ArrayList<Integer> numerosPares = new ArrayList<>();
    ArrayList<Integer> numerosImpares = new ArrayList<>();
    ArrayList<Integer> divisiveisPorCinco = new ArrayList<>();
    int numerotemp;
    int contador = 0;

    for (int i = 0; i < numeros.length; i++){
        numerotemp = random.nextInt(1000) + 1;
        numeros[i] = numerotemp;
        contador++;
        System.out.print(numeros[i] + " ");
        if (contador % 20 == 0) {
            System.out.println();
        }
    }
    System.out.println("Os numeros pares sao: ");
    for (int i = 0; i < numeros.length; i++){
        if (numeros[i] % 2 == 0){
            numerosPares.add(numeros[i]);
        }
    }
    for (int pares: numerosPares) {
        System.out.print(pares + " ");
        contador++;
        if (contador % 20 == 0){
            System.out.println();
        }

    }
    System.out.println("\nExistem " + numerosPares.size() + " numeros pares");
    System.out.println("\nOs numeros impares sao: ");
    for (int i = 0; i < numeros.length; i++) {
        if (numeros[i] % 2 != 0){
            numerosImpares.add(numeros[i]);
        }
    }
    for (int impares: numerosImpares) {
        System.out.print(impares + " ");
        contador++;
        if (contador % 20 == 0){
            System.out.println();
        }
    }
    System.out.println("\nExistem " + numerosImpares.size() + " numeros impares");

    for (int i = 0; i < numeros.length; i++) {
        if (numeros[i] % 5 == 0){
           divisiveisPorCinco.add(numeros[i]);
        }
    }
    System.out.println("\nOs numeros divisiveis por cinco sao: ");
    for (int cinco: divisiveisPorCinco){
        System.out.print(cinco + " ");
        contador++;
        if (contador % 20 == 0){
            System.out.println();
        }
    }
}
