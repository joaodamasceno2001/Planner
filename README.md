# Journey

O projeto Journey tem como objetivo ajudar o usuário a organizar viagens à trabalho ou lazer. O usuário pode criar uma viagem com nome, data de início e fim. Dentro da viagem, o usuário pode planejar sua viagem adicionando atividades para realizar em cada dia.

## Sobre o Projeto

Journey é uma aplicação web desenvolvida com Java 21 e Spring Boot, projetada para facilitar o planejamento e organização de viagens. Com Journey, os usuários podem criar viagens, convidar participantes e adicionar atividades e links importantes relacionados à viagem.

## Tecnologias Utilizadas

- **Java 21**: Linguagem de programação utilizada para o desenvolvimento da aplicação.
- **Spring Boot**: Framework utilizado para simplificar o desenvolvimento de aplicações Java.
- **Spring Data JPA**: Para manipulação e persistência de dados.
- **Spring Security**: Para autenticação e autorização de usuários.
- **Thymeleaf**: Motor de template para renderização de páginas HTML.
- **H2 Database**: Banco de dados em memória para testes e desenvolvimento.

## Funcionalidades

### 1. Cadastro de Viagem

- **Descrição**: O usuário cadastra uma viagem informando o local de destino, data de início, data de término, e-mails dos convidados e também seu nome completo e endereço de e-mail.
- **Campos**:
  - Local de Destino
  - Data de Início
  - Data de Término
  - E-mails dos Convidados
  - Nome Completo do Criador
  - Endereço de E-mail do Criador

### 2. Confirmação da Viagem

- **Descrição**: O criador da viagem recebe um e-mail para confirmar a nova viagem através de um link. Ao clicar no link, a viagem é confirmada, os convidados recebem e-mails de confirmação de presença e o criador é redirecionado para a página da viagem.
- **Fluxo**:
  1. Criador cadastra a viagem.
  2. Sistema envia e-mail de confirmação ao criador.
  3. Criador clica no link de confirmação.
  4. Sistema confirma a viagem e notifica os convidados.

### 3. Confirmação dos Convidados

- **Descrição**: Os convidados, ao clicarem no link de confirmação de presença, são redirecionados para a aplicação onde devem inserir seu nome (além do e-mail que já estará preenchido) e então estarão confirmados na viagem.
- **Campos**:
  - Nome Completo do Convidado
  - Endereço de E-mail do Convidado (pré-preenchido)

### 4. Links Importantes

- **Descrição**: Na página do evento, os participantes da viagem podem adicionar links importantes da viagem como reserva do AirBnB, locais para serem visitados, etc.
- **Campos**:
  - Título do Link
  - URL do Link
  - Descrição (opcional)

### 5. Atividades da Viagem

- **Descrição**: Ainda na página do evento, o criador e os convidados podem adicionar atividades que irão ocorrer durante a viagem com título, data e horário.
- **Campos**:
  - Título da Atividade
  - Data da Atividade
  - Horário da Atividade
  - Descrição (opcional)

### 6. Convite de Novos Participantes

- **Descrição**: Novos participantes podem ser convidados dentro da página do evento através do e-mail e assim devem passar pelo fluxo de confirmação como qualquer outro convidado.
- **Campos**:
  - E-mail do Novo Convidado

## Configuração do Ambiente de Desenvolvimento

### Pré-requisitos

- **JDK 21**: Certifique-se de ter o Java Development Kit (JDK) 21 instalado.
- **Maven**: Ferramenta de automação de compilação e gerenciamento de dependências.
- **IDE**: Recomenda-se o uso de uma IDE como IntelliJ IDEA ou Eclipse.
