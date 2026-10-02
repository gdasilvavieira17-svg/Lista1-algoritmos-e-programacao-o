void main() {
    Scanner input = new Scanner(System.in);
    int numeroSecreto = 67;
    int numeroDigitado = 0;
    int tentativas = 0;
    ArrayList<Integer> numerosDigitados = new ArrayList<>();
    System.out.println("JOGO DE ADIVINHAÇÂO \nTENTE ADIVINHAR O NUMERO SECRETO");
    do {
        System.out.print("Digite aqui sua tentativa: ");
        numeroDigitado = input.nextInt();
        numerosDigitados.add(numeroDigitado);
        if (numeroDigitado > numeroSecreto){
            System.out.println("O numero secreto é menor");
        } else {
            System.out.println("O numero secreto é maior");
        }
        tentativas++;

    }while (numeroDigitado != numeroSecreto);
    System.out.println("Parabens você acertou!!, o numero secreto é 67");
    System.out.println("Foram feitas "  + tentativas + " tentativas");
    for(int i = 1 ; i < numerosDigitados.size(); i++){
        System.out.println("CHUTE NÚMERO " + i + " = " + numerosDigitados.get(i));
    }

}
