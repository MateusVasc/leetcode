# Time Conversion

## Descrição do Problema
Dado um horário no formato de 12 horas AM/PM, converta-o para o horário militar (formato de 24 horas).

**Nota:**
- 12:00:00AM em um relógio de 12 horas é 00:00:00 em um relógio de 24 horas.
- 12:00:00PM em um relógio de 12 horas é 12:00:00 em um relógio de 24 horas.

## Exemplo
```
s = '12:01:00PM'
```
Retorna '12:01:00'

```
s = '12:01:00AM'
```
Retorna '00:01:00'

## Descrição da Função

Complete a função `timeConversion` com o(s) seguinte(s) parâmetro(s):
- `string s`: um horário no formato de 12 horas

## Retorno
- `string`: o horário no formato de 24 horas

## Formato de Entrada
Uma única string `s` que representa um horário no formato de relógio de 12 horas (ou seja: hh:mm:ssAM ou hh:mm:ssPM).

## Restrições
- Todos os horários de entrada são válidos

## Exemplo de Entrada
```
07:05:45PM
```

## Exemplo de Saída
```
19:05:45
```

## Explicação
- 7:05:45PM em um relógio de 12 horas é 19:05:45 em um relógio de 24 horas. 