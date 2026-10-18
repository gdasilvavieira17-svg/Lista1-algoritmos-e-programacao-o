void main() {
    Random aleatorio = new Random();
    int[] cemNumeros = new int[100];
    ArrayList<Integer> numerosAoQuadrado = new ArrayList<>();
    int quadrado;
    for (int i = 0; i < cemNumeros.length; i++) {
        quadrado = aleatorio.nextInt(100);
        cemNumeros[i] = quadrado;
        System.out.println("Na posição: " + (i + 1) + " Temos o número: " + cemNumeros[i]);
    }

    for (int valor : cemNumeros) {
        int elevados = (valor * valor);
        numerosAoQuadrado.add(elevados);
    }
    for (int i = 0; i < numerosAoQuadrado.size(); i++) {
        System.out.println("O quadrado do numero na posição " + (i + 1) + " é " + numerosAoQuadrado.get(i));
    }

}
