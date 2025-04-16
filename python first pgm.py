# Ternary operator with value
food=input("food: ")
eat= "Yes" if food=="cake" else "No"
print(eat)
# Ternary operator with statement
print("Sweet") if food=="cake" or food=="jalebi" else print("Not sweet")
#Ternary operator with clever if 
sal=float(input("Salary: "))
tax=sal*(0.1,0.2)[sal>50000]
print(tax)

