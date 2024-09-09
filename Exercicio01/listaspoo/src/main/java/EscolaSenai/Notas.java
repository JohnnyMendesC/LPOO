package EscolaSenai;

public class Notas{//Classe Ent. Associativa Aluno-Disciplina -> Vai escoar os dados para o sistema
    // •--==> ATRITUBTOS
    Aluno aluno;
    Disciplina disciplina;
    Professor professor;

    // •--==> CONSTRUTOR
    public Notas(Aluno alunoAv, Disciplina disciplinaAv, Professor professorAv, int resultadoAv){
        //this.alunoAv = aluno;
        
    }
    //System.out.println("Matricula:"+getAlunoMatricula);
    
    // •--==> METODOS  
    //nota é do aluno na discliplina
    //-nota1 nota2 nota3 nota4 
    //boletim é como o imprimir ficha
    //aprovado reprovado
    // avaliação seria um método não uma classe específica
    public void avaliacao(){}
    
    
    // •--==> GETTERs SETTERs
    
    
    //o aluno faz avaliacao de uma ou mais disciplinas e recebe nota    | Aluno -> 1-1 Avaliação -> 1-n Disciplina
    //o aluno é avaliado por um professor em uma ou mais disciplinas    | Aluno -> 1-1 Professor -> 1-n Disciplina
    //
    //a disciplina avalia um ou mais alunos e atribui nota              | Disciplina -> 1-1 Avaliação -> 1-n Aluno
    //o aluno é avaliado por um professor em uma ou mais disciplinas    | Disciplina -> 1-1 Professor -> 1-n Aluno
    
}
