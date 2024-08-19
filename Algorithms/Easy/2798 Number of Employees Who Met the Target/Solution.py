class Solution(object):
    def number_of_employees_who_met_target(self, hours, target):
        if len(hours) == 1:
            return 1 if hours[0] >= target else 0
        
        return self.number_of_employees_who_met_target(hours[:len(hours)//2], target) + self.number_of_employees_who_met_target(hours[len(hours)//2:], target)