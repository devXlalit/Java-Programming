def Hello():
    print("Hello world!")


def sum(a,b): # Parameterss
    print(a+b)

def sub(a,b):
    print(a-b)

Hello()
sum(2,3) # Arguements
sum(21,5) # Arguments
sub(2.5,12.4) # Arguments


# Keyword Argument 
sum(a=12,b=45)

def greet(name="your name"):
    print("Hello",name)

greet()

# return in python 

def funcSum(a):
    a+=10
    return a


result = funcSum(12)
print(result)


# lamda functions 
x = lambda a:a + 10
print(x(5))


list = [1,2,3,4,5,"lalit",False]
tuple = (1,2,3,4,5,"lalit",False)

arrays = ["first","second","third"]
arraysnum = [1,2,3,4,5]

print("Length of given array is: ",len(arrays))
print("Length of given array is: ",len(arraysnum))

print(arrays)
arrays.append("Fourth")
print(arrays)
arrays.insert(4,"Sixth")
print(arrays)
arrays.extend(["eight","nine","Ten"])
print(arrays)
arrays.pop(2)
print(arrays)
arrays.remove("nine")
arrays.remove("Ten")
print(arrays)
