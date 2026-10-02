//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner input = new Scanner(System.in);
    double salario = 0;
    int filhos = 0;
    int opcao;
    int pesquisas = 0;
    double mediasalario = 0;
    double somasalario = 0;
    int somafilhos = 0;
    double mediafilhos = 0;
    double maiorsalario = 0;
    int salariominimo = 1621;
    int contagemsalariominimo = 0;
    int porcentagemsalariominimo;
    System.out.println(".:PESQUISA PREFEITURA:.");
    System.out.print("digite 1 para iniciar o programa e 2 para finalizar: ");
    opcao = input.nextInt();
    if (opcao != 1 && opcao != 2) {
        System.out.println("Digite uma opção válida");
    }
    else if (opcao == 2) {
        System.out.println("Programa finalizado");
    }else{
        do {
            pesquisas++;
            System.out.print("qual seu salario? ");
            salario = input.nextDouble();
            somasalario += salario;
            if (salario > maiorsalario) {
                maiorsalario = salario;
            }
            if(salario <= salariominimo){
                contagemsalariominimo++;
            }


            System.out.print("quantos filhos você tem? ");
            filhos = input.nextInt();
            somafilhos += filhos;

            System.out.print("Digite 1 para continuar e 2 para finalizar o programa: ");
            opcao = input.nextInt();
        } while (opcao == 1);
        mediasalario = somasalario / pesquisas;
        mediafilhos = somafilhos / pesquisas;
        porcentagemsalariominimo = (contagemsalariominimo * 100) / pesquisas;
        System.out.println("A media salarial da população é " + mediasalario + "R$");
        System.out.println("A media de filhos da população é " + mediafilhos + " filhos");
        System.out.println("O maior salário da cidade é" + maiorsalario + "R$");
        System.out.println("A porcentagem da população que recebe ate 1 salario minimo é " +
                porcentagemsalariominimo + "%");
    }
}
