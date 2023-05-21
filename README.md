# GerenciadorPagamento

Este projeto consiste em um sistema de gerenciamento de pagamentos desenvolvido em Java. Ele permite ler o valor cobrado pelo cliente e a forma de pagamento (Crédito, Débito, PIX ou Dinheiro) e realiza o processamento adequado de acordo com as regras de prazo de recebimento.

## Funcionalidades

- Ler o valor cobrado pelo cliente.
- Ler a forma de pagamento (Crédito, Débito, PIX ou Dinheiro).
- Processar o pagamento de acordo com as seguintes regras:

### Forma de pagamento: Crédito

- O valor será recebido em 2 dias.
- Se os dois dias de espera caírem em um final de semana, a data é automaticamente atualizada para o próximo dia útil.

### Forma de pagamento: Débito

- O valor será recebido em 1 dia.
- Se o dia de espera cair em um final de semana, a data é automaticamente atualizada para o próximo dia útil.

### Forma de pagamento: PIX

- O valor é recebido instantaneamente.

### Forma de pagamento: Dinheiro

- O valor é recebido no ato da transação.

## Pré-requisitos

Antes de executar o projeto, verifique se você tem os seguintes requisitos instalados:

- Java Development Kit (JDK) 8 ou superior
- Ambiente de desenvolvimento Java (por exemplo, Visual Code, Eclipse, IntelliJ, NetBeans) ou um editor de texto

## Como executar o projeto

Siga as etapas abaixo para executar o projeto em sua máquina local:

1. Faça o clone deste repositório para o seu diretório de projetos local:

```
git clone https://github.com/seu-usuario/seu-projeto.git
```

2. Abra o projeto em seu ambiente de desenvolvimento Java.

3. Localize o arquivo principal do projeto (por exemplo, `Main.java`) e execute-o.

4. O programa irá solicitar o valor cobrado pelo cliente e a forma de pagamento. Siga as instruções exibidas na tela e insira as informações necessárias.

5. O programa irá processar o pagamento de acordo com as regras mencionadas acima e exibirá a data de recebimento ou qualquer mensagem relevante relacionada ao processamento.

## Contribuição

Se você deseja contribuir para este projeto, siga as etapas abaixo:

1. Faça um fork deste repositório.

2. Crie uma branch para a sua contribuição:

```
git checkout -b minha-contribuicao
```

3. Faça as alterações e adições necessárias no código.

4. Faça o commit das suas alterações:

```
git commit -m "Minha contribuição"
```

5. Faça o push para o repositório remoto:

```
git push origin minha-contribuicao
```

6. Abra um pull request no repositório original, descrevendo suas alterações e contribuições.

## Contato

Em caso de dúvidas ou sugestões, entre em contato com seu e-mail ou nome de usuário do GitHub.
