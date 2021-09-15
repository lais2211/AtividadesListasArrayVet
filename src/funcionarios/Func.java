package funcionarios;

public class Func {
    private String nome;
    private Integer id;
    private Double salario;
    public Integer porcentagem;

    public Func(String nome, Integer id, Double salario) {
        this.nome = nome;
        this.id = id;
        this.salario = salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void aumento (int porcentagem)
    {salario = salario + ((salario/100)*porcentagem);}

    @Override
    public String toString() {
        return id + ", " + nome + ", " + salario;
    }
}
