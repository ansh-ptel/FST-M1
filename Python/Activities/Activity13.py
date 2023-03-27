def CalculateSum(numbers):
    sum = 0
    for number in numbers:
        sum += number
    return sum
number = [20,32,44,75,21]

result = CalculateSum(number)

print("The sum of numbers is: "+str(result))