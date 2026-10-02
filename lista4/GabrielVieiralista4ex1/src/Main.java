void main() {
    Scanner input = new Scanner(System.in);
    int numero;
    int fatorial = 1;
    System.out.println("Digite um numero: ");
    numero = input.nextInt();
    for (int i = numero; i >= 1; i--) {
        fatorial *= i;
    }
    System.out.println(numero + "! = "+ fatorial);
}
