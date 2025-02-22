//resolução da class MainAutomovel
public class MainAutomovel {
    public static void main(String[] args) {
        Automovel a1 = new Automovel("11-11-AA", "Toyota",1440);
        System.out.println(a1.toString());
        System.out.println(a1.getMatricula());
        System.out.println(Automovel.getTotalAutomoveis());

        Automovel a2 = new Automovel("22-22-BB", "Fiat");
        System.out.println(a2.toString());
// colocação de uma cilindrada diferente
        a2.setCilindrada(1800);

        System.out.println(a2.getCilindrada());
 // numero total de automoveis
        System.out.println(Automovel.getTotalAutomoveis());
// calculo da diferença entre cilindradas
        System.out.println(a1.calcularDiferencaCilindrada(a2));

        System.out.println(a1.isCilindradaMaior(a2));
        a1.isCilindradaMaior(2000);
    }
}
