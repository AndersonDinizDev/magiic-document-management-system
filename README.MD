# Magiic Document Management System (DMS)

Este projeto faz parte de um projeto de extensão desenvolvido para a Magiic Systems, uma empresa especializada em soluções tecnológicas para automação e gestão de processos internos. O sistema desenvolvido tem como objetivo facilitar o gerenciamento de documentos internos, proporcionando um controle eficiente de empréstimos e devoluções, além de uma melhor organização do inventário.

## Objetivos

- Implementar um sistema de gerenciamento de documentos utilizando Programação Orientada a Objetos em Java.
- Treinar os colaboradores da Magiic Systems no uso do software para registrar empréstimos e devoluções de documentos.
- Reduzir os erros de registro de empréstimos e devoluções, melhorando a eficiência operacional da empresa.

## Estrutura do Projeto

O projeto está estruturado em três etapas principais:

1. **Registro de Usuários:** Gerenciamento de usuários que poderão registrar empréstimos e devoluções de documentos.
2. **Controle de Empréstimos e Devoluções:** Interface para registrar e acompanhar empréstimos e devoluções de documentos.
3. **Catalogação de Documentos:** Cadastro e controle de inventário dos documentos disponíveis.

## Requisitos

- Java JDK 8+
- IDE de sua preferência (Eclipse, IntelliJ IDEA, etc.)

## Estrutura do Código

O código-fonte está organizado da seguinte maneira:

- `src/` - Contém o código fonte do projeto.
  - `model/` - Contém as classes de modelo que representam os objetos do sistema, como `User`, `Document`, `Loan`.
  - `service/` - Contém as classes de serviço que implementam a lógica de negócio.
  - `Main.java` - Classe principal que inicia o sistema.

## Uso

1. **Registro de Usuários e Documentos:**

   - Após executar o sistema, você poderá registrar novos usuários e adicionar documentos ao inventário.

2. **Empréstimo de Documentos:**

   - O sistema permite registrar empréstimos de documentos disponíveis e controla a devolução quando necessário.

3. **Visualização de Empréstimos Ativos:**
   - Exibe o histórico de empréstimos e devoluções registrados no sistema.

## Exemplo de Uso

- O sistema inicia com alguns usuários e documentos predefinidos para demonstração. Você pode registrar novos usuários e documentos, realizar empréstimos e devoluções, e visualizar o histórico de transações.

## Como Executar

1. Clone o repositório:

   ```bash
   git clone https://github.com/seuusuario/magiic-dms.git
   cd magiic-dms
   ```

2. Importe o projeto em sua IDE de preferência.

3. Compile e execute a classe `Main.java` para iniciar o sistema.

## Resultados Esperados

- Gerenciamento eficiente de documentos técnicos e manuais, com redução significativa de erros nos registros de empréstimos e devoluções.
- Feedback positivo dos colaboradores quanto à facilidade de uso e utilidade do sistema desenvolvido.

## Contribuição

Este projeto foi desenvolvido por Anderson Luiz Diniz de Oliveira como parte de um projeto de extensão acadêmica. Feedback e sugestões são bem-vindos.

## Licença

Este projeto está sob a licença MIT. Consulte o arquivo `LICENSE` para mais detalhes.
