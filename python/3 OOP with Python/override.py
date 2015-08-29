from Man import *
from Woman import *

guy_1 = Man( 'Richard' )
guy_2 = Woman ( 'Anne ' )

guy_1.speak( 'It\'s a beautiful evening, from Richard.\n' )
guy_2.speak('It\'s a beautiful evening, from Anne.\n')

Person.speak( guy_1 )
Person.speak( guy_2 )
