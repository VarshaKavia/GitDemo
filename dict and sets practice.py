# store the following word meaning in python dictionary 
# "cat":"a small animal", "table": "a piece of wooden furniture" , "list of facts and figures"
#dictionary={"cat":"a small animal","table": ["a piece of wooden furniture" , "list of facts and figures"]} # we can store single key and multiple values as either list or in a tuple 
#1
# dictionary={"cat":"a small animal","table": ("a piece of wooden furniture" , "list of facts and figures")} # above was the example of list and this is of tuple
# print(len(dictionary))
# print(dictionary)

# You are given a list of students, assume 1 classroom is required for one subjects , total how many classroom will be needed by all the students 
#"python","java","python","javascript","c++","c++","Html","java"
#2
# set={"python","java","python","javascript","c++","c++","Html","java"}
# print(len(set))
# print(set)

# Write a pgm to enter the marks from the user and store them in a dictionary.start with an empty dict and store one by one. use subjects as key and marks as values 
student_marks={}
student_marks["Phy"]=int(input("Enter the marks of the Phy subject : "))
student_marks["Math"]=int(input("Enter the marks of the Math subject : "))
student_marks["Chem"]=int(input("Enter the marks of the Chem subject : "))
student_marks["Eng"]=int(input("Enter the marks of the Eng subject : "))
student_marks["Hindi"]=int(input("Enter the marks of the Hindi subject : "))
print(student_marks)

