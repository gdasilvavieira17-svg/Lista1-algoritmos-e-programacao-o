//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    for (int i = 1; i <= 100; i++){
        if (i % 3 == 0 || i == 1){
            System.out.println("Impar: " + i + " " + i * i);
        } else if (i % 2 == 0) {
            System.out.println("Par: " + i + " " + i * i * i);
        }
    }
}
