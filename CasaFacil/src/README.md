Projeto CASAFACIL

Bem-vindo ao repositório oficial do CASAFACIL, uma plataforma robusta desenvolvida para conectar clientes e profissionais de serviços domésticos com eficiência e segurança.

Arquitetura do Sistema

O sistema foi projetado seguindo o Padrão de Arquitetura em Camadas, priorizando a separação de preocupações (Separation of Concerns), baixo acoplamento e alta manutenibilidade.

Camadas:

View (Apresentação): Interação direta com o utilizador (Interfaces GUI).

Controller (Aplicação): Orquestra o fluxo de dados e requisições do sistema.

Service (Negócio): Onde reside o "coração" do sistema (algoritmos de Matching, cálculos, validações).

Repository (Dados): Abstrai a persistência e o acesso às entidades.

Domain (Domínio): Definição das regras de negócio e entidades.

Infraestrutura: Integração com sistemas externos (Pagamentos e APIs).

Padrões de Projeto (Design Patterns)

Para elevar a qualidade e a robustez do software, implementámos os seguintes padrões GoF (Gang of Four):

1. Facade (nos Controllers)

Implementado em CtlOrcamento, CtlNegociacao, etc.

Objetivo: Oferece uma interface única e simplificada para as operações do sistema, ocultando a complexidade dos subsistemas de serviço e persistência para a camada de visualização.

2. Singleton (nos Repositórios)

Implementado em RepositorioPedido, RepositorioPrestador, RepositorioUsuario.

Objetivo: Garante que exista apenas uma instância única (fonte de verdade) durante toda a execução da aplicação, evitando inconsistências em memória.

Como Executar

Certifique-se de ter o JDK 11+ instalado.

Clone o repositório ou descarregue os ficheiros fonte.

Compile e execute a partir da raiz do projeto:

# Compilar
javac Main.java

# Executar
java Main


Estrutura de Pastas

src/
├── controller/    # Camada de Aplicação (Facade)
├── domain/        # Entidades de Negócio
├── repository/    # Acesso a Dados (Singleton)
├── service/       # Lógica de Matching
├── view/          # Interface com o Utilizador
└── Main.java      # Ponto de entrada


 Autor

Desenvolvido como parte das atividades da disciplina de Engenharia de Software - 5P da Universidade Presbiteriana Mackenzie.