package projetocrypto;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) throws ClassNotFoundException {	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o email");
		String vEmail = sc.next(); 
		System.out.println("Informe a senha");
		String vSenha = sc.next();

		Usuario usu = new Usuario(vEmail, vSenha);
/*
 		if (usu.incluirUsuario()) {
			System.out.println("Parabéns ! usuário incluído com sucesso");
		}
*/
		/*
		 * autenticação não está funcionando - verificar
		if (usu.autenticarUsuario()) {
			System.out.println("Usuário autenticado com sucesso !!");
		} else {
			System.out.println("Usuário não encontrado !!");
		}
		*/
		sc.close();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// teste de conexão com o banco de dados
		/*
		Connection con = Conexao.conectar();
		if (con != null) {
			System.out.println("Eba! Conectei");
		}
		*/
	}

}
