a = 5

try:
    if a == 5:
        raise ValueError("Invalid Number")
except ValueError as msg:
    print msg
finally:
    print "The number is almost ok..."
