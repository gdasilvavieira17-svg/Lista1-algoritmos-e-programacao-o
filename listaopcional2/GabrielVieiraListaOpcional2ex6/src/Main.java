//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner input = new Scanner(System.in);
    int liminf;
    int limsup;
    int soma = 0;
    System.out.print("Digite o numero inicial: ");
    liminf = input.nextInt();
    System.out.print("Digite o numero final: ");
    limsup = input.nextInt();
    if (limsup < liminf) {
        System.out.println("ERRO");
    } else {
        System.out.println("Os numeros pares desse intervalo são: ");
        while (liminf < limsup) {
            liminf++;
            if (liminf % 2 == 0) {
                soma += liminf;
                System.out.println(liminf);


            }
        }
        System.out.println("A soma dos numeros pares é: " + soma);
    }
}
