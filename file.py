# f=open("/Users/ma-58/Documents/Python Folder/text.txt","r")
# data=f.read()
# # data=f.read(7)  
# print(data)
# print(type(data))
# f.close

# reading the file line by line, one line at a time 
# f=open("/Users/ma-58/Documents/Python Folder/text.txt","r")
# line1=f.readline()
# # data=f.read(7)  
# print(line1)
# # print(type(line1))
# line2=f.readline()
# # data=f.read(7)  
# print(line2)
# # print(type(line2))
# line3=f.readline()
# print(line3)
# f.close


# Write mode 
# f=open("/Users/ma-58/Documents/Python Folder/text.txt","w")
# f.write("Hello world")
# f.close

# append mode 
# f=open("/Users/ma-58/Documents/Python Folder/text.txt","a")
# f.write("\nI am a tester")
# f.close


# If the file does not exist then python will create a new file 
# f=open("demo.txt","a")
# f.close

#Using with syntax 
# with open("sample.txt","r") as f:
#     data=f.read()
#     print(data)

# No need to use f.close() with with syntax, with automatically closes the file 
with open("sample.txt","w") as f:
    data=f.write("Hi Hello python")
    # print(data)