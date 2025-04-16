# Deleting a file 
# import os
# os.remove("sample.txt")

# Write a pgm to create a file and add the below data in it 
# Hello Everyone
# We are learning Python file I/O
# using python

# with open("sample.txt","w") as f:
#     data=f.write("Hello Everyone\nWe are learning Python file I/O\nusing python")

#Write a pgm to replace python occurance with java in a file 
# with open("sample.txt","r") as f:
#     data=f.read()

# new_data=data.replace("python","java")
# print(new_data)

# with open("sample.txt","w") as f:
#     f.write(new_data)
# Write a pgm to find if learning exist in the file or not 

# def check_word() :
#     word="learning"
#     with open("sample.txt","r") as f:
#         data=f.read()
#         if(data.find(word)!=-1):
#             print("found")
#         else:
#             print("not found")

#     print(data.find("learning"))

# check_word()


def check_for_line():
    word="java2"
    data=True
    line_no=1
    with open("sample.txt","r") as f:
        while data:
            data=f.readline()
            if(word in data):
                print(line_no)
                return
            line_no+=1

    return -1

print(check_for_line())


