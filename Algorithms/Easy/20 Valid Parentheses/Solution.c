#include <stdlib.h>
#include <stdbool.h>
#include <string.h>

struct Stack
{
    char* data;
    int top;
    int capacity;
};

struct Stack* create_stack(int capacity)
{
    struct Stack* stack = malloc(sizeof(struct Stack));
    stack->data = malloc(capacity * sizeof(char));
    stack->top = -1;
    stack->capacity = capacity;

    return stack; 
}

void push(struct Stack* stack, char c)
{
    
}

void pop(struct Stack* stack)
{
    if (stack->top == -1)
    {
        return '\0';
    }
    
    return stack->data[stack->top--];
}

bool isValid(char* s)
{
    int i = 0;
    char open_paren = '(';
    char open_square = '[';
    char open_curly = '{';
    char close_paren = ')';
    char close_square = ']';
    char close_curly = '}';

    while (s[i] != '\0')
    {
        if (s[i] == open_paren || s[i] == open_square || s[i] == open_curly)
        {
            
        }
        
    }
    
    return true;
}

