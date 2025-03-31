# Birthday Cake Candles

## Descrição do Problema
Você está encarregado do bolo de aniversário de uma criança. O bolo terá uma vela para cada ano da idade total dela. A criança só conseguirá apagar as velas mais altas. Sua tarefa é contar quantas velas são as mais altas.

## Exemplo
```
candles = [4, 4, 1, 3]
```

As velas mais altas têm 4 unidades de altura. Existem 2 velas com esta altura, então a função deve retornar 2.

## Descrição da Função

Complete a função `birthdayCakeCandles` com o(s) seguinte(s) parâmetro(s):
- `int candles[n]`: as alturas das velas

## Retorno
- `int`: o número de velas que são as mais altas

## Formato de Entrada
A primeira linha contém um único inteiro, `n`, o tamanho de `candles[]`.
A segunda linha contém `n` inteiros separados por espaço, onde cada inteiro `i` descreve a altura de `candles[i]`.

## Restrições
- 1 ≤ n ≤ 10⁵
- 1 ≤ candles[i] ≤ 10⁷

## Exemplo de Entrada
```
4
3 2 1 3
```

## Exemplo de Saída
```
2
```

## Explicação
As alturas das velas são `[3, 2, 1, 3]`. As velas mais altas têm 3 unidades de altura, e existem 2 delas. 