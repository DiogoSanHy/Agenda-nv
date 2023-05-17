import java.util.ArrayList;

public class Agenda {
	private ArrayList<Cadastrar> tarefas = new ArrayList<>();

    public void cadastrarTarefa(Cadastrar tarefa) {
        tarefas.add(tarefa);
    }

    public ArrayList<Cadastrar> listarTarefas() {
        return tarefas;
    }

	public void remove(int cod) {
		
		
	}
}
