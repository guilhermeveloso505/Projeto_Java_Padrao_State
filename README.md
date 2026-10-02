# Padrão de Projeto State

# Sobre o Projeto
Este projeto implementa o padrão de projeto comportamental State (Estado) em Java, simulando o ciclo de vida de um código-fonte durante seu desenvolvimento.

O sistema permite controlar as mudanças de estado de um código, desde sua criação até sua implementação, atualização, compartilhamento ou exclusão, respeitando as transições permitidas em cada etapa.

# Estados do Código

O projeto possui cinco estados:
* Criado: estado inicial do código, permitindo sua implementação ou exclusão.
* Implementado: código que já foi desenvolvido e pode ser atualizado, compartilhado ou excluído.
* Atualizado: código que passou por modificações, podendo receber novas atualizações, ser compartilhado ou excluído.
* Compartilhado: código disponibilizado para outras pessoas, permitindo atualização ou exclusão.
* Deletado: estado final, no qual nenhuma outra operação é permitida.

# Aplicação do Padrão State

padrão State permite que o comportamento de um objeto seja alterado conforme seu estado interno, evitando a utilização de diversas estruturas condicionais para controlar suas operações.

Neste projeto, a classe Codigo representa o contexto, enquanto a classe abstrata CodigoEstado define as operações disponíveis. Cada estado concreto implementa as regras específicas para as transições permitidas.

Dessa forma, o sistema mantém a organização, facilita a manutenção e permite a evolução das regras de negócio de maneira estruturada.
