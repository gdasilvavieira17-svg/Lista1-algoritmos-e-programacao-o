//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double notas = 0;
    double notadigitada = 1;
    IO.println("--Calculadora de medias--");
    IO.print("MENU\nDigite as notas dos alunos no campo abaixo\ndigite 0 para calcular a media das notas");
    int c = -1;
    while (notadigitada != 0) {
        if (notadigitada < 0 ) {
            IO.print("Digite uma nota valida");
            notas = 0;
        } else {
            IO.print("\nDigite a nota do aluno: ");
            notadigitada = input.nextDouble();
            notas += notadigitada;
            c++;
        }

    }
    double media = notas / c;
    System.out.printf("\nForam digitadas %d notas\nA media do aluno é %.2f ", c, media);

}
