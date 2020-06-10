# MaxMinAvrg

This Module calculates the minimum, maximum and average of any ten integers between 1 and 100 through user interaction.

Minimum - Least value in the given series
Maximum - Highest value in the given series
Average - Sum of all values in the given series is divided by total number of values in the series
### Algorithm

sum=0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, i=0
while True do
  read integer 
 if integer < 0 or integer > 100 then 
  print Invalid input 
  continue 
  i=i+1 
  if min > n then 
  min = n 
  if max < n then 
  max = n 
  sum = sum + n 
  if i == 10 then 
  break 
avg = sum / 10.0
print min, max, avg
output

Enter 10 integers between 1 and 100
2
5
24
66
24
13
54
8
94
49
Minimum = 2
Maximum = 94
Average = 33.9

