//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner input = new Scanner(System.in);
    int numero;
    IO.println(".:TABUADA:.");
    IO.print("Digite o número : ");
    numero = input.nextInt();
    IO.println("a tabuada do número" + numero + "é ");
    for (int i = 1; i <= 10 ; i++){
        IO.println(numero + " X " + i + " = " + numero * i);
    }
}
