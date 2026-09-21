//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner input = new Scanner(System.in);
    String senha, senhadigitada;

    System.out.print("Digite sua senha numerica de 4 digitos: ");
    senha = input.nextLine();


    boolean somentenumeros = true;
    int verificar = 0;
    while (verificar < senha.length()) {
        if (!Character.isDigit(senha.charAt(verificar))) {
            somentenumeros = false;
        }
        verificar++;
    }


    if (senha.length() != 4 || !somentenumeros) {
        System.out.println("Senha invalida");
    } else {
        int i = 1;
        System.out.print("\nDigite sua senha numerica de 4 digitos salva: ");
        senhadigitada = input.nextLine();
        while (!senha.equals(senhadigitada) && i != 0) {
            IO.println("\nsenha incorreta tente novamente!");
            System.out.print("\nDigite sua senha salva: ");
            senhadigitada = input.nextLine();
            i++;

        }
        IO.print("FORAM FEITAS " + i + " TENTATIVAS");
        if (senha.equals(senhadigitada)) {
            IO.print("\nAcesso autorizado");
        } else {
            System.out.println("\nAcesso negado");
        }
    }


}
