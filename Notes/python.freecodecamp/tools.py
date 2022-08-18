import random

feet_in_mile = 5280
meters_in_km = 1000
beatles = ["John Lennon", "Paul McCartney", "George Harrison", "Gringo Star"]

def get_file_ext(filename):
    return filename[filename.index(".") + 1:]

def roll_n_sided_dice(num):
    return random.randint(1, num)
