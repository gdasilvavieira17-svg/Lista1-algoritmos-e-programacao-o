//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner input = new Scanner(System.in);
    int quantidade = 0;
    double valortotal = 0;
    double valor;
    double maior = 0;
    double menor = 0;

    System.out.print("Digite a quantidade de doações: ");
    quantidade = input.nextInt();

    int i = 0;
    while (i <  quantidade){
        System.out.println("Digite os valores das doações: ");
        valor = input.nextDouble();
        valortotal += valor;
        if (i == 0){
            maior = valor;
            menor = valor;
        } else if (valor > maior) {
            maior = valor;
        } else if (valor < menor){
            menor = valor;
        }
        i++;
    }
    System.out.println("O valor total das doações foi: R$ " + valortotal);
    System.out.println("O maior valor foi: R$ " + maior);
    System.out.println("O menor valor foi: R$ " + menor);

}
