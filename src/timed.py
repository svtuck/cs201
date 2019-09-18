import timeit

s="""\
i = 0
while i < 10000:
    i+=1"""
n = 10000
r = timeit.timeit(stmt=s, number=n)*1e9/n
print("Execution time in nanoseconds ", r)