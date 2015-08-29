# creating a file for writing
file = open("example.txt", "w")

file.write("This is my first text for the file.")

file.close()

# opening the file for reading
file = open("example.txt", "r")

content = file.readline()

file.close()

print content
