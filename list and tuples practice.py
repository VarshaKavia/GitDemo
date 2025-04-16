# Write a pgm to input 3 movies name and store it in a list 
# movie1=input("Enter the first movie name : ")
# movie2=input("Enter the first movie name : ")
# movie3=input("Enter the first movie name : ")
# my_list=[]
# my_list.append(movie1)
# my_list.append(movie2)
# my_list.append(movie3)
# print(my_list)
#or
# my_list=[]
# movie=input("Enter the first movie name : ")
# my_list.append(movie)
# movie=input("Enter the second movie name : ")
# my_list.append(movie)
# movie=input("Enter the third movie name : ")
# my_list.append(movie)
# print(my_list)

#or
# my_list=[]
# my_list.append(input("Enter the first movie name : "))
# my_list.append(input("Enter the second movie name : "))
# my_list.append(input("Enter the third movie name : "))
# print(my_list)

# Write a pgm to check if the list contains a palindrome content (Hint: Use Copy() method)
# list=[2,7,1,7,5]
# list=["m","p","o","p","l"]
# my_list=list.copy()
# my_list.reverse()
# print(my_list)
# if(list==my_list):
#     print("The list has palindrom elements")
# else:
#     print("The list does not have palindrome elements")


#Wriet a pgm to count the number of students with grade A in the following tuple ["C","D", "A","A","B", "B","A"]
grades=["C","D", "A","A","B", "B","A"]

print(grades.count("A"))
#Wriet a pgm to sort the list from A to D order 
grades=["C","D", "A","A","B", "B","A"]
grades.sort()
print(grades)
grades.sort(reverse=True)
print(grades)