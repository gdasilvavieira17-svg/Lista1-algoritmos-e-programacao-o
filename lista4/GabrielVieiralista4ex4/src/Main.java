//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner input = new Scanner(System.in);
    double[] faturamento = new double[5];
    double faturamentodigitado;
    double somafaturamento = 0;
    double mediafaturamento;
    String[] semana = {"Segunda", "terça", "Quarta", "Quinta", "Sexta"};

    for (int i = 0; i < faturamento.length; i++) {
        System.out.print("qual foi o faturamento de " + semana[i] + ": ");
        faturamentodigitado = input.nextDouble();
        somafaturamento += faturamentodigitado;
        faturamento[i] = faturamentodigitado;

    }

    mediafaturamento = somafaturamento / faturamento.length;
    System.out.println("A venda total da semana foi " + somafaturamento + "R$");
    System.out.println("A media de faturamento da semana foi " + mediafaturamento + "R$");

    for (int i = 0; i < faturamento.length; i++){
        if (faturamento[i] < mediafaturamento){
            System.out.println("O faturamento de " + semana[i] + " (" + faturamento[i] + "R$) Foi menor que a media semanal");
        }
    }
}
