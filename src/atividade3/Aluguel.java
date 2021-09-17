package atividade3;

public class Aluguel {
    private String nome;
    private String email;
    private Integer ap;

    public Aluguel (String nome,String email) {
        this.nome= nome;
        this.email=email;
        }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAp() {
        return ap;
    }

    public void setAp(int ap) {
        this.ap = ap;
    }

    public String toString() {
        return nome + ","+ email;
    }
}
