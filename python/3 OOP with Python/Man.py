from Person import *

'''A derived class to define Man properties.'''

class Man( Person ) :

	def speak( self , msg ) :
		print( self.name , ':\n\tHello!' , msg )
