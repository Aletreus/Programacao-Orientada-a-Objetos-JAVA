package Revisao;

public class Livro extends Biblioteca {
    private int numeroPag;
    private int capitulos;
    private String capa;
    
    public Livro(String titulo, String autor, int ano, String genero, int numeroPag, int capitulos, String capa){
        super(titulo, autor, ano, genero);
        this.numeroPag = numeroPag;
        this.capitulos = capitulos;
        this.capa = capa;
    }

    public int getNumeroPag() {
        return numeroPag;
    }

    public void setNumeroPag(int numeroPag) {
        this.numeroPag = numeroPag;
    }

    public int getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(int capitulos) {
        this.capitulos = capitulos;
    }

    public String getCapa() {
        return capa;
    }

    public void setCapa(String capa) {
        this.capa = capa;
    }
    
    @Override
    public void informacoes(){
        if(super.isDisponivel() == true){
            System.out.printf("Nome: %s\nAno: %d\nAutor: %s\nDisponivel: Sim\nNumero de paginas: %d\nCapitulos: %d\nCapa: %s", super.getTitulo(), super.getAno(), super.getAutor(), this.numeroPag, this.capitulos, this.capa);
            System.out.println("");
        }else{
            System.out.printf("Nome: %s\nAno: %d\nAutor: %s\nDisponivel: Nao\nNumero de paginas: %d\nCapitulos: %d\nCapa: %s", super.getTitulo(), super.getAno(), super.getAutor(), this.numeroPag, this.capitulos, this.capa);
            System.out.println("");
        }
    }
}
