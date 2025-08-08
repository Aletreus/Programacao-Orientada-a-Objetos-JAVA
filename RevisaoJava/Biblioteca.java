package Revisao;

public class Biblioteca {
    private String titulo;
    private String autor;
    private int ano;
    private String genero;
    private boolean disponivel = true;
    
    public Biblioteca(String titulo, String autor, int ano, String genero){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    
    public void alugar(){
            if(this.disponivel == true){
                System.out.printf("Voce pegou %s emprestado", this.titulo);
                System.out.println("");
                this.disponivel = false;
            }else{
                System.out.printf("%s nao esta disponivel", this.titulo);
                System.out.println("");
            }
        
    }
    
    public void devolver(){
            if(this.disponivel == false){
                System.out.printf("Voce acaba de devolver %s", this.titulo);
                System.out.println("");
                this.disponivel = true;
            }else{
                System.out.printf("%s nao esta emprestado", this.titulo);
                System.out.println("");
            }
        
       
    }
    
    public void informacoes(){
        if(this.disponivel == true){
            System.out.printf("Nome: %s\nAno: %d\nAutor: %s\nDisponivel: Sim", this.titulo, this.ano, this.autor);
            System.out.println("");
        }else{
            System.out.printf("Nome: %s\nAno: %d\nAutor: %s\nDisponivel: Nao", this.titulo, this.ano, this.autor);
            System.out.println("");
        }
    }
}
