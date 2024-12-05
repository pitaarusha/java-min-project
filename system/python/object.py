import math 

def huawei():
    number = int(input("enter number here:"))
    print(number)
    #create object of the class
    Bike1 = Bike()
    print(Bike.name)


#here is the class created in python
class Bike:
    name = ""
    gear = 0
    #assign the value of the class
Bike.gear = "mountain bike"
Bike.name = input("enter the name \n") 
huawei()

