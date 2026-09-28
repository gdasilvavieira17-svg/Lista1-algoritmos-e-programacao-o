//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner input = new Scanner(System.in);
    double tempdigitada = 0;
    double temptotal = 0;
    int i = 0;
    int calor = 0;
    System.out.print("MENU\nDigite a temperatura do sensor abaixo\nDigite -111 para calcular a media");
    while (tempdigitada != -111) {
        System.out.print("\nDigite a temperatura: ");
        tempdigitada = input.nextDouble();
        if (tempdigitada != -111) {
            temptotal += tempdigitada;
            i++;
        }
        if(tempdigitada > 30){
            calor++;
        }
    }
    double media = temptotal / i;
    System.out.println("A media das temperaturas foi de: " + media);
    System.out.println("ALERTA\nA temperatura ultrapassou 30° " + calor + "vezes");

}
