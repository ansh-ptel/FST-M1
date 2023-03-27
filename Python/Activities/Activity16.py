class car:
    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color
    def accelerate(self):
        print(self.manufacturer + " " + self.model + " car is started moving")
    def stop(self):
        print(self.manufacturer + " " + self.model + " car is stopped moving")
    
car1 = car("KIA", "India", "2020", "Automatic", "Black")
car2 = car("Audi", "US", "1990", "Manual", "white")
car3 = car("BMW", "Japan", "1992", "Manual", "red")

car1.accelerate()
car1.stop()