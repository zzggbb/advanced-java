from ast import literal_eval

def fib(n):
    a, b = 0, 1
    for i in range(n):
        a, b = b, a + b
    return a

def fib_series():
	series_list = []
	for i in range(0,200):
		term_number = i
		term_value = fib(i)
		if term_value < 4000000:
			series_list.append(term_value)
	return series_list

fib_series()

def even_fib_sum(some_fib_list):
	sum = 0
	for value in some_fib_list:
		if value % 2 == 0:
			sum = sum + value
	print sum

even_fib_sum(fib_series())