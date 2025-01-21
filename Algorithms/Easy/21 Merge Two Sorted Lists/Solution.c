#include <stdlib.h>

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

struct ListNode {
    int val;
    struct ListNode *next;
};

struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2) {
    struct ListNode* dummy = malloc(sizeof(struct ListNode));
    struct ListNode* curr = dummy;
    
    while (list1 != NULL && list2 != NULL)
    {
        if (list1->val < list2->val)
        {
            curr->next = list1;
            list1 = list1->next;
        } else
        {
            curr->next = list2;
            list2 = list2->next;
        }

        curr = curr->next;
    }

    if (list1 == NULL)
    {
        curr->next = list2;
    } else
    {
        curr->next = list1;
    }
    
    struct ListNode* head = dummy->next;
    free(dummy);
    return head;
}