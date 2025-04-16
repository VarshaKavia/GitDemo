#Write a pgm to create student class that takes name and marks of 3 students as a argument of constructor then create a method to print the avg
class student:
    def __init__(self,name,marks):
        self.name=name
        self.marks=marks
        
    def avg(self):
        # sum=0
        # for val in self.marks:
        #  sum+=val
        # print(self.name,"your total marks avg is : ",sum/3)
      return sum(self.marks) / len(self.marks)


s1=student("Tina",[86,89,90])
print(s1.name , s1.marks)
average=s1.avg()
print("The data is as given below : ", average)