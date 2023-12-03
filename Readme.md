# Projeto Backend Spring Boot para API REST de uma Clínica Médica.

Este é um projeto backend desenvolvido em Spring Boot, uma estrutura robusta para aplicações Java, que oferece suporte para a criação de APIs REST eficientes. Neste projeto, focamos no cadastro de médicos, pacientes e consultas, utilizando as melhores práticas de desenvolvimento.

## Tecnologias Utilizadas

O projeto incorpora diversas tecnologias modernas para garantir desempenho, segurança e facilidade de manutenção. Algumas delas incluem:

- **Spring Data JPA:** Utilizado para simplificar o acesso a banco de dados, permitindo operações CRUD de forma eficiente.

- **Flyway:** Ferramenta de controle de versão para bancos de dados, que garante a consistência entre o esquema do banco de dados e o código-fonte.

- **Bean Validation:** Implementado para garantir a validação de dados na camada de modelo, assegurando que apenas dados válidos sejam armazenados.

- **Paginação:** Implementada para facilitar a navegação pelos resultados da API, melhorando a eficiência na manipulação de grandes conjuntos de dados.

- **Spring Security com JWT:** Integrado para autenticação segura, utilizando JSON Web Tokens (JWT). Isso protege a API contra acessos não autorizados e fornece uma forma eficaz de gerenciar identidades.

- **Controle de Acesso:** Implementado para garantir que diferentes usuários tenham acesso apenas às funcionalidades pertinentes às suas permissões.

## Estrutura do Projeto

A estrutura do projeto segue boas práticas de organização de código-fonte em pacotes. Cada entidade (médico, paciente, consulta) tem sua própria camada de serviço, repositório e controlador, garantindo uma separação clara de responsabilidades.


