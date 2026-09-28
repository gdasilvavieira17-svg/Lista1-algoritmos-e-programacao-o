//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner input = new Scanner(System.in);
    int idade;
    String nota = "f";
    int otimo = 0;
    int respostas = 0;
    int bom = 0;
    int regular = 0;
    int ruim = 0;
    int pessimo = 0;
    int idadepessimo = 0;
    int somaidade = 0;

    while (!nota.equals("F")){
        System.out.println("Digite sua nota para o filme com base nessa tabela \nA = otimo\nB = bom \nC = regular\nD = ruim\nE = péssimo");
        System.out.println("Digite F para receber os dados");
        System.out.print("Digite sua nota: ");
        nota = input.nextLine();
        nota = nota.toUpperCase();
        if (!nota.equals("F")) {
            respostas++;
            System.out.print("Digite sua idade: ");
            idade = input.nextInt();
            input.nextLine();
            if (nota.equals("D")){
                somaidade += idade;
            }
        }
        switch(nota){
            case "A":
                otimo++;
                break;
            case "B":
                bom++;
                break;
            case  "C":
                regular++;
                break;
            case "D":
                ruim++;

                break;
            case "E":
                pessimo++;
                break;
        }

    }
    float diferenca = 0;
    float porcentagembom = (bom * 100) / respostas;
    float porcentagemregular = (regular * 100) / respostas;
    float porcentagempessimo =  (pessimo * 100) / respostas;
    double mediaruim = 0;
    if (ruim > 0) {
        mediaruim    = somaidade / ruim;
    }

    if (porcentagembom > porcentagemregular){
        diferenca = porcentagembom - porcentagemregular;
    } else if (porcentagemregular > porcentagembom) {
        diferenca = porcentagemregular - porcentagembom;
    }
    System.out.println(otimo);
    System.out.println(" A diferença sera de " + diferenca + "%");
    System.out.println(mediaruim);
  //falta a D e a E
}
