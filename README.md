SISTEMA DE GERENCIAMENTO DE VEICULOS

Este é um sistema básico de administração de veículos que emprega os princípios de orientação a objetos em Java, destacando a herança, os métodos de acesso e as classes abstratas.
===============================================================================================

FUNCIONALIDADES
Cada classe descendente utiliza o método informacoesVeiculo(), que fornece uma descrição detalhada do veículo.
===============================================================================================

ESTRUTURA DAS CLASSES

Carro.java: Classe que se origina de Veículo, acrescentando o atributo númeroPortas.
===============================================================================================
Main.java: Classe principal responsável por criar objetos de Carro e Moto, especificar seus atributos e mostrar suas informações.
===============================================================================================
Moto.java: Incorpora o atributo privado cilindrada juntamente com as técnicas de acesso.
O método informacoesVeiculo é implementado, formatando as informações de forma específica para motos.
===============================================================================================
Veiculo.java: Classe abstrata que define atributos comuns a todos os veículos e métodos para acesso ao ano do veículo.
===============================================================================================

COMO EXECUTAR

Baixe ou clone este repositório.
javac Main.java [Compila o código e gera o arquivo Main.class]
java Main [Executa o código]
