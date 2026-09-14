//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner input = new Scanner(System.in);
    float peso;
    int idade;
    // 1ml = 500 mg e 1ml = 20 gotas
    IO.println(".:Sistema de Prescrição automatica:.");
    IO.print("qual a idade do paciente: ");
    idade = input.nextInt();
    IO.print("qual o peso do paciente (em kgs): ");
    peso = input.nextFloat();

    if (idade < 0 || peso < 5) {
        IO.println("Idade ou peso invalido");
    } else if (idade >= 12 && peso >= 60) {
        IO.print("A dose prescrita é de 1000mg(2ml ou 40 gotas)");
    } else if (idade >= 12 && peso < 60) {
        IO.print("A dose prescrita é de 875mg(1,75ml ou 35 gotas)");
    } else if (idade < 12 && peso <= 9) {
        IO.print("A dose prescrita é de 125mg(0,25ml ou 5 gotas)");
    } else if (idade < 12 && peso <= 16) {
        IO.print("A dose prescrita é de 250mg(0,50ml ou 10 gotas)");
    } else if (idade < 12 && peso <= 24) {
        IO.print("A dose prescrita é de 375mg(0,75ml ou 15 gotas)");
    } else if (idade < 12 && peso <= 30) {
        IO.print("A dose prescrita é de 500mg(1ml ou 20 gotas)");
    } else if (idade < 12 && peso > 30) {
        IO.print("A dose prescrita é de 750mg(1,25ml ou 25 gotas)");
    }

}
