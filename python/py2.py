#py2.py - Chapters 21 to 40

#Chapter 21
print("Chapter 21: For Loops")
clean_cities = ["Cheyenne", "Santa Fe", "Tucson"]
city_to_check_1 = "Santa Fe"
city_to_check_2 = "New York"

for clean_city in clean_cities:
	if city_to_check_1 == clean_city:
		print(city_to_check_1 + " is a clean city")
		break


for clean_city in clean_cities:
	if city_to_check_2 == clean_city:
		print(city_to_check_2 + " is a clean city")

print("---")

#Chapter 21
print("Chapter 22: For loops nested")

first_names = ["BlueRay ", "Upchuck ", "Lojack ", "Gizmo ", "Do-Rag "]
last_names = ["Zzz", "Burp", "Dogbone", "Droop"]

full_names = []

for first_name in first_names:
	for last_name in last_names:
		full_names.append(first_name + " " + last_name)

print(full_names)

print("---") 