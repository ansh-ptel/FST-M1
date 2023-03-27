fruit_shop = {
    "apple": 10,
    "banana": 15,
    "orange": 20,
    "watermelon": 12
}

fruit_available = input("what are you looking for? ").lower()

if(fruit_available in fruit_shop):
    print("yes, fruit is available")
else:
    print("No, fruit is not availabe")