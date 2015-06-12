def fibonacciGenerator():
    a = b = 1

    while True:
        yield a
        a, b = b, a+b

fib = fibonacciGenerator()

for i in fib:
    if i > 100:
        break
    else:
        print i
