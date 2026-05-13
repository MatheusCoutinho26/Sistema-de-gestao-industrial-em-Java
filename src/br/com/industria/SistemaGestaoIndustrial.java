

public class SistemaGestaoIndustrial {
    public static void main(String[] args) {
        EquipamentoDAO dao = new EquipamentoDAO();

        System.out.println("--- INICIANDO SISTEMA DE GESTÃO INDUSTRIAL ---");

        dao.cadastrar(new Equipamento(101, "Torno CNC", "Usinagem"));
        dao.cadastrar(new Equipamento(102, "Injetora de Plástico", "Moldagem"));
        dao.cadastrar(new Equipamento(103, "Esteira Transportadora", "Logística"));

        Equipamento injetora = dao.buscarPorId(102);
        if (injetora != null) {
            injetora.ligar();
            System.out.println("\nComando de partida enviado para: " + injetora.getNome());
        }

        System.out.println("\n--- RECEBENDO DADOS DE SENSORES ---");
        dao.registrarLeituraSensor(102, 45.5); 
        dao.registrarLeituraSensor(101, 30.0); 
        dao.registrarLeituraSensor(102, 85.2); // Simula o acionamento do alerta

        System.out.println("\n--- RELATÓRIO DO CHÃO DE FÁBRICA ---");
        for (Equipamento eq : dao.listarTodos()) {
            System.out.println(eq.toString());
        }
    }
}
