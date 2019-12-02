package java_executavel;

import java_classes.Aluno;
import java_classes.Diretor;
import java_classes.Secretario;

public class Classe_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aluno aluno = new Aluno();
		aluno.setNome("Nobuyoshi Ishizuka");
		aluno.setNomeEscola("Unip");
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("12345678");
		diretor.setNome("Egidio");
		
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("87654321");
		secretario.setNumeroCpf("888888888");
		
		System.out.println(aluno);//Imprime os dados do aluno.
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println(diretor);//Imprime os dados do diretor.
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println(secretario);//Imprime os dados do secretario.
	}

}
