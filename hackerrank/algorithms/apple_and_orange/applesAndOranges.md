# Apples and Oranges

## Descrição do Problema
A casa de Sam tem uma macieira e uma laranjeira que produzem uma abundância de frutas. Usando as informações fornecidas abaixo, determine o número de maçãs e laranjas que caem na casa de Sam.

No diagrama:
- A região vermelha denota a casa, onde `s` é o ponto inicial e `t` é o ponto final
- A macieira está à esquerda da casa e a laranjeira está à direita
- Assuma que as árvores estão localizadas em um único ponto, onde a macieira está no ponto `a` e a laranjeira no ponto `b`
- Quando uma fruta cai de sua árvore, ela cai `d` unidades de distância de sua árvore de origem ao longo do eixo x
- Um valor negativo de `d` significa que a fruta caiu `d` unidades à esquerda da árvore, e um valor positivo significa que caiu `d` unidades à direita

## Descrição da Função

Complete a função `countApplesAndOranges` com os seguintes parâmetros:
- `s`: inteiro, ponto inicial da localização da casa
- `t`: inteiro, ponto final da localização da casa
- `a`: inteiro, localização da Macieira
- `b`: inteiro, localização da Laranjeira
- `apples`: array de inteiros, distâncias em que cada maçã cai da árvore
- `oranges`: array de inteiros, distâncias em que cada laranja cai da árvore

## Formato de Entrada
- A primeira linha contém dois inteiros separados por espaço denotando os valores de `s` e `t`
- A segunda linha contém dois inteiros separados por espaço denotando os valores de `a` e `b`
- A terceira linha contém dois inteiros separados por espaço denotando os valores de `m` e `n`
- A quarta linha contém `m` inteiros separados por espaço, denotando as distâncias que cada maçã cai do ponto `a`
- A quinta linha contém `n` inteiros separados por espaço, denotando as distâncias que cada laranja cai do ponto `b`

## Restrições
- 1 ≤ s, t, a, b, m, n ≤ 10⁵
- -10⁵ ≤ d ≤ 10⁵
- a < s < t < b

## Formato de Saída
Imprima dois inteiros em linhas separadas:
1. O número de maçãs que caem na casa de Sam
2. O número de laranjas que caem na casa de Sam

## Exemplo de Entrada
```
7 11
5 15
3 2
-2 2 1
5 -6
```

## Exemplo de Saída
```
1
1
```

## Explicação
- A primeira maçã cai na posição 5 - 2 = 3
- A segunda maçã cai na posição 5 + 2 = 7
- A terceira maçã cai na posição 5 + 1 = 6
- A primeira laranja cai na posição 15 + 5 = 20
- A segunda laranja cai na posição 15 - 6 = 9

Apenas uma fruta (a segunda maçã) cai na região entre 7 e 11, então imprimimos 1 como primeira linha de saída.
Apenas a segunda laranja cai na região entre 7 e 11, então imprimimos 1 como segunda linha de saída. 