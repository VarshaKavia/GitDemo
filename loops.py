# count=1
# while count<5 :
#     print("Hello world!")
#    # count=count+1
#     count+=1

# i=5
# while i>=0 :
#     print(i)
#    # count=count+1
#     i-=1

# Print numbers from 1 to 100
# num=1
# while num<=100 :
#     print(num)
#     num+=1

# Print numbers from 100 to 1
# num=100
# while num>=1 :
#     print(num)
#     num-=1
# Print multiplication table of number n 
# num=int(input("Enter a number : "))
# count=1
# while count<=10 :
#     print(count*num)
#     count+=1 

#Print the elements of the following list using a loop [1,4,9,16,25,36,49,64,81,100]
# list=[1,4,9,16,25,36,49,64,81,100]
# list=["Rio","Moco","Nio","Dono"]
# list_ele= "Moco"
# i=0
# while i<len(list) :
#     if(list[i]==list_ele):
#         print("Found ",list[i])
#     else:
#         print("Not found")
#     i=i+1
# op without break Not found Found  Moco,Not found,Not found
# pgm with break list=["Rio","Moco","Nio","Dono"]
# list=["Rio","Moco","Nio","Dono"]
# list_ele= "Moco"
# i=0
# while i<len(list) :
#     if(list[i]==list_ele):
#         print("Found ",list[i])
#         break
#     else:
#         print("Not found")
#     i=i+1
# # op with break Not found,Found  Moco
#continue example 
# list=[1,4,9,16,25,36,49,64,81,100]
# list_ele= 4
# i=0
# while i<len(list) :
#     if(list[i]==list_ele):
#         i=i+1
#         continue
#     print(i)
#     i=i+1

# print odd and even number from1 to 10 using continue statement
# i=1
# while i<=10 :
#     if(i%2!=0): # if(i%2==0):
#         i+=1
#         continue
#     print(i)
#     i+=1
n=7
i=1
while i<=10 :
    if(i==n): 
        i+=1
        break
    print(i)
    i+=1



    