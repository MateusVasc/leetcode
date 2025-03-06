#include <stdlib.h>

int get_common_prefix(char* prefix, char* word) {
    int i = 0;

    while (prefix[i] != '\0' && word[i] != '\0' && prefix[i] == word[i])
    {
        i++;
    }
    
    return i;
}

char* longestCommonPrefix(char** strs, int strsSize) {
    if (strsSize == 0)
    {
        return "";
    }
    
    char* prefix = strs[0];

    for (int i = 0; i < strsSize; i++)
    {
        int prefix_size = get_common_prefix(prefix, strs[i]);
        prefix[prefix_size] = '\0';
    }
    
    char* output = malloc((strlen(prefix) + 1) * sizeof(char));
    if (output == NULL)
    {
        return NULL;
    }
    
    strcpy(output, prefix);

    return output;
}