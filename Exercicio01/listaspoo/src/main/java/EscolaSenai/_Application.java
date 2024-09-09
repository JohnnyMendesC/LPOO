package EscolaSenai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class _Application {

	public static void main(String[] args) {
		SpringApplication.run(_Application.class, args);

        /*                 •---===ESCOLA SENAI===---•
         * Nós vamos começar a estruturar um projeto que é o EscolaSenai.
         * Nós precisamos montar um SISTEMA para GERENCIAR as ATIVIDADES
         * pedagógicas para alunos e professores
         * 
         *                  ¤ ¤ PRIMEIRA ENTREGA ¤ ¤
         * Critérios:
        ( )•-> Estruturar o projeto com suas CLASSES, RELACIONAMENTOS, HERANÇAS
         * e tudo que o sistema necessite baseado no que vocês aprenderam
         * 
        (×)•-> Classes (Alunos, Professores, Disciplinas e Notas). Se precisar de
         * outras para estruturar melhor, fiquem a vontade.
         * 
        (×)•-> Utilizar Herança (Ex: Pessoa)
         * 
        ( )•-> Montar CONSTRUTORES contendo as regras do negócio
         * 
        ( )•-> Montar todos os relacionamentos entre classes
         * 
         * 
         */

        Disciplina disciplina1 = new Disciplina("TIC", "Lógica de Programação", "Integral", "Jul-2024", "Dez-2024");
        Disciplina disciplina2 = new Disciplina("TIC", "Banco de Dados", "Integral", "Jul-2024", "Dez-2024");
        Disciplina disciplina3 = new Disciplina("TIC", "POO", "Integral", "Jul-2024", "Dez-2024");
        Disciplina disciplina4 = new Disciplina("ING", "Inglês Avançado", "Noite", "Jan-2025", "Jun-2025");
        
        disciplina1.imprimeDisciplina();
        disciplina2.imprimeDisciplina();
        disciplina3.imprimeDisciplina();
        disciplina4.imprimeDisciplina();

        Aluno aluno1 = new Aluno("ALUNO1");
        Aluno aluno2 = new Aluno("ALUNO2");
        Aluno aluno3 = new Aluno("ALUNO3");
        Aluno aluno4 = new Aluno("ALUNO4");
        Aluno aluno5 = new Aluno("ALUNO5");

        aluno1.imprimePessoa();
        aluno2.imprimePessoa();
        aluno3.imprimePessoa();
        aluno4.imprimePessoa();
        aluno5.imprimePessoa();
	}
}
