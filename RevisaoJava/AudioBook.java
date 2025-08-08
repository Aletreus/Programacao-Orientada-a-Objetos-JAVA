package Revisao;

public class AudioBook extends Biblioteca{
    private int minutos;
    private String narrador;
    private int horas;
    
    public AudioBook(String titulo, String autor, int ano, String genero, int minutos, String narrador, int horas){
        super(titulo, autor, ano, genero);
        this.horas = horas;
        this.minutos = minutos;
        this.narrador = narrador;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public String getNarrador() {
        return narrador;
    }

    public void setNarrador(String narrador) {
        this.narrador = narrador;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    @Override
    public void informacoes(){
        if(super.isDisponivel() == true){
            System.out.printf("Nome: %s\nAno: %d\nAutor: %s\nDisponivel: Sim\nHoras: %d\nMinutos: %d\nNarrador: %s", super.getTitulo(), super.getAno(), super.getAutor(), this.horas, this.minutos, this.narrador);
            System.out.println("");
        }else{
            System.out.printf("Nome: %s\nAno: %d\nAutor: %s\nDisponivel: Nao\nHoras: %d\nMinutos: %d\nNarrador: %s", super.getTitulo(), super.getAno(), super.getAutor(), this.horas, this.minutos, this.narrador);
            System.out.println("");
        }
    }
}
