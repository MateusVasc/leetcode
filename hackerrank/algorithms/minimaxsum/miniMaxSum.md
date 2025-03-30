# Mini Max Sum

## Descrição do Problema
Dados cinco inteiros positivos, encontre os valores mínimo e máximo que podem ser calculados somando exatamente quatro dos cinco inteiros. Em seguida, imprima os respectivos valores mínimo e máximo como uma única linha de dois inteiros longos separados por espaço.

## Exemplo
```
arr = [1, 3, 5, 7, 9]
```

A soma mínima é `1 + 3 + 5 + 7 = 16` e a soma máxima é `3 + 5 + 7 + 9 = 24`.
A função imprime:
```
16 24
```

## Descrição da Função

Complete a função `miniMaxSum` com o(s) seguinte(s) parâmetro(s):
- `arr[5]`: um array de 5 inteiros

## Saída
Imprima dois inteiros separados por espaço em uma linha: a soma mínima e a soma máxima de 4 dos 5 elementos.
Nenhum valor deve ser retornado.

**Nota:** Para algumas linguagens, como C, C++, e Java, as somas podem exigir que você use um inteiro longo devido ao seu tamanho.

## Formato de Entrada
Uma única linha de cinco inteiros separados por espaço.

## Restrições
- 1 ≤ arr[i] ≤ 10⁹

## Exemplo de Entrada
```
1 2 3 4 5
```

## Exemplo de Saída
```
10 14
```

## Explicação
Os números são 1, 2, 3, 4 e 5. Calcule as seguintes somas usando quatro dos cinco inteiros:

1. Some tudo exceto 1, a soma é 2 + 3 + 4 + 5 = 14.
2. Some tudo exceto 2, a soma é 1 + 3 + 4 + 5 = 13.
3. Some tudo exceto 3, a soma é 1 + 2 + 4 + 5 = 12.
4. Some tudo exceto 4, a soma é 1 + 2 + 3 + 5 = 11.
5. Some tudo exceto 5, a soma é 1 + 2 + 3 + 4 = 10.

## Dicas
- Cuidado com o estouro de inteiro! Use um inteiro de 64 bits para armazenar as somas. 