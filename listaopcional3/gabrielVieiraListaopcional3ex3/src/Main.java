void main(String[] args) {
    Random aleatorio = new Random();
    Scanner input = new Scanner(System.in);
    int[] listaA = new int[30];
    int[] listaB = new int[30];
    int numerosA;
    int numerosB;
    boolean numeroExiste = false;
    for (int i = 0; i < listaA.length; i++) {
        numerosA = aleatorio.nextInt(0, 100) ;
        numerosB = aleatorio.nextInt(0, 100) ;
        listaA[i] = numerosA;
        listaB[i] = numerosB;
    }
    System.out.println("Escolha um numero");
    int numeroEscolhido = input.nextInt();


    for (int i = 0; i < listaA.length; i++) {
        if (numeroEscolhido == listaA[i]){
            numeroExiste = true;
        }
        if (numeroExiste){
            System.out.println("O numero digitado está na posição: " + (i+1) + " na lista A");
            System.out.println("O número correspondente a posição desse numero na lista B é: " + listaB[i]);
            break;
        }

    }
    System.out.println("O número nao foi encontrado na lista");




}
