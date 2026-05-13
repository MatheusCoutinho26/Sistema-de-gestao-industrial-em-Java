package br.com.industria;

import java.util.ArrayList;
import java.util.List;

public class EquipamentoDAO {
    
    private List<Equipamento> bancoDeDados = new ArrayList<>();

    public void cadastrar(Equipamento eq) {
        bancoDeDados.add(eq);
        System.out.println("LOG SQL: Equipamento '" + eq.getNome() + "' cadastrado com sucesso.");
    }

    public List<Equipamento> listarTodos() {
        return bancoDeDados;
    }

    public Equipamento buscarPorId(int id) {
        for (Equipamento eq : bancoDeDados) {
            if (eq.getId() == id) {
                return eq;
            }
        }
        return null;
    }

    public void registrarLeituraSensor(int id, double temperaturaLida) {
        Equipamento eq = buscarPorId(id);
        if (eq != null) {
            eq.atualizarTemperatura(temperaturaLida);
            
            if (temperaturaLida > 80.0) {
                System.out.println("ALERTA CRÍTICO: Sobreaquecimento na máquina " + eq.getNome() + "!");
                eq.desligar();
            }
        }
    }
}
