//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner input = new Scanner(System.in);
    int liminicial;
    int limfinal;

    System.out.print("Digite o inicio do intervalo: ");
    liminicial = input.nextInt();
    System.out.print("Digite o final do intervalo: ");
    limfinal = input.nextInt();

    if (liminicial <= limfinal){
        System.out.println("O intervalo esta em ordem crescente");
        while (liminicial <= limfinal) {
            System.out.println(liminicial);
            liminicial++;
        }
    } else {
        System.out.println("O intervalo esta em ordem decrescente");
        while (limfinal <= liminicial) {
            System.out.println(liminicial);
            liminicial--;
        }

    }
}
