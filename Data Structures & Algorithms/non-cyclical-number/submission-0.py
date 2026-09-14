class Solution:
    def isHappy(self, n: int) -> bool:
        slow, fast = n, self.sumOfSquares(n)

        while slow != fast:
            fast = self.sumOfSquares(fast)
            fast = self.sumOfSquares(fast)
            slow = self.sumOfSquares(slow)
        return True if fast == 1 else False


    def sumOfSquares(self, n: int) -> int:
        # 1 ^ 2 + 0^2 == 0 + 1 ^ 2
        # 0 or zero base case scenario
        # if(n == 0):
        # 
        # 1 ^ 2 or identity case scenario 
        output = 0
        while n:
            digit = n % 10
            digit = digit ** 2
            output += digit
            n = n // 10
        return output 


            
        