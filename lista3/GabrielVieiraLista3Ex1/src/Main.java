//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner input = new Scanner(System.in);
    float X;

    IO.print("Digite o valor de X: ");
    X = input.nextFloat();

    if (X <= 1){
        IO.print("F(x) = 1");
    } else if (X <= 2) {
        IO.print("F(x) = 2");
    } else if (X <= 3) {
        IO.print("F(x) = " + (X * X));
    } else {
        IO.print("F(x) = " + (X * X * X));
    }
}
