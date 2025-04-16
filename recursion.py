# Recursion example
# def show(n):
#    if(n==0) :#Base case
#      return
#    print(n)
#    show(n-1)

# show(9) 

#Factorial of a number using recursion 
# def fact(n):
#    if(n==0 or n==1):
#       return 1
#    else:
#      return fact(n-1)*n

# print(fact(6))

# Write a recursive function to calculate the sum of natural numbers 
# def sum(n):
#     if n == 0:
#         return 0  # Return 0 when n is 0 (base case)
#     tot = sum(n - 1) + n  # Recursive call
#     return tot

# total = sum(3)
# print(total)


def sum(n):
   if(n == 0): 
      return 0
   tot = sum(n -1) + n
   return tot

total=sum(3)
print(total)