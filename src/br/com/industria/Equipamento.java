package br.com.industria;

public class Equipamento {
    private int id;
    private String nome;
    private String setor;
    private boolean emOperacao;
    private double temperaturaAtual;

    public Equipamento(int id, String nome, String setor) {
        this.id = id;
        this.nome = nome;
        this.setor = setor;
        this.emOperacao = false;
        this.temperaturaAtual = 25.0; // Temperatura ambiente padrão
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getSetor() { return setor; }
    public boolean isEmOperacao() { return emOperacao; }
    public double getTemperaturaAtual() { return temperaturaAtual; }

    public void ligar() { this.emOperacao = true; }
    public void desligar() { this.emOperacao = false; }
    
    public void atualizarTemperatura(double novaTemperatura) {
        this.temperaturaAtual = novaTemperatura;
    }

  
    public String toString() {
        String status = emOperacao ? "LIGADA" : "DESLIGADA";
        return String.format("[%d] %s (%s) - Status: %s | Temp: %.1f°C", 
                             id, nome, setor, status, temperaturaAtual);
    }
}
