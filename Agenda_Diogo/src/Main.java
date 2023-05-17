import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		
		ArrayList<Cadastrar> listaCadastro = new ArrayList<>()
;		Scanner ler = new Scanner(System.in);
		int codigo = 1;
		int op = 0;
		
		do {
			System.out.println("BEM VINDO A SUA AGENDA PESSOAL!");
			System.out.println("1 - Listar tarefas cadastradas");
			System.out.println("2 - Cadastrar tarefas");
			System.out.println("3 - Excluir tarefa");
			System.out.println("4 - Alterar tarefa");
			System.out.println("5 - Sair");
			System.out.println("DIGITE A OPÇÃO DESEJADA: ");
			op = ler.nextInt();
			
			switch(op){
				case 1:
					if(listaCadastro.size() <= 0) {
						System.out.println("Lista de atividades vazia!");
					}else {
						for(Cadastrar a:listaCadastro) {
							a.detalhe();
						}
					}
					break;
				case 2:
					System.out.println("Digite o mês da tarefa: ");
					int dataMes = ler.nextInt();
					
					System.out.println("Digite o dia da tarefa: ");
					int dataDia = ler.nextInt();
					
					System.out.println("Digite o horario da tarefa: ");
					int horario = ler.nextInt();
					
					System.out.println("Digite o nome da tarefa: ");
					ler.nextLine();
					String nome = ler.nextLine();
					
					System.out.println("Digite a descrcao da tarefa: ");
					String descricao = ler.nextLine();
					
					Cadastrar trf = new Cadastrar(nome, descricao,dataMes, dataDia, horario, codigo);
					codigo+=1;
					listaCadastro.add(trf);
					
					
					break;
				case 3:
					System.out.println("Digite o codigo da tarefa: ");
					codigo = ler.nextInt();
					

					for(Cadastrar a:listaCadastro) {
						if(codigo == a.getCod()) {
							if(listaCadastro.size()==1) {
								listaCadastro.clear();
								break;
							} else {
							listaCadastro.remove(a);
							}
						}
					}
					
					break;
				case 4:
					System.out.println("Digite o codigo da tarefa: ");
					codigo = ler.nextInt();
					int cnt = 1;
					for(Cadastrar a:listaCadastro) {
						if(codigo == a.getCod()) {
							System.out.println("Digite o mês da tarefa: ");
							dataMes = ler.nextInt();
							a.setDataMes(dataMes);
							System.out.println("Digite o dia da tarefa: ");
							dataDia = ler.nextInt();
							a.setData(dataDia);
							System.out.println("Digite o horario da tarefa: ");
							horario = ler.nextInt();
							a.setHorario(horario);
							System.out.println("Digite o nome da tarefa: ");
							ler.nextLine();
							nome = ler.nextLine();
							a.setNome(nome);
							System.out.println("Digite a descrcao da tarefa: ");
							descricao = ler.nextLine();
							a.setDescricao(descricao);
							cnt = 0;
						}
					}
					if(cnt==1) {
						System.out.println("Tarefa não encontrada");
					}
					
					break;
			}
			
		}while(op > 0 && op <=4);
		
		System.out.println("OBRIGADO POR UTILIZAR NOSSA AGENDA! VOLTE SEMPRE!");
		
		

	}
}
