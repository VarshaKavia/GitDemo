# collection={1,2,4,4,"hello","world","India","world"}
# print(type(collection))
# print(collection)
# print(len(collection))
# empty_set={}# this will give type as dict 
# empty_set=set()
# print(type(empty_set))
# print(empty_set.add(9))
# print(empty_set.add(7))
# print(empty_set.add(9))
# print(empty_set.add("Nice"))
# print(empty_set.add(((3,5,"Test"))))
# print(empty_set)
# #print(empty_set.add([10,7,9])) , it will give error 
# print(empty_set.remove(9))
# print(empty_set)
# print(empty_set.clear())
# print(empty_set)
# print(len(empty_set))
# print(collection.pop())# it will pop a random value
set1={1,2,3,4,9,10}
set2={1,3,9,11,16,7}
print(set1.union(set2))# it returns the union of 2 sets ignoring the duplicate values
print(len(set1.union(set2)))
print(set1)
print(len(set1))
print(set1.intersection(set2))# returns the common value