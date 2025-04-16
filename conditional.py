#Write a pgm to find a number is odd or even 
# num1=int(input("Enter a number : "))
# result= num1%2
# if(result==0):
#     print("The number is even ",num1)
# else:
#     print("The number is odd ",num1)

#Write a pgm to find the greatest of 3 numbers entered
# num1=int(input("Enter num1 numbers : "))
# num2=int(input("Enter num1 numbers : "))
# num3=int(input("Enter num1 numbers : "))
# if(num1>num2 and num1>num3) :
#     print("num1 is greatest ")
# elif(num2>num3):
#     print("num2 is greatest ")
# else:
#     print("num3 is greatest")

#Write a pgm to find the greatest of 4 numbers entered
# a=int(input("Enter num1 numbers : "))
# b=int(input("Enter num1 numbers : "))
# c=int(input("Enter num1 numbers : "))
# d=int(input("Enter num1 numbers : "))

# if(a>b and a>c and a>d):
#     print("a is greatest")
# elif(b>a and b>c and b>d):
#     print("b is greatest")
# elif(c>a and c>b and c>d):
#     print("c is greates")
# else:
#     print("d is greatest")

#or
 # Program to find the greatest of four numbers

# Taking input from the user
# num1 = float(input("Enter the first number: "))
# num2 = float(input("Enter the second number: "))
# num3 = float(input("Enter the third number: "))
# num4 = float(input("Enter the fourth number: "))

# # Finding the greatest number
# greatest = num1  # Assume num1 is the greatest

# if num2 > greatest:
#     greatest = num2
# if num3 > greatest:
#     greatest = num3
# if num4 > greatest:
#     greatest = num4

# # Display the result
# print(f"The greatest of the four numbers is: {greatest}")

#or
# num1 = float(input("Enter the first number: "))
# num2 = float(input("Enter the second number: "))
# num3 = float(input("Enter the third number: "))
# num4 = float(input("Enter the fourth number: "))
# greatest=int(max(num1, num2,num3,num4))
# print(greatest)

# Write a pgm to check if the number is multiple of 7
num1= int(input("Enter a number : "))
result=num1%7
if(result==0):
    print(" The number is multiple of 7")
else:
    print("The number is not the multiple of 7")