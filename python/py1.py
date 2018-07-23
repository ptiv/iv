
#chapter 16
print("Chp 16: Lists - Adding and changing elements")

cities_ch16 = ["SF", "NY", "LA"]
cities_ch16.append("Bos")
print(cities_ch16)
print(cities_ch16[3])

cities_ch16.insert(2, "Chi")
print(cities_ch16)

print("---")


#chapter 15
print("Chp 15: Lists")

cities = ["San Francisco", "New York", "Los Angeles"]
print("cities[0] = " + cities[0])
print("cities[1] = " + cities[1])

print("---")

#chapter 12
print("Chp 12: Testing sets of conditions")
weight = 320
time = 5.8
if (weight > 300 and time < 6):
	print("recruit player")

print("---")

#chapter 11
print("Chp 11: else and elif statements")
species = "dog"
if species == "cat":
	print("It's a cat")
else:
	print("It's not a cat")

if species=="cat":
	print("It's a cat")
elif species=="dog":
	print("It's a dog")
else:
	print("It's neither")

print("---")

#chapter 10
print("Chp 10: Comparison Operators")
num_ch10_1 = 4
num_ch10_2 = 7
if num_ch10_1 < num_ch10_2:
	print("4 < 7")
print("---")

#chapter 9
print("Chp 9: if statements")
str_ch9_1 = "ch9"
if str_ch9_1 == "ch9":
	print("ch9_str1")
	print("ch9_str2")

if str_ch9_1 == "hsjjd":
	print("ch9_str1")
	print("ch9_str2")
print("done")

print("---")

#chapter 8
str_ch8_1 = "hello, "
str_ch8_2 = "world!"
print(str_ch8_1 + str_ch8_2)

#chapter 6
num_ch6 = 2
num_ch6 += 3
print("num_ch6 = " + `num_ch6`)


speed = 40
speed = speed + 30
print("speed = " + `speed`)

#chapter 1
name = "pt"
print(name)