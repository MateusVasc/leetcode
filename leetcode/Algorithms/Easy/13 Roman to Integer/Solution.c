#include <stdio.h>
#include <stdlib.h>

struct hashmap {
    char key;
    int val;
};

struct hashmap* get_roman_hashmap() {
    struct hashmap* roman_hashmap = malloc(7 * sizeof(struct hashmap));

    if (roman_hashmap == NULL) {
        return NULL;
    }
    
    roman_hashmap[0] = (struct hashmap){'I', 1};
    roman_hashmap[1] = (struct hashmap){'V', 5};
    roman_hashmap[2] = (struct hashmap){'X', 10};
    roman_hashmap[3] = (struct hashmap){'L', 50};
    roman_hashmap[4] = (struct hashmap){'C', 100};
    roman_hashmap[5] = (struct hashmap){'D', 500};
    roman_hashmap[6] = (struct hashmap){'M', 1000};

    return roman_hashmap; 
}

int get_value_by_key(char key, struct hashmap* p_hashmap) {
    for (int i = 0; i < 7; i++) {
        if (p_hashmap[i].key == key) {
            return p_hashmap[i].val;
        }
    }
    
    return 0;
}

int romanToInt(char* s) {
    int total = 0;
    int i = 0;
    int j = i + 1;
    struct hashmap* p_hashmap = get_roman_hashmap();

    while (s[i] != '\0') {
        char curr = s[i];
        int curr_val = get_value_by_key(curr, p_hashmap);

        char next;
        int next_val;

        if (s[j] != '\0') {
            next = s[j];
            next_val = get_value_by_key(next, p_hashmap);
        } else {
            next_val = 0;
        }
        

        if (curr_val < next_val) {
            total += (next_val -  curr_val);
            i = j + 1;
            j = i + 1;
        } else {
            total += curr_val;
            i = j;
            j = i + 1;
        }
    }
    
    free(p_hashmap);

    return total;
}

int main() {
    char s[] = "MCMXCIV";
    printf("Value: %d\n", s, romanToInt(s));
    return 0;
}