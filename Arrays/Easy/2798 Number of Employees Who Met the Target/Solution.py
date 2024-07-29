class Solution(object):
    def numberOfEmployeesWhoMetTarget(self, hours, target):
        if len(hours) == 1:
            return 1 if hours[0] >= target else 0
        
        return self.numberOfEmployeesWhoMetTarget(hours[:len(hours)//2], target) + self.numberOfEmployeesWhoMetTarget(hours[len(hours)//2:], target)