info= {"name":"Varsha",
       "state":"Maharashtra",
       "job":("Tester",34),
       "company":["Tudip",90],
       "age":25,
       "34":89.0
       }
print(info)
print(type(info))
print(info["company"])
print(info["name"])
# print(info["set"]) , it will error out
info["name"]="Rukmani"
info["surname"]="Krishna"
print(info)
null_dict={}
print(null_dict)
null_dict["name"]="Soriya"
print(null_dict)
#Nested dictionaries 
student_info={"name":"Rani",
              "subjects":{"maths":67,"phy":68,"chem":89},
              "class":6,
              "school":"ABC" }
print(student_info)
print(student_info["subjects"])
print(student_info["subjects"]["phy"])
print(student_info.keys())# returns list of the keys 
print(tuple(student_info.keys()))
print(list(student_info.keys()))
print(len(student_info))
print(student_info.values())
print(student_info.items())# it returns the dictionary key value pair in tuple format 
pairs=list(student_info.items())
print(pairs)
print(pairs[1])
#print(student_info["test"]), this will error out if no key is found
print(student_info.get("test")) # but this will return none if no key is found and using this we can avoid halting the execution of the next lines 
print("Hello")
student_info["city"]="Delhi"
print(student_info)
print(len(student_info))
# above two lines we can also write as
new_dict={"city":"Delhi","state":"Maharashtra"}
student_info.update(new_dict)
print(student_info)