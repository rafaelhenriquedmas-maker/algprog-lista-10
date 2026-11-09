class Pessoa {
    private String nome;
    private int idade;
    private String cpf;

    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public void falar() {
        System.out.println(nome + " está falando.");
    }

    public String getNome() {
        return nome;
    }
}

class Endereco {
    private String rua;
    private int numero;
    private String cidade;

    public Endereco(String rua, int numero, String cidade) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
    }

    public void exibirEndereco() {
        System.out.println(rua + ", " + numero + " - " + cidade);
    }
}

class Aluno extends Pessoa {
    private String matricula;
    private Endereco endereco;

    public Aluno(String nome, int idade, String cpf,
                 String matricula, Endereco endereco) {
        super(nome, idade, cpf);
        this.matricula = matricula;
        this.endereco = endereco;
    }

    public void estudar() {
        System.out.println(getNome() + " está estudando.");
    }

    public String getMatricula() {
        return matricula;
    }

    public void exibirEndereco() {
        endereco.exibirEndereco();
    }
}

class Professor extends Pessoa {
    private String especialidade;

    public Professor(String nome, int idade, String cpf,
                     String especialidade) {
        super(nome, idade, cpf);
        this.especialidade = especialidade;
    }

    public void ensinar() {
        System.out.println(getNome() + " está ensinando "
                + especialidade);
    }
}

class Curso {
    private String nome;
    private int duracao;

    public Curso(String nome, int duracao) {
        this.nome = nome;
        this.duracao = duracao;
    }

    public void exibirCurso() {
        System.out.println("Curso: " + nome);
        System.out.println("Duração: " + duracao + " semestres");
    }

    public String getNome() {
        return nome;
    }
}

class Disciplina {
    private String nome;
    private int cargaHoraria;

    public Disciplina(String nome, int cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public void exibirDisciplina() {
        System.out.println("Disciplina: " + nome);
        System.out.println("Carga horária: " + cargaHoraria);
    }

    public String getNome() {
        return nome;
    }
}

class Turma {
    private String codigo;
    private Curso curso;
    private Professor professor;

    public Turma(String codigo, Curso curso, Professor professor) {
        this.codigo = codigo;
        this.curso = curso;
        this.professor = professor;
    }

    public void exibirTurma() {
        System.out.println("Turma: " + codigo);
        System.out.println("Curso: " + curso.getNome());
        System.out.println("Professor: " + professor.getNome());
    }
}

class Matricula {
    private Aluno aluno;
    private Turma turma;

    public Matricula(Aluno aluno, Turma turma) {
        this.aluno = aluno;
        this.turma = turma;
    }

    public void confirmarMatricula() {
        System.out.println("Matrícula realizada com sucesso!");
        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Número: " + aluno.getMatricula());
        turma.exibirTurma();
    }
}

class Nota {
    private Aluno aluno;
    private Disciplina disciplina;
    private double valor;

    public Nota(Aluno aluno, Disciplina disciplina, double valor) {
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.valor = valor;
    }

    public void exibirNota() {
        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Disciplina: " + disciplina.getNome());
        System.out.println("Nota: " + valor);
    }
}

class Escola {
    private String nome;

    public Escola(String nome) {
        this.nome = nome;
    }

    public void apresentarEscola() {
        System.out.println("Instituição: " + nome);
    }

    public void receberAluno(Aluno aluno) {
        System.out.println("Aluno recebido: " + aluno.getNome());
    }
}