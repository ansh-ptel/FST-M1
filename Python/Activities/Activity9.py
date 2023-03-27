listone = [20,33,40,55,60]
listtwo = [45,22,78,54,11]

print("First List= ", listone)
print("Second List= ", listtwo)

thirdlist = []

for num in listone:
    if(num % 2 != 0):
        thirdlist.append(num)

for num in listtwo:
    if(num % 2 == 0):
        thirdlist.append(num)

print("The list is: ",thirdlist)        
