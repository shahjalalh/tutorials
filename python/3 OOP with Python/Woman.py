from Person import *

'''A derived class to define Hombre properties.'''

class Woman( Person ) :
	def speak( self , msg ) :
		print( self.name , ':\n\tHi!' , msg )
