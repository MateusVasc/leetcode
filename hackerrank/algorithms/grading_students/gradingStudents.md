# Grading Students

## Descrição do Problema
A HackerLand University possui a seguinte política de notas:

- Todo estudante recebe uma nota no intervalo de 0 a 100.
- Qualquer nota menor que 40 é uma nota de reprovação.

Sam é um professor da universidade e gosta de arredondar a nota de cada estudante de acordo com estas regras:

- Se a diferença entre a nota e o próximo múltiplo de 5 for menor que 3, arredonda a nota para o próximo múltiplo de 5.
- Se o valor da nota for menor que 38, não ocorre arredondamento, pois o resultado ainda será uma nota de reprovação.

## Exemplos
- nota = 84 arredonda para 85 (85 - 84 é menor que 3)
- nota = 29 não arredonda (resultado é menor que 38)
- nota = 57 não arredonda (60 - 57 é 3 ou maior)

## Descrição da Função

Complete a função `gradingStudents` com o(s) seguinte(s) parâmetro(s):
- `int grades[n]`: as notas antes do arredondamento

## Retorno
- `int[n]`: as notas após o arredondamento

## Formato de Entrada
A primeira linha contém um único inteiro, `n`, o número de estudantes.
Cada linha `i` das `n` linhas subsequentes contém um único inteiro, `grades[i]`.

## Restrições
- 1 ≤ n ≤ 60
- 0 ≤ grades[i] ≤ 100

## Exemplo de Entrada
```
4
73
67
38
33
```

## Exemplo de Saída
```
75
67
40
33
```

## Explicação
1. Estudante 1 recebeu 73, e o próximo múltiplo de 5 é 75. Como 75 - 73 < 3, a nota é arredondada para 75.
2. Estudante 2 recebeu 67, e o próximo múltiplo de 5 é 70. Como 70 - 67 = 3, a nota não é arredondada.
3. Estudante 3 recebeu 38, e o próximo múltiplo de 5 é 40. Como 40 - 38 < 3, a nota é arredondada para 40.
4. Estudante 4 recebeu 33, que é menor que 38, então a nota não é arredondada. 