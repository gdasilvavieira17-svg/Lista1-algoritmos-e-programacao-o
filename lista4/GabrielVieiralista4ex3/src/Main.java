//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner input = new Scanner(System.in);
    double[] temperatura = new double[5];
    double temperaturadigitada = 0;
    double mediatemperatura = 0;
    String[] semana = {"Segunda", "terça", "Quarta", "Quinta", "Sexta"};
    double somatemperatura = 0;

    for (int i = 0; i < temperatura.length; i++){
        System.out.print("Digite a temperatura de " + semana[i] + ":");
        temperaturadigitada = input.nextDouble();
        somatemperatura += temperaturadigitada;
        temperatura[i] = temperaturadigitada;
    }
    mediatemperatura = somatemperatura / temperatura.length;
    System.out.println("A temperatura media da semana foi " + mediatemperatura + "°C");

    for (int i = 0; i < temperatura.length; i++){
        if (temperatura[i] > mediatemperatura){
            System.out.println("A temperatura de " + semana[i] + " (" + temperatura[i] + "°C) foi maior que a media semanal");
        }
    }


}
