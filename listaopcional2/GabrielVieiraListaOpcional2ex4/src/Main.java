//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    double paisA = 80000;
    double paisB = 200000;
    int anos = 0;
    while (paisA < paisB){
        paisA = paisA + paisA * 0.03;
        paisB = paisB + paisB * 0.015;
        anos++;
    }
    System.out.println("Serão necessarios " + anos + " anos para que o pais A ultrapasse a população do pais B");
}
