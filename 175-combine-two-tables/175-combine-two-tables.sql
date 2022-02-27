select firstName, lastName, city, state
from Person
left outer join Address 
on Person.personId = Address.personId