def getpassed(min,max): #getpassed(1,5)
    passed = 0			#passed = 0
    number = max 		#number = 5
    while passed < max:
	    for i in range(min,(max + 1)):  #(1,2,3,4,5,6)
	        if number % i == 0:
	            passed = passed + 1
	        #elif number % i != 0:
	    	else:
	            number = number + 1
	            passed = 0

    print ("The number " + str(number) + " is the lowest number"
    	   "divisible by all numbers from " + str(min) + " to " + str(max)) 

getpassed(input("Type a minumum value: "),input("Type a maximum value: "))