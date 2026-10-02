//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*05 - Um fiscal de qualidade mediu o peso (em kg) de 6 caixas em uma linha de produção. Logo após digitar os 6 pesos,
o sistema deve pedir para o fiscal digitar um peso de referência para pesquisa. O programa deve analisar a lista
informada e exibir:

Quantas vezes aquele peso específico foi encontrado.
Se o peso não foi encontrado em nenhuma das caixas, exibir: "Valor não localizado na amostragem".
*/

void main() {
    Scanner input = new Scanner(System.in);
    double[] pesos = new double[7];
    double pesodigitado = 0;
    double pesoreferencia;
    int vezes = 0;
    System.out.println("::-CONFERENCIA DE PESO-::");
    System.out.print("Digite um peso de referencia: ");
    pesoreferencia = input.nextDouble();

    for (int i = 1; i < pesos.length; i++) {
        System.out.print("Digite o peso em kg do produto de numero " + i + ": ");
        pesodigitado = input.nextDouble();
        pesos[i] = pesodigitado;
        if (pesodigitado == pesoreferencia) {
            vezes++;
        }

    }
    if (vezes == 0) {
        System.out.println("Valor não localizado na amostragem");
    }
    if (vezes == 1){
        System.out.println("O peso de referência foi digitado " + vezes + " vez");
    } else if (vezes > 1) {
        System.out.println("O peso de referência foi digitado " + vezes + " vezes");
    }


}
