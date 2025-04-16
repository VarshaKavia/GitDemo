# Write a function to print the length of the list(list is the paramenter)
# cities=["Delhi","Pune","Mumbai","Bangalore","Hydrabad"]
# brands=["Tata","Maruti","Mercedes","Kia","Swift","Ford"]
# def list_len(list):
#    print(len(list))


# list_len(cities)
# list_len(brands)

# Write a function to print the elements of a list in a single line
# cities=["Delhi","Pune","Mumbai","Bangalore","Hydrabad"]
# def list_ele(list):
#    for i in list:
#       print(i, end= " ")

# list_ele(cities)
# print()# trailing character 

#Write a function to print the factorial of a number (n as a parameter )
# def factorial(n):
#      fact=1
#      for i in range(1,n+1):
#         fact*=i
#      print("The fact is : ",fact)

# factorial(6)

# Write a function to convert USD into INR 
# def conversion(usd):
#     inr=usd*83
#     print(usd,"USD =",inr,"INR")

# conversion(1)


def odd_even(num):
    if(num%2==0):
        print("Even")
    else:
        print("Odd")

odd_even(22)