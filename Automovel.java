public class Automovel {
    private String matricula; //atributos
    private String marca;

    private int cilindrada;
    private static final String MATRICULA_POR_OMISSAO = "sem matrícula";
    private static final String MARCA_POR_OMISSAO = "sem marca";
    private static final int CILINDRADA_POR_OMISSAO = 0;

    private static int totalAutomoveis = 0;

    public Automovel() {
        matricula = MATRICULA_POR_OMISSAO; //construtores
        marca = MARCA_POR_OMISSAO;
        cilindrada = CILINDRADA_POR_OMISSAO;
        totalAutomoveis++;
    }
    // isto e criar o construtor
    public Automovel(String matricula, String marca, int cilindrada) {
        this.matricula = matricula;
        this.marca = marca;
        this.cilindrada = cilindrada;
        totalAutomoveis++;
    }

    public Automovel(String matricula, String marca) {
        this.matricula = matricula;
        this.marca = marca;
        this.cilindrada = CILINDRADA_POR_OMISSAO;
        totalAutomoveis++;
    }

    public Automovel(String marca, int cilindrada) {
        this.matricula = MATRICULA_POR_OMISSAO;
        this.marca = marca;
        this.cilindrada = cilindrada;
        totalAutomoveis++;

    }

    public String getMatricula() {
        return this.matricula;
    }

    public String getMarca() {
        return this.marca;
    }

    public int getCilindrada() {
        return this.cilindrada;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String toString() {
        return "Matricula:" + matricula  + "\n" + "Marca:" + marca +   "\n" + "Cilindrada:" + cilindrada ;
    }

    public int calcularDiferencaCilindrada(Automovel outroAutomovel) {
        return this.cilindrada - outroAutomovel.getCilindrada();
    }

    public boolean isCilindradaMaior(Automovel outroAutomovel) {
        return this.cilindrada > outroAutomovel.getCilindrada();
    }
// maior cilindrada
    public boolean isCilindradaMaior(int cilindrada) {
        if (this.cilindrada > cilindrada) {
            return true;
        }
        return false;
    }

    public static int getTotalAutomoveis() {
        return totalAutomoveis;
    }
}


