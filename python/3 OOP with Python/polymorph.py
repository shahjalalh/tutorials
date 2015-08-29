from Duck import *
from Mouse import *

def describe( object ) :
	object.talk()
	object.coat()

donald = Duck()
mickey = Mouse()

describe( donald )
describe( mickey )
