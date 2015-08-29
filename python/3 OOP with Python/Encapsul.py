from Bird import *

print( '\nClass Instances Of:\n' , Bird.__doc__ )

polly = Bird( 'Squawk, squawk!' )

print( '\nNumber Of Birds:' , polly.count )
print( 'Polly Says:' , polly.talk() )

harry = Bird( 'Tweet, tweet!' )
print( '\nNumber Of Birds:' , harry.count )
print( 'Harry Says:' , harry.talk() )
