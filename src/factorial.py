def factorial(n):
    result = 1
    for i in range(1, n+1):
        result = result * i
    return result

n = 3
result = factorial(n)
print("The result is ", result)