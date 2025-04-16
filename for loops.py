#nums=[2,7,8,4,6,2,10] #list
#nums=(2,7,1,0,10) #tuple
# str= "Hello world!"
# for char in str :
#     print(char)

# search for a number in a the given tuple 
# tup=(3,5,7,9,11,10,26,18,9)
# num=9
# i=0
# for val in tup :
#     if(val==num):
#         print("num found at : ",i)
#         break 
#     i+=1
#     print(val)

# str="Hey its me!"
# ch="i"
# i=0
# for char in str :
#     if(char==ch):
#         print("Ch found at : ",i)
#         break
#     i+=1
#     print(char)

# range() function 
# for i in range(10):
#     print(i)

# table of any number 
# for i in range(4,41,4):
#     print(i)

# for i in range(1,10,2):
#     print(i)

# Print 1 to 100 number 

# for i in range(1,101):
#     print(i)
#Print 100 to 1 number 
# for i in range(100,0,-1):
#     print(i)
#Print a table of a number 
# num=int(input("Enter a number : "))
# for i in range(1,11):
#     print(num*i)

# print the total of natural numbers for a given range 
# num=9
# sum=0
# i=1
# for i in range(1,num+1):
#     sum+=i

# print("Total is : ", sum)
# using while loop
# num=9
# sum=0
# i=1
# while i<=num:
#     sum+=i
#     i+=1

# print(sum)

# print the factorial of a number (using for loop)
# num=int(input("Enter a number : "))

# fact=1
# for i in range(1,num+1):
#     fact*=i
    
# print(fact)

#using while loop
num=int(input("Enter a number : "))
fact=1
i=1
while i<=num:
    fact*=i
    i+=1

print(fact)