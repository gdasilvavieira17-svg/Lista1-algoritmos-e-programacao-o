void main() {
    Scanner input = new Scanner(System.in);
    float a, b, c;

    IO.println("Digite os valores respectivamente de a,b,c");
    a = input.nextFloat();
    b = input.nextFloat();
    c = input.nextFloat();
    float delta = (b * b) - (4 * a * c);
    double x1 = ((-b + (Math.sqrt(delta))) / (a * 2));
    double x2 = ((-b - (Math.sqrt(delta))) / (a * 2));

    if (a == 0) {
        IO.print("Não é uma equação de segundo grau!");
    } else if (delta < 0) {
        IO.print("Não exixtem raizes reais!");
    } else if (delta > 0) {
        System.out.printf("Existem 2 raizes reais diferentes que sao: \nx1 = %.2f\nx2 = %.2f", x1,x2);
    } else if (delta == 0) {
        System.out.printf("Existe apenas 1 raiz real que é: %.2f" , x1);
    }

}
