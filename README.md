# Sistema de Gestão Industrial (MES) 🏭

Mini-sistema desenvolvido em Java para simular o gerenciamento e monitoramento de equipamentos no chão de fábrica. O projeto aplica os conceitos de Orientação a Objetos e o padrão de projeto DAO (Data Access Object) para gerenciar o estado das máquinas e simular a leitura de sensores de temperatura.

## 🛠️ Tecnologias Utilizadas
* **Java** (Lógica de Negócios e Modelagem)
* **Padrão DAO** (Simulação de persistência de dados)

## ⚙️ Funcionalidades
* Cadastro de maquinário industrial (ID, Nome, Setor).
* Controle de acionamento (Ligar/Desligar).
* Monitoramento de temperatura com alerta crítico para sobreaquecimento.
* Emissão de relatório de turno de operação.

## 🚀 Como executar
1. Clone este repositório.
2. Compile os arquivos `.java` localizados na pasta `src`.
3. Execute a classe principal `SistemaGestaoIndustrial`.

## 🔮 Próximos Passos
* Integração com banco de dados relacional via SQL (JDBC).
* Conexão via interface serial para leitura de dados reais de sensores e microcontroladores.
